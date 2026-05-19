class Calculator {
    var totalCalculations = 0
    var calcList: ArrayList<String> = arrayListOf()
    fun calculate(num1: Int, num2: Int, operator: String): Int {
        totalCalculations++
        var result = 0
        when (operator) {
            "+" -> {
                result = num1 + num2
            }
            "-" -> {
                result =  num1 - num2
            }
            "*" -> {
                result =  num1 * num2
            }
            "/" -> {
                result =  num1 / num2
            }
        }
        calcList.add("$num1 $operator $num2 = $result")
        return result
    }
}