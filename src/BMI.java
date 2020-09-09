import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Weight is (kg)");
        float weigth= scanner.nextFloat();
        System.out.println("Height is (meters)");
        float height= scanner.nextFloat();
        float bmi= weigth/(height*height);
       if(bmi<18.5){
           System.out.print("Underweight");
       }else if (bmi<25){
           System.out.print("Normal");
       }else if (bmi<30){
           System.out.print("Overweight");
       }else System.out.print("Obese");
    }
}
