object Main extends App{
    def easy_pace(n:Double):Double = 8*n;
    def Tempo(n:Double):Double = 7*n;
    def Total(e1:Double,t1:Double,e2:Double):Double = easy_pace(e1) + Tempo(t1) + easy_pace(e2);

    println("Total running time = " + Total(2,3,2)+" min");
}