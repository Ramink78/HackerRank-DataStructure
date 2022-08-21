/*
 * Complete the 'reverseArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun reverseArray(a: Array<Int>): Array<Int> {
    if (a.isEmpty()) return a
    val reversedArray = a.clone()
    val lastIndex = a.lastIndex
    for (i in lastIndex downTo 0) {
        reversedArray[lastIndex - i] = a[i]
    }
    return reversedArray
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}
