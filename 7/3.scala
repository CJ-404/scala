package Account;

object acc extends App{

    val a1 = account("Kamal" , "9912233445v" , "10544567865432" , 20000);
    val a2 = account("saman" , "9619237481v" , "10987145289234" , 10000);

    println(s"acc 1 Details : \n${a1.toString}");
    println(s"acc 2 Details : \n${a2.toString}");

    a1.transfer(a2, 5000);

    println(s"acc 1 Details : \n${a1.toString}");
    println(s"acc 2 Details : \n${a2.toString}");

}