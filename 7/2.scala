package Rational;

object ration extends App{

    val x = rational(3,4);
    val y = rational(5,8);
    val z = rational(2,7);

    val res0 = x.sub(y).sub(z);     // ( x - y - z )
    println( res0.toString);

}