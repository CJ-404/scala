package Account;

object acc2 extends App{

    val x1 = account("Kamal" , "9912233445v" , "10544567865432" , 10000);
    val x2 = account("saman" , "9619237481v" , "10987145289234" , -20000);
    val x3 = account("Kamal" , "9715612095v" , "10346797841131" , 30000);
    val x4 = account("saman" , "9511293548v" , "10112111287699" , -40000);
    val x5 = account("piyal" , "9112673557v" , "19216786634333" , 40000);

    val Accounts:List[account] = List(x1,x2,x3,x4,x5);

    def isNegative = (acc:account) => (acc.balance < 0 );
    def sum = (b1:Double , b2:Double) => ( b1 + b2 );
    def interests = (acc:account) => ( if(acc.balance >= 0) (acc.balance + acc.balance*.05) else (acc.balance + acc.balance*.1) );

    println( Accounts.filter(isNegative ) );
    println( s"\nSum of account balances : ${Accounts.map( (x => x.balance) ).reduce(sum )}\n" );
    println( s"List of all interests : ${Accounts.map(interests )}\n" );


}