/**
 * Created by legionevil on 12.06.2018.
 */
public class Divider implements Operation {
    @Override
    public void showOperationResult(Operand operand1, Operand operand2) {
        double result = operand1.getOperandValue() - operand2.getOperandValue();
        System.out.println("Результат деления = " + result);
    }
}
