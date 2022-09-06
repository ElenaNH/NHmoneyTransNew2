import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun transformBy100() {
        val m = 20_00uL
        val result = transformBy100(m)

        assertEquals("20,00", result)
    }
}