import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnalogClock extends JFrame {

    private ClockPanel clockPanel;

    public AnalogClock() {
        setTitle("Analog Clock");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        clockPanel = new ClockPanel();

        add(clockPanel);

        // Update the time every second
        Timer timer = new Timer(1000, e -> updateTime());
        timer.start();
    }

    private void updateTime() {
        clockPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }

            AnalogClock clock = new AnalogClock();
            clock.setVisible(true);
        });
    }
}

class ClockPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(getWidth(), getHeight()) / 2 - 10;

        // Draw clock face
        g2d.setColor(Color.WHITE);
        g2d.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        // Draw clock numbers
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.PLAIN, 12));
        for (int i = 1; i <= 12; i++) {
            double angle = Math.toRadians((360.0 / 12) * (i - 3) - 90);
            int x = (int) (centerX + radius * 0.8 * Math.cos(angle));
            int y = (int) (centerY + radius * 0.8 * Math.sin(angle));
            g2d.drawString(Integer.toString(i), x, y);
        }

        // Draw clock hands
        drawClockHand(g2d, centerX, centerY, radius * 0.5, getHour() % 12, 12);
        drawClockHand(g2d, centerX, centerY, radius * 0.7, getMinute(), 60);
        drawClockHand(g2d, centerX, centerY, radius * 0.9, getSecond(), 60);
    }

    private void drawClockHand(Graphics2D g2d, int centerX, int centerY, double length, int value, int total) {
        double angle = Math.toRadians((360.0 / total) * value - 90);
        int x = (int) (centerX + length * Math.cos(angle));
        int y = (int) (centerY + length * Math.sin(angle));

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(3));

        g2d.drawLine(centerX, centerY, x, y);
    }

    private int getHour() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        return Integer.parseInt(sdf.format(new Date()));
    }

    private int getMinute() {
        SimpleDateFormat sdf = new SimpleDateFormat("mm");
        return Integer.parseInt(sdf.format(new Date()));
    }

    private int getSecond() {
        SimpleDateFormat sdf = new SimpleDateFormat("ss");
        return Integer.parseInt(sdf.format(new Date()));
    }
}
