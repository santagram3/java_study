package day06;

    //parameter 매 개 변 수 : 함수가 외부에서 받아와야 하는 값을 저장하는 공간
public class MethodParam {

    // 2개의 정수를 전달받아 그 합을 돌려주는 함수
       static int add(int n1, int n2){
           System.out.println("함수호출!");
           int sum = n1+n2;
           return sum;
       }

       // n개의 정수를 전달받아 그 총합을 리턴하는 함수

        static int addAll (int... numbers){
           // int[]를 int... 으로 바꾸면
//            addAll(new int[]{10,20,30}); 이렇게 해야될을
//            addAll(10,20,30); 이렇게 처리해도된다
            // 둘다 사용가능하게 만든다


           int total = 0;
            for (int n : numbers) {
                total += n;
            }
            return total;
        }

        // 2개의 배열을 전달 받아 길이가 더 긴 배열을 리턴하는 함수
        static int[] compareLength(int[] nums1 , int[] nums2){
           return (nums1.length > nums2.length) ? nums1 : nums2;
        }

        static void hello(){
            System.out.println("안녕하셉여병병");
        }



    public static void main(String[] args) {

        System.out.println("함수 호출 전 ");
        add(10,20);
        System.out.println(add(10,20)+50);
        System.out.println("함수 호출 후 ");

        System.out.println("=======================");

        // 업캐스팅
        short y = 12;
        add(5, y);
        // 인트에 맞추기
        long x = 12L;
        add(5 , (int)x);

        System.out.println("=======================");

        int[] arr = {10 , 20 , 30 , 40};
        int sum = addAll(arr);
        System.out.println(sum);

        // 카페 = 엄마 카레해줘 (손맛 , 카레가루 , 채소 ,밥 )


        addAll(new int[] {10,20,30,50});

        System.out.println(addAll(new int[] {10,20,30,50}));

        System.out.println("=======================");

        compareLength(new int[] {1,2,3,4,5} ,new int[]{1,3,4,5,5,6,7,8} );
        System.out.println(compareLength(new int[] {1,2,3,4,5} ,new int[]{1,3,4,5,5,6,7,8}));


        System.out.println("=======================");

        for (int i = 0; i <5 ; i++) {
            hello();
        }

    }
}
