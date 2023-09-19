
fun main(args: Array<String>)
{
    //задание1
    printFullName("Александр", "Паразихин")

    //задание2
    printFullName(firstName = "Александр", lastName = "Паразихин")

    //задание3
    val fullName = calculateFullName("Александр","Паразихин")

    //задание4
    println(calculateFullName2("Паразихин","Александр").second)

    //задание5
    val primeNumber = primeNumber( 29)
    println(primeNumber)

    //задание6
    val fib = fibonacci(9)
    println(fib)

}
//задание1
fun  printFullName(firstName: String, lastName: String)
{
    println("$firstName $lastName")
}


//задание3
fun calculateFullName(firstName: String,lastName: String) = firstName + lastName


   //задание4
fun calculateFullName2(firstName: String,lastName: String):Pair<String,Int>
{
   return Pair("$firstName $lastName", firstName.length + lastName.length)
}

//задание 5
fun primeNumber (number: Int) : Boolean
{
    for (i in 2 .. (number/2))
    {
        if (number % i == 0)
            return false
    }
    return true
}
//задание6
fun fibonacci(n: Int): Int
{
    if (n == 1 || n == 2) return 1
    else return fibonacci(n - 1) + fibonacci(n - 2)
}


