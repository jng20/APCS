public class catDog{

  public static boolean catDog(String str) {
    int cat,dog;
    String current = "";
    cat = 0;
    dog = 0;

    for(int i = 0; i <= str.length()-3; i++){
      current = str.substring(i,i+3);

      if(current.contentEquals("cat")){
        cat++;
      }
    }

    for(int i = 0; i <= str.length()-3; i++){
      current = str.substring(i,i+3);

      if(current.contentEquals("dog")){
        dog++;
      }
    }

    return (cat == dog);
  }

  public static void main(String[] args){
	   System.out.println(catDog("catdog"));
	}

}
