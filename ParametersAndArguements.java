public class ParametersAndArguements {
    public static int calculateArea (int width, int height) {
        int area = width * height;
        return area;
    }
	public static void main(String[] args) {
		int roonWidth = 10;
		int roomHeight = 15;
		
		int area = calculateArea(roonWidth, roomHeight);
		
		System.out.println ("The calculateArea is: " + area );
	}
}