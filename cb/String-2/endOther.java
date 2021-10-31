public class endOther{

  public static boolean endOther(String a, String b) {
    int big, small, size;
    String min, max;
    min = "";
    max = "";
    a = a.toLowerCase();
    b = b.toLowerCase();
    big = 0;
    small = 0;

    if( a.length() > b.length()){
        min = b;
        max = a;
    }else if ( b.length() > a.length()){
        min = a;
        max = b;
    }else{
        min = a;
        max = b;
    }
    big = max.length();
    small = min.length();
    size = big - small;
    //System.out.println(size);
    return ( max.substring(size).contentEquals(min));
    //return true;

  }

  public static void main(String[] args){
	   System.out.println(endOther("Hiabc", "abc"));
     System.out.println(endOther("AbC", "HiaBc"));
     System.out.println(endOther("abc", "abXabc"));
     //endOther("abc", "abXabc");
	}

}
