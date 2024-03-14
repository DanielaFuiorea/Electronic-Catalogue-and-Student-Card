import javax.swing.*;
import java.awt.*;
import java.io.Serializable;


public class IndexPage implements Serializable {

    public void indexPage(University university){

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new JLabel(new ImageIcon("images/background.png")));

        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);


        JPanel frame1 = new JPanel();
        frame1.setLayout(new BoxLayout(frame1, BoxLayout.Y_AXIS));
        frame1.setOpaque(false);



        JLabel title = new JLabel();
        title.setIcon(new ImageIcon("images/UniversitateaDeCodat.png"));
        title.setAlignmentX(0.4f);

        Dimension d = new Dimension(100, 140);

        JButton button1 = new JButton();
        button1.setOpaque(false);
        button1.setBorderPainted(false);
        button1.setContentAreaFilled(false);
        button1.setPreferredSize(d);
        button1.setIcon(new ImageIcon("images/CoursesOverview.png"));
        button1.setAlignmentX(0.3f);

        JButton button2 = new JButton();
        button2.setOpaque(false);
        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button2.setPreferredSize(d);
        button2.setIcon(new ImageIcon("images/LogIn.png"));
        button2.setAlignmentX(0.3f);


        frame1.add(title);
        frame1.add(button1);
        frame1.add(button2);
        frame1.setVisible(true);

        frame1.setSize(1000,600);
        frame.add(frame1);


        frame.setVisible(true);
        frame.setSize(1000,635);
        frame.setLocationRelativeTo(null);

        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button1.setIcon(new ImageIcon("images/CoursesOverview2.png"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button1.setIcon(new ImageIcon("images/CoursesOverview.png"));
            }
        });

        button1.addActionListener(e -> {
            CourseOverview i = new CourseOverview();
            i.courseOverview(university);

            frame.dispose();
        });

        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2.setIcon(new ImageIcon("images/LogIn2.png"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2.setIcon(new ImageIcon("images/LogIn.png"));
            }
        });

        button2.addActionListener(e -> {
            LogIn i = new LogIn();
            i.logIn(university);

            frame.dispose();

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}