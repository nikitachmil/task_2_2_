fun main() {

    val likes = 2 //количество лайков
    val total = likes % 10


    if (total == 1) {
        print("нравится ")
        print(likes)
        print(" человеку") //человеку
    } else {
        print("нравится ")
        print(likes)
        print(" людям") //людям

    }

}