import kotlin.math.max

/*
 * Complete the 'hourglassSum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */
fun hourglassSum(arr: Array<Array<Int>>): Int {
    val rows = arr.lastIndex
    val cols = arr[0].lastIndex
    var maxSum = Int.MIN_VALUE
    for (x in 0..rows - 2) {
        for (y in 0..cols - 2) {
            val hourglass = arrayOf(
                arr[x][y],
                arr[x][y + 1],
                arr[x][y + 2],
                arr[x + 1][y + 1],
                arr[x + 2][y],
                arr[x + 2][y + 1],
                arr[x + 2][y + 2]
            )
            maxSum = max(maxSum, hourglass.sum())
        }
    }
    return maxSum

}

fun main(args: Array<String>) {

    val arr = Array<Array<Int>>(6) { Array<Int>(6) { 0 } }

    for (i in 0 until 6) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
