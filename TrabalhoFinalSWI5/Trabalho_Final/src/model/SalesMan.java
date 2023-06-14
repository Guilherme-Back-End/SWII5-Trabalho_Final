package model;

public class SalesMan {
	
	
	private int id;
	private String name;
	private String city; 
	private Double commission;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getComission() {
		return commission;
	}
	public void setCommission(double com) {
		this.commission = com;
	}
	@Override
	public String toString() {
		return "SalesMan [id=" + id + ", name=" + name + ", city=" + city + ", commission=" + commission + "]";
	}


}
