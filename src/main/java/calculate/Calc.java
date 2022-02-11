package calculate;

public class Calc {
    private double summ;
    private  int colDaysInMonth;
    private int colDasInMonthPol;
    private int colPolMonth;

    public double getSumm() {
        return summ;
    }

    public int getColDaysInMonth() {
        return colDaysInMonth;
    }

    public int getColPolMonth() {
        return colPolMonth;
    }

    private double result;

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public void setColDaysInMonth(int colDaysInMonth) {
        this.colDaysInMonth = colDaysInMonth;

    }

    public void setColPolMonth(int colPolMonth) {
        this.colPolMonth = colPolMonth;
    }

    public int getColDasInMonthPol() {
        return colDasInMonthPol;
    }

    public void setColDasInMonthPol(int colDasInMonthPol) {
        this.colDasInMonthPol = colDasInMonthPol;
    }

    public double resultSumm(){
        this.result= (this.summ/this.colDasInMonthPol)*this.getColDaysInMonth()+(this.summ*this.colPolMonth);

        return this.result;
    }

}
