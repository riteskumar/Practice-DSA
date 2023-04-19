interface Callback
{
    void callback(int a);
}
class Client implements Callback
{
   public void callback(int a){  // Method should be declared with public
        System.out.println("Callback called with "+a);
    }
    void show(){
       System.out.println("Classes that implement interfaces " +"May also defined other members,too.");
    }
}
abstract class incomplete implements Callback // If any class doesn't include interface's method then that class must be abstract
{
    int a=10,b=20;
    void show(){   // Non-Abstract method
        System.out.println(a+" "+b);
    }

}
public class Program1 {
    public static void main(String[] args){
        Client a = new Client();
        a.callback(20);
        a.show();

         // We can't create the object of abstract class or interface.

    }
}
