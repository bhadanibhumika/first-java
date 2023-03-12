import java.sql.SQLOutput;

public class Calculator
{
    //Global static/class variables
    static int a = 10;
    static int b = 5;
    static int answer;
    //no return type no parameter user defined method
    // addition method
    static void addition() {
        answer = a + b;
        System.out.println(answer);
    }
    // substation method
    static void sub(){
        answer = a-b;
        System.out.println(answer);
    }
    // multiply method

    static void multi(){
        answer = a*b;
        System.out.println(answer);}
    // division method

    static void division(){
        answer = a/b;
        System.out.println(answer);
    }

    //main method
    public static void main(String[] args){
        addition();
        sub();
        multi();
        division();
    }

}
