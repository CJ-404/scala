object Main extends App{
    def Grade(M:Double):String={
        if(M<0.0) "Invalid Marks" else if(M>39) if(M>54) if(M>69) "Very Good" else "Good" else "Pass" else "Fail"
    }

    println(Grade(47.8));
}