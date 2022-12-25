fun main() {
    //Inisialisasi pilihan
    val pilihan = arrayOf("gunting", "batu", "kertas")

      //Membuat pilihan random untuk komputer
    var bot = pilihan.random()

    //Header program
    println("=====================")
    println("GAME SUIT TERMINAL VERSION")
    println("=====================")

//    Menangkap pilihan player
    println("Masukan Pilihan anda Antara (Gunting,Batu, Kertas) ")
    print("Input : ")

    var player = readLine()
    var status = false

//    Menentukan peraturan
    if (player!!.toLowerCase().equals(bot.toLowerCase())) {
        println("Draw")
        println(" $bot dengan $player")
    }
    else if (player.toLowerCase().equals("batu")) {
        if(bot.toLowerCase().equals("gunting")){
            status = true
            hasil(status,player,bot)
        }else{
            status = false
            hasil(status,player,bot)
        }
    }
    else if (player.toLowerCase().equals("gunting")) {
        if (bot.toLowerCase().equals("kertas")) {
            status = true
            hasil(status,player,bot)
        } else {
            status = false
            hasil(status,player,bot)
        }
    }
    else if (player.toLowerCase().equals("kertas")) {
        if (bot.toLowerCase().equals("batu")) {
            status = true
            hasil(status,player,bot)
        } else {
            status = false
            hasil(status,player,bot)
        }
    }
}

fun hasil(status: Boolean, p1: String, p2: String) {
    if (status) {
        println("=====================")
        println("GAME SUIT TERMINAL VERSION")
        println("=====================")
        println("Pemain 2 Menang !")
        println("$p1 mengalahkan $p2")
    } else {
        println("=====================")
        println("GAME SUIT TERMINAL VERSION")
        println("=====================")
        println("Pemain 1 Menang!")
        println("$p2 mengalahkan $p1")

    }
}
