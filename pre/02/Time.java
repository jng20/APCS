public class Time{
      public static void main(String[] args){
          int hour, minute, second, passed, remain, total, percentage, hrnow, minnow, secnow, passnow;
          hour = 15;
          minute = 48;
          second = 7;
          passed = (hour * 3600 + minute * 60 + second);
          remain = ((24 * 3600) - (hour * 3600 + minute * 60 + second));
          total = (24 * 3600);
          percentage =  passed *100 / total;
          hrnow = 16;
          minnow = 12;
          secnow = 18;
          passnow = (hrnow * 3600 + minnow * 60 + secnow);
          //System.out.println(hour);
          //System.out.println(minute);
          //System.out.println(second);
          System.out.println("Seconds since midnight: "+ passed);
          System.out.println("Seconds left until midnight: "+ remain);
          System.out.println("percentage of day passed: "+  percentage + "%");
          System.out.println("Seconds since I started: "+ (passnow - passed));
      }
}
