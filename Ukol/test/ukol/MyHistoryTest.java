/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2016-e-grosman
 */
/*
public class MyHistoryTest {
    
    public MyHistoryTest() {
    }
    
     @Test
    public void initTest() {
        MyHistory h = new MyHistory("z:test.txt");
        assertEquals("ahoj\nnazdar", h.toString());
    }
    
    @Test
    public void readTest() throws IOException {
        //init
        Path p = Files.createTempFile(null, null);
        ArrayList<String> arr = new ArrayList();
        arr.add("ahoj");
        arr.add("nazdar");
        Files.write(p, arr);
        
        //test
        MyHistory h = new MyHistory(p.toString());
        h.read();
        
        assertEquals("ahoj\nnazdar", h.toString());
    }
 */
public class MyHistoryTest {

    private MyHistory h;

    @Before
    public void prepare() throws IOException {
        Path p = Files.createTempFile(null, null);
        h = new MyHistory(p.toString());
    }

    @Test
    public void write0() {
        try {
            h.addLine("");
            h.save();
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void write1() {
        try {
            h.addLine("ahoj");
            h.save();
        } catch (IOException e) {
            fail();
        }
    }

    @Test
    public void write2() {
        try {
            h.addLine("ahoj");
            h.addLine("ahoj");
            h.addLine("ahoj");
            h.save();
        } catch (IOException e) {
            fail();
        }
    }

    @After
    public void cleanUp() throws IOException {
        boolean p = Files.deleteIfExists(null);
    }

}
