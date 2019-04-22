import fileGenerator.FileGenerator;
import fileGenerator.FileGeneratorImpl;
import java.util.List;
import thread.DocumentCreation;

public class Main {

  public static void main(String[] args) {
    Integer numberFiles = 20;
    String directoryName = "files";
    Integer weightFile = 100;
    Integer maxNumberElementInLine = 100;
    Integer maxValueNumber = 100;

    FileGenerator fileGenerator = new FileGeneratorImpl();
    List<String> fileNames = fileGenerator.createFileNames(numberFiles);
    for (String fileName: fileNames) {
      DocumentCreation documentCreation = new DocumentCreation(directoryName, fileName, weightFile, maxNumberElementInLine, maxValueNumber);
      documentCreation.start();
    }
  }
}
