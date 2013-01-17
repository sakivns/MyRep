/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cabservice;

import java.io.*;

/**
 *
 * @author Vikas Yadav
 */
public class Stringg {
   static String s1,s2;
   static int m,n,i,j;
   static int[][] arr;
   static char[] sar1;
   static char[] sar2;
    public static void main(String args[])throws Exception
    {
        InputStreamReader i1=new InputStreamReader(System.in);
        BufferedReader bf=new BufferedReader(i1);
        
        System.out.println("enter the first string");
        s1=bf.readLine();
         m=s1.length();
         sar1=new char[m];
        sar1=s1.toCharArray();
        System.out.println("enter the second string");
         s2=bf.readLine();
        n=s2.length();
        sar2=new char[n];
        sar2=s2.toCharArray();
        arr=new int[m+1][n+1];
       for(i=0;i<m+1;i++)
         {
             for(j=0;j<n+1;j++)
             {arr[i][j]=0;}}
        
         
       
         for(int p=0;p<n+1;p++)
         arr[0][p]=p;  
          for(int p=0;p<m+1;p++)
              arr[p][0]=p;
         
             
         for(i=1;i<m+1;i++)
         {
             for(j=1;j<n+1;j++)
             {
                 arr[i][j]=min(arr[i][j-1]+1,arr[i-1][j]+1,arr[i-1][j-1]+diff(i,j));
             }
         }
         
          for(i=0;i<m+1;i++)
         {
             for(j=0;j<n+1;j++)
             {
             System.out.print(arr[i][j]+"  ");
             }
         System.out.println();}
          
          System.out.println("The effective cost of this string allignment is cost "+arr[m][n]);
          fun();
         
    }
    public static int diff(int x,int y)
    {
        if(sar1[x-1]==sar2[y-1])
            return 0;
        else
            return 1;
    }
    public static int min(int i,int j,int k)
    {
        int l=i;
        if(l>j) l=j;
        if(l>k) l=k;
        return l;
    }
   
    
   

public static void fun()
{
    String t1="",t2="";
   while(m>0 && n>0){
if(arr[m-1][n-1]==min(arr[m-1][n-1],arr[m][n-1],arr[m-1][n])){
t1=s1.charAt(m-1)+t1;
t2=s2.charAt(n-1)+t2;
m--;
n--;

}else if(arr[m][n-1]==min(arr[m-1][n-1],arr[m][n-1],arr[m-1][n])){
t1="-"+t1;
t2=s2.charAt(n-1)+t2;
n--;

}else if(arr[m-1][n]==min(arr[m-1][n-1],arr[m][n-1],arr[m-1][n])){
t2="-"+t2;
t1=s1.charAt(m-1)+t1;
m--;

}

}
if(m>0){
while(m>0){
t1=s1.charAt(m-1)+t1;
t2="-"+t2;
m--;
}
}else if(n>0){
while(n>0){
t2=s2.charAt(n-1)+t2;
t1="-"+t1;
n--;
}
} 


System.out.println(t1);
System.out.println(t2);

}
}
      
    
      
       
    
    
  