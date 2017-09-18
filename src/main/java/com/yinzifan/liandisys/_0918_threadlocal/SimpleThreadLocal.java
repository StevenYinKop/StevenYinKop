package com.yinzifan.liandisys._0918_threadlocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yinzf2 2017/09/18 13:09:34
 * 
 */
// void set(Object value)
// 设置当前线程的线程局部变量的值；
// public Object get()
// 该方法返回当前线程所对应的线程局部变量；
// public void remove()
// 将当前线程局部变量的值删除，目的是为了减少内存的占用，该方法是JDK
// 5.0新增的方法。需要指出的是，当线程结束后，对应该线程的局部变量将自动被垃圾回收，
// 所以显式调用该方法清除线程的局部变量并不是必须的操作，但它可以加快内存回收的速度；
// protected Object initialValue()
// 返回该线程局部变量的初始值，该方法是一个protected的方法，
// 显然是为了让子类覆盖而设计的。这个方法是一个延迟调用方法，
// 在线程第1次调用get()或set(Object)时才执行，并且仅执行1次。
// ThreadLocal中的默认实现直接返回一个null。
public class SimpleThreadLocal {
	private Map valueMap = Collections.synchronizedMap(new HashMap());

	public void set(Object newValue) {
		// ①键为线程对象，值为本线程的变量副本
		valueMap.put(Thread.currentThread(), newValue);
	}

	public Object get() {
		Thread currentThread = Thread.currentThread();

		// ②返回本线程对应的变量
		Object o = valueMap.get(currentThread);

		// ③如果在Map中不存在，放到Map中保存起来
		if (o == null && !valueMap.containsKey(currentThread)) {
			o = initialValue();
			valueMap.put(currentThread, o);
		}
		return o;
	}

	public void remove() {
		valueMap.remove(Thread.currentThread());
	}

	public Object initialValue() {
		return null;
	}
}
