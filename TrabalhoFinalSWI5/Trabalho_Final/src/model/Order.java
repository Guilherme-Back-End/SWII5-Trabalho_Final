package model;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Order {
	
	
	private int order_id;
	private double purch_amt; 
	private String ord_date; 
	private int customer_id; 
	private int salesman_id;
	
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public double getPurch_amt() {
		return purch_amt;
	}
	public void setPurch_amt(double purch_amt) {
		this.purch_amt = purch_amt;
	}
	public String getOrd_date() {
		return ord_date;
	}
	public void setOrd_date(String date) {
 
		this.ord_date = date;
			
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public int getSalesman_id() {
		return salesman_id;
	}
	public void setSalesman_id(int salesman_id) {
		this.salesman_id = salesman_id;
	}
	
	} 
	
