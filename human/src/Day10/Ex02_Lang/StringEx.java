package Day10.Ex02_Lang;

public class StringEx {
	
	public static void main(String[] args) {
		String str1 = " Human Edu Center ";
		String str2 = " human Edu Center ";
		
		System.out.println( str1.charAt(2));         // index 에 있는 문자 추출
		System.out.println( str1.concat(str2));      // str1 + str2 문자 연결
		System.out.println( str1.contains("Edu"));   // 문자열 포함 여부 확인 (true/false)
		System.out.println( str1.equals(str2) );     // 문자열 일치여부 확은 (true/false) 
		System.out.println( str1.equalsIgnoreCase(str2));  // 대소문자 구분없이 문자열 일지여부 확인 (true/false)
		System.out.println( str1.indexOf("c"));      // 해당 문자의 첫 index 반환, 없으명 -1
		System.out.println( str1.lastIndexOf("u"));  // 해당 문자의 마지막 index 반환, 없으면 -1
		System.out.println( str1.trim());            // 문자열 양쪽 공백 제거
		System.out.println( str1.length());          // 문자열의 길이 (글자수) [공백포함]
		System.out.println( str1.substring(7));      // 문자열의 길이 (글자수) [공백포함]
		System.out.println( str1.substring(7, 17));  // index~(index2-1)까지 반환
		System.out.println( str1.replace(" ", "#")); // replace("기존문자", "대체문자)
		System.out.println( str1.replaceAll(" ", "*"));// 
		System.out.println( str1.toUpperCase());
		System.out.println( str1.toLowerCase());
		
		String[] sp = str1.split(" ");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i +"\t : " + sp[i]);
			
		}
	}

}
