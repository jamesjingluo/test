package util;

public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String s = "1310cd7af3e3e981e93ef8757ecfe71b";
		String s = "863970020324687";
		
		StringBuffer sb = new StringBuffer();
		for (int i= s.length()-1 ;i >=0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);

	}

}
