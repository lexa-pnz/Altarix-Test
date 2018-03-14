package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер кредита: ");
        double S = scanner.nextDouble(); //Размер кредита

        System.out.print("Введите количество меяцев: ");
        int N = scanner.nextInt(); //Месяц
        System.out.print("\n\n");

        double P = 12; //Проценты
        double x; //Размер платежа
        double st,mps,mps2,pst;


        mps = P/100/12;
        mps2 = mps + 1;
        st = Math.pow(mps2, -N);
        x = S * (mps / (1 - st));

        int mes=1;
        double pl ;
        System.out.print("Номер месяца\t");
        System.out.print("Платеж в счет\t");
        System.out.print("Проценты по кредиту\t");
        System.out.print("Общий ежемесячный \t");
        System.out.print("Остаток осн. долга после \t");
        System.out.print("\n\t\t\t\tпогашения \t");
        System.out.print("\t\t\t\t\t\t\tплатеж \t");
        System.out.print("\t\tсовершения текущего платежа \t");
        System.out.print("\n\t\t\t\tосновного долга \t");

        do {
            System.out.println(" ");
            System.out.println(" ");
            if (mes < 10)
                System.out.print(mes + " Месяц " + "\t\t");
            else
                System.out.print(mes + " Месяц" + "\t\t");
            mes++;
            pst = S * mps;
            pl = x - pst;
            S = S - x + pst;
            System.out.print(Math.round(pl * 100.0) / 100.0 + "\t\t\t\t");
            System.out.print(Math.round(pst * 100.0) / 100.0 + "\t\t\t\t");
            System.out.print(Math.round(x * 100.0) / 100.0 + "\t\t\t\t");
            System.out.print(Math.round(S * 100.0) / 100.0 + "\t\t\t\t");
        }
        while (S > 1);
    }
}
