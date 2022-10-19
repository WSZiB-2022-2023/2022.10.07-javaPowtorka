package pl.edu.wszib.powtorka;

public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client(String name, String surname, int age, long pesel) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name, String surname, int age, long pesel,
           String street, String city, String postCode) {
        this(name, surname, age, pesel);
        this.address = new Address(street, city, postCode);
    }

    Client(){}
    int add(int a, int b) {
        return a+b;
    }

    double add(double a, double b) {
        return a+b;
    }

    void powiedzImie() {
        System.out.println(this.name);
    }

    void varargs(int... argumenty) {
        System.out.println(argumenty[0]);
    }

    void varargs2(int[] argumenty) {
        System.out.println(argumenty[0]);
    }
}
