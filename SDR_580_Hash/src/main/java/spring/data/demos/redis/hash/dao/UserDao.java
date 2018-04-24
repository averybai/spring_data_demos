package spring.data.demos.redis.hash.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.redis.core.*;
import org.springframework.data.redis.hash.HashMapper;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import spring.data.demos.redis.hash.model.User;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 从对象到　redis hash 类型的映射，SDR 有三种不同的方式实现
 */
@Repository
public class UserDao implements PagingAndSortingRepository<User,Long> {


    @Resource
    private RedisTemplate redisTemplate;


    /**
     * strategie 1 -- 通过 HashOperations 和 serializer 实现
     *
     *
     */
    private HashOperations hashOps;

    /**
     *  strategie 2 - Using Redis Repositories - 这一种，先忽略，因为它需要在实体类上面加注解
     */


    /**
     *
     * strategie 3 -- 通过 HashOperations 和 HashMapper  实现
     * HashMapper 其实就是可以可以在 对象 和 map 之间进行转换的接口,
     * 现成的实现就有三种: BeanUtilsHashMapper ObjectHashMapper Jackson2HashMapper
     *
     *
     */
    private HashMapper hashMapper;

    {


        hashOps = redisTemplate.opsForHash();


    }




    @Override
    public Iterable<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    /**
     * 把对象以 hash 类型存储，需要先把对象转为 map
     * @param entity
     * @param <S>
     * @return
     */
    @Override
    public <S extends User> S save(S entity) {
        String key = null;
        Map<String,String> map = new HashMap<>(5);
        hashOps.putAll(key,map);


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
