package ru.gov.pfr.sev.calculate;

import java.time.LocalDate;
import java.time.Period;

public class DateCakcImpements implements DateCalc{

    private LocalDate localDateStart, localDateEnd;
    private Period period;
    private int colDaysInMonth;
    private int colDaysInMonthPol;
    private int colPolMonth;

    public void setLocalDateStart(LocalDate localDateStart) {
        this.localDateStart = localDateStart;
    }

    public void setLocalDateEnd(LocalDate localDateEnd) {
        this.localDateEnd = localDateEnd;
    }

    public int getColDaysInMonth() {
        return colDaysInMonth;
    }

    public int getColDaysInMonthPol() {
        return colDaysInMonthPol;
    }

    public int getColPolMonth() {
        return colPolMonth;
    }

    @Override
    public void setDateStartEnd() {
       
        period = Period.between(localDateStart, localDateEnd);
        this.colPolMonth = period.getMonths();

        this.colDaysInMonthPol = localDateStart.lengthOfMonth();

        this.colDaysInMonth =this.colDaysInMonthPol-(localDateStart.getDayOfMonth()-1);

    }
}
