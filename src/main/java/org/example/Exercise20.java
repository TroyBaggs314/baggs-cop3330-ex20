package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

class Tax
{
    double amount;
    String state;
    String county;
}

public class Exercise20
{
    public static void main(String[] args)
    {
        Tax t = new Tax();
        t = inputs(t);
        DecimalFormat df = new DecimalFormat("0.00");
        double total = t.amount;
        if(t.state.equals("Wisconsin"))
        {
            if(t.county.equals("Eau Claire"))
            {
                System.out.println("The tax is $" + df.format(t.amount * (0.05 + 0.005)) + ".");
                total += t.amount * (0.05 + 0.005);
            }
            else if(t.county.equals("Dunn"))
            {
                System.out.println("The tax is $" + df.format(t.amount * (0.05 + 0.004)) + ".");
                total += t.amount * (0.05 + 0.004);
            }
            else
            {
                System.out.println("The tax is $" + df.format(t.amount * 0.05) + ".");
                total += t.amount * 0.05;
            }
        }
        else if(t.state.equals("Illinois"))
        {
            System.out.println("The tax is $" + df.format(t.amount * 0.08) + ".");
            total += t.amount * 0.08;
        }
        System.out.println("The total is $" + df.format((Math.ceil(total * 100)/100)) + ".");
    }

    public static Tax inputs(Tax t)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the order amount?");
        t.amount = sc.nextDouble();
        System.out.println("What state do you live in?");
        t.state = sc.next();
        sc.nextLine();
        System.out.println("What county do you live in?");
        t.county = sc.nextLine();
        return t;
    }
}
