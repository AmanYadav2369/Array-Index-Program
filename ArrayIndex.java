/* wajp to find the index of an array elements. */

import java.io.*;
class ArrayIndex
{
public static void main(String args[])
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter the number :"));

int num[]={25,85,35,75,65};
int index=0;
for(int i=0; i<num.length; i++){
if(num[i]==n){
index=i;
}
}
System.out.println("index ="+index);
}
}