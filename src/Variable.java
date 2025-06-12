import java.util.*;

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
        System.out.println("Please input your age ");
        int age = scanner.nextInt();
        System.out.println("Please input your name: ");
        String name = scanner.next();
        System.out.println("Please input a float number: ");
        float num = scanner.nextFloat();
        System.out.println("Please input a Double number: ");
        double num1 = scanner.nextDouble();

        Random ran = new Random();
        double num2 = ran.nextDouble();
        double res = (num +num1)/ age * num2;
        System.out.println("Today "+name+"`s Lucky number is : "+res+" ! \n");
    }

    public void defineTuples(){
        int[] arr = new int[10];
        int[] arr1 = new int[]{1,2};
        int[] arr2 = {1,2};
        int[][] arr3 = new int[4][4];
        int[][] arr4 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        int[] arr5 = {1,2,3,4,5,6,7};

        for(int i = 0;i<arr5.length;i++){
            System.out.print(arr5[i]+" ");
        }
            System.out.print("\n");
        for (int i = 0;i< arr4.length;i++){
            System.out.print("|");
            for (int j = 0;j<arr4[0].length;j++){
                System.out.print(arr4[i][j]+" |");
            }
            System.out.print("\n");
        }
    }

    public void equalAndequalMark(){
        String s1 = "EQUALITY";
        String s2 = new String("EQUALITY");
        System.out.println("s1 == s2 :"+ (s1 == s2));//对象是否一样
        System.out.println("s1 equals s2 :" + s1.equals(s2));//对象里的内容是否一样

        String s3 = "Equality";
        System.out.print("");
    }

    public void stringOperation(){
        String s1 = "Hello you are my world !";
        String s2 = "hello you are my world !";
        String s3 = new String("hello you are my world !");

        System.out.println("euqual : " + s1.equals(s3));//对象内容是否一样
        System.out.println("euqalIgnoreCase : " + s1.equalsIgnoreCase(s3));//忽略大小写对象内容是否一样
        System.out.println("The length of string : " + s2.length());
        for(int i = 0;i<s1.length();i++){
            System.out.println("|| The "+(i+1)+"th character of the array is "+s1.charAt(i) + ". ||");
        }
        System.out.println("The sub string for 2th to 5th of the array is "+s1.substring(2,5));

        System.out.println("Replace my to your: "+s1.replace("my","your"));

        String[] strArr = s1.split(" ");
        System.out.println("Separate string to array: " + Arrays.toString(strArr));
    }

    public void stringBuilderTest(){
        //有参构造
        System.out.println("stringBuilderTest Start : ");
        StringBuilder sb = new StringBuilder("www.google.com");
        System.out.println("length() : "+sb.length());
        System.out.println("append() : "+ sb.append("/search_id=123456"));
        System.out.println("toString() : "+sb.toString());
        System.out.println("reverse() : "+sb.reverse());

    }

    public void stringJoiner(){
        System.out.println("StringJoiner : StringJoiner(segment,start,end)");
        StringJoiner sj = new StringJoiner("--","{","}");
        sj.add("090");
        sj.add("0000");
        sj.add("0000");
        System.out.println("length() : " + sj.length());
        System.out.println("toString() : " + sj.toString());
    }

    public void arrayList(){
        //动态数组
        System.out.println("ArrayList usage : ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        StringJoiner sj = new StringJoiner("|","{","}");
        //add
        for(int i = 0;i<10;i++){
            arrayList.add(i);
        }
        //set(index,element)
        arrayList.set(arrayList.size()-1,0);
        for(int i = 0;i<arrayList.size();i++){
            sj.add(Integer.toString(arrayList.get(i)));
        }
        System.out.println(sj.toString());
    }

}
