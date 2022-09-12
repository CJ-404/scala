package Rational;

class rational(x:Int , y:Int){

    require(y!=0 , "Denominator can't be Zero");

    private def ABS(n:Int):Int = n match{
        case x if x>=0 => x;
        case _ => -x;
    }
    private def GCD(a:Int , b:Int):Int = b match{
        case 0 => a;
        case x if(x>a) => GCD(x,a);
        case _ => GCD(b,a%b);
    }


    private val gcd = GCD( ABS(x) , ABS(y) );
    var numer = x/gcd;
    var denom = y/gcd;

    def neg = new rational(-this.numer , this.denom);

    override def toString = "[ "+ numer + " / " + denom + " ]";

    def sub(that:rational):rational = new rational( (this.numer*that.denom) - (that.numer*this.denom) , this.denom*that.denom );
}