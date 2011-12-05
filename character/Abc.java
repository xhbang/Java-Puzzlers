package character;
public class Abc {
    public static void main(String[] args) {
        String letters = "ABC";
        char[] numbers = { '1', '2', '3' };
        Object[] numbers2 = { '1', '2', '3' };
        System.out.println(letters + " easy as " + numbers);
        System.out.println(numbers2);
        System.out.println(numbers.toString());
        System.out.println(letters + " easy as " + String.valueOf(numbers));
        //char[] to string
    }
}
