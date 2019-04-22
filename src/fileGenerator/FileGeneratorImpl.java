package fileGenerator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import util.Util;

public class FileGeneratorImpl implements FileGenerator {

  @Override
  public List<String> createFileNames(Integer numberFiles) {
    List<String> fileNames = new ArrayList<>();
    for (int i = 1; i <= numberFiles; i++) {
      fileNames.add(i + ".txt");
    }
    return fileNames;
  }

  @Override
  public void createNewFile(String directoryName, String fileName, Integer weightFile, Integer maxNumberElementInLine, Integer maxValueNumber) throws IOException {
    String path = new File("").getAbsolutePath() + "/" + directoryName +"/" + fileName;
    File file = new File(path);
    PrintWriter out = new PrintWriter(file.getAbsolutePath());
    while (file.length()/(1024 *1024) < weightFile) {
      out.write(getNewLine(Util.getRandomNumber(1, maxNumberElementInLine), maxValueNumber) + "\n");
    }
    out.close();
  }

  @Override
  public String getNewLine(Integer maxNumberElementInLine, Integer maxValueNumber) {
    StringBuilder newString = new StringBuilder();
    for (int i = 0; i < maxNumberElementInLine; i++) {
      newString.append(Util.getRandomNumber(0, maxValueNumber)).append(",");
    }
    newString.deleteCharAt(newString.length() -1);
    return String.valueOf(newString);
  }
}
