public class lab10 {
    public static void main(String[] args) {
        // 1
        System.out.println((int) 'c');

        // 2
        System.out.println((char) 0x0021);

        // 3
        char ch1 = 'a';
        System.out.println(++ch1);

        // 4
        ch1 = 'A';
        char ch2 = '1';
        System.out.println(++ch1 + ch2++);

        // 5
        String s = "Hello";
        ch1 = 'A';
        ch2 = '1';
        System.out.println((char) (++ch1 + ch2++));

        // 6
        System.out.println("Today is\b a happy day");
        System.out.println("Today is\t a happy day ");
        System.out.println("Today is\n a happy day ");
        System.out.println("Today is\f a happy day ");
        System.out.println("Today is\r a happy day ");
        System.out.println("Today is\\ a happy day ");
        System.out.println("Today is\" a happy day ");
        System.out.println("Today is\\t a happy day ");

        // 7
        System.out.println((char) 0x0076);

        // 8
        System.out.println((char) (int) 45.3);

        // 9 - Compile error: '\uFF14' is 65300, too large for byte
        // byte b = '\uFF14';

        // 10 
        byte b = (byte) '\uFF14';
        System.out.println(b);

        // 11
        int i = '2' + '3';
        char c = (char) ('2' + '3');
        System.out.println(i + " " + c);
    }
}
