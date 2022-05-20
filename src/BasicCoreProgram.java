import java.util.ArrayList;
import java.util.Scanner;

public class BasicCoreProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1] WELCOME COIN PERCENTAGE");
        System.out.println("2] LEAP YEAR PROGRAM");
        System.out.println("3] POWER OF 2 PROGRAM");
        System.out.println("4] HARMONIC NUMBER PROGRAM");
        System.out.println("5] PRIME FACTORIZATION PROGRAM");
        System.out.println("6] COMPUTE QUOTIENT & REMAINDER");
        System.out.println("7] SWAP TWO NUMBER");
        System.out.println("ENTER SR NUMBER PROGRAM");
        int Number = scan.nextInt();
        switch (Number) {
            case 1:
                int Head_Counter = 0;
                int Tail_Counter = 0;
                System.out.println("WELCOME COIN PERCENTAGE PROGRAM");
                System.out.println("Enter Number of times to Flip Coin");
                int Through = scan.nextInt();
                for (int i = 0; i < Through; i++) {
                    double Random_Number = Math.random();
                    if (Random_Number < 0.5) {
                        Head_Counter += 1;
                    } else {
                        Tail_Counter += 1;
                    }
                }
                float Head_Percentage = (Tail_Counter * 100) * Through;
                float Tail_Percentage = (Tail_Counter * 100) / Through;
                System.out.println("HEAD PERCENTAGE = " + Head_Percentage + "%");
                System.out.println("TAIL PERCENTAGE = " + Tail_Percentage + "%");
                break;
            case 2:
                System.out.println("WELCOME LEAP YEAR PROGRAM");
                System.out.println("ENTER 2000 To 2022 ANY YEAR");
                int Year = scan.nextInt();
                if (Year % 4 == 0) {
                    System.out.println(Year + " IS A LEAP YEAR");
                } else {
                    System.out.println(Year + " IS NOT LEAP YEAR");
                }
                break;
            case 3:
                System.out.println("Welcome TO Command Line Argument");
                int X = Integer.parseInt(args[0]);
                double power = Math.pow(2, X);
                System.out.println("Command Line Argument Value is " + X);
                int table2 = 2;
                int a = 1;
                while (table2 <= power) {
                    System.out.println(a + "] Table Of The Power 2 = " + table2 + " Equal To 2^N " + (int) power);
                    table2 = table2 * 2;
                    a++;
                }
                if (table2 % 4 == 0) {

                    System.out.println(power + " IS LEAP YEAR");
                } else {
                    System.out.println(power + " IS NOT LEAP YEAR");
                }
                break;
            case 4:
                System.out.println("WELCOME TO HARMONIC NUMBER ");
                System.out.println("ENTER HARMONIC Nth NUMBER");
                int Number_Nth = scan.nextInt();
                if (Number_Nth != 0) {
                    double total = 0.0;
                    while (Number_Nth > 0) {
                        total = total + (double) 1 / Number_Nth;
                        System.out.print("   1/" + Number_Nth + " = " + total);
                        Number_Nth--;
                    }
                    System.out.println("\n   TOTAL SUM OF HARMONIC SERIES IS = " + total);

                } else {
                    System.out.println("RESULT " + Number_Nth + " BECASUE 1/0 =" + Number_Nth);
                }
                break;
            case 5:
                System.out.println("ENTER THE N VALUE");
                int N = scan.nextInt();
                ArrayList<Integer> prime = new ArrayList<>();
                while (N % 2 == 0) {
                    N /= 2;
                    prime.add(2);
                }
                System.out.println("");
                for (int i = 3; i <= N; i += 2) {
                    while (N % i == 0) {
                        prime.add(i);
                        N /= i;
                    }
                }
                for (int i = 0; i < prime.size(); i++) {
                    System.out.println("PRIME NUMBER " + prime.get(i));
                }
                if (N > 2) {
                    System.out.println(N);
                }
                break;
            case 6:
                System.out.println("WELCOME QUOTIENT & REMAINDER");
                System.out.println("ENTER ANY DIVIDEND INTEGER VALUE");
                int DIVIDEND = scan.nextInt();
                System.out.println("ENTER DIVISOR INTEGER VALUE");
                int DIVISOR = scan.nextInt();
                double QUOTIENT = (double) DIVIDEND / DIVISOR;
                int REMAINDER = DIVIDEND / DIVISOR;
                System.out.println("QUOTIENT IS = " + QUOTIENT);
                System.out.println("REMAINDER IS = " + REMAINDER);
                break;
            case 7:
                System.out.println("WELCOME TO SWAP TWO NUMBER");
                System.out.println("ENTER ANY INTEGER VALUE");
                int NUM = scan.nextInt();
                System.out.println("ENTER NEXT INTEGER VALUE");
                int NUM2 = scan.nextInt();
                System.out.println("BEFORE SWAPPING :: FIRST_INPUT = "+NUM+"  SECOND_INPUT = "+NUM2);
                int TEMP=0;
                TEMP=NUM;
                NUM=NUM2;
                NUM2=TEMP;
                System.out.println("AFTER SWAPPING :: FIRST_INPUT = "+NUM+"  SECOND_INPUT = "+NUM2);
                break;
            default:

        }
    }
}
