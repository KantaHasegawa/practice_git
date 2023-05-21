import java.util.Scanner;
import carculater.carculater;
public class main {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("整数を入力してください");
    int arg1=scanner.nextInt();
    int arg2=scanner.nextInt();
    carculater carculater = new carculater();
    System.out.println(carculater.carculate(arg1, arg2));
    scanner.close();
  }
}
