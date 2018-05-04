package com.DependencyInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	
	/***Spring 注入集合***/
	//Java Collection 类型 List、Set、Map 和 Properties
	List addressList;
	Set  addressSet;
	Map  addressMap;
	Properties addressProp;
	public List getAddressList() {
		return addressList;
	}
	public Set getAddressSet() {
		return addressSet;
	}
	public Map getAddressMap() {
		return addressMap;
	}
	public Properties getAddressProp() {
		return addressProp;
	}
	public void setAddressList(List addressList) {
		this.addressList = addressList;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public void setAddressProp(Properties addressProp) {
		this.addressProp = addressProp;
	}
	   
	
	//解决上面多值集合问题，Spring 提供了四种类型的集合的配置元素<list>,<set>,<map>,<props>
	
}
