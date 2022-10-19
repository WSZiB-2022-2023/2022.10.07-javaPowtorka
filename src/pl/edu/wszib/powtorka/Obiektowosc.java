package pl.edu.wszib.powtorka;

public class Obiektowosc {
    public static void main(String[] args) {
        Client[] tab = new Client[5];

        Client c1 = new Client();
        Client c2 = new Client();

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        //String s = "ABC";

        c2.name = "Zbyszek";

        int jakisWiekMojegoKlienta = 5;

        Address address = new Address();
        address.city = "Krakow";
        address.street = "Ogrodowa";
        address.postCode = "12-123";

        c1.address = address;

        c2.address = new Address();
        c2.address.city = "Poznań";
        c2.address.street = "Kijwska";
        c2.address.postCode = "23-234";

        System.out.println(c2.add(4,7));

        c2.powiedzImie();

        c2.varargs(3, 4, 5, 67, 7, 5);
        int[] abc = {1,2,3,4,5};
        c2.varargs2(abc);

        System.out.println(c2.add(3.3, 5.5));

        System.out.println(345);
        System.out.println("ABC");

        Client c3 = new Client("Jan", "Kowalski",
                40, 23452345L);

        System.out.println(c3.name);
        System.out.println(c3.surname);
        System.out.println(c3.age);
        System.out.println(c3.pesel);
        System.out.println(c3.address);

        Client c4 = new Client();
        System.out.println(c4.name);
        System.out.println(c4.surname);
        System.out.println(c4.age);
        System.out.println(c4.pesel);
        System.out.println(c4.address);
        //System.out.println(c4.address.street);

        System.out.println("-------------------------------------------");

        Client c5 = new Client(
                "Wiesiek",
                "Malinowski",
                40,
                2334523423L,
                "Ogrodowa",
                "Krakow",
                "12-123");

        System.out.println(c5.name);
        System.out.println(c5.surname);
        System.out.println(c5.age);
        System.out.println(c5.pesel);
        System.out.println(c5.address);
        System.out.println(c5.address.street);
        System.out.println(c5.address.city);
        System.out.println(c5.address.postCode);

        for(int i = 0; i < 10; i++) {
            int j = 6;
        }

        //System.out.println(i);

        for(int i = 0; i < 10; i++) {
            //???
        }

        int i = 5;
    }
}
