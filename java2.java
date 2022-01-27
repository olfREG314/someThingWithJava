
//question  6
import java.util.Scanner;



class Account{
    String custName;
    int accountNumber;
    double balance;

    Account(){
        this.accountNumber=00;
        this.balance=00;
        this.custName="null";
    }

    Account(String name,int no,double bal){
        this.custName=name;
        this.accountNumber=no;
        this.balance=bal;
    }
    void  deposit(double amtAddded){
        this.balance+=amtAddded;
        System.out.println("Amt Added successfully "+amtAddded);
    }
    void withdraw(double amtwithdraw){
        this.balance-=amtwithdraw;
        System.out.println("Amt withdrawed successfully"+amtwithdraw);
    }
    
}

public class java2 {

    static void display(Account obj){
        System.out.println("account number="+obj.accountNumber+"  account name="+obj.custName+"   account balance="+obj.balance);
        
    }

    public static void main(String args[]){
        int temp=0;
        Scanner sc=new Scanner(System.in);   
      
        Account arr[]=new Account[5];
        for(int i=0; i<5;++i){
            arr[i]=new Account();
            arr[i].accountNumber=200+i;
        }
        for(int i=0;i<5;++i){
            System.out.println("enter the name "+i+" customer");
            arr[i].custName=sc.nextLine();
        }

        char c='y';
        while (c!='q'){

            System.out.println("Choose account from 1 to 5");
            temp=sc.nextInt();
            

            System.out.println("(1) withdraw   (2) deposit   (3) display   (4) quit");
            c= sc.next().charAt(0);

            switch(c){
                case '1':System.out.println("amt to withdraw");
                         arr[temp].withdraw(sc.nextDouble());
                         break;
                case '2':System.out.println("amt to deposit");
                         arr[temp].deposit(sc.nextDouble());
                         break;
                case '3':System.out.println("amt to display");
                            System.out.println("enter the  amount");
                            double m=sc.nextDouble();
                         for(int i=0;i<5;++i){
                             if(arr[i].balance>=m)
                                display(arr[i]);
                         }
                         break;
                case '4':System.out.println("quit");
                        c='q';
                        break;
            }
        }
        
        
    }
    
}
question 1

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

