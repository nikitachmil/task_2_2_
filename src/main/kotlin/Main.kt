fun main() {

    val likes = 2211 //количество лайков
    val total = likes % 100



    if (total == 1) {

        print("Нравится $likes  человеку") //человеку
    } else if (total == 11) {

        print("Нравится $likes  людям") //людям
    } else {

        print("Нравится $likes  людям") //людям

    }
}
