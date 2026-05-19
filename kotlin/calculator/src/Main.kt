import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val calc = Calculator()

    println("Welcome to the Kotlin Calculator!")

    var running = true
    while (running) {
        println("\nSelect an option: ")
        println("1. New Calculation")
        println("2. Calculation History")
        println("3. Exit")
        print("Choice: ")
        val input = scanner.nextLine().trim()

        if (input == "1") {
            println("Enter a number: ")
            val num1 = scanner.nextLine().toIntOrNull()

            println("Enter an operator ('+', '-', '*', '/'): ")
            val operator = scanner.nextLine().trim()

            println("Enter another number: ")
            val num2 = scanner.nextLine().toIntOrNull()

            if (num1 == null || num2 == null) {
                println("Error: Please enter a valid whole number.")
                continue
            }
            if (operator == "/" && num2 == 0){
                println("Error: cannot divide by zero.")
                continue
            }
            val result = calc.calculate(num1, num2, operator)
            println("Result: $num1 $operator $num2 = $result")
        }
        else if (input == "2") {
            println("\n --- History Log ---")
            println("Total Calculations: ${calc.totalCalculations}")

            if (calc.calcList.isEmpty()){
                println("No calculations made yet.")
            }
            else{
                for (record in calc.calcList){
                    println(record)
                }
            }
        }
        else if (input == "3") {
            running = false
            println("Goodbye!")
        }
        else{
            println("Invalid input. Please choose '1' or '2' or '3'")
        }
    }
}