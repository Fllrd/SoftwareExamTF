package ie.gmit;

public class Employee {
    private String Name;
    private String PhoneNumber;
    private String EmployeeNumber;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        if (name.length() >= 3 && name.length() < 25) {
            Name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name");
        }
    }
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(PhoneNumber.length() == 8) {
            PhoneNumber = phoneNumber;
        }
        else{
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        if(EmployeeNumber.length()== 5) {
            EmployeeNumber = employeeNumber;
        }
        else{
            throw new IllegalArgumentException("Invalid Employee Number");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16) {
            this.age = age;

        }
        else {
            throw new IllegalArgumentException("Age must be over 16")
        }
    }

    public Employee(){
        setName("John");
        setPhoneNumber("12345678");
        setEmployeeNumber("12345");
        setAge(21);

    }
    public Employee (String Name, String PhoneNumber, String EmployeeNumber, int age){
        setName(Name);
        setPhoneNumber(PhoneNumber);
        setEmployeeNumber(EmployeeNumber);
        setAge(age);
    }


}
