/*
Input : 596
Output : 258136
*/

fun main(){
    println(square(596))
}
fun square(n: Int): Int{
    var tem = n
    var returnvalue =""
    while(tem != 0){
        var c = tem % 10
        returnvalue =  Integer.toString(c * c) + returnvalue 
        tem = tem / 10
      
    }
    return Integer.parseInt(returnvalue) ;
}
