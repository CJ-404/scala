object Main extends App {
    var i,j,k:Int = 2;
    var m,n:Int = 5;
    var f:Float=12.0f;
    var g:Float=4.0f;
    var c:Char='X';
    // printf("i = %c,j = %f,k = %f",c,f,g);     // scala doesn't support ++i

    printf("%d\n",k + 12*m);
    printf("%d\n",m/j);
    printf("%d\n",n%j);
    printf("%d\n",m/j*j);
    printf("%f\n",f + 10*5 + g);
    (i+=1);
    printf("%d\n",i*n);// print(++i*n);

}