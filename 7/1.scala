package Rational;

object ration extends App{
    val x = rational(9,15);
    println( x.toString );

    x.neg;
    println( x.toString );

    val x = rational(3,4);
    val y = rational(5,8);
    val z = rational(2,7);

    val res0 = x.sub(y).sub(z);
    println( res0.toString);

}