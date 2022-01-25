package java8test;

interface Test {
	   void func();
	}
	class StaticMethodRef {
	   static void message() {
	      System.out.println("Welcome to static method");
	   }
	}
	class InstanceMethodRef {
		   void message() {
		      System.out.println("Welcome to dynamic method");
		   }
		}
	public class Test44 {
	   public static void main(String arg[]) {
	      Test test = StaticMethodRef :: message;    // calling using "::" operator
	      test.func();
	      InstanceMethodRef ref = new InstanceMethodRef();
	      Test test2 = ref :: message;   // calling using "::" operator
	      test2.func();
	   }
	}
	
		
		
		  