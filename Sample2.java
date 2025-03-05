package Calculator_project.prac;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요");
        int num1 = scanner.nextInt();

        System.out.println("두 번째 수를 입력하세요");
        int num2 = scanner.nextInt();

        System.out.println("1:더하기 2:빼기, 3:곱하기, 4:나누기");
        int num3 = scanner.nextInt();
        if (num3 == 1) {
            System.out.println(num1+num2);
        } else if (num3 == 2) {
            System.out.println(num1-num2);
        } else if (num3 == 3) {
            System.out.println(num1*num2);
        } else if (num3 == 4) {
            System.out.print("목: "+num1/num2);
            System.out.println(" 나머지: "+ num1%num2);
        }
    }
}
