package Calculator_project.prac;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("더하기");
        System.out.print("첫 번째 수\n");
        int add1=scanner.nextInt();
        System.out.print("두 번째 수\n");
        int add2=scanner.nextInt();
        System.out.println("값 = "+(add1+ add2));

        System.out.println("빼고 싶은 정수를 입력하세요");
        System.out.print("첫 번째 수\n");
        int minus1=scanner.nextInt();
        System.out.print("두 번째 수\n");
        int minus2=scanner.nextInt();
        System.out.println("값 = "+ (minus1 - minus2));

        scanner.close();



    }
}
