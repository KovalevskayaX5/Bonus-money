public class Main {
    public static void main(String[] args) {

        int w = 500; //начальный счет
        int t = 1300;  //сумма пополнения

        if (t > 1000) {
            System.out.println(w + (t / 100));
        } else {


            if (t < 100) {
                System.out.println(w + t);
            }

        }
    }
}