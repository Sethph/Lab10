/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab10;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sethp
 */
public class StackTest {
    
   
    @Test
    public void testEvaluate1() {
        Stack stack = new Stack("2 3 4 * -");
        assertEquals(-10, stack.evaluate());  
    }
    
    @Test
    public void testEvaluate2() {
        Stack stack = new Stack("2 16 4 / +");
        assertEquals(6, stack.evaluate());  
    }
    
    @Test
    public void testEvaluate3() {
        Stack stack = new Stack("2 2 + 8 7 * -");
        assertEquals(-52, stack.evaluate());  
    }
    
     @Test
    public void testEvaluate4() {
        Stack stack = new Stack("3 4 * 3 5 * + 3 /");
        assertEquals(9, stack.evaluate());  
    }
    
    public void testEvaluate5() {
        Stack stack = new Stack("3 5 4 + 4 2 - 4 + + -");
        assertEquals(-12, stack.evaluate());  
    }
    public void testEvaluate6() {
        Stack stack = new Stack("64 2 / 2 / 2 / 2 / 2 / 2 /");
        assertEquals(1, stack.evaluate());  
    }
    
    public void testEvaluate7() {
        Stack stack = new Stack("64 2 / 2 / 2 / 2 / 2 / 2 / 2 /");
        assertEquals(0, stack.evaluate());  
    }
    
    public void testEvaluate8() {
        Stack stack = new Stack("2 2 * 2 * 2 * 2 * 2 * 2 * 2 *");
        assertEquals(256, stack.evaluate());  
    }
    
    @Test
    public void testEvaluate9() {
        Stack stack = new Stack("3 4 * 2 -");
        assertEquals(10, stack.evaluate());  
    }
}
