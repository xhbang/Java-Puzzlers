package expressive;
public class CleverSwap {
    public static void main(String[] args) {
        int x = 1984;
        int y = 2001;
        x ^= y ^= x ^= y;
        System.out.println(Integer.toHexString(1984));
        System.out.println(Integer.toHexString(2001));
        System.out.println("x = " + x + "; y = " + y);
        
        /*the process
        int tem1=x^y;
        int tem2=y^tem1;
        int tem3=tem1^tem2;
        System.out.println(Integer.toHexString(tem1));
        System.out.println(Integer.toHexString(tem2));
        System.out.println(Integer.toHexString(tem3));
        */
        
        //在单个的表达式中不要对相同的变量赋值两次,自作聪明,丑陋无用
    }
}
