public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 120;
        double height = 180;
        double index = service.calculate(weight,height);
        System.out.println(index);
    }
}
