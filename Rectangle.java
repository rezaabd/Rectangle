import javax.swing.JOptionPane;

public class Rectangle{

	public static void main(String[] args){
	
		String areaString = JOptionPane.showInputDialog("Enter lenght:");
		double lenght = Double.parseDouble(areaString);

		String perimeterString = JOptionPane.showInputDialog("Enter width:");
		double width = Double.parseDouble(perimeterString);

		double area, perimeter;

		area = lenght * width;
		perimeter = 2 * (lenght + width);

		
		JOptionPane.showMessageDialog(null, area + " is the Area of the rectangle\n" + perimeter + " is the perimeter of the rectanlge");

		System.exit(0);

	}
} 