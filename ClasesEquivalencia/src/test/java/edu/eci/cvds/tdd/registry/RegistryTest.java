package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();


    @Test
    public void should_RegisterPerson_When_IsAdultAndIsAlive() {
        
        //Arrange
        Person person = new Person("Camilo", 1001, 18, Gender.MALE , true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void should_NotRegisterPerson_When_IsAdultAndIsNotAlive() {
        
        //Arrange
        Person person = new Person("Camilo", 1002, 18, Gender.MALE , false);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void should_NotRegisterPerson_When_InvalidAge() {
        
        //Arrange
        Person person = new Person("Camilo", 1003, -10, Gender.MALE , true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void should_NotRegisterPerson_When_UnderrageAgeAndIsAlive() {
        //Arrange
        Person person = new Person("Camilo", 1007, 15, Gender.MALE , true);
        //Action
        RegisterResult result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void should_NotRegisterPerson_When_DuplicateIdAndIsAlive() {
        
        //Arrange
        Person person = new Person("Camilo", 1004, 18, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(person);
        //Action
        result = registry.registerVoter(person);
        //Assertion
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

}
