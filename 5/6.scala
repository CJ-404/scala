object Main extends App{
    def fibonacci(n:Int):Int= n match{
        case 0 => 0;
        case 1 => 1;
        case _ => fibonacci(n-1) + fibonacci(n-2);
    }

    def fib_Series(n:Int):Any={
        if(n > 0) fib_Series(n-1);
        
        println(fibonacci(n));
    }

    fib_Series(10);
}