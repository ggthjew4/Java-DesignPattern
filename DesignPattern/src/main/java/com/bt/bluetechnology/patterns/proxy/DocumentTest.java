package com.bt.bluetechnology.patterns.proxy;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class DocumentTest {

	@Test
	public void test() {
		Object image = Proxy.newProxyInstance(Graphic.class.getClassLoader(),
				new Class[] { Graphic.class }, new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method,
							Object[] args) throws Throwable {
						if (method.getName().equals("getFileName")) {
							return "Test.gif";
						}
						return null;
					}
				});

		assertTrue((Graphic) image instanceof Graphic);
		assertEquals(((Graphic) image).getFileName(), "Test.gif");

	}

}
