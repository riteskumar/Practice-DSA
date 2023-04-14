class Box
    {
        int width,depth,height;
        Box(){      //Default Constructor
           width = depth = height= -1;
        }
        Box(int w, int d , int h){          //Parameterized Constructor
            width = w;
            depth =d;
            height = h;
        }
        Box(int len){
            width = depth = height = len;
        }
        int volume(){
            return (width*depth*height);
        }
    }
    class BoxWeight extends Box
    {
        int weight;
        BoxWeight(){
            super();
            weight = -1;
        }
        BoxWeight(int w, int d , int h , int m){
            super(w,d,h);
            weight = m;
        }
        BoxWeight(int len , int m){
            super(len);
            weight = m;
        }
    }
/*
    class A
    {
        A(){
            System.out.println("Constructor in class A");
        }
    }
    class B extends A
    {
        B(){
//            super();  Without using of super keyword first preference to superclass and then subclass
            System.out.println("Constructor in class B");
        }
    }

 */
public class Program_1_140423 {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(1,2,3,4);
        BoxWeight mybox2 = new BoxWeight(5,6,7,8);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mybox4 = new BoxWeight(3,2);
        int vol = mybox1.volume();
        System.out.println("Volume of mybox1 = "+vol);
        System.out.println("Weight of mybox1 = "+mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 = "+vol);
        System.out.println("Weight of mybox2 = "+mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 = "+vol); // -1
        System.out.println("Weight of mybox3 = "+mybox3.weight); // -1
        System.out.println();
         vol = mybox4.volume();
        System.out.println("Volume of mybox4 = "+vol);  // 27
        System.out.println("Weight of mybox4 = "+mybox4.weight); //2
        System.out.println();


//        B obj = new B();

    }
}
