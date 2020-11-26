package ru.otus.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otus.spring.domain.Person;
import ru.otus.spring.service.PersonService;

public class Main {

    public static void main(String[] args) {
        // создайте здесь класс контекста
        ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("/spring-context.xml");
        // Получите Person Service
        PersonService service = context.getBean(PersonService.class);
        // Получите Person "Ivan"
        Person ivan = service.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());
        //закроем контекст
        context.close();
    }
}
