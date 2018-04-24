package spring.data.demos.redis.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * 因为是用 Spring boot 的构架，所以，主要使用 java-based  config
 */
@SpringBootApplication
public class Main {

    //------------------------ common -------------------------------

    @Bean
    public RedisTemplate getRedisTemplate() {
        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    }
    @Bean
    public RedisTemplate getStringRedisTemplate() {
        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
        stringRedisTemplate.setConnectionFactory(jedisConnectionFactory());
        return stringRedisTemplate;
    }

    //------------------------ jedis -------------------------------

    /**
     * jedis -- 其实如果使用的是本机的redis,而且端口没改,下面这个 config 是没有必要的。因为有默认值，此处写出来是为了方便理解
     */
    @Bean
    public RedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("127.0.0.1",6379);
        config.setPassword(RedisPassword.of("123456"));
        JedisConnectionFactory factory = new JedisConnectionFactory(config);
        return factory;
    }

    /**
     * jedis -- Sentinel 应该是 redis 的一个特性，虽然目前不清楚是啥，但是先留着吧
     */
    @Bean
    public RedisConnectionFactory jedisConnectionFactoryWithSentinel() {
        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
                .master("mymaster")
                .sentinel("127.0.0.1", 26379)
                .sentinel("127.0.0.1", 26380);
        return new JedisConnectionFactory(sentinelConfig);
    }


    //------------------------ Lettuce -------------------------------

    /**
     * Lettuce
     */
    @Bean
    public RedisConnectionFactory lettuceConnectionFactory() {
        LettuceConnectionFactory lettuceConnectionFactory = new LettuceConnectionFactory();
        return lettuceConnectionFactory;
    }

    /**
     * Lettuce
     */
    @Bean
    public RedisConnectionFactory lettuceConnectionFactoryWithSentinel() {
        RedisSentinelConfiguration sentinelConfig = new RedisSentinelConfiguration()
                .master("mymaster")
                .sentinel("127.0.0.1", 26379)
                .sentinel("127.0.0.1", 26380);
        return new LettuceConnectionFactory(sentinelConfig);
    }


    /**
     * 这个 demo 没别的内容，就是配置 redis 连接。因为目前共有两种不同的客户端，所以，jedis 和 Lettuce 都有例子,不过会以 jedis 为主
     *
     * @param args
     */
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
}
