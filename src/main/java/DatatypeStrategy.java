/**
 * Created by dmi on 03.07.17.
 */
public interface DatatypeStrategy {
    public void readFile(String inputFilename);
    public void sort(String sortOrder);
    public void writeFile(String outputFilename);
}
