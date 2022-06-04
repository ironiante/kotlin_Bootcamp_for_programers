fun main(){
 // leccion 2
//datatypes()
//enteros()
 // leccion 3
 //sentenciaIf()
// sentenciaIfopearadoresLogico()
 //sentenciaElseIf()
 //whenCodigoSimplificado()
 //whenRangos()
 //ifWhen()
 //ifWhenIgualando()
 //arrays()
 //listas()
 //listasMutables()
 //maps()
 // loops()
 //loopWhile()
// nullSafety()
 //funcionesSimples()
 funcionesParametros()



}

private  fun datatypes(){
 val mystring:String="hola jirman" // primera variable - constante
 val mystring2:String="rodriguez"  // segunda variable - constante
 val mystring3:String=mystring + " " + mystring2        // concatenar strings
  println(mystring3)
 val mystring4:String="primera variable   $mystring"
    println(mystring4)
}
private fun enteros(){ // byte,short,int,long

}
// sentencia if
/***
 * operadores condionales
 * 1.> mayor que
 * 2.< menor que
 * 3.>= mayor o igual que
 * 4.<= menor o igual que
 * 5.== igualdad
 * 6.!=desigualdad
 * _______________________________________________________
 * operadores logicos , concatenar
 * && (Y)
 * || (o)
 * ! operador no
 */

private fun sentenciaIf(){
 val myNumber:Int=9
 if (myNumber <10){
  println("$myNumber es menor o igual que 10")
 } else {
  print("$myNumber es mayor que 10 ")
 }

}
private fun sentenciaIfopearadoresLogico(){
 val mynumber:Int= 53
 if ((mynumber <10 && mynumber>5) || mynumber == 53){
  println("$mynumber es menor o igual que 10 y mayor que 5 o es igual a 53 ")
   } else {
    println("$mynumber es mayor que 10 o menor o igual que 5 y no es igual a 5")
 }
}
private fun sentenciaElseIf(){ // nos vamos al medio del if else
 val mynumber:Int= 60
 if ((mynumber <10 && mynumber>5) || mynumber == 53){
  println("$mynumber es menor o igual que 10 y mayor que 5 o es igual a 53 ")
 } else if (mynumber==60){  // sentencia else if
 println("$mynumber es igual a 60")
 }

 else {
  println("$mynumber es mayor que 10 o menor o igual que 5 y no es igual a 5")
 }



  }
private fun sentenciaWhen(){
 /***
  * when define una expresión condicional con múltiples ramas.
 Es similar a la instrucción switch en lenguajes tipo C. Su forma simple se ve así.
  */
 // vamos a comparar idioma de varios paises
 val country:String="españa"
 when (country) {
  "españa" -> {
   println("el idioma es español")
  }
  "mexico" -> {
   println("el idioma es español")
  }
  "peru" -> {
   println("el idioma es español")
  }
  "colombia" -> {
   println("el idioma es español")
  }
  "eeuu" -> {
   println("el idioma es ingles")
  }
  "francia" -> {
   println("el idioma es frances")
  }
  else -> {
   println("no conocemos el idioma")
  }
 }
}
private fun whenCodigoSimplificado(){
 val country:String="españa"
 when (country) {
  "españa","mexico","peru","colombia","argentina" -> {
   println("el idioma es español")
}  "eeuu" -> {
  println("el idioma es ingles")
 }
  "francia" -> {
   println("el idioma es frances")
  }
  else -> {
   println("no conocemos el idioma")
  }
 }

 }
private fun whenRangos(){
 println("ingrese su edad")
 val edad:Int= readLine()!!.toInt()
 when (edad){
  in 0..2 ->{
   println("eres un bebe")
  }in 3..10 ->{
   println("eres un niño")
  }in 11..17->{
   println("eres un adolescente")
  }in 18..69 ->{
   print("eres adulto")
  }in 70..99 ->{
   print("eres anciano")
  }else ->{
   print("eres inmortal!!!!")
  }
 }
}
private fun ifWhen(){
 val time:Int=12
 if (time in 0..11){
  println("good morning!!")
 }else if (time ==12){
  println("time for lunch!!")
 }else {
  println("good day")
 }
}
private fun ifWhenIgualando() {
 val time: Int = 12
 val greeting: String = if (time in 0..11) {
  "goog morning"
 } else if (time == 12) {
  "time for lunch"
 } else {
  "good day!!"
 }
 println(greeting)
}
private fun arrays(){
 /***
  * con set cambiamos la posicion
  * tamaño del array es con size
  */
 val diasSemana= arrayOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
// println(diasSemana[2])                         // acceder a la posicion
// diasSemana.set(2,"miernes")                    //cambiar el valor en esa posicion
// println(diasSemana[2])
 //ulilizamos un forEach para recorrer el array
// diasSemana.forEach {
//  println("ejemplo") // va a repetir "ejemplo la cantidad de veces que tengamos posiciones
 //}
 //diasSemana.forEach {
 // println(it)  // itera todo el array
 //}
 /*diasSemana.forEach {
  println(it)
  if (it=="jueves"){
   println("por fin es jueves")
  }
 }*/

/*
 println(diasSemana.get(0)) // accedemos por medio del get
 println(diasSemana.get(1))
 println(diasSemana.get(2))
 println(diasSemana.get(3))
 println(diasSemana.get(4))
 println(diasSemana.get(5))
 println(diasSemana.get(6))
 if (diasSemana.size>=8){
  println(diasSemana.get(7))
 }else{
  println("no tiene mas parametros")
 }
*/

}
private fun listas(){
 /***
  * Las colecciones se pueden clasificar en dos grandes grupos, las mutables
  * e inmutables. Es decir, las que se pueden editar (mutables) y las que son
  * solo de lectura (inmutable).

val readOnly:List<String> = listOf("lunes","martes","miercoles","jueves","viernes","sabado","domingo")
 println(readOnly.size) // muestra el tamaño de la lista
 println(readOnly.get(3)) // devuelve el valor de la posicion 3
 println(readOnly.first()) // devuelve el primer valor
 println(readOnly.last())  // devuelve el ultimo valor
 println(readOnly) // imprime todas las posiciones
 val a = readOnly.filter { it == "lunes" || it == "juernes"}
*/
/*
}
private fun listasMutables(){
 var diasSemana:MutableList<String> = mutableListOf("lunes","martes","miercoles","jueves","viernes","sabado")
//println(mutableList)
 diasSemana.add("domingo") // agregar un nuevo dato
 println(diasSemana)
 diasSemana.add(2,"jirman") // agregar un nuevo dato pero en alguna posicion
 println(diasSemana)
 diasSemana.forEach {
  println(it)               // iterar , tambien se puede con filter
  if (it == "jirman"){
   println("lo vas a lograr")
  }

 }
 */

}
private fun maps(){   // diccionarios, necesitan un clave y un valor, no son ordenados
 // sintaxis
/* var myMap:Map<String,Int> = mapOf()
 println(myMap)
 // añadir elementos
 myMap= mapOf("jirman" to 1, "yakov" to 2,"sofia"  to 3)
 print*/
 //_____________________________________________________________________________________________
 // para agregar o añadir un solo valor se tiene que escribir que sea de tipo mutable
/* var myMap:Map<String,Int> = mapOf()
 println(myMap)
 // añadir elementos
 myMap= mutableMapOf("jirman" to 1, "yakov" to 2,"sofia"  to 3)
 println(myMap)
 myMap["yulieth"]=7 // primer forma
 myMap.put("maria",8) // segunda forma
 println(myMap)
 // acceso a datos
 println(myMap["jirman"])
 // eliminar datos

 myMap.remove("jirman")
 println(myMap) */

 //_______________________________________________________________________________________________
 }
// aqui vamos a hablar de loops, tambien llamados bucles, sirven  para recorrer estructuras que almacena datos,
// como arrays y mapas.
private fun loops (){
// bucle for nos sirve para repetir una accion, pero tambie nos sirve para recorrer el contenido de estructuras
// de datos como son nuestro array o nuestro mapa.

// val myArray:List<String> = listOf("hola","Bienvenido al tutorial","suscribete")
// los diccionarios
 val myMap:MutableMap<String,Int> = mutableMapOf("jirman" to 1,"yulieth" to 2 , "sofia" to 3,"martin" to 4)
// vamos acceder a las dos estructuras
 // for , primero vamos a definir cual es el nombre que va a tomar cada uno de los elementos de por ejemplo
 // nuestro array, el nombre es myString que va a designar a cada uno de los elementos a continuacion.
 //for (myString in myArray){
 // println(myString)
 //____________________________________________________________________________________________________________________
  // recorriendo el dicionario.
  //  se crea un string e interpolamos ( aceeder desde un string a diferentes variantes y constantes de nuestro  codigo
  //for (myElement in myMap){
   //println("${myElement.key}-${myElement.value}")
 //____________________________________________________________________________________________________________________
 // recorrer rangos con for
 //for (x in 0..20){
 // println(x)
 //____________________________________________________________________________________________________________________
  //  ( until) - recorrido entre 0 y 10 pero sin tener en cuenta el ultimo numero.
 // for (x in 0 until 10)
 //  println(x)
 //____________________________________________________________________________________________________________________
 // utlizamos step para dar salto , vamos a recorrer de 2 en 2.
 //for (x in 0..10 step 2){
 // println(x)
 //______________________________________________________________________________________________________________________
 //for (x in 10 downTo 0 step 3){ // desde 10 hasta 0 de 3 en 3.
 // println(x)

 //}//________________________________________________________________________________________________________________
 // crear array con rangos numericos.
 //val myNumeriArray=(0..20)
 //for (myNum in myNumeriArray){
 // println(myNum)

 }
 //}//____________________________________________________________________________________________________________________
/*
*  ( while = mientras) -nos sirve para repetir una misma accion mientras la condion que vamos a validar sea verdadera.
* */
//private fun loopWhile (){
// var x=0
 //while (x<10){
 // println(x)
 // x +=2   // incrementa de 2 en 2


//_______________________________________________________________________________________________________________
/*
/***
 * null safety: el programa va a detectar como nulo y va a desencadenar un error que va a hacer que se detenga
 * inesperadamente, variables que pueden llegar a ser nulas.
 *
 */
private fun nullSafety(){
 var myString = "jirman"
  //myString = null esto da un error de compilacion.
 println(myString)
 // variable null safety
 var mySafetyString:String? = "jirman null safety"   // toca declararle el tipo de variable, acompañado de un signo de interrogacion
 mySafetyString = null
 println(mySafetyString)
 mySafetyString = "jirman alexander"
 //if (mySafetyString != null){
  //println(mySafetyString!!)

 //}_________________________________________________________________________________________________________________
 // safe call --> llamadas que son seguras. (length ->cantidad de caracteres.
 println(mySafetyString?.length) // el interrogante dice que si es nula no ejecuta la operacion.
//___________________________________________________________________________________________________

/*
 }
*/
private  fun funcionesSimples (){
 /***
  * las funciones son fragmentos  de codigo independientes que realizan una tarea especifica.
  * reutilizacion de codigo
  *
   */
// funciones simples

  println("hola")
 }
//________________________________________________________________________________________________________________

*/
// funciones con parametro de entrada
private  fun funcionesParametros(){


}








