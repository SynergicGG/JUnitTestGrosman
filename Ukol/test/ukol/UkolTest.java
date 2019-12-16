/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author 2016-e-grosman
 */
public class UkolTest {
    
    public UkolTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMin() {
    }

    @Test
    public void testMain() {
    }
    
 
    @Test
    public void testPositive() {
        int out = Ukol.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = Ukol.min(-1, -2);
        assertEquals(-2, out);
    }

    
}
