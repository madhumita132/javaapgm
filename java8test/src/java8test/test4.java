package java8test;

interface Method{
	void say();
}
@FunctionalInterface
interface Consnew{
	SampleCons print(String msg);//call without return type(void) using functional interface
}
class SampleCons{
	 SampleCons(String msg){
		 System.out.println(msg);
	 }
}
public class test4 {
 public void saySomething() {
	 System.out.println("non static method");
 }
 public static void main(String[] args) {
	 test4 mr=new test4();
	 System.out.println("non static method using reference");
	 Method m=mr::saySomething;
	 m.say();//calling interface
	 System.out.println("Refeering non static method using anonymous object");
	 Method mr1=new test4()::saySomething;
	// Method m1=MethodReference()::saySomething;
 	mr1.say();
 	
 	
 	Consnew cn=SampleCons::new;
 	cn.print("constructor call using new keyword");
 	}
}
