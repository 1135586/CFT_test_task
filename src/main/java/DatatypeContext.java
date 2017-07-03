/**
 * Created by dmi on 03.07.17.
 */
public class DatatypeContext {
    private DatatypeStrategy strategy;

    public void setDatatypeStrategy(DatatypeStrategy strategy) {
        this.strategy = strategy;
    }
    public void readFile(String inputFilename) {
        strategy.readFile(inputFilename);
    }
    public void sort(String sortOrder) {
        strategy.sort(sortOrder);
    }
    public void writeFile(String outputFilename) {
        strategy.writeFile(outputFilename);
    }

}
