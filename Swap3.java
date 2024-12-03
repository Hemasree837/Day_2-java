import java.util.*;
public class Swap3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int g=sc.nextInt();
        b=b*g;
        g=b/g;
        b=b/g;
        String res=String.format("After Swapping\nboy=%d\ngirl=%d\n",b,g);
        System.out.println(res);

    }
}


