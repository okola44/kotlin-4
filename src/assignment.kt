import java.util.*

fun main() {

var b=things("banana","gigiri","Tanzania","Grace")
    println(Arrays.toString(b))
    place()

    numbers()
    println()
    var c=names("Happy","Ayoma","Aggrey")
    println(Arrays.toString(c))
}
fun things(fruits:String,place:String,country:String,name:String):Array<String>{
    var x = arrayOf(fruits, place, country, name)
    return x
}
fun place(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities[0].capitalize()+","+cities[1].capitalize()+","+cities[2].capitalize()+","+cities[3])
}
fun numbers(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var add=(numbers[1])+(numbers[4])
    println(add)
    var numIndex=numbers.indexOf(158)
    println(numIndex)
    numbers=numbers.sortedArray()
    for (number in numbers){
        println(number)
    }

}
fun names(name1:String,name2:String,name3:String):Array<String>{
    var b=arrayOf(name1,name2,name3)
    return b
}