import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloMaven{
    public static boolean Fanhui(String str){
        int num = str.length();
        int num1 = num-1;
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<num;i++){
            String ss = String.valueOf(str.charAt(i));
            list.add(ss);
        }
        if(list.get(0) == list.get(num1-2) && list.get(1) == list.get(num1-3)){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        //System.out.println("hello maven");
        //System.out.println("it is a change test!");
        //System.out.println("123");
        Scanner in = new Scanner(System.in);
        String str;
        str = in.next();
        Fanhui(str);

    }
}
