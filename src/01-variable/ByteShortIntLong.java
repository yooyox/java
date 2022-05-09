public class ByteShortIntLong {
    public static void main(String[] args) {
        //1.超过范围
        //byte b1 = 128;
        byte b1 = 127;
        System.out.println(b1);

        //2.long型，必须用l或L结尾。
        long l1 = 2147483647;
        //long l1 = 2147483648L;
        System.out.println(l1);
    }
}
