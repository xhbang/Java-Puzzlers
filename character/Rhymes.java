package character;
import java.util.*;

public class Rhymes {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        StringBuffer word = null;
        switch(rnd.nextInt(2)) {
            case 1:  word = new StringBuffer('P');
            case 2:  word = new StringBuffer('G');
            default: word = new StringBuffer('M');
        }
        //StringBuffer无构造参数
        word.append('a');
        word.append('i');
        word.append('n');
        System.out.println(word);
    }
}
