object Main extends App{

    case class shopping_cart(quantity:Int , name:String, price:Double);

    def print_cart(a:Array[shopping_cart]):Any = {
        if(a.length >= 1){
            println(a.head.quantity + " " + a.head.name + " at Rs " +a.head.price+ " each");
            // println("$a.head.quantity $a.head.name at Rs $a.head.price each");
            print_cart(a.tail);
        }
        
    }

    def out_vanilla(a:Array[shopping_cart]):Any = {
        if(a.length >=1){
            if(a.head.name == "vanilla ice cream"){
                println("Found " + a.head.quantity + " " +a.head.name);
            }
            else{
                println("Found another item");
            }
            out_vanilla(a.tail);
        }
    }

    val item1  = shopping_cart(13,"vanilla ice cream",3.99);
    val item2 = shopping_cart(6,"chocolate biscuits",4.00);
    val item3 = shopping_cart(7,"cupcakes",7.77);


    val a = Array(item1,item2,item3);
    print_cart(a);
    println("\n\nMethod for output vanilla ice cream\n");
    out_vanilla(a);


}