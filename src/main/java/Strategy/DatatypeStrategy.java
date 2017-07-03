package Strategy;

import java.io.IOException;

/**
 * Created by dmi on 03.07.17.
 */
public abstract class DatatypeStrategy {
    protected Boolean orderIsAcs;
    protected String inputFilename;
    protected String outputFilename;

    public DatatypeStrategy(Boolean orderIsAsc, String inputFilename, String outputFilename) {
        this.orderIsAcs = orderIsAsc;
        this.inputFilename = inputFilename;
        this.outputFilename = outputFilename;
    }

    public void run() throws IOException {
        readFile(inputFilename);
        sort();
        writeFile(outputFilename);
    }

    protected abstract void readFile(String inputFilename) throws IOException, NumberFormatException;

    protected void sort() {
        if (orderIsAcs) {
            sortAsc();
        } else {
            sortDesc();
        }
    }

    protected abstract void writeFile(String outputFilename) throws IOException;
    protected abstract void sortAsc();
    protected abstract void sortDesc();
}
