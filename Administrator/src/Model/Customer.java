package Model;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private int id;
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String phoneNumber;
	
	public Customer(String firstName, String lastName, String street,
			String city, String phoneNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String toString()
	{
		return id + " " + firstName + " " + lastName + " " + street + " " + city + " " + phoneNumber + "\n";
	}

}
