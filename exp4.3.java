//3. Write a Java program to demonstrate the use of garbage collector.

import java.util.*;
public class garbagecollector
{
public static void main(String args[])
{
garbagecollector obj=new garbagecollector();
obj=null;
garbagecollector a = new garbagecollector();
garbagecollector b = new garbagecollector();
b = a;
System.gc();
}
protected void finalize() throws Throwable
{
System.out.println("Garbage collection ids done by JVM");
}
}