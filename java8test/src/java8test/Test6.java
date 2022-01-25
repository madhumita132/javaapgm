package java8test;
interface Draw
{
    default void show()
    {
        System.out.println("This is default method of Draw Interface");
    }
    void DrawData();
}
interface Print
{
    default void show()
    {
        System.out.println("This is default method of Print Interface");
    }
    void PrintData();
}
class ManageRecord implements Draw, Print
{
    public void PrintData() 
    {
        System.out.println("PrintData method Implemented by ManageRecord class");
    }
    public void DrawData() 
    {
        System.out.println("DrawData method Implemented by ManageRecord class");
    }
    @Override
    public void show() 
    {
        Draw.super.show();
        Print.super.show();
    }
}
public class Test6
{
    public static void main(String arg[])
    {
        ManageRecord obj = new ManageRecord();
        obj.DrawData();
        obj.PrintData();
        obj.show();
    }
}