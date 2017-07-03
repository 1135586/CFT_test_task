import DataContext;
// other imports here ...

class Main{
	static final String stringData = "-s";
	static final String integerData = "-i";
	DataContext ctx = new DataContext();
	public static void main(String[] args){
		final String inputFilename, outputFilename, datatype, sortOrder;
		if (args.length < 4){
			throw new ArgumentException("Error: missing operands");
		}
		inputFilename = args[0];
		outputFilename = args[1];
		datatype= args[2];
		sortOrder = args[3];



		// TODO: knowledge SINGLETON server that reciece data type and sort order informaition
		KnowledgeServer knowledge = KnowledgeServer.getInstance(inputFilename, outputFilename, datatype, sortOrder);
		// DI is bad

		if (datatype == knowledge.isStringData()){
			ctx.setStrategy(new StringStrategy(knowledge);
		} else if (datatype == knowledge.isIntegerData()){
			ctx.setStrategy(new IntegerStrategy(knowledge);
		}

		ctx.readFile(inputFilename);
		ctx.sortSequences(sortOrder);
		ctx.writeFiles(outputFilename);
	}
}