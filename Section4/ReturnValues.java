public class ReturnValues {
    public static void main(String[] args) {
            double area1  = calculateArea(2.3, 3.6);
            printArea(2.3, 3.6, area1);
            // System.out.println("Area: "+ area1);
            // double area2  = calculateArea(1.5, 3.5);
            // System.out.println("Area: "+ area2);
            // double area3  = calculateArea(2.5, 5.5);
            // System.out.println("Area: "+ area3);
            // calculateArea(-2.3, 5);
            

            String englishExplanation = explainArea("English");
            // String frenchExplanation = explainArea("French");
            // String spanishExplanation = explainArea("Spanish");
            // String italianExplanation = explainArea("Italian");
            System.out.println(englishExplanation);


        }
        public static double calculateArea(double length, double width){
            if (length<0 || width<0){
                System.out.println("invalid Dimensions");
                System.exit(0);
            }
            double area = length * width;
            return area;
        } 

        public static String explainArea(String language){
            switch(language){
                case "English": return "Area equals length * width";
                case "French": return "La surface est egale a la longueur * la largeur"; 
                case "Spanish": return "area es igual a largo * ancho";
                default: return "Language not available";
            }
          }
        public static void printArea(double length, double width, double area){
            System.out.println("A rectangle with a length of "+length+ " and a width of "+ width+ " has an area of "+ area);
        }
    }
