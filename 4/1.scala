object Main extends App{
    def interest(n:Double):Double = n match {
        case x if x>2000000 => x*.065
        case x if x>200000 => x*.035
        case x if x>20000 => x*.04
        case x if x>0 => x*.02
        case x if x<=0 => 0
    }

    println("Interest for RS. 22000 is : RS." + interest(20001));

}