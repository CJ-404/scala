package Account;

class account(nm:String , id:String , n:String , b:Double){
    var name = nm;
    var nic = id;
    var accNo = n;
    var balance = b;

    def transfer(that:account , a:Double ):Any ={
        this.balance = this.balance - a;
        that.balance = that.balance + a;
        println(s"$$${a} Transfered Successfully. To ${that.name} From ${this.name}\n");
    };

    override def toString = "\n[ NAME : " + name +" ]\n" + "[ NIC :" + nic +" ]\n" + "[ Account No : " + accNo +" ]\n" + "[ Balance : $" + balance + " ]\n"; 
}