package pl.edu.wszib.powtorka;

public class App2 {
    public static void main(String[] args) {
        Square k1 = new Square(5, 25, 20);

        System.out.println(k1.getSide());
        System.out.println(k1.getField());
        System.out.println(k1.getCircuit());

        //k1.field = 35;
        k1.setSide(10);

        System.out.println(k1.getSide());
        System.out.println(k1.getField());
        System.out.println(k1.getCircuit());

        k1.zrobCos();
    }
}
