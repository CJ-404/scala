object Main extends App{
    def attendees(price:Int):Int = 120 + (15 - price)/5*20;
    def cost(price:Int):Int = 500 + 3*attendees(price);
    def revenue(price:Int):Int = price*attendees(price);
    def profit(price:Int):Int = revenue(price) - cost(price);

    println("when ticket price is 5, Profit is : " + profit(5));
    println("when ticket price is 10, Profit is : " + profit(10));
    println("when ticket price is 15, Profit is : " + profit(15));
    println("when ticket price is 20, Profit is : " + profit(20));
    println("when ticket price is 25, Profit is : " + profit(25));
    println("when ticket price is 30, Profit is : " + profit(30));
    
}