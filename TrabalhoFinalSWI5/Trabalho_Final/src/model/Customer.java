package model;

public class Customer {
	
	
	private int id;
	private String name;
	private String city; 
	private String grade;
	private int salesman;
	
	
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
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getSalesman() {
		return salesman;
	}
	public void setSalesman(int idsales) {
		this.salesman = idsales;
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", grade=" + grade + ", salesman="
				+ salesman + "]";
	}
	
	
	

}
