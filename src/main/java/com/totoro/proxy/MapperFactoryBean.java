package com.totoro.proxy;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface){
        this.mapperInterface = mapperInterface;
    }

    @Override
    public T getObject() throws Exception {

        InvocationHandler handler = ((proxy, method, args) -> {
            Select select = method.getAnnotation(Select.class);
            System.out.println("SQL:"+select.value().replace("#{id}",args[0].toString()));
            return args[0];
        });

        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{mapperInterface}, handler);
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
