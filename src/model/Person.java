package model;

public class Person {
	private String idNumber;
	private Type idType;
	
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
