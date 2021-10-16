package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.cannotEnterException;
import exceptions.tiException;

class Person_ManagerTest {
	private Person_Manager personManager = new Person_Manager();

	public void setupScenary(){

	}
	@Test
	void testRegister() {
		setupScenary();
		int idType=2;
		String idNumber="1007560744";
		personManager.setDay(13);
		assertAll( () -> personManager.register(idType,idNumber));
	}
	
	@Test
	void testTICondition() {
		setupScenary();
		int idType=1;
		String idNumber="1007560744";
		assertThrows(tiException.class, () -> {
			personManager.register(idType,idNumber);
		});
	}
	
	@Test
	void testDayCondition() {
		setupScenary();
		int idType=2;
		String idNumber="1007560744";
		personManager.setDay(14);
		assertThrows(cannotEnterException.class, () -> {
			personManager.register(idType,idNumber);
		});
	}

}
