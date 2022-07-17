object Main extends App{
    def Grade(M:Double):String={
        if(M<0.0)
            "Invalid Marks"
        else if(M>69.0)
            "very Good"
        else if(M>54.0)
            "Good"
        else if(M>39.0)
            "Pass"
        else
            "Fail"
    }

    println(Grade(54.9));
}