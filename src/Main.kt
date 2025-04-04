fun koko (da:String, Key:Int): String { //this function get a String and integer and shify each character of the string
    var result = ""  // empty string to save the result
    for (char in da) {   //going through each character of the string
        var coded = char //create variable to save the coded character
        if (char .isLetter()) { // checking if character is letter
            // shifting the character to key character after and making sure is not passing Z
            val shifted = (char - 'a' + Key) % 26 + 'a'.toInt()
            coded = shifted .toChar() //converting the code to the new character to char
        }
        result += coded // adding the new character to string result
    }
    return result //  returning the new string
}// this function checks if the both of the string used the same character
fun anagrams (w1:String, w2:String):Boolean {
     // returns true if the sorted array of character are the same in both word
    return w1.toCharArray().sorted()== w2.toCharArray().sorted()
}
//this function check if w2 is a substring of w1
fun world (w1:String, w2:String):Boolean { //
    var I = 0 //create a variable for index of w2
    for(char in w1) { //going through each character of w1
        if (char == w2[I]) { //checking if the character in w1 is the same as w2
            I ++  //adding 1 to the index of w2
            if (I == w2.length) {  // checking if we match all the character of w2
                return true
            }
        }
    }
    return false
}
// this function is return the longest word in string w
fun analyzes (w:String):String {
    var words = w.split(" ") // breaking the string w in to a list of word
    var result = ""
    for (word in words) { // going through each word of list word
        if (word.length>result.length) { // checking the length of word to find the longest one
            result = word // changing the result to the longer word
        }
    }
    return result
}
//calling ech function to test them
fun main () {
    println(koko("fufu",5))
    println(anagrams("study","dusty"))
    println(world("sunny", "moom"))
    println(analyzes("life is horrible"))
}