/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.hoangbaohuy.mathutil.core.test;

import com.hoangbaohuy.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Acer
 */
public class MathUtilityTest {
    // Test case #1 - Verify getFactorial(with n = 0)
    // Steps/ Procedures
    //      1. Given n = 0
    //      2. Call/ invoke getFactorail(n = 0)
    // Expected Result:
    //      The method must return 1 as the result of 0! = 1
    // Status: Passed/ failed chờ đến lúc runtime mới biết
    
    @Test
    public void verifyFactorialGivenRightArgument0ReturnsOK() {
        assertEquals(1, MathUtility.getFactorial(0));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument1ReturnsOK() {
        assertEquals(1, MathUtility.getFactorial(1));
    }
    
    @Test
    public void verifyFactorialGivenRightArgument5ReturnsOK() {
        assertEquals(120, MathUtility.getFactorial(5));
    }
}
