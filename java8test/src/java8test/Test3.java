package java8test;

/*interface Manager{
public void Activity();
}public class LamdaEg{
public static void main(String[] args) {
	int task=10;
	//without lambda,implement interface using anonymous class
	Manager d=new Manager() {
		public void Activity() {
			System.out.println(task);}
		};
d.Activity();
		
	}
}*/

@FunctionalInterface
interface Manager{
public void Activity();
//public void Activity1();
}public class Test3{
public static void main(String[] args) {
	int task=10;
	//without,implement interface using anonymous class
	Manager m1=() -> System.out.println(task);
m1.Activity();
		
	}
}






