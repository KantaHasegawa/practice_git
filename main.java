import java.util.Scanner;
import carculater.carculater;
public class main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("整数を入力してください");
    int arg1=scanner.nextInt();
    int arg2=scanner.nextInt();
    carculater carculater = new carculater();
    System.out.println("足し算の答えは"+carculater.addition(arg1, arg2));

    int arg3=scanner.nextInt();
    int arg4=scanner.nextInt();
    System.out.println("掛け算の答えは"+carculater.multiplication(arg3, arg4));
    scanner.close();

  }
}
