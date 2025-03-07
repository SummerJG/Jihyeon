package Calculator_project.prac;
import java.util.Scanner;
class Sample4 {

        //계산기 기본 기능 수행
        Scanner scanner = new Scanner(System.in);

        //계산기 변수 선언
        int num1, num2, num3 = 1;
        String input;

        //계산기 기본 기능 메서드 전체 포괄
        public void method() {
        //continue 계산기 반복 라벨
        outer:
        while (true) {
            System.out.println("첫 번째 수를 입력해 주세요.");
            while (!scanner.hasNextInt()) {
                System.out.println("정수를 입력해주세요.");
                scanner.next();
            }
            num1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("두 번째 수를 입력해 주세요.");
            while (!scanner.hasNextInt()) {
                System.out.println("정수를 입력해주세요.");
                scanner.next();
            }
            num2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("1: 더하기  2: 빼기  3: 곱하기  4: 나누기.");
            while (true) {
                if (scanner.hasNextInt()) {
                    num3 = scanner.nextInt();
                    if (num3 >= 1 && num3 <= 4) {
                        break;
                    }
                } else {
                    scanner.next();
                }
                System.out.println("1, 2, 3, 4만 눌러주세요.");
            }

            while (num3 == 4 && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다");
                scanner.nextLine();
                System.out.println("계산기를 다시 시작해 주세요");
                continue outer;
            }

            //연산자 선택
            switch (num3) {
                case 1:
                    System.out.println(num1 + num2);
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.print("목: " + (num1 / num2));
                    System.out.println(" 나머지: " + (num1 % num2));
                    break;
            }

            //종료 선택지
            System.out.println("종료하려면 'exit'을, 다시 시작하려면 아무 버튼을 입력하세요.");
            input = scanner.nextLine();
            scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");

                break;
            }

            //재시작 안내문
            System.out.println("계산기를 다시 시작합니다.");
        }

        }
}
