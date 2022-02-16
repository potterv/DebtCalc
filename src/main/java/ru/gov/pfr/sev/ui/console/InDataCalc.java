package ru.gov.pfr.sev.ui.console;

import java.util.Scanner;

public class InDataCalc {
    private double summ;
    private int colDaysInMonth;
    private int colDasInMonthPol;
    private int colPolMonth;
    private boolean count;

    private Scanner sc = new Scanner(System.in);

    public double getSumm() {
        System.out.println("Vvedite summu v vide xxx,xx:");
        try {
            this.summ = sc.nextDouble();
            return this.summ;
        } catch (NumberFormatException nfe) {
            nfe.getMessage();
            return this.summ = 0.00;
        } catch (Exception e) {

            e.getMessage();
            return this.summ = 0.00;
        }


    }

    public int getColDaysInMonth() {
        System.out.println("Vedite colDaysInMonth (ot 1 do 31):");


        try {
            this.colDaysInMonth = sc.nextInt();
            if (this.colDaysInMonth >= 1 && this.colDaysInMonth <= 31) {
                return this.colDaysInMonth;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }


    }

    public int getColDasInMonthPol() {
        System.out.println("Vedite colDaysInMonthPol (28,30,31):");

        try {
            this.colDasInMonthPol = sc.nextInt();

            if (this.colDasInMonthPol == 28 || this.colDasInMonthPol == 30 || this.colDasInMonthPol == 31) {

                return this.colDasInMonthPol;
            } else {
                return 0;
            }

        } catch (Exception e) {
            e.getMessage();
            return 0;
        }

    }

    public int getColPolMonth() {
        System.out.println("Vedite colPolMonth :");

        try {
            this.colPolMonth = sc.nextInt();

            if (this.colPolMonth > 0 && this.colPolMonth <= 12) {
                return this.colPolMonth;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }

    }

    public boolean isCount() {
        System.out.println("prodoljit schet (0 - net, 1 - da) :");
        try {
            this.count = sc.nextInt()!=0;
            System.out.println(this.count);
            return this.count;
        } catch (Exception e) {
            return false;
        }

    }
}
