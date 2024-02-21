package satorres.andre.termosolver

data class Word(private val w: String) {

    fun getLetter(i: Int) = w[i]

    fun contains(l: Char) = w.contains(l);

    fun indexOf(l: Char) = w.indexOf(l);

    fun frequencyOf(l: Char) = w.count { it == l }

    fun isRepeatedLetter(l: Char) = w.count { it == l } >= 2

    fun forEach(action: (Char) -> Unit) {
        w.forEach { action(it) }
    }
}