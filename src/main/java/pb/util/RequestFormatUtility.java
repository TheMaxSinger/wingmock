package pb.util;

public class RequestFormatUtility { 
	
	private RequestFormatUtility() {
        throw new IllegalStateException("Utility class");
    }
	
	public static String escapeForMySql(String input) { 
		return input.replace("%", "\\%").replace("_", "\\_");
	}

}