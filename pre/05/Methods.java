public class Methods{

    /**
    *isDivisible takes 2 integers, n annd m,and that returns true if n is divisible by m, and false otherwise.
    *@param n is the dividend
    *@param m is the divisor
    *@returntrue if n is divisible by m, and false otherwise
    **/

    public static boolean isDivisible(int n, int m){
        if(n % m == 0){
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }

    /**
    *isTriangle takes 3 integers, s1 s2 s3,and returns true if a triangle can be made, and false otherwise.
    *@param s1 is side 1
    *@param s2 is side 2
    *@param s3 is side 3
    *@returntrue if a triangle can be made, and false otherwise
    **/

    public static boolean isTriangle(int s1, int s2, int s3){
        if(s1 >= s2 + s3){
            System.out.println("You stupid.");
            return false;
        }else if(s2 >= s1 + s3){
            System.out.println("You stupid.");
            return false;
        }else if(s3 >= s1 + s2){
            System.out.println("You stupid.");
            return false;
        }else{
          System.out.println("You can have triangle :)");
          return true;
        }
    }

    /**
    *ack is a program I can't describe in a sentence.
    *@param m is an int
    *@param n is an int
    *@return an int
    **/

    public static int ack(int m, int n){
        if (m == 0){
            //int fin;
            //fin = n + 1;
            //System.out.println(fin);
            return n + 1;
        }
        if (m > 0 && n == 0){
            //int fin;
            //fin = ack(m-1, 1);
            //System.out.println(fin);
            return ack(m-1, 1);
        }
        //int fin;
        //fin = ack(m - 1, ack(m, n - 1));
        //System.out.println(fin);
        return ack(m - 1, ack(m, n - 1));

    }

    /**
    if(m == 0){
        return n + 1;
    } else{
        if(m > 0 && n == 0){
            ack(m-1, 1);
        } else{
            ack(m - 1, ack(m, n-1));
        }
    }
    **/

    public static void main(String[] args){
        //isDivisible(7, 3);
        //isTriangle(10,1,1);
        System.out.println(ack(1,1));
    }
}
