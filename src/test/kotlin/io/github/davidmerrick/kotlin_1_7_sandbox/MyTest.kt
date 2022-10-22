package io.github.davidmerrick.kotlin_1_7_sandbox

import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class MyTest {

    @Test
    @OptIn(ExperimentalStdlibApi::class)
    fun `Open-ended range operator`() {
        (0..<3).toList().contains(3) shouldBe false
    }
}
