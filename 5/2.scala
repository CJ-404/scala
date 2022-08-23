object Main extends App{
    def GCD(a:Int,b:Int):Int= b match{
        case 0 => a;
        case x if x>a => GCD(x,a);
        case _ => GCD(b,a%b);
    }

    def prime(p:Int,n:Int):Boolean = n match{
        case x if(x == p) => true;
        case x if(GCD(p,x) > 1) => false;
        case x => prime(p,x+1);
    }

    def primeSeq(n:Int):Any= {
        if(n == 2 ){
            println(n)
        }
        else{
            primeSeq(n-1);
            if(prime(n,2)) {
                println(n)
            }
        }
    }

    primeSeq(10);
}