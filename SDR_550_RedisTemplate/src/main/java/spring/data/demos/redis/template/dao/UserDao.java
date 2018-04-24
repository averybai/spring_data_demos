package spring.data.demos.redis.template.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.redis.core.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import spring.data.demos.redis.template.model.User;

import javax.annotation.Resource;
import java.util.Optional;

@Repository
public class UserDao implements PagingAndSortingRepository<User,Long> {


    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;


    private ValueOperations valueOps;
    private ListOperations listOps;
    private HashOperations hashOps;
    private SetOperations setOps;
    private ZSetOperations zsetOps;


    {
        // 不太明白为什么要这样做，而不是直接让 redisTemplate 代理所有的接口
        valueOps = redisTemplate.opsForValue();
        listOps = redisTemplate.opsForList();
        hashOps = redisTemplate.opsForHash();
        setOps = redisTemplate.opsForSet();
        zsetOps = redisTemplate.opsForZSet();


    }




    @Override
    public Iterable<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends User> S save(S entity) {
        return null;
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return null;
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<User> findAll() {
        return null;
    }

    @Override
    public Iterable<User> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(User entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
