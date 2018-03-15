package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double P=12; //Проценты
        double x; //Размер платежа
        double S; //Размер кредита
        int N; //Кол-во месяцев
        double st,mps,mps2,pst;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер кредита: ");
        S = scanner.nextDouble();
        System.out.print("\n");

        int a;
        for (;;) {
            System.out.print("Введите кол-во месяцев: ");
            N = scanner.nextInt();

            mps = P/100/12;
            mps2 = mps + 1;
            st = Math.pow(mps2, -N);
            x = S * (mps / (1 - st));
            System.out.println("Ежемесячный платеж = " + Math.round(x * 100.0) / 100.0 );

            System.out.print("Вас устраивает ежемесячный платеж? (1 - Yes / 0 - No)");
            a = scanner.nextInt();
            if (a == 1)
                break;
        }
        System.out.print("\n");

        System.out.println("Сумма кредита: " + Math.round(S * 100.0) / 100.0 + " руб.");
        System.out.println("Срок кредитования: " + N + " мес.");
        System.out.println("Общий ежемесячный платеж: " + + Math.round(x * 100.0) / 100.0 + " руб.");


        System.out.print("\n");

        int mes=1;
        double pl ;
        double dosr;
        while (S > 0.1){
            System.out.println(" ");
            System.out.println(" ");
            System.out.print(mes + " Месяц\n");
            mes++;

            System.out.print("Введите размер досрочного платежа (сверх ежемесячного платежа): ");
            dosr = scanner.nextDouble();

            pst = S * mps;
            pl = x - pst;
            S = S - x + pst;
            S = S - dosr;
            System.out.println("Платеж в счет погашения основного долга, руб\t\t\t\t\t" + Math.round(pl * 100.0) / 100.0 );
            System.out.println("Проценты по кредиту, руб\t\t\t\t\t\t\t\t\t\t" + Math.round(pst * 100.0) / 100.0 );
            System.out.println("Общий ежемесячный платеж, руб\t\t\t\t\t\t\t\t\t" + Math.round(x * 100.0) / 100.0 );
            System.out.println("Остаток осн. долга после совершения текущего платежа, руб\t\t" + Math.round(S * 100.0) / 100.0 );
            System.out.println("Досрочное погашение (сверх ежемесячного платежа), руб\t\t\t" + Math.round(dosr * 100.0) / 100.0 );

            if(dosr != 0){
                mps = P/100/12;
                mps2 = mps + 1;
                st = Math.pow(mps2, -N + mes -1);
                x = S * (mps / (1 - st));
            }
        }
    }
}
