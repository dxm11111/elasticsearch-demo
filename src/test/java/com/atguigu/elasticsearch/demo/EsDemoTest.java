package com.atguigu.elasticsearch.demo;

import com.atguigu.elasticsearch.demo.pojo.User;
import com.atguigu.elasticsearch.demo.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EsDemoTest {
    @Autowired
    private ElasticsearchRestTemplate restTemplate;
    @Autowired
    private UserRepository userRepository;


    @Test
    public void test(){

        this.restTemplate.createIndex(User.class);
        this.restTemplate.putMapping(User.class);
    }

    @Test
    public void testDocument(){
        this.userRepository.save(new User(1l,"柳岩，身材好",30,"123456"));
    }
}
