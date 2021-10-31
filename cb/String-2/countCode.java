public class countCode{

  public static int countCode(String str) {
    int code = 0;
    String front, end;
    front = "";
    end = "";

    for(int i = 0; i <= str.length()-4; i++){
      front = str.substring(i,i+2);
      end = str.substring(i+3,i+4);

      if(front.contentEquals("co") && end.contentEquals("e")){
        code++;
      }
    }

    return code;
  }

  public static void main(String[] args){
	   System.out.println(countCode("aaacodebbb"));
	}

}
