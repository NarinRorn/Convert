

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String date;

        System.out.print("Enter Date(YYYY-MM-dd) : ");
        date=input.next();

        String[] shotdate=date.split("-");

        switch(shotdate[1]) {
            case "01":
                shotdate[1]="January";
                break;
            case "02":
                shotdate[1]="Febuary";
                break;
            case "03":
                shotdate[1]="March";
                break;
            case "04":
                shotdate[1]="April";
                break;
            case "05":
                shotdate[1]="May";
                break;
            case "06":
                shotdate[1]="June";
                break;
            case "07":
                shotdate[1]="July";
                break;
            case "08":
                shotdate[1]="August";
                break;
            case "09":
                shotdate[1]="September";
                break;
            case "10":
                shotdate[1]="October";
                break;
            case "11":
                shotdate[1]="November";
                break;
            case "12":
                shotdate[1]="December";
                break;
            default:
                System.out.println("Number of Month have only 01-12");

        }

        System.out.println("Output : " + shotdate[1]+" "+shotdate[2]+","+shotdate[0]);

    }
}