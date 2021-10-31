public class xyzThere{

  public static boolean xyzThere(String str) {
    String key, current, error;
    boolean there;
    key = "xyz";
    current = "";
    error = ".xyz";
    there = false;
    for(int i = 0; i <= str.length()-3; i++){
        current = str.substring(i,i+3);
        if(current.contentEquals(key)){
            there = true;
        }
        if(i > 0){
          if(current.contentEquals(key)){
              current = str.substring(i-1, i+3);
              if (current.contentEquals(error)){
                  there = false;
                }
              else {
                there = true;
              }
          }
        }
    }
    return there;


  }

  public static void main(String[] args){
	   System.out.println(xyzThere("abcxyz"));
     System.out.println(xyzThere("abc.xyz"));
     System.out.println(xyzThere("xyz.abc"));

	}

}
