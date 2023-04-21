/* wajp to find the index of an array elements.  */

import java.io.*;
class Index
{
public static void main(String args[])
{
Console c=System.console();
int size=Integer.parseInt(c.readLine("enter the size of array :"));

//declare array....
int num[]=new int[size];

//read the data from user...
for(int i=0; i<size; i++){
num[i]=Integer.parseInt(c.readLine("enter the no :"));
}

//retrive the data...
for(int i=0; i<size; i++){
System.out.print(num[i]+" ");
}

//find index of array element...
int n=Integer.parseInt(c.readLine("\n enter the number :"));
int index=0;
for(int i=0; i<size; i++){
if(num[i]==n){
index=i;
}
}
System.out.println("Index position at = "+ index +" "+"position");

}
}