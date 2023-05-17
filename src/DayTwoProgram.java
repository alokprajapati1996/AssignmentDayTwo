import java.util.Scanner;
public class DayTwoProgram {
       public static void digitNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Read a Number 1,10,100,1000 and display unit, ten hundred");
        System.out.println("Enter number");
        int num=sc.nextInt();
        if(num== 1){
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
    public static void readSingleDigit(){
            System.out.println("Enter single Digit number 1 to 9");
            Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
            if(num==1){
        System.out.println("One");
    }
            else if(num==2){
        System.out.println("Two");
    }
            else if(num==3){
        System.out.println("Three");
    }
            else if(num==4){
        System.out.println("Four");
    }else if(num==5){
        System.out.println("Five");
    }else if(num==6){
        System.out.println("Six");
    }else if(num==7){
        System.out.println("Seven");
    }else if(num==8){
        System.out.println("Eight");
    }
            else if(num==9){
        System.out.println("Nine");
    }else{
        System.out.println("enter wrong value");
    }
}
public static void main(String[] args) {
        digitNumber();
        readSingleDigit();
    }
}
