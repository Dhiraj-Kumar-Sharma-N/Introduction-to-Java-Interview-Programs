package String_Java_Programs;

public class TC07__Remove_Leading_Zeros_From_String {

	public static void main(String[] args) {
		String str = "00000123569";

		str = str.replace('0', ' ');
		String noSpaceStr = str.replaceAll("\\s", "");
		System.out.println(noSpaceStr);
	}

}
