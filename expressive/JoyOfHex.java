package expressive;
public class JoyOfHex {
    public static void main(String[] args) {
        System.out.println(
            Long.toHexString(0x100000000L + 0xcafebabe));
        /*
        System.out.println(0x100000000L);
        System.out.println(0xcafebabe);
        Long l1=new Long(0xcafebabe);
        System.out.println(l1);
        System.out.println(0xffffffffcafebabel);
        System.out.println(0xcafebabel);
        */
        System.out.println(
                Long.toHexString(0x100000000L + 0xcafebabel));
        //try to avoid mix types calculate
    }
}
