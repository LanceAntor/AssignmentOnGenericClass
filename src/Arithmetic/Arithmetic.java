package Arithmetic;

public class Arithmetic <A extends  Number> {
    public A num1;
    public A num2;

    public Arithmetic(A num1, A num2) {
        if(isNumber(num1) && isNumber(num2)){
            this.num1 = num1;
            this.num2 = num2;
        } else {
            throw new IllegalArgumentException("Invalid Input");
        }
    }

    private boolean isNumber(A num) {
        return num instanceof Integer || num instanceof Double || num instanceof Float || num instanceof Short || num instanceof Long;
    }

    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }
    public double subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }
    public double multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }
    public double divide(){
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Cannot Divide A Zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }
    public double getMax(){
       return Math.max(num1.doubleValue(), num2.doubleValue());
    }
    public double getMin(){
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
