// import scala.io.StdIn.readChar()

object Main extends App{
    def add():Double = {
        var a:Double =0;
        var b:Double = 0;
        printf("Enter 1st number : ");
        a = scala.io.StdIn.readInt();
        printf("Enter 2nd number : ");
        b = scala.io.StdIn.readInt();
        return a+b;
    }
    def sub():Double = {
        var a:Double =0;
        var b:Double = 0;
        printf("Enter 1st number : ");
        a = scala.io.StdIn.readInt();
        printf("Enter 2nd number : ");
        b = scala.io.StdIn.readInt();
        return a-b;
    }
    def mult():Double = {
        var a:Double =0;
        var b:Double = 0;
        printf("Enter 1st number : ");
        a = scala.io.StdIn.readInt();
        printf("Enter 2nd number : ");
        b = scala.io.StdIn.readInt();
        return a*b;
    };
    def dev():String = {
        var a:Double =0;
        var b:Double = 0;
        printf("Enter 1st number : ");
        a = scala.io.StdIn.readInt();
        printf("Enter 2nd number : ");
        b = scala.io.StdIn.readInt();
        return if(b==0) "NAN" else String.valueOf(a/b);
    }
    //More
    // Interface for calculator
    var stop:Int = 0;
    while(stop == 0){
        println("WELCOME to Calculator");
        println("Enter,\n1 for add two numbers\n2 for substract second number from first number\n3 for multiply two numbers\n4 for devide first number from second number\n5 for stop the calculator : \n\n");

        printf("Enter command : ");
        var input:Char = scala.io.StdIn.readChar()

        if(input == '1'){
            println("Answer is = " + add() + "\n\n");
        }
        else if(input == '2'){
            println("Answer is = " + sub() + "\n\n");
        }
        else if(input == '3'){
            println("Answer is = " + mult() + "\n\n");
        }
        else if(input == '4'){
            println("Answer is = " + dev() + "\n\n");
        }
        else if(input == '5'){
            println("\n***\nEND OF CALCULATOR...\n")
            stop = 1;
        }
        else{
            println("Invalid input : TRY AGAIN\n\n");
        }
    }
}