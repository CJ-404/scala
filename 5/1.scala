object Main extends App{
    def GCD(a:Int,b:Int):Int= b match{
        case 0 => a;
        case x if x>a => GCD(x,a);
        case _ => GCD(b,a%b);
    }

    def is_prime(p:Int,n:Int):Boolean = n match{
        case x if(x == p) => true;
        case x if(GCD(p,x) > 1) => false;
        case x => is_prime(p,x+1);
    }

    println(is_prime(11,2));
}