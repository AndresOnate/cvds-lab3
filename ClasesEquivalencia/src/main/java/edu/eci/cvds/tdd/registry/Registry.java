package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    
    private ArrayList<Person> registeredPersons= new ArrayList<Person>();

    public RegisterResult registerVoter(Person person) {

		int age = person.getAge();

        if (!person.isAlive()) {
			return RegisterResult.DEAD;

		} else if (age >= 0 && age <= 17) {
			return RegisterResult.UNDERAGE;

		} else if (age < 0 || age > 114) {
			return RegisterResult.INVALID_AGE;

		} else if (age > 17 && age < 114 && isPersonRegistered(person)) {
			return RegisterResult.DUPLICATED;
		}
		registeredPersons.add(person);
		return RegisterResult.VALID;
    }

	private boolean isPersonRegistered(Person person) {
		int personId = person.getId();
		for (Person registeredPerson : registeredPersons) {
			if (registeredPerson.getId() == personId) {
				return true;
			}
		}
		return false;
	}

}
