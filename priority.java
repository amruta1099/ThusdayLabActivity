package question5;
public class priority implements Runnable
{
public void run()
{
  System.out.println(Thread.currentThread()); // This method is static.
}
public static void main(String[] args) 
{
 priority a = new priority();
 Thread t = new Thread(a, "AmrutaThread");
 
 System.out.println("Priority of Thread: " +t.getPriority());
 System.out.println("Name of Thread: " +t.getName());
 t.start();
  }
}
