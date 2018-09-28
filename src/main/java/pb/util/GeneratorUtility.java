package pb.util;

import java.util.UUID;

public class GeneratorUtility {

    private GeneratorUtility() {
        throw new IllegalStateException("Utility class");
    }

	public static String generateTransactionId(String transactionId) {
		return convertString(transactionId);
	}
	
	public static String generateTransactionIdForEmptyContext() {
		return convertString(UUID.randomUUID().toString());
	}

	private static String convertString(String transactionId){
		String[] transactionSplited = transactionId.split("-");
        if(transactionSplited.length > 2){
            transactionId = "fds-"+ transactionId.replace("-", "");
        }else if(transactionSplited.length == 1){
            transactionId = "fds-"+ transactionSplited[0];
        }
        return transactionId;
	}
	
}
