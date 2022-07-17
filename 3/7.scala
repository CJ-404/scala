object Main extends App{
    def Season(a:Int):String = {
        if(a == 12 || a==2 || a==1)
            "Season = Winter"
        else if(a==3 || a==4 || a==5)
            "Season = Spring"
        else if(a==6 || a==7 || a==8)
            "Season = Summer"
        else if(a==9 || a==10 || a==11)
            "Season = Autumn"
        else
            "Bogus month"
        
    }

    println(Season(10));
}