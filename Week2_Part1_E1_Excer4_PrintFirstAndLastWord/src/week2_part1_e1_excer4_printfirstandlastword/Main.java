package week2_part1_e1_excer4_printfirstandlastword;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        System.out.println("please insert next word or insert 'end' to end:");
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        String inpoutString="";
        int temp = 0;
        while(true)
        {
            inpoutString=sc.next();
            if(inpoutString.equals("end"))
            {
             break;
            }
            else
            {
                list.add(inpoutString);
            }
        }
        
            System.out.println("First Word Is: "+list.get(0)+"\nLast Word Is: "+list.get(list.size()-1));
    }  
   
}
