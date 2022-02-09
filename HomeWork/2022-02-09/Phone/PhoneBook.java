package kosta.oop;

public class PhoneBook {

    private String name;
    private String phoneNumber;
    private String birthDate;

    //Default Constructor
    public PhoneBook() {}

    //Constructor Overloading
    public PhoneBook(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    //getter
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
