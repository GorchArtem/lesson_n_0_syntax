package constructor_homework;

public class Human {

    String name;
    Address homeAddress = new Address("Moscow", "Tverskaya");

    public Human (String name, String city, String street){

        Address address = new Address(homeAddress.city, homeAddress.street);
    }


}


