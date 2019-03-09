package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import java.util.ArrayList;
import java.util.List;


@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

//    @Autowired
//    @Qualifier("inProgressList")
//    TaskList inProgressList;
//
//    @Autowired
//    @Qualifier("doneList")
//    TaskList doneList;

    @Bean(name="toDoList")
    @Scope("prototype")
    public TaskList getToDoList(){
        List<String> data= new ArrayList<>();
        data.add("TO DO");
        System.out.println("TO DO dodaje do listy");
        return new TaskList(data);
    }

//    @Bean(name="inProgressList")
//    @Scope("prototype")
//    public TaskList getinProgerssList(){
//        List<String> data= new ArrayList<>();
//        data.add("IN PROGRESS");
//        System.out.println("In PROGRESS dodaje do listy");
//        return new TaskList(data);
//    }
//
//    @Bean(name="doneList")
//    @Scope("prototype")
//    public TaskList getDoneList(){
//        List<String> data= new ArrayList<>();
//        data.add("DONE");
//        System.out.println("DONE dodaje do listy");
//        return new TaskList(data);
//    }


    @Bean
    public Board getBoard(){
        return new Board(getToDoList(),getToDoList(),getToDoList());
        //getinProgerssList(),getDoneList()
    }
}
