package expressive;
public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);
        System.out.println(Integer.toBinaryString(-1));
        //符号拓展和原生类型拓展
        
        //char to int 非符号拓展的两种方式
        char c=0xffff;
        int i=c & 0xffff;
        int i2=c;
        System.out.println(i2);
        
        //cause sign extension char to int
        int i3=(short)c;
        System.out.println(i3);
        
        //byte to int without sign extendsion
        byte b=2;
        char c2=(char) (b & 0xff);
        //byte to int with sign extendsion
        char c3=(char) b;
    }
    

}
