/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukol;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2016-e-grosman
 */
public class MyHistory {
    private Path filePath;
    private List<String> h;
    
    public MyHistory(String fileName) {
        filePath = Paths.get(fileName);
    }

    public void read() throws IOException {
        h=Files.readAllLines(filePath);
        
    }

    public void save() throws IOException {
        Files.write(filePath, h);
    }

    public void addLine(String str) {
        if (h == null) {
            h = new ArrayList<>();        
        h.add(str);
    }
}
    public String toString() {
        return String.join("\n", h);        
    }
}