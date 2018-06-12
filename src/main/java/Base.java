import java.util.Scanner;

/**
 * Created by legionevil on 03.06.2018.
 */
public class Base {
    public static void main(String[] args) {
        String repeat;
        System.out.println("ООП КАЛЬКУЛЯТОР!!!");
        Scanner scan = new Scanner(System.in);
        Operand oper1 = new Operand();
        Operand oper2 = new Operand();
        do {
            System.out.println("Введите первое число: ");
            oper1.setOperandValue(scan.nextDouble());
            //System.out.println(oper1.getOperandValue());
            System.out.println("Введите второе число: ");
            oper2.setOperandValue(scan.nextDouble());
            //System.out.println(oper2.getOperandValue());
            System.out.println("Выберите тип операции по оператору(+,-,*,/):");
            String choice = scan.next();
            switch (choice) {
                case "+":
                    Operation adder = new Adder();
                    adder.showOperationResult(oper1, oper2);
                    break;
                case "-":
                    Operation subtract = new Subtractor();
                    subtract.showOperationResult(oper1, oper2);
                    break;
                case "*":
                    Operation multiply = new Multiplier();
                    multiply.showOperationResult(oper1, oper2);
                    break;
                case "/":
                    Operation divide = new Divider();
                    divide.showOperationResult(oper1, oper2);
                    break;
            }

            System.out.println("Продолжить работу с калькулятором?(да/нет)");
            repeat = scan.next();
        }while (repeat.equals("да"));
        System.out.println("Пока!");
        scan.close();
    }
}
