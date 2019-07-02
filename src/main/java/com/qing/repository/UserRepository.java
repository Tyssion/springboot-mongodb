package com.qing.repository;

import com.qing.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: zhching
 * @Date: 2019/7/2 10:41
 * @Version 1.0
 */
@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
