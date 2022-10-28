package Chegg_Solution;

//Question-1
public class Foo{
    //Class or instance Variable
    //Access Type is Public ,it means
    //it is accessible from anywhere
    public int i=75;

    //this is class Constructor which is
    //Used for initializing the variables
    public Foo(int i) {
        this.i=i;
    }
    //This is the main Method where program is Started
    public static void main(String[] args) {
        //We are Creating two  Objects of the Foo
        //class namely x and y
        Foo x=new Foo(57);
        Foo y=new Foo(87);
        //Now we are assign the Values
        y=x;  //y=hashCode Value or Address
        y.i=38;
        System.out.println(x.i); //38

    }
}
