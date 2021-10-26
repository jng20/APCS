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
	
	public static void main(String[] args){
		System.out.println(fenceR(3));
		System.out.println(fenceR(1));
		System.out.println(fenceR(2));
		System.out.println(fenceR(4));
	}
}
