package com.businge.testsonarandjacoco

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MathServiceTest {

    @Test
    fun multiply_by_zero() {
        val mathService = MathService()
        val result = mathService.multiply(5, 0)
        assertEquals(0, result)
    }

    @Test
    fun multiply_two_negative_integers() {
        val mathService = MathService()
        val result = mathService.multiply(-3, -4)
        assertEquals(12, result)
    }

    @Test
    fun subtract_two_negative_integers(){
        val mathService = MathService()
        val result = mathService.subtract(-6, 9)
        assertEquals(-15,result)
    }
}