fun main() {
var mary = Human("mary",22,54)
    mary.eat(3)
    mary.speak("How are you?")
    mary.birthday(22)



var details = Details("Leah","Muthoni","muthonileah@gmail.com","734218765","srwqcz122")
    println(details.lastName)
    println(details.password)

}
//Q1.
class Human(var name: String,var age: Int,var weight: Int){
fun eat(foodWeight:Int){
    println("I am eating food ${foodWeight} kg of food")
            weight += foodWeight
    println(weight)
}
    fun speak(speech: String){
        println(speech)
    }
    fun birthday(date: Int){
        age += 1
        println(age)

    }
}







data class Details(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)