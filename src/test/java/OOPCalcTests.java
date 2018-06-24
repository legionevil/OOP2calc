import org.junit.Assert;
import org.junit.Test;
import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/**
 * Created by legionevil on 24.06.2018.
 */
public class OOPCalcTests {

    @Test
    public void NewOperandEqualsZero(){
        Operand operand = new Operand();
        Assert.assertEquals("Новый операнд должен быть равен нулю",0,operand.getOperandValue(),0);
    }

    @Test
    public void SetOperandEquals2(){
        Operand operand = new Operand();
        operand.setOperandValue(2);
        Assert.assertEquals("должна присвоиться 2 новому операнду",2,operand.getOperandValue(),0);
    }

    @Test
    public void SubtractionOfEqualOperandsShouldBeZero(){
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Subtractor subs = new Subtractor();
        for (int x = 0; x < 100; x++) {
            operand1.setOperandValue(x);
            operand2.setOperandValue(x);
            Assert.assertEquals("x - x = 0",0,subs.CalcOperationResult(operand1,operand2),0);
        }
    }
    @Test
    public void AdditionOfEqualsShouldBeMultiplication(){
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Adder adder = new Adder();
        for (int x = 0; x < 100; x++) {
            operand1.setOperandValue(x);
            operand2.setOperandValue(x);
            Assert.assertEquals("x + x = 2x",x * 2,adder.CalcOperationResult(operand1,operand2),0);
        }
    }

    @Test
    public void MultiplicationOfEqualsPower2(){
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Multiplier multiplier = new Multiplier();
        for (int x = 0; x < 100; x++) {
            operand1.setOperandValue(x);
            operand2.setOperandValue(x);
            Assert.assertEquals("x * x = x ^ 2",power( x,2),multiplier.CalcOperationResult(operand1,operand2),0);
        }
    }
    @Test
    public void DivideOfEqualsIs1(){
        Operand operand1 = new Operand();
        Operand operand2 = new Operand();
        Divider divider = new Divider();
        for (int x = 1; x < 100; x++) {
            operand1.setOperandValue(x);
            operand2.setOperandValue(x);
            Assert.assertEquals("x / x = 1",1,divider.CalcOperationResult(operand1,operand2),0);
        }
    }
}
