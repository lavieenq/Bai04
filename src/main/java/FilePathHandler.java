import java.io.File;

public class FilePathHandler {
    public String getConfigFileRelativePath() {
        return "config\\application.properties";
    }

    public String getAbsoluteConfigPath() {
        File file = new File(getConfigFileRelativePath());
        return file.getAbsolutePath();
    }
}