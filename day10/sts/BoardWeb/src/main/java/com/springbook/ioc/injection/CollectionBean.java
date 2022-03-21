package com.springbook.ioc.injection;

//p92-94
import java.util.List;
//p94-96
import java.util.Set;
//p96-97
import java.util.Map;
//p97-98
import java.util.Properties;

public class CollectionBean {
	
//p92-94
//	private List<String> addressList;
//
//	public void setAddressList(List<String> addressList) {
//		this.addressList = addressList;
//	}
//	public List<String> getAddressList() {
//		return addressList;
//	}
		
//p94-96
//	private Set<String> addressList;
//	
//	public void setAddressList(Set<String> addressList) {
//		this.addressList = addressList;
//	}
//	public Set<String> getAddressList(){
//		return addressList;
//	}

//p96-97	
//	private Map<String, String> addressList;
//	
//	public Map<String, String> getAddressList() {
//		return addressList;
//	}
//	
//	public void setAddressList(Map<String, String> addressList) {
//		this.addressList = addressList;
//	}

//p97-98	
	private Properties addressList;

	public Properties getAddressList() {
		return addressList;
	}

	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	
	
	
}
