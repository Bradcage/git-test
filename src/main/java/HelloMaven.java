import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloMaven{
    public static boolean Fanhui(String str){
        int num = str.length();
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<num;i++){
            String ss = String.valueOf(str.charAt(i));
            list.add(ss);
        }
        //System.out.println(list.get(0));
        //System.out.println(list.get(num-2));
        //System.out.println(list.get(1));
        //System.out.println(list.get(num-1));

        if(num-2<0){
            return true;
        }else if(list.get(0).equals(list.get(num-2)) && list.get(1).equals(list.get(num-1))){
            return true;
        }else{
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
        System.out.print(Fanhui(str));

    }
}
