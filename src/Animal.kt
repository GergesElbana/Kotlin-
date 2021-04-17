

open class Animal() {
    var Name:String?=null
     var Color:String?=null
     var age:Float?=null

    constructor(Name:String, Color: String?, age:Float):this(){
        this.Name=Name
        this.Color=Color
        this.age=age

    }



   open fun eat(){

    }
     fun addAnimal() {
         println("add animal name")
         var name= readLine()!!.toString()
         println("add animal color")
         var color= readLine()!!.toString()
         println("add animal age")
         var age= readLine()!!.toFloat()
         var animal=Animal(name,color,age)
       println("${animal.Name}  ${animal.Color}  ${animal.age}")
     }

}