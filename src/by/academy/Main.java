package by.academy;

public class Main {

    public static void main(String[] args) {
        System.out.println("Lesson 3");

        int i = 1;
        int m = 2* i++ + i++; //2*i=> i+1 => 2+i(=2) => m=4, i ++ (i=2+ 1);
        System.out.println(m);
        System.out.println(i);

        /*
        int i = 1;
        int m = 2* ++i + i++; //2*2+2 =6   2*(1+1)+1+1=6
        System.out.println(m);
        System.out.println(i);

         */





        /*
        int x = 6;

        if (x > 5 || 1 < x && x < 5) { // если я правильно понял
            System.out.println("true");
        } else {
            System.out.println("false");

        };
        */



        /*
        if (a  2 ==% 0) {
            //5 = 2*2 остаток 1; мы получили тем самым остаток от деления. НЕ ДЕЛЕНИЕ, а именно остаток.
            System.out.println("Чётное");
        }else{
            System.out.println("нечётное");

        };
        */

    }
}
