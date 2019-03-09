package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ForumUserTestSuite {

    @Test
    public void testGetUsername(){
        //given
        ApplicationContext context=
                new AnnotationConfigApplicationContext("com.kodilla.spring.forum");
        ForumUser forumUser = new ForumUser();
        //when
        String name = forumUser.username;
        //then
        Assert.assertEquals("John Smith",name);
    }
}
