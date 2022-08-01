object Main extends App{

    def check(n:Int):Any= n match{
        case 0 => println("Zero is given");
        case x if(x < 0) => println("Negative number is given");
        case x if(x%2 == 0 ) => println("Even number is given");
        case _ => println("Odd number is given");
    }

    def getInput():Any = {
        printf("Enter a number : ");
        check(scala.io.StdIn.readInt());
    }

    getInput();
    
}