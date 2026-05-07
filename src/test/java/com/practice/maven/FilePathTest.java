package com.practice.maven;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;

public class FilePathTest {
  @Test
  void testPath() {
    String path = "target\\data.txt";
    File file = new File(path);
    // Trên Linux, file.exists() sẽ trả về false vì đường dẫn chứa dấu \ không hợp
    // lệ
    assertTrue(file.exists(), "File phải tồn tại với đường dẫn này!");
  }
}