import org.example.Sample
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class SampleTest {
    private val testSample: Sample = Sample()
    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }
}