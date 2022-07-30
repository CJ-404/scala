object Main extends App{

    def toUpper(str:String):String = {
        if(str.length >= 1){
            str.head.toUpper + toUpper(str.tail);
        }
        else{
            "";     //null
        }
    }

    def toLower(str:String):String = {
        if(str.length >= 1){
            str.head.toLower + toLower(str.tail);
        }
        else{
            "";     //null
        }
    }

    println(toUpper("ChArith"));
    println(toLower("ChArith"));

    
}