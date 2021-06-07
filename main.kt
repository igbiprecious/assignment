
//    2) 10 Variabes of each of the different main Data types in Kotlin
fun main() {
    var num1: Int = 10000
    var num2: Double = 100.00
    var num3: Float = 100.00f
    var longNum: Long = 1000000004
    var shortNum: Short = 10
    var numB: Byte = 1
    var letter: Char = 'a'
    var isGood: Boolean = true
    var name: String = "Precious"
    var numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    sayHello1()
    printAge1()
    addition1()
    subtraction1()
    isRaining1()

    println(sayHello2())
    println(printAge2())
    println(addition2())
    println(subtraction2())
    println(isRaining2())

    println(sayHello3("Precious"))
    println(printAge3(54))
    println(addition3(5, 2))
    println(subtraction3(10, 7))
    println(isRaining3(true))

}
//    3)	5 Function with no return value

    fun sayHello1(){
        println("Hello User")
    }
    fun printAge1(){
        var age : String = "55"
        println("I am "+ age + "years old")
    }
    fun addition1(){
        var num1 : Int = 2
        var num2 : Int = 3
        var result : Int = num1 + num2
        println("The sum is" + result)
    }
    fun subtraction1(){
        var num1 : Int = 5
        var num2 : Int = 3
        var result : Int = num1 - num2
        println("The answer is" + result)
    }

    fun isRaining1(){
        var detectRain : Boolean = true
        print(detectRain)
    }

//    3)	5 Function with return value

    fun sayHello2(): String{
        return("Hello User")
    }
    fun printAge2(): String{
        var age : String = "55"
        return("I am "+ age + "years old")
    }
    fun addition2(): Int{
        var num1 : Int = 2
        var num2 : Int = 3
        var result : Int = num1 + num2
        return(result)
    }
    fun subtraction2(): Int{
        var num1 : Int = 5
        var num2 : Int = 3
        var result : Int = num1 - num2
        return(result)
    }

    fun isRaining2(): Boolean{
        var detectRain : Boolean = true
        return(detectRain)
    }

//    4) 5 Functions which receive arguments

    fun sayHello3( greeting: String){
        println(greeting)
    }
    fun printAge3(age: Int){
        println("I am "+ age + "years old")
    }
    fun addition3(num1: Int, num2: Int){
        var result : Int = num1 + num2
        println("The sum is" + result)
    }
    fun subtraction3(num1: Int, num2: Int){
        var result : Int = num1 - num2
        println("The answer is" + result)
    }

    fun isRaining3(detectRain : Boolean){
        println(detectRain)
    }
