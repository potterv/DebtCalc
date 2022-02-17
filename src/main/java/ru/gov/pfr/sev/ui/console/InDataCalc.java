package ru.gov.pfr.sev.ui.console;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class InDataCalc {
  private double summ;
  private int colDaysInMonth;
  private int colDaysInMonthPol;
  private int colPolMonth;
  private boolean count;
  private LocalDate localDateStart, localDateEnd;
  private Period period;
  private Scanner sc = new Scanner(System.in);

  public void setDateStartEnd() {
    System.out.println("Ведите дату начала");
    localDateStart = LocalDate.parse(sc.nextLine());
    System.out.println("Введите дату окончания");
    localDateEnd = LocalDate.parse(sc.nextLine());

    period = Period.between(localDateStart, localDateEnd);
    this.colPolMonth = period.getMonths();

    this.colDaysInMonthPol = localDateStart.lengthOfMonth();

    this.colDaysInMonth =this.colDaysInMonthPol-(localDateStart.getDayOfMonth()-1);



  }

  public double getSumm() {
    System.out.println("Ведите сумму xxx,xx:");
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

    return this.colDaysInMonth;
  }

  public int getColDaysInMonthPol() {

    return this.colDaysInMonthPol;
  }

  public int getColPolMonth() {
    return this.colPolMonth;
  }

  public boolean isCount() {
    System.out.println("ПРОДОЛЖИТЬ (0 - НЕТ, 1 - ДА) :");
    try {
      this.count = sc.nextInt() != 0;
      return this.count;
    } catch (Exception e) {
      return false;
    }
  }
}
