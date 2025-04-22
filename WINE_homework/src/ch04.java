public class ch04 {
    public static void main(String[] args) {
//        int a=5;
//        int b=10;
//
//        if(a>b) {     //true일 경우만 작동
//            a++;
//            System.out.println("a의 값 : "+a);
//        }
//        else if (b<11) {
//            b++;
//            System.out.println("b의 값 : "+b);
//        }
//        else if (b<12) {
//            b++;
//            System.out.println("b의 값 : "+b);
//        }
//        else {
//            System.out.println("b의 값 : "+b);
//        }
        int week = 3;

        switch(week) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
        }

    }
}

