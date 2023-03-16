public class ReturnValues {
    public static void main(String[] args) {
            double area1  = calculateArea(2.3, 3.6);
            System.out.println("Area: "+ area1);
            double area2  = calculateArea(1.5, 3.5);
            System.out.println("Area: "+ area2);
            double area3  = calculateArea(2.5, 5.5);
            System.out.println("Area: "+ area3);
        }
        public static double calculateArea(double length, double width){
            double area = length * width;
            return area;
        } 
    }
