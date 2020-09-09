import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please input your Dollar ");
        double usd=scanner.nextDouble();
        final int RATE=23000;
        double vnd=usd*RATE;
        System.out.println("VND: "+ vnd +" vnd");
    }
}
