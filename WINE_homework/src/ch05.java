public class ch05 {
    public static void main(String[] args) {
//        int i = 0;

//        while(i<10){
//            System.out.println("i의 값 : "+i);
//            i++;
//        }
//        do {
//            System.out.println("i의 값 : "+i);
//        }while(1<10);
//        for(i=0; i<10; i++) {
//            System.out.println("i의 값 : "+i);
//        }
//        String[] strs = {"사과", "바나나", "망고"};

//        int cnt = 0;
//        for(String str : strs){
//            System.out.println("배열의 "+cnt+"번째 요소 : "+str);
//            cnt++;
//        }
//        for (int i = 0; i < strs.length; i++) {
//            System.out.println("배열 : "+i+" 배열 요소 : "+strs[i]);
//        }
//        for (int i = 0; i<3; i++) {
//            for (int j = 0; j<3; j++) {
//                System.out.println(i+"와 "+j+"의 값");
//            }
//        }

        int[][] numbers = {{1,2,3,4},{5,6}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(i+","+j+"번째요소 : "+numbers[i][j]);
            }
        }
    }
}
