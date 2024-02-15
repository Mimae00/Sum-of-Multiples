package src;


import java.util.Scanner;

public class SumOfMultiples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter 2nd number: ");
        int n2 = scanner.nextInt();

        SumOfMultiplesImpl.sumMul(n1,n2);
    }
}

