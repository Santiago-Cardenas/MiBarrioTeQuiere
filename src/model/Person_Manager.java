package model;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.cannotEnterException;
import exceptions.noIdTypeException;
import exceptions.notValidIdNumberException;
import exceptions.tiException;

public class Person_Manager {
    private ArrayList<Person> registeredPersons;
    private int day;
    private int totalTries;

    public Person_Manager(){
        registeredPersons = new ArrayList<Person>();
        day= LocalDate.now().getDayOfMonth();
    }

    public String register(int idType,String idNumber) throws tiException, noIdTypeException, notValidIdNumberException, cannotEnterException {
    	Person newPerson=null;
    	String msg="";
    	switch(idType) {

			case 1:
				newPerson = new Person(Type.TI,idNumber);
				break;

			case 2:
				newPerson = new Person(Type.CC,idNumber);
				break;

			case 3:
				newPerson = new Person(Type.PP,idNumber);
				break;

			case 4:
				newPerson = new Person(Type.CE,idNumber);
				break;

			default:
				throw new noIdTypeException();
    		
    	}
		if(idNumber.length()<2){
			throw new notValidIdNumberException();
		}

		totalTries++;
		char penultimate =newPerson.getIdNumber().charAt(newPerson.getIdNumber().length()-2);
		int verify=Integer.parseInt(String.valueOf(penultimate));
		if(newPerson.getIdType().equals(Type.TI)) {
			throw new tiException();
		}
		else if(verify%2==0 && day%2!=0){
			msg+="Registered!\n";
			registeredPersons.add(newPerson);
		}
		else if(verify%2!=0 && day%2==0){
			msg+="Registered!\n";
			registeredPersons.add(newPerson);
		}
		else{
			throw new cannotEnterException();
		}
    	
    	return msg;
    }

    public int getTotalTries() {
        return totalTries;
    }

	public void setDay(int day) {
		this.day = day;
	}
    
}
