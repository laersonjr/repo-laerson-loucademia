package br.com.softblue.loucademia.application.utils;

public class StringUtils {

	// Quando se utiliza o static, não é necessario criar um objeto, com a classe
	// você pode utilizar o metodo
	// .trim() retira os espaços em branco no inicio de uma string

		public static boolean isEmpty(String s) {
			if (s == null) {
				return true;
			}
			
			return s.trim().length() == 0;
		}
		
		public static String leftZeros(int value, int finalSize) {
			return String.format("%0" + finalSize + "d", value);
		}

	public static void main(String[] args) {
		String str = "abc";
		String str2 = "   ";
		String str3 = null;
		int v = 100;

		System.out.println(StringUtils.isEmpty(str));
		System.out.println(StringUtils.isEmpty(str2));
		System.out.println(StringUtils.isEmpty(str3));
		System.out.println(StringUtils.leftZeros(v, 8));
	}
}
