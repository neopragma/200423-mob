package com.neopragma.mob200423

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class PrimeFactorsTest : DescribeSpec() {

    init {
        describe("Find the prime factors of an integer") {

// We have no production code yet. Our first test failure will be because
// we're referencing a function that doesn't exist. That's okay.
// We assume we will write a function with a name we think is descriptive
// of its purpose. Everything can change later, so we needn't overthink it.

            it("returns an empty list for the number 1") {
                primeFactorsOf(1) shouldBe listOf()
            }

            it("returns an list of '2' for the number 2") {
                primeFactorsOf(2) shouldBe listOf(2)
            }


        }
    }

    private fun primeFactorsOf(i: Int): List<Int> {
        return listOf();
    }
}
