package app;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String filePath) {
        File file = new File(filePath);
        List<String> listText = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listText.add(line);
            }
            bufferedReader.close();
        } catch (Exception errException) {
            System.err.println("File không tồn tại, hoặc bị lỗi");
        }
        return listText;
    }

    public static void writeFile(String filePath, boolean addContent, List<String> listText) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter writer = new FileWriter(file, addContent);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < listText.size(); i++) {
                bufferedWriter.write(listText.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception errException) {
            System.err.println("File không tồn tại, hoặc bị lỗi");
        }
    }
}
