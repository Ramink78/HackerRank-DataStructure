import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReverseArrayTest {
    @Test
    fun reverseArrayTest() {
        val arrayToReverse = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = reverseArray(arrayToReverse)
        val expected = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1).joinToString()
        assertEquals(expected, result.joinToString())
    }

    @Test
    fun reverseEmptyArray() {
        val arrayToReverse = emptyArray<Int>()
        val result = reverseArray(arrayToReverse)
        val expected = emptyArray<Int>().joinToString()
        assertEquals(expected, result.joinToString())
    }
}