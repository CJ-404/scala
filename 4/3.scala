object Main extends App{

    def toUpper(str:String):String = str.toUpperCase();

    def toLower(str:String):String = str.toLowerCase();

    def first_2_Upper(str:String):String = (str.substring(0,2)).toUpperCase() + str.substring(2,str.length);

    def last_Upper(str:String):String = str.substring(0,str.length-1) + (str(str.length-1)).toUpper;

    def formatNames(name:String,func:(String)=>String):String = {
        func(name);
    }

    println(formatNames("Benny",toUpper));
    println(formatNames("Niroshan",first_2_Upper));
    println(formatNames("Saman",toLower));
    println(formatNames("Kumara",last_Upper));

    
}