import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
public class DemoViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Container pane = frame.getContentPane();
        pane.setLayout(new BorderLayout());

        // Slider for horizontal rotation
        JSlider headingSlider = new JSlider(0,360, 180);
        pane.add(headingSlider, BorderLayout.SOUTH);

        // Slider for vertical rotation
        JSlider pitchSlider = new JSlider(SwingConstants.VERTICAL, -90, 90, 0);
        pane.add(pitchSlider, BorderLayout.EAST);

        // Panel that displays render results
        JPanel renderPanel = new JPanel() {
          public void paintComponent(Graphics g) {
              Graphics2D g2 = (Graphics2D) g;
              g2.setColor(Color.BLACK);
              g2.fillRect(0, 0, getWidth(), getHeight());
          }
        };

        pane.add(renderPanel, BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
