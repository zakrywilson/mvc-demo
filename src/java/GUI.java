import javax.swing.*;

/**
 * @author Zach Wilson
 * @since Feb 19, 2016
 */
public class GUI {

  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.control();
      }

    });
  }
}
