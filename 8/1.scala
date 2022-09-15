import scala.math.pow;

case class Point(a:Double , b:Double ){
    def x = a;
    def y = b;

    def add(that:Point) = {
        Point(this.x + that.x , this.y + that.y);
    }

    def move( dx:Double , dy:Double ) = {
         Point(this.x+dx , this.y+dy);
    }

    def distance(that:Point) = {
        pow( pow( this.x - that.x , 2.0 ) + pow(this.y - that.y , 2.0 ) , 0.5);         // sqrt ( (x2 - x1)^2 + (y2 - y1)^2 )
    }

    def invert() = {
        Point( -this.x , -this.y );
    }
}



object Main extends App{
    val p1 = Point(6.0 , 10.0);
    val p2 = Point(3.0 , 6.0 );

    println(s"\np1 = ${p1} and p2 = ${p2} \n");
    val p3 = p1.add(p2);
    println(s"\nadd p1 & p2 = ${p3} => p3\n");
    val p4 = p3.move(2,4);
    println(s"\nmove p3 by dx: 2 & dy:4 = ${p4} => p4\n");
    val distance = p1.distance(p2);
    println(s"\nDistance between p1 and p2 = ${distance} \n");
    val p5 = p4.invert();
    println(s"\nInvert of p4 = ${p5} => p5\n");

}