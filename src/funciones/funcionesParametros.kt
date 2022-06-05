package funciones

fun main() {
   // sayMyName("jirman")
   // sayNameAndAge("jirman",41)
   println(sumtwoNumbers(10,5))

}
/*
// primera funcion pidiendo nombre
private fun sayMyName(name:String){
    println("hola mi nombre es $name")

}
// funcion con mas de un parametro
private fun sayNameAndAge(name:String,age:Int){
    println ("mi nombre es $name y mi edad es $age")

}*/
// funciones con valor de retorno
private  fun sumtwoNumbers(firsNumber:Int,secondNumber:Int):Int{
    var sum = firsNumber+secondNumber
    return sum

}