/*
Nacho Patcho (Jacob Ng + PreGuac, Gabriel Thompson + Iggy, Faiza Huda + truthfulTom)
APCS
HW29 -- Which Way Do You Roll?
2021-11-01
time spent: 1.0hrs (at the Dojo)
*/

/*
DISCO:
 - Integer.parseInt() converts a String to an integer
 - Integer.toString() converts an integer to a String

QCC:
 - For the function commafyF(), why is there an offset for (strLen - i) % 3 == 0, but rather 1?
 - Is there a more efficient way to write either the iterative or the recursive function?
*/

public class Commafier{
	public static String commafyF(int n){
		String output = "";
		String nStr = Integer.toString(n);
		int strLen = nStr.length();
		
		for(int i = 0; i < strLen; i++){
			output += nStr.charAt(i);
			if((strLen - i) % 3 == 1 && (i != (strLen - 1))){
				output += ",";
			}
		}
		return output;
	}
	
	public static String commafyR(int n) {
		String output = "";
                String nStr = Integer.toString(n);
                int strLen = nStr.length();
		if(strLen <= 3){
			return nStr;
		}
		return commafyR(Integer.parseInt(nStr.substring(0, strLen-3))) + "," + nStr.substring(strLen -3);
	}
	
	public static void main( String[] args ) {
//		System.out.println(commafyF(476730128));
//		System.out.println(commafyR(476730128));
		for(String arg : args){
			System.out.println(commafyF(Integer.parseInt(arg)));
			System.out.println(commafyR(Integer.parseInt(arg)));
		}

	}
}
