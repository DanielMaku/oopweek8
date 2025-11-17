package ie.atu;

public class Calculator {
    public int add(int firstNum, int secondNum) {
        if (firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        int result = firstNum + secondNum;
        return result;
    }

    public int sub(int firstNum, int secondNum)
    {
        if(firstNum <= Integer.MIN_VALUE || secondNum <= Integer.MIN_VALUE)
            throw new ArithmeticException("Number cannot be less than or equal to Integer.MIN_VALUE");
        int result = firstNum - secondNum;
        return result;

    }

    public int mul(int firstNum, int secondNum)
    {
        if(firstNum >= Integer.MAX_VALUE || secondNum >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        int result = firstNum * secondNum;
        return result;


    }

    public int div(int firstNum, int secondNum)
    {
        if (firstNum >= Integer.MAX_VALUE || secondNum == 0)
            throw new ArithmeticException("Number cannot 0 or be greater than or equal to Integer.MAX_VALUE");
        int result = firstNum/secondNum;
        return result;



    }
}
