import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FilePathHandlerTest {
    @Test
    void testConfigFilePathResolvesCorrectly() {
        FilePathHandler handler = new FilePathHandler();
        String absolutePath = handler.getAbsoluteConfigPath();

        String expectedSuffix = "config" + File.separator + "application.properties";

        assertTrue(absolutePath.endsWith(expectedSuffix),
                "Lỗi OS: Đường dẫn không đúng định dạng: " + absolutePath);
    }
}