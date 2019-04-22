package fileGenerator;

import java.io.IOException;
import java.util.List;

/**
 * generation of files with numbers according to the specified parameters
 */
public interface FileGenerator {

  /**
   * @param numberFiles - number of files
   * @return list of file names in the format "1.txt", "2.txt", ... , "param.txt"
   */
  List<String> createFileNames(Integer numberFiles);

  /**
   * @param directoryName - directory in project, where to write files
   * @param weightFile - maximum file size (megabyte)
   */
  void createNewFile(String directoryName, String fileName, Integer weightFile, Integer maxNumberElementInLine, Integer maxValueNumber) throws IOException;

  /**
   * @return a string of length in the range [1..maxNumberElementInLine] and element-numbers in the range [0..maxValueNumber]
   */
  String getNewLine(Integer maxNumberElementInLine, Integer maxValueNumber);
}
