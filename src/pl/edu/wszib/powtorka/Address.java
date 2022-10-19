package pl.edu.wszib.powtorka;

public class Address {
    String street;
    String city;
    String postCode;

    Address(String street1, String city1, String postCode1) {
        street = street1;
        city = city1;
        postCode = postCode1;
    }

    Address() {
        System.out.println("Tworzy się adres !!!");
    }
}
