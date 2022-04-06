public class Cereal{
  private String name;
  private String type;
  private int cal;
  private int prot;
  private int fat;
  private int sodium;
  private int fiber;
  private int carb;
  private int sugar;
  private int potas;
  private int vita;
  private int shelf;
  private double weight;
  private int cups;
  private double rating;

  public Cereal(){
    //I am not putting everything into the params
    name = "";
    type = "";
    cal = 0;
    prot = 0;
    fat = 0;
    sodium = 0;
    fiber = 0;
    carb = 0;
    sugar = 0;
    potas = 0;
    vita = 0;
    shelf = 0;
    weight = 0.0;
    cups = 0;
    rating = 0.0;

  }

  public Cereal(String nam,
   String typ,
  int ca,
   int pro,
  int fa,
  int sodiu,
  int fibe,
  int car,
 int suga,
  int pota,
  int vit,
int shel,
double weigh,
  int cup,
  double ratin){
    
    name = nam;
    type = typ;
    cal = ca;
    prot = pro;
    fat = fa;
    sodium = sodiu;
    fiber = fibe;
    carb = car;
    sugar = suga;
    potas = pota;
    vita = vit;
    shelf = shel;
    weight = weigh;
    cups = cup;
    rating = ratin;

  }

  public String name(){
    return name;
  }

  public String type(){
    return type;
  }

  public int cal(){
    return cal;
  }
  public int prot(){
    return prot;
  }
  public int fat(){
    return fat;
  }
  public int sodium(){
    return sodium;
  }
  public int fiber(){
    return fiber;
  }
  public int carb(){
    return carb;
  }
  public int sugar(){
    return sugar;
  }
  public int potas(){
    return potas;
  }
  public int vita(){
    return vita;
  }
  public int shelf(){
    return shelf;
  }
  public int cups(){
    return cups;
  }

  public double weight(){
    return weight;
  }
  public double rating(){
    return rating;
  }
  public String toString(){
    String ret = "";
    ret += "name = " + name;
    ret += " type = " + type;
    ret += " cal = " + cal;
    ret += " prot = " + prot;
    ret += " fat = " + fat;
    ret += " sodium = " + sodium;
    ret += " fiber = " + fiber;
    ret += " carb = " + carb;
    ret += " sugar = " + sugar;
    ret += " potas = " + potas;
    ret += " vita = " + vita;
    ret += " shelf = " + shelf;
    ret += " weight = " + weight;
    ret += " cups = " + cups;
    ret += " rating = " + rating;
    return ret;


  }

  public static void main(String[] FKNSHI){
    Cereal please = new Cereal();
    System.out.println(please.weight());
    System.out.println(please.sugar());
    System.out.println(please.sodium());
    System.out.println(please.rating());
    System.out.println(please);
  }
}
