
object Main extends App {

    // convert acceptable Scala statements..
    var a:Int = 2;var b:Int = 3;var c:Int = 4;var d:Int = 5;
    var k:Double = 4.3f;
    var g:Double = 1.0f;    //g is not declared in the tutorial file...
    
    //a)
    println( (b-1)*a + c *d);b-=1;d-=1;
    //b)
    println((a+1));a+=1;
    //c)
    println(-2*(g-k)+c);
    //d)
    println(c);c+=1;
    //e)
    println((c+1)*a);c+=1;a+=1;


}

