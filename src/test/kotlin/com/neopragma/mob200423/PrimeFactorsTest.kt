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

            it("returns an list of '3' for the number 3") {
                primeFactorsOf(3) shouldBe listOf(3)
            }

            it("returns an list of '2,2' for the number 4") {
                primeFactorsOf(4) shouldBe listOf(2, 2)
            }

            it("returns an list of '2,3' for the number 6") {
                primeFactorsOf(6) shouldBe listOf(2, 3)
            }

            it("returns an list of '2,2,2' for the number 8") {
                primeFactorsOf(8) shouldBe listOf(2, 2, 2)
            }

            it("returns an list of '3, 3' for the number 9") {
                primeFactorsOf(9) shouldBe listOf(3, 3)
            }
        }
    }

    private fun primeFactorsOf(given: Int): List<Int> {
        val result = mutableListOf<Int>()
        var intermediate = given

        val primes = listOf(2, 3)
        for (candidate in primes) {
            while (intermediate % candidate == 0) {
                result += candidate
                intermediate /= candidate
            }
        }

        if (intermediate != 1) {
            result += intermediate
        }
        return result
    }
}
