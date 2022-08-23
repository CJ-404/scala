object Main extends App{
    def isEven(n:Int):Boolean = n match{
        case 0 => true;
        case _ => isOdd(n-1);
    }

    def isOdd(n:Int):Boolean = !isEven(n);

    def sumOfEven(n:Int):Int= n match {
        case 0 => 0;
        case x if(isEven(x)) => x + sumOfEven(x-1);
        case _ => sumOfEven(n-1);
    }

    println(sumOfEven(11));
}