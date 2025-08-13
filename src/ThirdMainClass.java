public class ThirdMainClass {
    public static void main(String[] args) {
        int n1 = 100;
        int n2, n3;
        n2 = ++n1;
        n3 = n1++ + --n2;
        System.out.println("Value of n1 :" + n1);
        System.out.println("Value of n2 :" + n2);
        System.out.println("Value of n3 :" + n3);

        /*
        n1 = 102
        n2 = 100
        n3 = 101 + 100 = 201

         */
    }
}
