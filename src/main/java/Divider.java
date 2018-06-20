import java.util.InputMismatchException;

/**
 * Created by legionevil on 12.06.2018.
 */
public class Divider implements Operation {
    @Override
    public void showOperationResult(Operand operand1, Operand operand2) {
        if (operand2.getOperandValue()==0) {
            try{
                throw new InputMismatchException("Нельзя делить на ноль!!!");
            }
            catch (InputMismatchException ex){
                ex.printStackTrace();
            }
        }else{
            double result = operand1.getOperandValue() / operand2.getOperandValue();
            System.out.println("Результат деления = " + result);
        }
    }
}
