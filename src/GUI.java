import javax.swing.*;

/**
 * Runs the program.
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
        Presenter presenter = new Presenter(model, view);
        presenter.control();
      }

    });
  }
}
