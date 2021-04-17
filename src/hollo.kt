

fun main() {
    var animalObject=Animal()
    menuOptions()
    var chose= readLine()!!.toInt()
    when(chose)
    {
        1 -> showSavedAnimal()
        2-> animalObject.addAnimal()
        else->{
            println("Finished")

        }



    }




}
fun menuOptions(){
    println("_______Chose_________")
    println("1-Show Animal")
    println("2-Add new Animal")
    println("3-Exit")
}
fun showSavedAnimal(){
    var cat=Animal("cat","red",2.5f)
    var dog=Animal("dog","black",3.2f)
    var tiger=Tiger("tiger","yellow",44.2f)
    println(" Animal name : ${cat.Name} \n Animal Color : ${cat.Color}" +
            " \n" +
            " Animal Age :${cat.age}")
    println(" 1" +
            "Animal name : ${tiger.Name} \n Animal Color : ${tiger.Color}" +
            " \n" +
            " Animal Age : ${tiger.age}")
             tiger.eat()

}