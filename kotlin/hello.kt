fun main() {
    println("Hello, World!")

    var name: String = "Spencer"
    print("Hello, $name!\n")

    println(add(100, 50))
    listPractice()
    println(divide())
}

fun add(x: Int, y: Int): Int{
    return x + y
}

fun divide() = 10 / 2

fun listPractice(){
    var randomThings = mutableListOf<Any>("Bananas", "Optimus Prime", "Chicken Nuggets", 15, 12.5, "Megatron")
    for (thing in randomThings){
        if (thing is String){
            println(thing)
        }
    }
}