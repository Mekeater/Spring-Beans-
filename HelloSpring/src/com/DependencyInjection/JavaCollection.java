package com.DependencyInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	
	/***Spring ע�뼯��***/
	//Java Collection ���� List��Set��Map �� Properties
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
	   
	
	//��������ֵ�������⣬Spring �ṩ���������͵ļ��ϵ�����Ԫ��<list>,<set>,<map>,<props>
	
}
