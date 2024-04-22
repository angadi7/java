package StringUtil;
public class StringUtil {

	
		
		
		   public static String reverseConcatAndExtractMiddle(String str1, String str2, int length) {
		        
		        String concatenated = str1.concat(str2);

		        
		        if (concatenated.isEmpty() || length <= 0) {
		            return "";
		        }

		        
		        StringBuilder reversed = new StringBuilder(concatenated).reverse();

		        
		        if (length > reversed.length()) {
		            return "";
		        }

		        
		        int startIndex = (reversed.length() - length) / 2;

		        
		        return reversed.substring(startIndex, startIndex + length);
		    }

		    public static void main(String[] args) {
		        String str1 = "Hello";
		        String str2 = "World";
		        int length = 5;

		        String result = reverseConcatAndExtractMiddle(str1, str2, length);
		        System.out.println("Result: " + result);
		    }
		


	}


