package com.springbook.ioc.injection;
//p93-94
import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.springbook.ioc.injection.CollectionBean;
//p94-96
import java.util.Set;
//p96-97
import java.util.Map;
//p97-98
import java.util.Properties;




public class CollectionBeanClient {
	
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("collectionContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
//p93-94		
//		List<String> addressList = bean.getAddressList();
//		for(String address : addressList) {
//			System.out.println(address.toString());//toString 없어도 됨.
//			System.out.println("address: "+address);
//		}
//		factory.close();
		
//p94-96
//		Set<String> addressList = bean.getAddressList();
//		for(String address : addressList) {
//			System.out.println("address: "+address);
//		}
//		factory.close();
//		Set<String> addressList = bean.getAddressList();//int 자료형으로도 해보기
//		for(String address : addressList) {
//			System.out.println("address: "+address);
//		}
//		factory.close();
		
//p96-97
//		Map<String, String> addressList = bean.getAddressList();
//		for(String name : addressList.keySet() ) {
//			System.out.println("name: "+name+"address: "+addressList.get(name));
//		}
//		Iterator<String> k = addressList.keySet//으로 hasnext 써서 해보긴
//	
//		factory.close();

//p97-98		
		Properties addressList = bean.getAddressList();
		for(Map.Entry<Object, Object>entry : addressList.entrySet() ) {
			System.out.println("name: "+entry.getKey()+"address: "+entry.getValue());
			
		}
		factory.close();
		
		
		
	}
	
	
}
