package com.atguigu.elasticsearch.demo.repository;

import com.atguigu.elasticsearch.demo.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserRepository extends ElasticsearchRepository<User,Long> {

}
