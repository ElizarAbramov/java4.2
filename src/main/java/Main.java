public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();
    
    System.out.println(service.calculate(1000_60, true));
  }
}

