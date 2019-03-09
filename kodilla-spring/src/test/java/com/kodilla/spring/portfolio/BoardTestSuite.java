package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //given
        ApplicationContext context
                = new AnnotationConfigApplicationContext(BoardConfig.class);

        Board board = context.getBean(Board.class);
        TaskList taskList = context.getBean(TaskList.class);
        //when&then
        List<String> expected = new ArrayList<>();
        expected.add("TO DO");
        Assert.assertEquals(expected,taskList.taskList);
//        Assert.assertEquals(expected,board.getToDoList());
//        Assert.assertEquals("IN PROGRESS",board.getInProgressList());
//        Assert.assertEquals("DONE",board.getDoneList());


    }
}
