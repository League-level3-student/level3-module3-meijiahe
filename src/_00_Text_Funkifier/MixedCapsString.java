package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String up="";
		for (int i =0;i<s.length();i++) {
			if (i%2==1) {
				up+=s.substring(i,i+1).toUpperCase();
			}
			else {
				up+=s.substring(i,i+1).toLowerCase();
			}
		}
		return up;
	}

}
