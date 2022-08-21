import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class BalancedBracketsTest {
    @DisplayName("Test for input: {{}[()[()]]}")
    @Test
    fun balancedBracketsTest1() {
        val result = isBalanced("{{}[()[()]]}")
        assert(result == "YES")
    }

    @DisplayName("Test for input: ({[)})")
    @Test
    fun balancedBracketsTest2() {
        val result = isBalanced("({[)})")
        assert(result == "NO")
    }

    @DisplayName("Test for input: [({})+(1+2}]")
    @Test
    fun balancedBracketsTest3() {
        val result = isBalanced("[({})+(1+2}]")
        assert(result == "NO")
    }

    @DisplayName("Test for input: (2*3)+[5]-[55]]")
    @Test
    fun balancedBracketsTest4() {
        val result = isBalanced("(2*3)+[5]-[55]]")
        assert(result == "NO")
    }
}