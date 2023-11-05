package udacity_java_programming.exceptionExample;

public class Phone {
    private String PhoneType;
    private String PhoneNumber;

    public Phone(String phoneType, String phoneNumber){
        if(phoneType == null || phoneNumber == null){
            throw new IllegalArgumentException("The type and number cannot be null");
        }
        this.PhoneType = phoneType;
        this.PhoneNumber = phoneNumber;
    }

    public String getPhoneType(){
        return PhoneType;
    }

    public String getPhoneNumber(){
        return PhoneNumber;
    }

    public void setPhoneType(String phoneType){
        this.PhoneType = phoneType;
    }

    public void setPhoneNumber(String phoneNumber){
        this.PhoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Phone Type: " + PhoneType + " Phone Number: " + PhoneNumber;
    }
}
