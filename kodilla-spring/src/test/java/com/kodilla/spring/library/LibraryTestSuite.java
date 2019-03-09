package com.kodilla.spring.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)//przed wykonaniem testów należy wykonać kod klasy SpringRunner
@SpringBootTest
public class LibraryTestSuite {

    @Test
    public void testLoadFromDb(){
        //given
        ApplicationContext context =
                 new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);
        //when
        library.loadFromDb();
        //then
        //do nothing
    }


    @Test
    public void testSaveToDb(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.library");
        Library library = context.getBean(Library.class);
        //when
        library.saveToDb();
        //then
        //do nothhing
    }

    @Test
    public void testContextWithClassConfiguration(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(LibraryConfig.class);
        //when&then
        System.out.println("======= Beans list: =====>>");
        //metoda getBeanDefinitionName wyświetla nazwy Benaów w Kontenerze
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<========= Banens list =====");

    }


    @Test
    public void testContextWithBasePackage(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        //when&then
        System.out.println("========Beans list: ======>>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("========== Beans list ===========");
    }
}
