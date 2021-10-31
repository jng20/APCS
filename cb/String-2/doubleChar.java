public class doubleChar{

	public static String doubleChar(String str) {
		String result= "";
  	 	for(int i = 0; i <= str.length()-1; i++){
				result +=  str.substring(i,i+1)+str.substring(i,i+1);
		  }
		return result;
	}
	public static void main(String[] args){
			System.out.println(doubleChar("The"));
	}
}
