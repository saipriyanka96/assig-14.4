package test;
//Package is a grouping of related types providing access protection and name 
//test is the package name
public class DaemonTest extends Thread{
////public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class. DaemonTest is a class name
//An interface can extends another interface in the same way class can extend the class
//The extends keyword extend an interface and the child interface inherits the methods of parent
//interface
	public void run()
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
	{
		if(Thread.currentThread().isDaemon())
//If thread is equal to daemon thread then it prints daemon thread otherwise user
		{
			System.out.println("Daemon thread:"+Thread.currentThread().getName());
		}
		else
		{
			System.out.println("User Thread:"+Thread.currentThread().getName());
		}
		//system is final class
		//out is a static member of system class and type printStream
		//println is method of printStream class.ln means nextline
		// if else condtion is like true and false condition
	}
	public static void main(String[] args) {
//static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
				
		// TODO Auto-generated method stub
		DaemonTest test1=new DaemonTest();
		//creating the new object and printing with set method
		 test1.setName("Thread 1");
		DaemonTest test2=new DaemonTest();
		test2.setName("Thread 2");
		test1.setDaemon(true);//boolean for set method
		test1.start();//starts the thread condition
		test2.start();
		//here we are implementing the thread 1 as daemon  and thread 2 as user thread
	}
	

}
