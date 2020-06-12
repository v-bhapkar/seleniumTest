package javaBasics;

public class MethodsInJava {

    public int addIntegers(int num1, int num2){
        int result = num1 + num2;
        return  result;
    }

    public float addFloatNumbers(float num1, float num2){
        float result = num1 + num2;
        return result;
    }


    public static void main(String[] args) {
        MethodsInJava mt = new MethodsInJava();
        int r = mt.addIntegers(12, 23);
        System.out.println(r);
        System.out.println(mt.addFloatNumbers(1.5f,2.5f));
    }
}
