package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
//        int[] intArray = new int[10];
//        int d = 0;
        /* 적합한 컬렉션 타입의 변수 선언 */
        ArrayList<Integer> intList = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int a = sc.nextInt();
            sc.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int b = sc.nextInt();
            sc.nextLine();

            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            System.out.print("사칙 연산 기호를 입력하세요: ");
            char c = sc.nextLine().charAt(0);


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
            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            new ArrayList<Integer>();
            intList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            // remove 값을 입력했을 때 index 0번째 값을 삭제
            str = sc.nextLine();
            if (str.equals("remove")) {
                intList.remove(0);
            }
            /* 위 요구사항에 맞게 구현 */
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            str = sc.nextLine();
        } while (!str.equals("exit"));
        System.out.println("프로그램을 종료합니다");

            /* 연산의 결과를 배열에 저장합니다. */
//            intArray[d] = result;
            /* 위 요구사항에 맞게 구현 */
//            if(d == 9) {
//                int delIndex = 0;
//                for (int i = delIndex; i < intArray.length - 2; i++) {
//                    intArray[i] = intArray[i + 1];
//                }
//            }
            /* index를 증가 시킵니다. */
            // 1. 배열은 자기 길이 이상의 값을 참조하려고 하면 에러가 나게 되어있다.
            // 2. 첫 번째 수정은 길이에서 -2를 해줘서 마지막 인덱스 이상으로 참조를 하지 않도록 수정
            // 3. 그러던 중 아직도 스캐너 관련 에러가 나서 해당 부분도 수정 ( 왜 에러가 나는지는 나중에 공부하자)(메모리버퍼)
            // 입출력에
            // 4. 3이 아닌 경우에만 d값 (인덱스)를 올리도록 수정
//            if ( d != 9) {
//                d++;
//            }
    }
}



