package satorres.andre.termosolver

class Solver {

    // read all possible words from file (TW)
    // create letter -> freq dictionary
    // find the best first guess
    // receive input of first guess (BLACK, YELLOW, GREEN)
    // create a list for all still possible words (SPW)
    // remove from SPW words with black letters, yellow letters in the same position and without green in the exact position
    // search in SPW the most frequent letters (excluding GREEN)
    // search in TW for a word with the letters found above
    // receive input of this guess
    // continue... until #SPW == 1 or last possible guess

    fun solve(guessLimit: Int) {
        val allWords = readWords()
        val stillPossibleWords = allWords.toList()

        do {
            val letterFrequency = stillPossibleWords.getLetterFrequencyDictionary()
            var guesses = 0
            val guess = findBestGuess(allWords, letterFrequency)
            val input = guessAndGetInput(guess).also { guesses++ }
            stillPossibleWords.removeByGivenInput(input)
        } while (stillPossibleWords.size > 1 || guesses < guessLimit)
    }
}