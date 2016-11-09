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
	 * �����һ��ģ�崦�������ظ��Ķ�����
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(clazz.getCanonicalName()+"�����ռ�");
        
        System.out.println(method.getName()+"��������");
		return null;
	}

}
