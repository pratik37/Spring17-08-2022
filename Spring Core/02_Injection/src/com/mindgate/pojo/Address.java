package com.mindgate.pojo;

public class Address {
	private	int addressId;
	private	String houseNumber;
	private	String housingName;
	private	String street;
	private	String city;
	private	String Pin;
		public Address() {
			
		}
		
		public Address(int addressId, String houseNumber, String housingName, String street, String city, String pin) {
			super();
			this.addressId = addressId;
			this.houseNumber = houseNumber;
			this.housingName = housingName;
			this.street = street;
			this.city = city;
			Pin = pin;
		}

		public int getAddressId() {
			return addressId;
		}
		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}
		public String getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}
		public String getHousingName() {
			return housingName;
		}
		public void setHousingName(String housingName) {
			this.housingName = housingName;
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
		public String getPin() {
			return Pin;
		}
		public void setPin(String pin) {
			Pin = pin;
		}
		@Override
		public String toString() {
			return "Address [addressId=" + addressId + ", houseNumber=" + houseNumber + ", housingName=" + housingName
					+ ", street=" + street + ", city=" + city + ", Pin=" + Pin + "]";
		}
	

}
