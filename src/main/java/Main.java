import Factories.StrategyFactory;
import Strategy.DatatypeStrategy;
import java.io.IOException;
import Exception.*;
/**
 * Created by dmi on 02.07.17.
 */
public class Main {
    public static void main(String[] args) {
        DatatypeStrategy strategy;
        if (args.length < 4) {
            System.err.println("Error: application requires 4 arguments");
            return;
        }
        final String inputFilename = args[0];
        final String outputFilename = args[1];
        final String typeOfData = args[2];
        final String sortOrder = args[3];

        try {
            strategy = StrategyFactory.getStrategy(typeOfData, sortOrder, inputFilename, outputFilename);
            strategy.run();
        } catch (DatatypeStrategyFactoryException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Wrong file: not only integers presented " + e.getMessage());
        }
    }
}