object Main extends App{

    def check(n:Int):String = n match{
        case x if(x <= 0) => "Negative/Zero is given";
        case x if(x%2 == 0 ) => "Even number is given";
        case _ => "Odd number is given"
    }

    def getInput():String = {
        printf("Enter a number : ");
        check(scala.io.StdIn.readInt());
    }

    println(getInput());
    
}