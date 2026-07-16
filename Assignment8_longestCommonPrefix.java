package weeklyAsssignment;


public class Assignment8_longestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		
		if(strs ==null || strs.length ==0) {
			return " ";
	}
		
		String prefix = strs[0];
		
		for(int i = 1;i<strs.length;i++)
			
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				
				
				if(prefix.isEmpty()) {
					return "";
				}
				
			}
			
		return prefix;

	}

	public static void main(String[] args) {

        String[] arr1 = {"flower", "flow", "flight"};
        System.out.println("Output :" + longestCommonPrefix(arr1));

        String[] arr2 = {"dog", "racecar", "car"};
        System.out.println("Output :" +longestCommonPrefix(arr2));

        String[] arr3 = {"interview", "internet", "internal", "interval"};
        System.out.println("Output :" + longestCommonPrefix(arr3));
    }
	}
