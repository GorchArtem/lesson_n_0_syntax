package constructor_homework;

public class Human {

    String name;
    Address homeAddress;

    public Human (String name, String city, String street) {
        this.homeAddress = new Address(city, street);
    }

    public Human(Address address) {
        this.homeAddress = address;
    }


}


