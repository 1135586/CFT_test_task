package Strategy;

import Strategy.DatatypeStrategy;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by dmi on 03.07.17.
 */
public class StringStrategy extends DatatypeStrategy {
    private ArrayList<String> data = new ArrayList<String>();

    public StringStrategy(Boolean orderIsAsc, String inputFilename, String outputFilename) {
        super(orderIsAsc, inputFilename, outputFilename);
    }

    public void readFile(String inputFilename) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFilename), "UTF-8"));
        while ((line = reader.readLine()) != null) {
            data.add(line);
        }
    }

    public void writeFile(String outputFilename) throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFilename), "UTF-8"));
        for (int i = 0; i < data.size(); i++) {
            writer.write(data.get(i).toString());
            writer.newLine();
        }
        writer.flush();
    }

    protected void sortAsc() {
        for (int i = 1; i < data.size(); i++) {
            String key = data.get(i);
            int j = i - 1;
            while (j > -1 && (data.get(j).compareTo(key) > 0)) {
                data.set(j + 1, data.get(j));
                j--;
            }
            data.set(j + 1, key);
        }
    }

    protected void sortDesc() {
        for (int j = 1; j < data.size(); j++) {
            String key = data.get(j);
            int i = j - 1;
            while (i > -1 && ((data.get(i)).compareTo(key) < 0)) {
                data.set(i + 1, data.get(i));
                i--;
            }
            data.set(i + 1, key);
        }
    }
}
