   //задание1
fun  printFullName(firstName: String, lastName: String)
{
    println("$firstName $lastName")
}


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

}
    //задание3
fun calculateFullName(firstName: String,lastName: String) = firstName + lastName


   //задание4
   fun calculateFullName2(firstName: String,lastName: String):Pair<String,Int> {
       return Pair("$firstName $lastName", firstName.length + lastName.length)
   }




