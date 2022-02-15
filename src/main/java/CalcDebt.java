import calculate.Calc;
import inteface.InDataCalc;

public class CalcDebt {
    public static void main(String[] args) {
        Calc calc =new Calc();
        InDataCalc inDataCalc = new InDataCalc();
        boolean count = true;
        while (count) {
            try {
                calc.setSumm(inDataCalc.getSumm());
                calc.setColDaysInMonth(inDataCalc.getColDaysInMonth());
                calc.setColDasInMonthPol(inDataCalc.getColDasInMonthPol());
                calc.setColPolMonth(inDataCalc.getColPolMonth());

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("posledniy vvedennyi parametr ne korreknyi");
            } finally {

                System.out.print(" REZULTAT : " + calc.resultSumm());
                System.out.println("");
                if (!inDataCalc.isCount()){
                    break;
                }
            }




        }
    }
}
