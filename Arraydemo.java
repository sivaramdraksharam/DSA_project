package com.satyam.sivaram;

class Customer
{
	int customterId;
	char customerInitial;
	String customerName;
	String customerPhone;
	
	
	public Customer() {
		super();
	}
	
	public Customer(int customterId, String customerName, String customerPhone) {
		super();
		this.customterId = customterId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}

	public int getCustomterId() {
		return customterId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomterId(int customterId) {
		this.customterId = customterId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public char getCustomerInitial() {
		return customerInitial;
	}

	public void setCustomerInitial(char customerInitial) {
		this.customerInitial = customerInitial;
	}
	
	
}
public class Arraydemo {

	public static void main(String[] args) {
		
		Customer c1=new Customer(1,"Sahil Dixit","452135785");
		c1.setCustomerInitial('D');
		
		Customer c2=new Customer(2,"Sivaram Prasad","122135785");
		c1.setCustomerInitial('D');
		

	}

}
