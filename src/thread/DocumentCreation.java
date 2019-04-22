package thread;

import fileGenerator.FileGenerator;
import fileGenerator.FileGeneratorImpl;
import java.io.IOException;

public class DocumentCreation extends Thread {

  private String documentName;
  private String directoryName;
  private Integer weightFile;
  private Integer maxNumberElementInLine;
  private Integer maxValueNumber;

  public DocumentCreation(String directoryName, String documentName, Integer weightFile, Integer maxNumberElementInLine, Integer maxValueNumber) {
    this.directoryName = directoryName;
    this.documentName = documentName;
    this.weightFile = weightFile;
    this.maxNumberElementInLine = maxNumberElementInLine;
    this.maxValueNumber = maxValueNumber;
  }

  @Override
  public void run() {
    FileGenerator fileGenerator = new FileGeneratorImpl();
    try {
      fileGenerator.createNewFile(directoryName, documentName, weightFile, maxNumberElementInLine, maxValueNumber);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
