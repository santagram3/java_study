package programers.level1;

public class 숫자_문자열과_영단어 {

    public static int solution(String s) {

//        replace (old ,new)
//        String str3 = "python study ,python app ,python data";
//        String replace = str3.replace("python" , "java");
//        System.out.println("replace =" +replace);

        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for (int i = 0; i <numbers.length ; i++) {
            s = s.replace(numbers[i] ,String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
}
