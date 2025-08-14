public class StringBuild {
  public static void main(String args[]){
    StringBuilder str=new StringBuilder("meow");
    str.append(" meow");
    System.out.println(str);
    str.insert(4," and");
    System.out.println(str);
  }  
}
