class DogException() : Exception()
class CatException() : Exception()

fun checkClient(client : String){
    when (client){
        "dog" -> throw DogException()
        "cat" -> throw CatException()
    }
}