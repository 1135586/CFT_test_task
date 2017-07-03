public class KnowledgeServer {
	private String inputFilename;
	private String  outputFilename;
	private String  datatype;
	private String  sortOrder;

  private static KnowledgeServer instance;
  public static synchronized getInstance(String inputFilename,String  outputFilename,String  datatype,String  sortOrder) {
    if (instance == null){
      instance = new Singleton();
      this.inputFilename; this.outputFilename; this.datatype; this.sortOrder;
    }
  }

  	public Boolean isStringData(){
  		if (this.datatype == "-s"){
			return true;
  		}
  		return false;
  	}
  	public Boolean isIntegerData(){
  		if (this.datatype == "-i"){
			return true;
  		}
  		return false;
  	}
  	public Boolean isAscendingOrder(){
  		if (this.sortOrder == "-a"){
			return true;
  		}
  		return false;
  	}
  	public Boolean isDescendingOrder(){
  		if (this.sortOrder == "-d"){
			return true;
  		}
  		return false;
  	}

}