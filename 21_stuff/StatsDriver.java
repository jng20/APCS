public class StatsDriver{
	public static void main( String[] args ){
		Stats st = new Stats();
		st.mean(2,4); // Should be 3
		st.mean(2.0,4.0); // Should be 3.0
		st.mean(1, 0); // Should be 1 or 0
		st.mean(1.0, 0.0);// Should be 0.5

		st.max(7,5); //Should be 7
		st.max(7.7777, 4.4444444444444); //Should be 7.7777
		st.max(1, 0); //Should be 1
		st.max(1.0, 0.0);//Should be 1.0

		st.geoMean(4, 16); //Should be 8
		st.geoMean(3.00, 12.0); //Should be 6.0
		st.geoMean(1,0); // Should be 0
	}
}
