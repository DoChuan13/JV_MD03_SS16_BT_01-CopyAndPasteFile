package app;

import java.util.List;

public class Main {
    private static String SOURCE_PATH = "./src/database/source.txt";
    private static String TARGET_PATH = "./src/database/target.txt";

    public static void main(String[] args) {
        List<String> reader = ReadAndWrite.readFile(SOURCE_PATH);
        System.out.println(reader.size());
        ReadAndWrite.writeFile(TARGET_PATH, false, reader);
    }
}
