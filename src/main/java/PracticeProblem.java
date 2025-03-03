public class PracticeProblem {

	public static void main(String args[]) {

	} 
	public static String pluralize(String word){
		word = word.toLowerCase();
		if (word.endsWith("ey")){
			return "eys";
		}

		else if(word.endsWith("y")){
			return "ies";
		}

		else if (word.endsWith("ife")){
			return "ives";
		}
		else{
			return "s";
		}

	}

	public static int min(int a, int b, int c){
		if (a <= b && a <= c) {
            return a;
        } 
		else if (b <= a && b <= c) {
            return b;
        } 
		else {
            return c;
		}
	}

	public static boolean isLeapYear(int leap){
		if (leap % 4 == 0){
			if (leap % 100 == 0){
				if (leap % 400 == 0){
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return true;
			}
		}
		else{
			return false;
		}
	
		}
	}