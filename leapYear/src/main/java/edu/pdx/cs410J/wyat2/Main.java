package edu.pdx.cs410J.wyat2;

public class Main {
    public static void main(String[] args) {
        //System.err.println("Missing command line arguments");
        //take one arg as string, then convert to int
        int year = Integer.parseInt(args[0]);
        LeapYear data1 = new LeapYear(year);

        System.out.println(data1.getResult());
        System.out.println("Goodbye!");

        System.exit(1);
    }

}

