object Main extends App{
    def isEven(a:Int):Boolean = { a match{
            case 0 => true
            case _ => isOdd(a-1)
        }
    }

    def isOdd(a:Int):Boolean = !(isEven(a))

    println(isEven(5));
}