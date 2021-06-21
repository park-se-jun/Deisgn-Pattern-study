import java.util.Scanner;

public class simpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int value1 = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int value2 = sc.nextInt();

        System.out.println("\n= = = 메뉴 = = =");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.print("메뉴를 선택하세요: ");

        String oper = sc.next();
        System.out.println();

        if(oper.equals("1")){
            int result = value1 + value2;
            System.out.println(value1 + " + " + value2 + " = " + result);
        }

        else if(oper.equals("2")){
            int result = value1 - value2;
            System.out.println(value1 + " - " + value2 + " = " + result);
        }

        else if(oper.equals("3")){
            int result = value1 * value2;
            System.out.println(value1 + " * " + value2 + " = " + result);
        }

        else if(oper.equals("4")){
            int result = value1 / value2;
            System.out.println(value1 + " / " + value2 + " = " + result);
        }
    }
}
