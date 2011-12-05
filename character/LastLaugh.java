package character;
public class LastLaugh {
    public static void main(String args[]) {
        System.out.print("H" + "a");
        System.out.print('H' + 'a');
        //ÔõÑùÁ¬½Ó×Ö·û?
        //´ð£ºStringBuffer
        System.out.println("2 + 2 ="+2+2);
        
        StringBuffer sb=new StringBuffer();
        sb.append('H');
        sb.append('a');
        System.out.println(sb);
        System.out.println(""+'H'+'a');
        System.out.printf("%c%c",'H','a');
    }
}
