import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month= scanner.nextInt();
        String dayIsMonth;

        switch (month){
            case 2:
                dayIsMonth= "28 or 29 days!";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayIsMonth="31 days!";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayIsMonth="30 days!";
                break;
            default:
                dayIsMonth="";
        }
        if(dayIsMonth != "") System.out.println("The month "+ month+" has "+ dayIsMonth);
        else System.out.println("Invalid input");
    }
}
