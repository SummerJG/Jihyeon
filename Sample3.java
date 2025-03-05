package Calculator_project.prac;

import java.util.Scanner;

public class Sample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3 = 1;

       System.out.println("첫 번째 수를 입력해 주세요.");
        while (!scanner.hasNextInt()) {
            System.out.println("정수를 입력해주세요.");
            scanner.nextLine();
        }
        num1 = scanner.nextInt();

        System.out.println("두 번째 수를 입력해 주세요.");
        while (!scanner.hasNextInt()) {
            System.out.println("정수를 입력해주세요.");
            scanner.nextLine();
        }
        num2 = scanner.nextInt();

        System.out.println("1: 더하기  2: 빼기  3: 곱하기  4: 나누기.");
        while (true) {
        if(scanner.hasNextInt()){
            num3 = scanner.nextInt();
            if(num3>=1 && num3 <=4){
                break;}
        } else {
            scanner.next();
        }
        System.out.println("1, 2, 3, 4만 눌러주세요.");
        }

        while (num3 == 4 && num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다");
            scanner.nextLine();
        }

        if (num3 == 1) {
            System.out.println(num1 + num2);
        } else if (num3 == 2) {
            System.out.println(num1 - num2);
        } else if (num3 == 3) {
            System.out.println(num1 * num2);
        } else if (num3 == 4) {
            System.out.print("목: " + num1 / num2);
            System.out.println(" 나머지: " + num1 % num2);
        }

    }
}
