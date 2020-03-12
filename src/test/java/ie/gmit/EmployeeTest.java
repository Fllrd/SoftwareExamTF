package ie.gmit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static  org.junit.jupiter.api.Assertions.assertEquals;
import static  org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {
    private Employee myEmployee;
    @BeforeEach

    void init(){
        myEmployee = new Employee();

    }

    @Test

    void testName(){
        assertEquals("John",myEmployee.getName());
    }

    @Test

    void testPhoneNumber(){
        assertEquals("12345678",myEmployee.getPhoneNumber());
    }

    @Test

    void testEmployeeNumber(){
        assertEquals("12345",myEmployee.getEmployeeNumber());
    }
    @Test

    void testAge(){
        assertEquals(16,myEmployee.getAge());
    }

}
    @Test

    void testNameError() {
        Exception e = assertThrows(IllegalArgumentException, () -> myEmployee.setName("Jo"))
        assertEquals("Invalid Name", e.getMessage());
    }
    @Test

    void testPhoneNumberError(){
        Exception e = assertThrows(IllegalArgumentException, ()-> myEmployee.setPhoneNumber("12"))
        assertEquals("Invalid Phone Number",e.getMessage());
    }
    @Test

    void testEmployeeNumberError(){
        Exception e = assertThrows(IllegalArgumentException, ()-> myEmployee.setEmployeeNumber("1"))
        assertEquals("Invalid Employee Number",e.getMessage());
    }
    @Test

    void testAgeError(){
        Exception e = assertThrows(IllegalArgumentException, ()-> myEmployee.setAge(15))
        assertEquals("Age must be over 16",e.getMessage());
    }

    @test
void testFullArgConstructor(){
    Employee e = new Employee *("James", "07912345","54321",24);
    assertEquals("James"+"07912345"+"54321"+24, e.getName()+e.getPhoneNumber()+e.getEmployeeNumber()+e.getAge());



    }
