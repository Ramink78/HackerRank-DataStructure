import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SparseArrayTest {
    @Test
    fun sparseArrayTest1() {
        val strings = arrayOf(
            "aba",
            "baba",
            "aba",
            "xzxb"
        )
        val queries = arrayOf(
            "aba",
            "xzxb",
            "ab",
        )
        val result = matchingStrings(strings, queries)
        val expected = arrayOf(2, 1, 0)
        assertEquals(expected.joinToString(), result.joinToString())
    }

    @Test
    fun sparseArrayTest2() {
        val strings = arrayOf(
            "def",
            "de",
            "fgh",
        )
        val queries = arrayOf(
            "de",
            "lmn",
            "fgh",
        )
        val result = matchingStrings(strings, queries)
        val expected = arrayOf(1, 0, 1)
        assertEquals(expected.joinToString(), result.joinToString())
    }

    @Test
    fun sparseArrayTest3() {
        val strings = arrayOf(
            "abcde",
            "sdaklfj",
            "asdjf",
            "na",
            "basdn",
            "sdaklfj",
            "asdjf",
            "na",
            "asdjf",
            "na",
            "basdn",
            "sdaklfj",
            "asdjf",
        )
        val queries = arrayOf(
            "abcde",
            "sdaklfj",
            "asdjf",
            "na",
            "basdn"
        )
        val result = matchingStrings(strings, queries)
        val expected = arrayOf(1, 3, 4, 3, 2)
        assertEquals(expected.joinToString(), result.joinToString())
    }
}