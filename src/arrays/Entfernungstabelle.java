package arrays;
public class Entfernungstabelle {

	public static final String[] alleStaedte = 
	{
		"Berlin","Dortmund",
		"Dresden","Erfurt",
		"Frankfurt","Halle",
		"Hannover","Kassel",
		"Koeln","Leipzig",
		"Magdeburg"
	};

	public static final int[][] alleEntfernungen = 
	{
	  //   B, DO, DD, ER,  F,HAL,  H, KA,  K,  L, MD
		{  0,512,297,327,660,229,299,465,609,187,153}, // B
		{512,  0,553,354,226,535,213,163, 97,493,359}, // DO
		{297,553,  0,199,585,152,390,390,650,110,244}, // DD
		{327,354,199,  0,386,182,357,191,451,140,274}, // ER
		{660,226,585,386,  0,568,361,195,187,526,507}, // F
		{229,535,152,182,568,  0,322,373,632, 42,176}, // HAL
		{299,213,390,357,361,322,  0,166,310,280,146}, // H
		{465,163,390,191,195,373,166,  0,260,331,312}, // KA
		{609, 97,650,451,187,632,310,260,  0,591,456}, // K
		{187,493,110,140,526, 42,280,331,591,  0,134}, // L
		{153,359,244,274,507,176,146,312,456,134,  0}  // MD
	};
}
