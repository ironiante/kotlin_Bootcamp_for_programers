package clases

fun main() {
var auto1:Auto= Auto() // creamos objetos de la clase auto
auto1.color="amarillo"
auto1.marca="ferrary"
auto1.modelo=2021.0
auto1.acelera()

}
class Auto {
// las variables = atributos
    var color:String = ""
    var modelo:Double=0.0
    var marca:String =""
// metodos = funciones
fun enciende (){
    println("run run")
}
fun acelera(){
    println("El auto acelero 10 km/h mas")
}
fun frena(){
    println("el auto freno a 10 km/h")
}


}




