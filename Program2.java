interface IntStack
{
    void push(int item);
    int pop();
}
class FixedStack implements IntStack
{
    int[] st;
    int top;
    FixedStack(int size){
        st = new int[size];
        top = -1;
    }
    public void push(int item){
        top++;
        st[top] = item;
    }
    public int pop(){
        int value = st[top];
        top--;
        return value;
    }
}
public class Program2 {
    public static void main(){
        FixedStack f = new FixedStack(10);
        for(int i = 10 ; i <= 20 ; i++)
        {
            f.push(i);
        }
        for(int i = 1 ; i <= 5 ; i++){
            f.pop();
        }
    }
}
