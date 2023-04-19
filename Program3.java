import java.util.Random;

interface SharedCons
{
    // All instance variables by default declared with final(Constant Value) and static in interface
    int No = 0;
    int Yes = 1;
    int Maybe = 2;
    int Later = 3;
    int Soon = 4;
    int Never = -1;
}
class Question implements SharedCons
{
    Random num = new Random();
    int ask(){
        int prob = 100*num.nextInt();
        if(prob<30)
            return No;
        else if (prob < 60)
            return Yes;
        else if (prob < 75)
            return Later;
        else if(prob < 90)
            return Soon;
        else
            return Never;
    }
}
class Askme implements SharedCons {
    static void answer(int res) {
        switch (res) {
            case No:
                System.out.println("NO");
                break;
            case Yes:
                System.out.println("YES");
                break;
            case Maybe:
                System.out.println("Maybe");
                break;
            case Later:
                System.out.println("Later");
                break;
            case Soon:
                System.out.println("Soon");
                break;
            case Never:
                System.out.println("Never");
                break;
        }
    }


}

public class Program3 {
    public static void main(String[] args) {
        Question q = new Question();
        Askme a = new Askme();
        a.answer(q.ask());

    }
}
