import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.println("整数を入力してください");
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();
  
    int result = num1 + num2;
    System.out.println(result);

    scanner.close();
  }
}
