public class ch03  {
    public static void main(String[] args) {
        //배열 선언
        String[] cars;

        //선언과 동시에 초기화
        String[] food = {"사과", "바나나", "파인애플", "수박"};
        int[] myNum ={10, 20, 30, 40};

        System.out.println("food의 첫번째값 : "+food[0]);
        System.out.println("food의 두번째값 : "+food[1]);
        System.out.println("food의 세번째값 : "+food[2]);
        System.out.println("food의 네번째값 : "+food[3]);
//        System.out.println(food[4]);//java-array-index-out-of-bounds error(범위초과)

        //배열 요소 변경
        food[0]="밀감";
        System.out.println("변경한 food의 첫번째값 : "+food[0]);
        //배열 길이
        System.out.println("food 배열의 길이 : "+food.length);

        //2차원 배열
        int[][] Num = {{1, 2, 3, 4, 5},{6, 7, 8}};
        int var = Num[1][0]; //변수명 [n번째 배열] [n번째 배열의 n번째 값]
        System.out.println("var의 값 : "+var);

        cars = new String[] {"새로작성", "두번째 car"};
        System.out.println("car의 값 : "+cars[0]);
    }
}
