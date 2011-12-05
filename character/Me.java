package character;

import java.util.regex.Pattern;
public class Me {
   public static void main(String[] args) {
      System.out.println(
         Me.class.getName().replaceAll(".", "/") + ".class");
      //正则表达式误用
      System.out.println(
    	         Me.class.getName().replaceAll("\\.", "/") + ".class");
      
      System.out.println(
    	         Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
   }
}
