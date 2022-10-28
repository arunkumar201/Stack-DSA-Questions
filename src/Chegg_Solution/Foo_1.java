package Chegg_Solution;

//Question-1
public class Foo_1{
 //Class or instance Variable
    //Access Type is Public ,it means
    //it is accessible from anywhere
    public int i=45;

    //this is class Constructor which is
    //Used for initializing the variables
    public  Foo_1(int i) {
        this.i=i;
    }
  //This is the main Method where program is Started
    public static void main(String[] args) {
     //We are Creating two  Objects of the Foo
     //class namely x and y
        Foo x=new Foo(74);
        Foo y=new Foo(30);
        //Now we are assign the Values
        y.i=x.i;  //y.i=74
        y.i=96;
        System.out.println(x.i);

    }
}
