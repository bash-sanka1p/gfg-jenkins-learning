package gfg;

public class MyCalc {
    public int sum(int a, int b)
    {
        return (a+b);
    }
    public int diff(int a, int b)
    {
        return (a-b);
    }
    public int mul(int a, int b)
    {
        return (a*b);
    }
    public int div(int a, int b)
    {
        return (a/b);
    }
    public int mod(int a, int b)
    {
        return (a%b);
    }
    public void greet(){
        System.out.println("Hello Prod Branch");
    }
    public static void main(String[] args){
        MyCalc calc = new MyCalc();
        calc.greet();
        System.out.println("Sum is :" + calc.sum(20, 10));
        System.out.println("diff is :" + calc.diff(20, 10));
        System.out.println("mul  is :" + calc.mul(20, 10));
        System.out.println("div  is :" + calc.div(20, 10));
        System.out.println("Mod  is :" + calc.mod(20, 10));
    }
}