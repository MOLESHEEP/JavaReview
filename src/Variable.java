import java.util.Scanner;

public class Variable {

    //声明常量
    public static final boolean flag = false;
    public static final int numOfdec = 5;
    public static int count;
    //静态变量的作用是，无论创建多少个对象，静态变量只有一个，这意味着可以用作计数器等作用
    //静态函数的作用是，无论创建多少个对象，静态函数只运行一次，这意味着可以用于初始化静态变量或者加载静态设置。
    //静态类的作用是，其不能直接访问静态变量或静态方法，适合用于作为组织类关系的类，或作为命名空间
    public static void find(){

    }
    public void defineVariable(){
        int a = 10;
        double b = 20.d;
        float c = 30.f;
        long d = 40;
        short e = 50;
        char f = 'f';
        byte g = 10;
        boolean h = true;

        // a = b 不行是因为int范围没有double大需要用强制转换
        b = a;
        // int < float < double < long
        //boolean 通常1bite

        String s1 = "\t I am a string; \n \" I am a string \" \n \\ I am a string \\ ";
        System.out.println(s1);
        //String 不可变 StringBuffer 和 StringBuilder可变
        StringBuffer s2 = new StringBuffer("\t I am a string; \n \" I am a string \" \n \\ I am a string \\ ");
        System.out.println(s2);

        StringBuilder s3 = new StringBuilder("Eos");
        System.out.println(s3);

        //其他类型转字符串
        String as = Integer.toString(a);
        //String as = String.valueOf(int a); 这种形式也是可行的
        String bs = Double.toString(b);
        String cs = Float.toString(c);
        String ds = Long.toString(d);
        String es = Short.toString(e);
        String fs = Character.toString(f);
        String gs = Byte.toString(g);
        String hs = Boolean.toString(h);

        //字符串转其他类型
        //float -> double
        float num1 = 1.0f;
        double num2 = (double) num1;

        double num3 = 100.0;
        int num4 = (int)num3;
    }

    public void BiConvert(){
        int num = 200;
        System.out.println(num + "的二进制是："+ Integer.toBinaryString(num));
        System.out.println(num + "的十进制是："+ Integer.toOctalString(num));
        System.out.println(num + "的十六进制是："+ Integer.toHexString(num));
        System.out.println(num + "的三进制是："+ Integer.toString(num,3));
    }

    public void IOoperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a Integer");
    }
}
