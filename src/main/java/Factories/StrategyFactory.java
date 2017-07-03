package Factories;

import Strategy.*;
import Exception.*;

/**
 * Created by dmi on 03.07.17.
 */
public class StrategyFactory {
    public static DatatypeStrategy getStrategy (String dataType, String sortOrder, String inputFilename, String outputFilename) throws DatatypeStrategyFactoryException {
        Boolean orderIsAsc;
        if (sortOrder.equals("-a")) {
            orderIsAsc = true;
        } else  if (sortOrder.equals("-d")) {
            orderIsAsc = false;
        } else {
            throw new DatatypeStrategyFactoryException("Error: unknown sort order");
        }
        if (dataType.equals("-s")) {
            return new StringStrategy(orderIsAsc, inputFilename, outputFilename);
        } else if (dataType.equals("-i")) {
            return new IntegerStrategy(orderIsAsc, inputFilename, outputFilename);
        } else {
            throw new DatatypeStrategyFactoryException("Error: unknows datatype");
        }
    }
}
