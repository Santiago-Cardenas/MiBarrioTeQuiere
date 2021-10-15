package ui;
import exceptions.cannotEnterException;
import exceptions.noIdTypeException;
import exceptions.notValidIdNumberException;
import model.Person_Manager;
import java.util.Scanner;

import exceptions.tiException;

	public class Main {

	private Scanner sc;
	private Person_Manager person_manager;
	private boolean exit;
    public Main() {
        sc = new Scanner(System.in);
		person_manager=new Person_Manager();
		exit=false;
    }

    public static void main(String[] args){
        Main main = new Main();
		while(main.exit==false){
			main.menu();
		}
    }
    
    public void menu() {
		System.out.println("Please select an option\n"+
				"1)Register a person\n"+
				"2)See how many people have tried to register\n"+
				"3)Exit\n");
    	int option=sc.nextInt();
    	exit=false;
    	sc.nextLine();
    	switch(option) {
    	
	    	case 1:
	    		registerPerson();
	    	break;
	    	
	    	case 2:
				System.out.println("A total of: " + person_manager.getTotalTries() + " persons tried to enter\n");
	        break;
	        
	    	case 3:
				System.out.println("Goodbye\n");
				exit=true;
	        break;

    	}
    }

	private void registerPerson() {
		System.out.println("What is the person ID type?\n"+
						   "1)TI *tarjeta de identidad*\n"+
						   "2)CC *cedula de ciudadania*\n"+
						   "3)PP *pasaporte*\n"+
						   "4)CE *cedula de extranjeria\n");
		int idType=Integer.parseInt(sc.nextLine());
		System.out.println("What is the person ID number?\n");
		String idNumber=sc.nextLine();
		try {
			System.out.println(person_manager.register(idType,idNumber));
		} catch (tiException e) {
			System.err.println(e.getMessage());
		}catch (noIdTypeException e) {
			System.err.println(e.getMessage());
		} catch (notValidIdNumberException e) {
			System.err.println(e.getMessage());
		} catch (cannotEnterException e) {
			System.err.println(e.getMessage());
		}
	}
}
