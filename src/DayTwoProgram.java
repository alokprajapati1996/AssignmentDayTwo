import java.util.Scanner;
public class DayTwoProgram {
       public static void digitNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Read a Number 1,10,100,1000 and display unit, ten hundred");
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num==1){
            System.out.println("One");
        }
        else if(num==10){
            System.out.println("Ten");
        }
        else if(num==100){
            System.out.println("One Hundred");
        }
        else if(num==100){
            System.out.println("Ten Hundred");
        } else{
            System.out.println("enter wrong value");
        }
    }

    public static void main(String[] args) {
        digitNumber();
    }
}
