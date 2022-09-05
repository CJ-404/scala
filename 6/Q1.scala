object Main extends App{

    val Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    val encrypt = (letter:Char , key:Int , alphabet:String ) => letter match{
        case x if( alphabet.indexOf(x) > 0 ) => alphabet((alphabet.indexOf(letter.toUpper) + key ) % alphabet.size );
        case _ => letter;
    }


    val decrypt = (letter:Char , key:Int , alphabet:String ) => letter match{
        case x if( alphabet.indexOf(x) > 0 ) => alphabet((alphabet.indexOf(letter.toUpper) - key + alphabet.size ) % alphabet.size );
        case _ => letter;
    }

    val cipher = ( Func : ( Char , Int , String ) => Char , Str:String , key:Int , albhabet:String ) => Str.map( x => Func( x , key , albhabet ) );


    val STR = "HELLO WORLD";

    val encrypted_Str = cipher( encrypt , STR , 5 , Alphabet );

    val decrypted_Str = cipher( decrypt , encrypted_Str , 5 , Alphabet );

    println("\n\nSTRING is = " + STR );
    println("Encrypted STR is = " + encrypted_Str );
    println("Decrypted STR is = " + decrypted_Str + "\n\n");
}