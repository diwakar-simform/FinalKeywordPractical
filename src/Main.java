// Second Class
public class Main extends AreaOfCircle {

    public static void main(String[] args) {

        AreaOfCircle obj = new AreaOfCircle();

        // Try to change final variable PIE value
        obj.PIE = 3;

        // Try to override final Method
        @Override
        public double calculateArea(int r) {
            return PIE*(r*r);
        }

        // System.out.println(obj.calculateArea(5));
    }
}
