package Calculator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\Calculator");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
        Path pathAbsolute = Paths.get("C:\\Users\\True._.Mary\\IdeaProjects\\JavaBasics\\src\\Calculator");
        Path pathBase = Paths.get("\\Calculator");
        Path pathRelative = pathBase.relativize(pathAbsolute);
        System.out.println(pathRelative);
    }
}
