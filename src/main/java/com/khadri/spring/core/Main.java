package com.khadri.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String[] args) {

//        //BeanFactoryContainer Activation
//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader registry = new XmlBeanDefinitionReader(beanFactory);
//        registry.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//
//        //Lazy loading
//        beanFactory.getBean("b",Bean.class);


//        //ApplicationContextContainer Activation and Eager Loading
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


    }
}