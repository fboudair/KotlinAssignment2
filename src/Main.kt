fun koko (da:String, Key:Int): String {
    var result = ""
    for (char in da) {
        var coded = char
        if (char .isLetter()) {
            val shifted = (char - 'a' + Key) % 26 + 'a'.toInt()
            coded = shifted .toChar()
        }
        result += coded
    }
    return result
}
fun anagrams (w1:String, w2:String):Boolean {
    return w1.toCharArray().sorted()== w2.toCharArray().sorted()
}
fun world (w1:String, w2:String):Boolean {
    var I = 0
    for(char in w1) {
        if (char == w2[I]) {
            I ++
            if (I == w2.length) {
                return true
            }
        }
    }
    return false
}
fun analyzes (w:String):String {
    var words = w.split(" ")
    var result = ""
    for (word in words) {
        if (word.length>result.length) {
            result = word
        }
    }
    return result
}
fun main () {
    println(koko("fufu",5))
    println(anagrams("study","dusty"))
    println(world("sunny", "moom"))
    println(analyzes("life is horrible"))
}