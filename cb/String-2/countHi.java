public class countHi{

  public static int countHi(String str) {
      int hiCounter = 0;
      String current = "";
      for(int i = 0; i <= str.length()-2; i++){
        current = str.substring(i,i+2);

        if(current.contentEquals("hi")){
          hiCounter = hiCounter + 1;
        }
      }
      return hiCounter;

  }

  public static void main(String[] args){
	   System.out.println(countHi("abc hi ho"));
	}

}
