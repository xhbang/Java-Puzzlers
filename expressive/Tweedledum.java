package expressive;
public class Tweedledum {
    public static void main(String[] args) {
        // Put your declarations for x and i here
/*
        x += i;     // Must be LEGAL
        x = x + i;  // Must be ILLEGAL
*/
        //不要把复合赋值用在 byte,short,char上
        short s=0;
        int i=66783;
        s+=i;
        System.out.println(s);	//This is dangerous
    }
}
