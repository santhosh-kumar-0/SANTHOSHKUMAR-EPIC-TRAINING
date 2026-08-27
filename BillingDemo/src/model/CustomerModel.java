package model;

public class CustomerModel {
	String cusName;
	String cusMailId;
	int cusId;
	public CustomerModel(String cusName, String cusMailId, int cusId) {
		
		this.cusName = cusName;
		this.cusMailId = cusMailId;
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public String getCusMailId() {
		return cusMailId;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public void setCusMailId(String cusMailId) {
		this.cusMailId = cusMailId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	
	
	
	
	
}
