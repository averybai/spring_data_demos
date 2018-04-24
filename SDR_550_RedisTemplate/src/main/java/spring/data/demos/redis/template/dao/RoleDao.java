package spring.data.demos.redis.template.dao;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class RoleDao {


    @Resource
    RedisTemplate redisTemplate;

}
