public class Repeater{
	public static String fenceR(int numPosts){
	
		if(numPosts == 1){
			//fence = "|"
			return "|";
		}
		//String fence = ;
		//fenceR(numPosts - 1);
		return "|--" + fenceR(numPosts - 1);
		//return fence
		
	}
	
	public static String fenceW(int numPosts){
		String fence = "|";
		while(numPosts > 1){
			fence += "--|";
			numPosts --;
		}
		return fence;
		
	}
	
	public static void main(String[] args){
		System.out.println(fenceR(3));
		System.out.println(fenceR(1));
		System.out.println(fenceR(2));
		System.out.println(fenceR(4));
		
		System.out.println(fenceW(3));
		System.out.println(fenceW(1));
		System.out.println(fenceW(2));
		System.out.println(fenceW(4));
	}
}
