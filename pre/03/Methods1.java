public class Methods1{

    /**
    * zoop outputs:
    *baffle which prints "wug.\n"
    *"You wugga "
    *"wug.\n"
    *"wug.\nYou wugga wug.\n"
    */
    public static void zoop() {
      baffle();
      System.out.print("You wugga ");
      baffle();
    }

    /**
    *"No, I wug.\nYou wugga wug.\nI wug.\n"
    */

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    /**
    *"wug.\n"
    */

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    /*
    *".\n"
    */

    public static void ping() {
        System.out.println(".");
    }

}
