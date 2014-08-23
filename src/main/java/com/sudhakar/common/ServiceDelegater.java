package com.sudhakar.common;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ServiceDelegater {
	
private static BeanFactory bf;
	
	/**
	 * @param serviceName
	 * @return
	 */
	public static Object getService(String serviceName){
		
		if(bf==null){
			ClassPathResource res =  new ClassPathResource("servlet-context.xml");
			bf = new XmlBeanFactory(res);
		}		
		Object service = bf.getBean(serviceName);		
		return service;
	}

}
