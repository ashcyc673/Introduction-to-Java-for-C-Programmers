import java.io.*;

public class FileProcessor {
    private String[] fileData = new String[50];
    private int lineCounter = 0;

    FileProcessor(String fileName) {
        try {
            File file = new File(fileName);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getAbsolutePath()));
            String buffer;
            while ((buffer = bufferedReader.readLine()) != null) {
                if (lineCounter == 50) {
                    break;
                } else {
                    fileData[lineCounter++] = buffer;
                }
            }
            bufferedReader.close();

        } catch (FileNotFoundException err) {
            err.printStackTrace();
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
    public String[] getFileData(){
        return fileData;
    }

    public int getLineCounter(){
        return lineCounter;
    }
}
