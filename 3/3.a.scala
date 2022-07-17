object Main extends App{

    def Max(a:Int,b:Int,c:Int):Int={
            if(a<b){
                if(b<c){
                    c
                }
                else{
                    b
                }
            }
            else{
                if(a<c){
                    c
                }
                else{
                    a
                }
            }
        }

    println(Max(2,8,5));
    
}