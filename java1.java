import java.util.Scanner;
import java.lang.Math;

//this obj is just to take data
class obj{
    double x,y,z;

    //default constructor
    obj(){
        x=y=z=0;
    }
    //if data is send when creating the
    //parameterized constructor
    obj(double x,double y,double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
}
//this class calculate the area of the obj
//usage of Inheritance
class calAreaOfTheObj extends obj{
    double calArea(){
        double s=(x+y+z)/2;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }
}

public class java1 {

    static double calArea(double x, double y, double z){
        double s=(x+y+z)/2;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }
    public static void main(String args[]){
    
        Scanner sc= new Scanner(System.in);
        //creating of the object
        obj obj1=new obj();
        //asking for input
        System.out.println("side 1");
        obj1.x=sc.nextDouble();
        System.out.println("side 2");
        obj1.y=sc.nextDouble();
        System.out.println("side 3");
        obj1.z=sc.nextDouble();
        //creating of subclass
        calAreaOfTheObj obj1_2=new calAreaOfTheObj();
        //calculating the area
        double area=obj1_2.calArea();
        System.out.println("Area of the triangle="+area);
        
    }
}
