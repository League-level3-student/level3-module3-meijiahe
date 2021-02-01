package _00_Text_Funkifier;

public class testCustomString extends SpecialString {

	public testCustomString(String s) {
		super(s);
	}
	@Override
	public String funkifyText(String s) {
		String ups="";
		for (int i=0;i<s.length();i++) {
			ups=s.toLowerCase();
		}
return ups;
	}
}
