public class MathTest {
    public static void main (String [] args){
        MyMath m1 = new MyMath();
        int [] test = {2,-5,67,3};
        System.out.println(m1.arrSumRechnen(test));
        System.out.println(m1.arrPositivInteger(test));
        System.out.println(m1.arrNegativInteger(test));
        System.out.println(m1.arrGeradeInteger(test));
        System.out.println(m1.arrUngeradeInteger(test));
    }
}
