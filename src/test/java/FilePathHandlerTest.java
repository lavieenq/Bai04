import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathHandler {
    public String getConfigFileRelativePath() {
        Path path = Paths.get("config", "application.properties");
        return path.toString();
    }

    public String getAbsoluteConfigPath() {
        Path path = Paths.get("config", "application.properties");
        return path.toAbsolutePath().toString();
    }
}