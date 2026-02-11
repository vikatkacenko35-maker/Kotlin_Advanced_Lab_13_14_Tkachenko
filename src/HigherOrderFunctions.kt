import java.nio.channels.SelectionKey

fun main(){
    val action1 = selectAction(1)
    println(action1(8,5))
    val action2 = selectAction(2)
    println(action1(8,5))

    displayMessage(::morning)
    displayMessage(::evening)
}

fun action(n1: Int, n2: Int, op:(Int,Int) -> Int) {
    val result = op(n1,n2)
    println(result)
}
fun selectAction(key: Int):(Int,Int)->Int{
    return when(key){
        1 -> ::sum
        2 -> ::substract
        3 -> ::mupliply
        else -> ::empty
    }
}
fun empty(a:Int, b:Int):Int{
    return 0
}
fun sum(a:Int, b:Int): Int{
    return a + b
}
fun substract(a:Int, b:Int): Int{
    return a - b
}
fun mupliply(a:Int, b:Int): Int{
    return a * b
}

fun displayMessage(mes:()->Unit) {
    mes()
}
fun morning(){
    println("Good Morning")
}
fun evening(){
    println("Good evening")
}
