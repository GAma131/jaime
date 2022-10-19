import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) throws Exception {
    double a = 0;
    double b = 0;

    a = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa a: "));
    b = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa b: "));

    double op1 = ((Math.pow(a, 3) + Math.pow(b, 5)) / Math.exp(a + b));

    double op2 = (Math.log(a / b) / Math.sin(a * b));

    double op3 = (Math.pow(Math.cos(a / b), Math.sqrt(a / b)));

    double result = op1 + op2 * op3;

    JOptionPane.showMessageDialog(
      null,
      "Resultado 1= " +
      op1 +
      "\nResultado 2= " +
      op2 +
      "\nResultado 3= " +
      op3 +
      "\nResultado FINAL= " +
      result
    );
  }
}
