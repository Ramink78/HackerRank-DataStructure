import java.util.*

/*
 * Complete the 'isBalanced' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun isBalanced(s: String): String {
    val bracketsStack = Stack<Char>()
    val no = "NO"
    val yes = "YES"
    s.forEach { bracket ->
        if (bracket.isClosedBracket()) {
            if (bracketsStack.isEmpty()) return no
            if (!(bracket match bracketsStack.pop())) {
                return no
            }
        } else {
            bracketsStack.push(bracket)
        }
    }
    return if (bracketsStack.isEmpty()) yes else no
}

infix fun Char.match(char: Char): Boolean {
    return when (char) {
        '{' -> this == '}'
        '(' -> this == ')'
        '[' -> this == ']'
        else -> false
    }
}

fun Char.isClosedBracket() =
    when (this) {
        '}', ')', ']' -> true
        else -> false
    }

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val s = readLine()!!

        val result = isBalanced(s)

        println(result)
    }
}
