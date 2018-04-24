package spring.data.demos.redis.serializers;

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
import org.springframework.data.redis.serializer.*;

/**
 *
 */
@SpringBootApplication
public class Main {

    //------------------------ common -------------------------------



    //------------------------ jedis -------------------------------






    //------------------------ Lettuce -------------------------------






    /**
     * 尽管 redis 有多种不同的数据类型，但实际上，存储的都是 bytes(字节) . 所以，序列化和反序列化就很重要了
     *  相关的内容都在  org.springframework.data.redis.serializer　这个包里
     *
     * @param args
     */
    public static void main(String[] args) {
        //序列化与反序列化的接口主要是下面三个
        // 这一个是　序列化和反序列化　都支持 -- 内部使用 byte[]
        RedisSerializer redisSerializer = null;

        //这一个是反序列化接口 -- 这两个接口和上面那个接口的最大区别是内部使用了 ByteBuffer
        RedisElementReader redisElementReader = null;
        //这一个是序列化接口
        RedisElementWriter redisElementWriter = null;


        // 关于这些接口的实现，目前有两种现成的可以使用

        // 这个是默认选项
        JdkSerializationRedisSerializer jdkSerializationRedisSerializer = null;
        StringRedisSerializer stringRedisSerializer = null;

        // 上面都只是普通对象的序列化实现，生产环境中，可能会有 xml json 等其它形式的数据需要序列化。

        // xml
        OxmSerializer oxmSerializer = null;

        // json
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = null;
        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer = null;





        SpringApplication.run(Main.class, args);
    }
}
