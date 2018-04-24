package spring.data.demos.redis.hash.dao;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ResourceDao {

    @Resource
    RedisTemplate redisTemplate;


}
