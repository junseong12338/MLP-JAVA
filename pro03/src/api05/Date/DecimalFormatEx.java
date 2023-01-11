package api05.Date;

import java.text.DecimalFormat;

public class DecimalFormatEx {
	public static void main(String[] args) {
		double x = 1234567.89;
		
		DecimalFormat df1 = new DecimalFormat("0000000");
		DecimalFormat df2 = new DecimalFormat("0");
		DecimalFormat df3 = new DecimalFormat("0.000");
		DecimalFormat df4 = new DecimalFormat("0.0");
		DecimalFormat df5 = new DecimalFormat("00000000000000.0000000");
		
		System.out.println(df1.format(x));
		System.out.println(df2.format(x));
		System.out.println(df3.format(x));
		System.out.println(df4.format(x));
		System.out.println(df5.format(x));
		System.out.println();
		
		
		
		DecimalFormat df6 = new DecimalFormat("#######");
		DecimalFormat df7 = new DecimalFormat("#");
		DecimalFormat df8 = new DecimalFormat("#.###");
		DecimalFormat df9 = new DecimalFormat("#.#");
		DecimalFormat df10 = new DecimalFormat("##############.#######");
		
		System.out.println(df6.format(x));
		System.out.println(df7.format(x));
		System.out.println(df8.format(x));
		System.out.println(df9.format(x));
		System.out.println(df10.format(x));
		System.out.println();
		
		DecimalFormat df11 = new DecimalFormat("#.000");
		System.out.println(df11.format(x));
		
		//1,000,000
		int y = 1000000;
		DecimalFormat df12 = new DecimalFormat("#,###");
		System.out.println(df12.format(y));
		
		
		
	}
}
