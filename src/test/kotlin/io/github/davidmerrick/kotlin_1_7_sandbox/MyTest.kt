package io.github.davidmerrick.kotlin_1_7_sandbox

import org.junit.jupiter.api.Test

class MyTest {

    @Test
    fun `Open-ended range operator`() {
        (0..<3).forEach {
            println(it)
        }
    }
}
