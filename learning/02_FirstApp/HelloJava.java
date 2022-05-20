import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class HelloJava {
  public static void main(String[] args) {
    JFrame frame = new JFrame("HelloJava");
    frame.add(new HelloComponent(args[0]));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}


class HelloComponent extends JComponent implements MouseMotionListener {
  String msg;
  int msgX = 125,
    msgY = 95;

  public HelloComponent(String msg) {
    this.msg = msg;
    addMouseMotionListener(this);
  }

  public void paintComponent(Graphics g) {
    g.drawString(msg, msgX, msgY);
  }

  public void mouseDragged(MouseEvent e) {
    msgX = e.getX();
    msgY = e.getY();
    repaint();
  }

  public void mouseMoved(MouseEvent e) {}
}
