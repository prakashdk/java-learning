import java.text.DecimalFormat;

public class StringFunctions {

	public static void main(String[] args) {
		String s="Kd.Prakash";
		int a=10;
		String str="Kd.P";
		String[] spl=s.split(".");
		System.out.println(spl);
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(String.format("String :%s", s));
		System.out.println(new DecimalFormat("#.##").format(32.234));
		System.out.println(String.format("%"+a+"d", a));
		System.out.println(String.format("%011d", a));
		System.out.println(s.substring(5));
		System.out.println(s.substring(2,5));
		System.out.println(s.contains("r"));
		System.out.println(s.join(":","2","20","05"));
		System.out.println(s.equals("r"));
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		System.out.println(s.concat(String.valueOf(a)));
		System.out.println(s.replace("a","#"));
		System.out.println("\n");
		System.out.println(s.replaceAll("a","#"));
		System.out.println(s.replace("Pra", "#"));
		System.out.println(s.replaceFirst("a", "*"));
		System.out.println(s.replace("a","#"));
		System.out.println(s.equalsIgnoreCase("kdpraKash"));
		for(int i=0;i<spl.length;i++) {
			System.out.println(spl[i]);
		}
		System.out.print("\n");
		System.out.println("\n");
		System.out.println(s.intern());//==equals
		System.out.println(s.indent(7));
		System.out.println(s.indexOf("r"));
		System.out.println(s.indexOf("a", 6));
		System.out.println(s.indexOf("Pr", 0));
		System.out.println(s.codePointAt(2));//range 0-10FFFF
		System.out.println(s.codePointCount(3, 7));
		System.out.println(s.codePointBefore(5));
		System.out.println(s.contentEquals("Kd.Prakash"));
		System.out.println(s.compareTo(str));
		System.out.println(s.matches("Kd.Prakash"));
		System.out.println(s.endsWith("ash"));
		System.out.println(s.startsWith("K"));
		System.out.println(s.strip());//trim
		System.out.println(s.regionMatches(3, "Pr", 0, 2));
		System.out.println(s.hashCode());
		//System.out.println(s.chars());
		//System.out.println(s.getBytes());
		//System.out.println(s.CASE_INSENSITIVE_ORDER);		
	}

}
