package spring.data.demos.common;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 对于 Spring data 这个大的项目来说，最核心的概念就是 Repository ,当然，这是一个空接口，实际使用，都是用它的子接口，
 * 比如 CrudRepository,PagingAndSortingRepository 等，这些接口定义了最基本的增删改查的操作，具体实现嘛，肯定是根据数据仓库的不同而不同.
 *
 *
 */
public class CoreConcepts {

    public static void main(String[] args) {
        CrudRepository repository = null;
        PagingAndSortingRepository pagingAndSortingRepository = null;
    }

}
