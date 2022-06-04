package section1.`6_readingInputFromCommandLine`

import kotlin.math.max
fun main(){
    println("enter two number")
    var (a,b)= readLine()!!.split("")
    fun maxNum(a: Int, b: Int): Int {
        var max = if (a > b) {
            println("The value of a is $a");
            a
        } else {
            println("The value of b is $b")
            b
        }
        return max;
    }
}

