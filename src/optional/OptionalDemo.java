package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		String[] s = new String[5];
		s[3]= "india";
//		
//		String lowerString = s[3].toLowerCase();
//		
//		System.out.println(lowerString);
		
		Optional<String> checkNull = Optional.ofNullable(s[3]);
		
		if(checkNull.isPresent()) {
			String toLowerCase = s[3].toLowerCase();
			System.out.println(toLowerCase);
		}
		else {
			System.out.println("String value is not present");
		}
		
	}

}
