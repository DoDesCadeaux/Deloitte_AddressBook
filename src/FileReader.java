import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Path;

public class FileReader {
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}

class FileReaderTest {

    @Test
    void testReadFile() throws IOException {
        Path path = Files.createTempFile("test", ".txt");
        Files.write(path, List.of("John Doe, Male, 01/01/1980"));
        List<String> lines = FileReader.readFile(path.toString());
        assertFalse(lines.isEmpty());
        assertEquals("John Doe, Male, 01/01/1980", lines.get(0));
    }
}

