object Main extends App{
    def price(n:Int):Double = n*24.95;
    def discount(p:Double):Double = p*0.4;
    def shipping_cost(n:Int):Double = if(n>50) 3*50+ 0.75*(n-50) else 3*n;
    def whole_cost(n:Int):Double = price(n) - discount(price(n)) + shipping_cost(n);

    println("Wholesale cost for 60 copies = "+whole_cost(60));
}