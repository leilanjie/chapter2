package com.smart.service;

import com.smart.domain.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

@ContextConfiguration("classpath*:/smart-context.xml")
public class UserServiceTest extends AbstractTransactionalTestNGSpringContextTests {
     private UserService userService;
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Test
     public void hasMatchUser(){
        boolean b1=userService.hasMatchUser("admin","123456");
        boolean b2=userService.hasMatchUser("admin","1111");
          assertTure(b1);
          assertTure(!b2);
    }

    private void assertTure(boolean b) {
       if(!b) {
           System.out.println("用户添加失败");
       }
       else{
           System.out.println("用户添加成功");
       }
    }


    @Test
    public void findUserByUserName(){
        User user=userService.findUserByUserName("admin");
        assertEquals(user.getUserName(),"admin");
    }


}
