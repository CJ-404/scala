object Main extends App{

    def normal_Salary(h:Int):Double=h*250.00;
    def ot_Salary(h:Int):Double=h*85.00;
    def total(hNormal:Int,hOT:Int):Double=normal_Salary(hNormal)+ot_Salary(hOT);
    def tax(total:Double):Double=total*.12;
    def takehome_Salary(hNormal:Int,hOT:Int):Double=total(hNormal,hOT)-tax(total(hNormal,hOT));
    
    println("Take home Salary is : " + takehome_Salary(40,30));

}