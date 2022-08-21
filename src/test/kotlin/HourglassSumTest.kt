import org.junit.jupiter.api.Test

class HourglassSumTest {
    @Test
    fun hourglassSumTest1() {
        val input = arrayOf(
            arrayOf(
                1, 1, 1, 0, 0, 0,
            ),
            arrayOf(
                0, 1, 0, 0, 0, 0
            ),
            arrayOf(
                1, 1, 1, 0, 0, 0
            ),
            arrayOf(
                0, 0, 2, 4, 4, 0

            ),
            arrayOf(
                0, 0, 0, 2, 0, 0
            ),
            arrayOf(
                0, 0, 1, 2, 4, 0
            ),
        )
        val result = hourglassSum(input)
        assert(result == 19)
    }

    @Test
    fun hourglassSumTest2() {
        val input = arrayOf(
            arrayOf(
                0, 6, -7, 1, 6, 3
            ),
            arrayOf(
                -8, 2, 8, 3, -2, 7
            ),
            arrayOf(
                -3, 3, -6, -3, 0, -6
            ),
            arrayOf(
                5, 0, 5, -1, -5, 2


            ),
            arrayOf(
                6, 2, 8, 1, 3, 0

            ),
            arrayOf(
                8, 5, 0, 4, -7, 4
            ),
        )
        val result = hourglassSum(input)
        assert(result == 25)
    }
}