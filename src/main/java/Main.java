/**
 * Created by dmi on 02.07.17.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.err.println("Error: must ");
            return;
        }
        final String inputFilename = args[0];
        final String outputFilename = args[1];
        final String typeOfData = args[2];
        final String sortOrder = args[3];


        DatatypeContext ctx = new DatatypeContext();
        if (typeOfData.equals("-i")) {
            ctx.setDatatypeStrategy(new IntegerStrategy());
        } else if (typeOfData.equals("-s")) {
            ctx.setDatatypeStrategy(new StringStrategy());
        } else {
            System.out.println("Error: wrong order");
        }
        ctx.readFile(inputFilename);
        ctx.sort(sortOrder);
        ctx.writeFile(outputFilename);
    }
}