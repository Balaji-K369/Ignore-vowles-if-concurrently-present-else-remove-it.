import java.util.*;
public class Vowel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' ||
str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U'){
            if(str.charAt(i)==str.charAt(i+1)){
            str1+=str.charAt(i);
            str1+=str.charAt(i+1);}
            else{
                i++;
                str1+=str.charAt(i);
            }
        }else
        str1+=str.charAt(i);
    }System.out.println(str1);}
}