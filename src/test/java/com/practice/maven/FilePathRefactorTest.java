package com.practice.maven;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FilePathRefactorTest {

    @Test
    void testFilePathRefactored() {
        // Sử dụng Paths.get giúp code tự thích nghi với OS
        Path path = Paths.get("target", "test-classes", "example.txt");
        
        System.out.println("OS Independent Path: " + path.toString());
        
        // Kiểm tra xem path có được khởi tạo thành công không
        assertNotNull(path);
    }
}