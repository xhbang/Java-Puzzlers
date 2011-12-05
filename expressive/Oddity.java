package expressive;
public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }

    public static boolean isOdd2(int i){
    	return i%2!=0;
    	//return (i&1)!=0;	how?
    }
    public static void main(String[] args) {
    	System.out.println(isOdd(-3));
    	System.out.println(isOdd2(-3));
    }
}
