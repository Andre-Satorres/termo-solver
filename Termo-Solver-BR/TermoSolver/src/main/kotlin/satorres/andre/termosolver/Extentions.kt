package satorres.andre.termosolver

fun List<Word>.getLetterFrequencyDictionary() = mutableMapOf<Char, Int>().also { dict ->
    this.forEach { word ->
        word.forEach { char ->
            dict[char] = dict.getOrDefault(char, 0) + 1
        }
    }
}

fun List<Word>.getNUplicatedLetterFrequencyDictionary() = mutableMapOf<Char, Int>().also { dict ->
    this.forEach { word ->
        word.forEach { char ->

            dict[char] = dict.getOrDefault(char, 0) + 1
        }
    }
}


fun Word.lettersFrequencySum(map: MutableMap<Char, Int>) {
    var sum = 0
    this.forEach {
        if (this.isRepeatedLetter(it)) {

        }
        sum += map.getOrDefault(it, 0)
    }
}

fun List<Word>.sortByLetterFrequencyDictionary() {
    val dict = this.getLetterFrequencyDictionary()
    this.sortedBy {  }
}

fun List<Word>.getUsingLetterFrequencyDictionary(map: MutableMap<Char, Int>) {
    this.filter {
        it.contains()
    }
}