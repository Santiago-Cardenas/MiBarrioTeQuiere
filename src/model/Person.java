package model;

public class Person {
	String idNumber;
	Type idType;
	
	public Person (Type idType, String idNumber) {
		this.idNumber=idNumber;
		this.idType=idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public Type getIdType() {
		return idType;
	}
	
}
