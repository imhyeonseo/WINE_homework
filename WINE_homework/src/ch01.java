public class ch01 {
    public static void main(String[] args) {
//        int var=10;
//        String str2 = "문자열을 사용하기위해 저장";
//        str2 = "문자열을 다시 적어서 사용";
//
//        long number = 990000000L;
//        Short number2 = 3200;
//        byte number3 = -128;
//        boolean valied = true;
//        char vchar = 'A';
//        float flt = 3.14f;
//        double dle = 0.9999999999999;
//
//        System.out.println("내가 저장한 값은?"+str2);

//        int money = 500;
//        System.out.println("숫자"+money);
//        money = 1100;
//        System.out.println("숫자"+money);
        String str = "12345";
        int num = 0;

        num = Integer.parseInt(str);
        System.out.println("변경된 값은?"+str);

        int num2 = 1234;
        String str2;

        str2 = String.valueOf(num2);

        System.out.println("변경된 값은?"+str2);
    }
}