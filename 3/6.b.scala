object Main extends App{
    def Grade(M:Double):String={
        if(M>0.0){
            if(M>39.0){
                if(M>54.0){
                    if(M>69.0){
                        "Very Good"
                    }
                    else{
                        "Good"
                    }
                }
                else{
                    "Pass"
                }
            }
            else{
                "Fail"
            }
        }
        else{
            "Invalid Marks"
        }

    }

    println(Grade(54.9));
}