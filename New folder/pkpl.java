package poovarasan;

import java.util.*;

public class pkpl
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        String s1=s.toUpperCase();
        char c[]=new char[s1.length()];
        for(int i=0;i<s1.length();i++){
            c[i]=s1.charAt(i);
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(char ch='A';ch<='Z';ch++){
                if(c[i]==ch){
                    count++;
                    break;
                }
            }
        }
        if(count>=26){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}