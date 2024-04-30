import java.util.*;
public class taxSlab{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Yours Yearly income:");
        int income = scan.nextInt();
        scan.close();

        int tax =0;
        if (income > 0 && income <= 300000){
            System.out.println("You are out of tax slab you have to pay " + tax + " tax");
        }
        else if (income > 300000 && income <= 600000){
            income = income - 300000;
            tax = (int) (tax + (income *0.05));
            System.out.println("total taxable income is "+income + " you have to pay "+ tax + " tax");
        }
        else if(income > 600000 && income <= 900000){
            income = income - 300000;
            System.out.println("Your Taxable amount is "+ income);
            tax = (int) ((300000 * 0.05) + ((income - 300000) * 0.10));
            System.out.println("total taxable income is "+income + " you have to pay "+ tax + " tax");

        }
        else if (income > 900000 && income <= 1200000){
            income = income - 300000;
            System.out.println("Your Taxable amount is "+ income);
            tax = (int) ((300000 * 0.05) + (300000 * 0.10) +((income - 600000) * 0.15));
            System.out.println("total taxable income is "+income + " you have to pay "+ tax + " tax");
        }
        else if (income > 1200000 && income <= 1500000){
            income = income - 300000;
            System.out.println("Your Taxable amount is "+ income);
            tax = (int) ((300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) +((income - 900000) * 0.2));
            System.out.println("total taxable income is "+income + " you have to pay "+ tax + " tax");
        }
        else if (income > 1500000){
            income = income - 300000;
            System.out.println("Your Taxable amount is "+ income);
            tax = (int) ((300000 * 0.05) + (300000 * 0.10) + (300000 * 0.15) + (300000 * 0.2)+((income - 1200000) * 0.3));
            System.out.println("total taxable income is "+income + " you have to pay "+ tax + " tax");
        }
        else {
            System.out.println("Your entered amount is eigher 0 or in negative");
        }
    }
}