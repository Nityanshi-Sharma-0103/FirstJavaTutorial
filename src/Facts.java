public class Facts {
    public static void main(String[] args) {
        int x = 100;
        int y = ++x;
        //int z = ++100;
        System.out.println("Value of x: " + x--);

        /*
        * we can use increment and decrement operators only on variables,not with constants
        * Nesting of increment and decrement operators is not allowed.
        * We can use increment and decrement operators with normal variables only, but not with final variables.
        *
        * */

        final int temp = 10; // final variables cannot be changed
        // by writing  the keyword final , it becomes final variable.
        // it is constant.


        // we can apply increment and decrement operators on every primitive type except boolean.

        boolean b = true; // boolean cannot be incremented or decremented
        // b++; // this will give an error
        // b--; // this will give an error
        System.out.println("Value of y: " + y);
        System.out.println("Value of temp: " + temp);
        System.out.println("Value of b: " + b);
        // System.out.println("Value of z: " + z); // this will give an error
        // System.out.println("Value of z: " + ++100); // this will give an error
        // System.out.println("Value of z: " + 100++); // this will
        // give an error
        // System.out.println("Value of z: " + 100--); // this will





    }
}
