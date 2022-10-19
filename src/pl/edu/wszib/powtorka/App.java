package pl.edu.wszib.powtorka;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int a = 3;
        if(a == 3) {
            System.out.println("to jest 3 !!");
        } else if(a == 4) {
            System.out.println("to jest 4 !!");
        } else if(a == 5) {
            System.out.println("to jest 5 !!");
        } else {
            System.out.println("to jest nie wiadomo co !!");
        }

        String cos = "B";
        switch(cos) {
            case "A":
                System.out.println("to jest a !!!");
            case "B":
                System.out.println("to jest b !!!");
            case "C":
                System.out.println("to jest c !!!");

            default:
                System.out.println("nie wiadomo co to jest !!!");
        }

        int m = 1;
        switch (m) {
            case 1,3,5,7:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4,6:
                System.out.println("30");
                break;
        }

        /*int i = 1;
        String s = switch(i) {
            case 1,2,3 -> "to jest jeden albo dwa albo trzy";
            case 4,5 -> "cos tam !!";
            default -> "Default Value !!";
        };*/

        int[] tab = new int[10];
        for(int i = 0; i < 10; i++) {
            tab[i] = new Random().nextInt(101);
        }

        for(int element : tab) {
            System.out.println(element);
        }

        int i = 0;
        while(i<10) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while(j<10);

        System.out.println("-----------------------------------");

        for(int z = 0; z < 10; z++) {
            if(z == 5) {
                continue;
            }
            System.out.println(z);
        }

        int[][][] tab2 = new int[3][3][3];

        tab2[0][0][0] = 5;

        int[][] t = tab2[0];

        int[] t2 = t[0];

        int t3 = t2[0];
    }
}
