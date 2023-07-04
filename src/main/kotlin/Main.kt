//classes are templates for objects and objects are instances of classes.

fun main(){
var tesla = Car("tesla", "Y", "KDR 206Y", 20)
    println(tesla.model)
    tesla.start()
    println(tesla.speed)
    tesla.accelerate(acceleration = 50)
    println(tesla.speed)
    tesla.accelerate(acceleration = 40 )
    println(tesla.speed)
    tesla.deccelerate(decceleration = 50)
    println(tesla.speed)
    tesla.hoot()
    tesla.stop()
    println(tesla.speed)
}

class Car(var make:String, var model:String, var registration:String, var speed:Int){
    fun start(){
        println("Vroooooom Vrooooom")
    }
    fun accelerate(acceleration:Int){
        speed += acceleration
    }
    fun deccelerate(decceleration:Int){
        speed -= decceleration
    }
    fun hoot(){
        println("piiiiiiiip piiiiiiiip")
    }
    fun stop(){
        speed = 0
    }
}