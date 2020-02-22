package com.vp.DemoSpring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory beanfactory = new ClassPathXmlApplicationContext("context.xml");
        BasicBean bean = (BasicBean) beanfactory.getBean("basic");
        System.out.println(bean.getMesg());
    }
}
