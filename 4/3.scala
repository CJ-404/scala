object Main extends App{

    def toUpper(str:String):String = str.toUpperCase();

    def toLower(str:String):String = str.toLowerCase();

    def formatNames(name : String )(index_List : Int*)(func : String => String) : String = {
        if(index_List.isEmpty){
            func(name);     //return
        }
        else{
            var temp = "";
            var index = 0;
            while(index < name.length){
                if(index_List.contains(index)) temp = temp + func(name(index).toString)
                else temp = temp + name(index).toString
                index = index + 1;
            }
            temp;   //return
        }
    }

    println(formatNames("Benny")()(toUpper));
    println(formatNames("Niroshan")(0,1)(toUpper));
    println(formatNames("Saman")()(toLower));
    println(formatNames("Kumara")(5)(toUpper));

    
}