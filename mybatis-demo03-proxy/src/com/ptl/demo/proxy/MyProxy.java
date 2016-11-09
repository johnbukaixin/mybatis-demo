package com.ptl.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy implements InvocationHandler{
   private Class clazz;
	public Object myProxy(Class clazz){
	   this.clazz=clazz;
		return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, this);
	}
	/**
	 * 这就是一个模板处理方法中重复的东西的
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(clazz.getCanonicalName()+"命名空间");
        
        System.out.println(method.getName()+"方法结束");
		return null;
	}

}
