import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by legionevil on 12.06.2018.
 */
public class Operand {
    private double value;
    public double getOperandValue() {
        return value;
    }
    public void setOperandValue() {
        Scanner sc = new Scanner(System.in);
        try {
            this.value = sc.nextDouble();
        }catch (InputMismatchException ex){
            System.out.println("Не является числом.");
            //ex.printStackTrace();
            System.out.println("Введите число:");
            this.setOperandValue();
        }
    }
}
