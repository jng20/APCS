public class Date{
      public static void main(String[] args){
          String day, month;
          int date, year;
          day = "Monday";
          month = "August";
          year = 2021;
          date  = 30;

          //System.out.print(day);
          //System.out.print(month);
          //System.out.print(date);
          //System.out.print(year);
          System.out.println("American format:");
          System.out.println(day + ", " + month + " " + date + ", " + year);
          System.out.println("European format:");
          System.out.println(day + " " + date + " " + month + " " + year);
      }
}
