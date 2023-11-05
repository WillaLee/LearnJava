package udacity_java_programming;

public class Person {
    private String firstName;
    private  String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName(){
        return firstName + lastName;
    }

    public void setName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "First Name:" + firstName + " Last Name:" + lastName;
    }
}