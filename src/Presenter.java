import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Represents the presenter in the MVP.
 * @author Zach Wilson
 * @since Feb 19, 2016
 */
public class Presenter {

  /** Model of the MVP */
  private Model model;

  /** View of the MVP */
  private View view;

  /**
   * Constructor.
   * @param m - the model
   * @param v - the view
   */
  Presenter(Model m, View v) {
    this.model = m;
    this.view = v;
  }

  /**
   * Control the GUI.
   */
  public void control() {
    setUpListeners();
  }

  /**
   * Set up the listeners by assigning them to their respective components.
   */
  private void setUpListeners() {
    addShowButtonListener();
    addClearButtonListener();
  }

  /**
   * Add action listener to 'show' button.
   */
  private void addShowButtonListener() {

    // Add action listener for 'show' button
    view.getShowButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {

        // Store information in model...
        model.setText(view.getTextArea().getText());

        // Now we can use this information in the model whenever we like
        String modelText = model.getText();
        String msg = (modelText.equals("")) ? "No content" : modelText;
        JOptionPane.showMessageDialog(null, msg);

      }
    });
  }

  /**
   * Add action listener to 'clear' button.
   */
  private void addClearButtonListener() {
    view.getClearButton().addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        view.getTextArea().setText("");
        model.setText("");
      }

    });
  }
}
