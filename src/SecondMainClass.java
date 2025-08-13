public class SecondMainClass {
    public static void main(String[] args) {
        int x = 100;
        int y = x--; // post-decrement
        int z = --x; // pre-decrement
        System.out.println("Value of x : " + x);
        System.out.println("Value of y : " + y);
        System.out.println("Value of z : " + z);

        /*
        x = 98
        * y = 100
        * z = 98
        * */


    }
}
