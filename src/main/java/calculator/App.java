package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int a = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int b = sc.nextInt();
        // a값 양수
        if (a>=0) {
            System.out.println(a);
        } else {
            System.out.println("첫번째 숫자에 양수를 입력해주세요");
        }
        // b값 양수
        if (b>=0) {
            System.out.println(b);
        } else {
            System.out.println("두번째 숫자에 양수를 입력해주세요");
        }
    }
}