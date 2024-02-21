package satorres.andre.termosolver

import java.io.File

fun readWords(): List<Word> {
    val words = mutableListOf<Word>()
    File("src/main/resources/words.txt").useLines { lines -> lines.forEach { words.add(Word(it)) } }
    return words
}