import javax.swing.*;
import java.awt.*;

/**
 * Represents the view in the MVP.
 *
 * @author Zach Wilson
 * @since Feb 19, 2016
 */
public class View {

  /** The frame */
  private JFrame frame;

  /** The panel */
  private JPanel panel;

  /** The show showButton */
  private JButton showButton;

  /** The clear showButton */
  private JButton clearButton;

  /** The text area */
  private JTextArea textArea;

  /**
   * Constructor.
   */
  View() {
    frame = new JFrame();
    init();
  }

  /**
   * Initializes frame.
   */
  private void init() {
    createComponents();
    createLayout();
    display();
  }

  /**
   * Create the display.
   */
  private void display() {
    frame.setTitle("MVP Demo");
    frame.setSize(300, 200);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setContentPane(panel);
    frame.setVisible(true);
  }

  /**
   * Creates components: show button, clear button, and text area.
   */
  private void createComponents() {
    showButton = createButton("show");
    clearButton = createButton("clear");
    textArea = createTextArea();
  }

  /**
   * Creates new button with desired size (100x25) and title.
   *
   * @return the new button
   */
  private JButton createButton(final String title) {
    JButton button = new JButton(title);
    button.setPreferredSize(new Dimension(100, 25));
    button.setMaximumSize(button.getPreferredSize());
    return button;
  }

  /**
   * Creates the text area.
   *
   * @return the text area
   */
  private JTextArea createTextArea() {
    return new JTextArea();
  }

  /**
   * Creates the layout for the panel.
   */
  private void createLayout() {
    panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);
    layout.setHorizontalGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
        .addComponent(textArea)
        .addComponent(showButton)
        .addComponent(clearButton))
    );
    layout.setVerticalGroup(layout.createSequentialGroup()
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
        .addComponent(textArea))
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
        .addComponent(showButton))
      .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
        .addComponent(clearButton))
    );
  }

  /**
   * Gets the frame.
   *
   * @return the frame
   */
  public JFrame getFrame() {
    return frame;
  }

  /**
   * Gets the show button.
   *
   * @return the show button
   */
  public JButton getShowButton() {
    return showButton;
  }

  /**
   * Gets the clear button.
   *
   * @return the clear button
   */
  public JButton getClearButton() {
    return clearButton;
  }

  /**
   * Get the text area.
   *
   * @return the text area
   */
  public JTextArea getTextArea() {
    return textArea;
  }
}
