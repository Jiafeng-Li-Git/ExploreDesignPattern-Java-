package data_structure;

public class StringValidationer {
	
	public boolean allUpperCaseValidation(String str) {
		boolean flag = true;
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if (!Character.isUpperCase(charArray[i])) {
				flag = false;
			}
		}
		return flag;
	}

	public boolean allLowerCaseValidation(String str) {
		return str.chars().allMatch(Character::isLowerCase);
	}
	
	public Boolean isPalindrome(String s){
        StringBuffer sr = new StringBuffer(s);
        sr.reverse();
        String newString = new String(sr);
        Boolean flag = true;
        if(s.equals(newString)) {
            return true;
        }else{
            return false;
        }
    }
}
