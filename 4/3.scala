object Main extends App{

    def hashcode(a:String,b:Int = 0):Long = {
        if(a.length >= 1){    
            ((a.head.toLong)*(scala.math.pow(10,b).toLong)) + hashcode(a.tail,b+1);
        }
        else{
            0;
        }
    }

    case class car(name:String,price:Double);

    def genrate_UUID(a:Array[car],b:Array[String],index:Int = 0):Any = {
        if(a.length >= 1){
            b(index) = a.head.name +" - " + hashcode(a.head.name).toString;
            genrate_UUID(a.tail,b,index+1);
        }
    }

    def print_uuid(a:Array[car],b:Array[String]):Any = {
        if(a.length>=1){
            println("car uuid = " + b.head);
            print_uuid(a.tail,b.tail);
        }
    }

    val car1 = car("bmw 3 series",20000);
    val car2 = car("bmw 5 series",50000);
    val car3 = car("vw passat",10000);
    val car4 = car("vw golf",12000);
    val car5 = car("mazda 3",15000);

    val car_inventory = Array(car1,car2,car3,car4,car5);
    val hashcodes = new Array[String](car_inventory.length);

    
    genrate_UUID(car_inventory,hashcodes);
    print_uuid(car_inventory,hashcodes);

    
}