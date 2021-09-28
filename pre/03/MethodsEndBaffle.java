public class MethodsEndBaffle{

    /*
    *invoking baffle at the end of ping will create a loop and the main function will get stuck at zoop because of baffle.
    *Baffle calls ping which calls baffle which calls pings ...
    */

    public static void zoop() {
      baffle();
      System.out.print("You wugga ");
      baffle();
    }



    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }



    public static void baffle() {
        System.out.print("wug");
        ping();
    }



    public static void ping() {
        System.out.println(".");
        baffle();
    }

}
