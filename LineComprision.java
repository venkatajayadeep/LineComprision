package BridgeLabz;
import java.util.Scanner;
class lineFunction {

    int getLineValue() {
        int value = (int)(Math.random() * 10);
        return value;
    }

    double getLineLength(int x1,int x2, int y1,int y2) {
        double x = Math.pow((x2 - x1), 2);
        double y = Math.pow((y2 - y1), 2);
        return Math.sqrt(x + y);
    }

    boolean isEqual(double length , double length1) {
        if(String.valueOf(length).equals(String.valueOf(length1))) {
            return true;
        }
        else {
            return false;
        }
    }
	
    int compaire(double length , double length1) {
        int result = Double.valueOf(length).compareTo(Double.valueOf(length1));
        return result;
    }
}
public class LineComprision {
	 public static void main(String args[]) {
	        lineFunction lineFunctionObject = new lineFunction();
	        
	        int x1 = lineFunctionObject.getLineValue();
	        int x2 = lineFunctionObject.getLineValue();
	        int y1 = lineFunctionObject.getLineValue();
	        int y2 = lineFunctionObject.getLineValue();
	        
	        int x11 = lineFunctionObject.getLineValue();
	        int x12 = lineFunctionObject.getLineValue();
	        int y11 = lineFunctionObject.getLineValue();
	        int y12 = lineFunctionObject.getLineValue();
	        
	        double length = lineFunctionObject.getLineLength(x1 , x2 , y1 , y2);
	        double length1 = lineFunctionObject.getLineLength(x11 , x12 , y11 , y12);
	        boolean isEqual = lineFunctionObject.isEqual(length , length1);
	        
	        if(isEqual == true) {
	            System.out.println("Lines are equal!");
	        }
	        else {
	            System.out.println("Lines are not equal!");
	        }

	        int compaire = lineFunctionObject.compaire(length , length1);
	        if(compaire >= 1) {
	            System.out.println("line1 is greater than line2");
	        }
	        else if(compaire < 0) {
	            System.out.println("line1 is less than line2");
	        }
	    }
	}
	


