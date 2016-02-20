import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Zach Wilson
 * @since Feb 19, 2016
 */
public class Controller {

  /** Model of the MVC */
  private Model model;

  /** View of the MVC */
  private View view;

  /**
   * Constructor.
   * @param m - the model
   * @param v - the view
   */
  Controller(Model m, View v) {
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
