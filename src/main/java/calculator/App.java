package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ex = false;

        String str;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int a = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int b = sc.nextInt();

            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            System.out.print("사칙 연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);


            // a값 양수
            if (a >= 0) {
                System.out.println(a);
            } else {
                System.out.println("첫번째 숫자에 양수를 입력해주세요: ");
            }
            // b값 양수
            if (b >= 0) {
                System.out.println(b);
            } else {
                System.out.println("두번째 숫자에 양수를 입력해주세요: ");
            }

            int result = 0;

            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/

            if (c == '+') {
                result = (a + b);
            } else if (c == '-') {
                result = (a - b);
            } else if (c == '*') {
                result = (a * b);
            } else if (c == '/') {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    result = (a / b);
                }
            } else {
                System.out.println(" 사칙 연산자가 아닙니다 ");
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            str = sc.nextLine();

        } while (!str.equals("exit"));
        System.out.println("프로그램을 종료합니다");


//        System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        /* exit을 입력 받으면 반복 종료 */
//        while (!str.equals("exit")) {
//            System.out.println("문자열 입력 :");
//            str = sc.next();
    }
    }



