package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        // 시작: 코드를 작성하세요
        temp = a; // 10
        System.out.println("a = " + temp);
        a = b; // 20
        System.out.println("b = " + a);
        b = temp; // 10
        System.out.println("temp = " + b);

        // 종료: 코드를 작성해세요
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
