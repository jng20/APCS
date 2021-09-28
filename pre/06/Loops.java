public class Loops{

    /**
    *Power is an exponential function
    @param x is the base
    @param n is the exponent
    **/
    public static void power(double x, int n){
        double answer, initial;
        initial = x * x;
        answer = initial * x;
        for(int i = 1; i <= n - 2; i++){

            answer = initial * x;
            initial = answer;

        }
        System.out.println(answer);
    }

    /**
    *factorial calculates the factorial of x
    @param x
    **/
    public static void factorial(int x){
        if (x < 0){
            System.out.println("DNE");
        }else if(x == 0){
            System.out.println("1");
        }else{
          int answer;
          answer = 1;
            for(int i = 1; i <= x; i++){
              answer = answer * i;
            }
          System.out.println(answer);
        }
    }

    public static int factorialint(int x){
        //if (x < 0){
            //System.out.println("DNE");
            //break;
        //}else
        if(x == 0){
            //System.out.println("1");
            return 1;
        }else{
          int answer;
          answer = 1;
            for(int i = 1; i <= x; i++){
              answer = answer * i;
            }
          //System.out.println(answer);
          return answer;
        }

    }
    /**
    public static double myexp(int x, int n){
        double estimate;
        estimate = 1;
        for(int i = 1; i <= n; i++){
           estimate = estimate + ((Math.pow(x, i))/factorialint(i));
        }
        return estimate;
    }
    **/
    public static double myexp(double x, int n){
        int i;
        double estimate, numerator, denominator;
        estimate = 1;
        numerator = x;
        denominator = 1;
        //question about n and n-1 chnging the answer
        for(i = 1; i <= n; i++){
           numerator = numerator * x;
           denominator = denominator * i;
           estimate = estimate + (numerator/denominator);
        }
        return estimate;
    }

    public static void check(double x){
        System.out.println(x + "  " + myexp(x, 30) + "  " + Math.exp(x));
    }

    public static void main(String[] args){
        //power(2,3);
        //factorial(-2);
        //factorial(0);
        //factorial(5);
        //System.out.println(factorialint(3));
        //System.out.println(myexp(1,10));
        double x, y;
        x = 0.01;
        y = -0.01;
        for(int i = 1; i<= 4; i++){
          x = x * 10;
          check(x);
        }
        for(int i = 1; i<= 4; i++){
          y = y * 10;
          check(y);
        }
    }
}
