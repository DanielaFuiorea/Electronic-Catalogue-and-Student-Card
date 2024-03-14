import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;


public class CourseOverview implements Serializable {
    public void courseOverview(University university){


        JFrame frame = new JFrame();
        frame.setBackground(Color.darkGray);

        Image icon_small = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon_small);


        Container pane = frame.getContentPane();
        pane.setBackground(Color.darkGray);
        Dimension d = new Dimension(300, 26);

        JPanel panelA1 = new JPanel(new FlowLayout());
        panelA1.setOpaque(false);
        String faculties[] = new String[university.getFaculty().size()];
        String departaments[] = new String[50];
        String courses[] = new String[50];
        int i;

        i = 0;
        for (Faculty x : university.getFaculty()) {
            faculties[i] = x.getName();
            i++;
        }

        JComboBox comboBox1 = new JComboBox(faculties);
        comboBox1.setPreferredSize(d);
        comboBox1.setBackground(Color.darkGray);
        comboBox1.setForeground(Color.white);
        panelA1.add(comboBox1);
        JButton check1 = new JButton("✔");
        check1.setBackground(Color.black);
        check1.setForeground(Color.white);
        panelA1.add(check1);

        JPanel panelA2 = new JPanel(new FlowLayout());
        panelA2.setOpaque(false);
        JComboBox comboBox2 = new JComboBox();
        comboBox2.setPreferredSize(d);
        comboBox2.setBackground(Color.darkGray);
        comboBox2.setForeground(Color.white);
        panelA2.add(comboBox2);
        JButton check2 = new JButton("✔");
        check2.setBackground(Color.black);
        check2.setForeground(Color.white);
        panelA2.add(check2);

        JPanel panelA3 = new JPanel(new FlowLayout());
        panelA3.setOpaque(false);
        JComboBox comboBox3 = new JComboBox();
        comboBox3.setPreferredSize(d);
        comboBox3.setBackground(Color.darkGray);
        comboBox3.setForeground(Color.white);
        panelA3.add(comboBox3);
        JButton check3 = new JButton("✔");
        check3.setBackground(Color.black);
        check3.setForeground(Color.white);
        panelA3.add(check3);

        JPanel panelA = new JPanel(new GridLayout(3,1));
        panelA.setOpaque(false);
        panelA.add(panelA1);
        panelA.add(panelA2);
        panelA.add(panelA3);

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.setOpaque(false);
        panel1.add(panelA);
        JLabel title = new JLabel("                        ");
        panel1.add(title);
        JLabel icon = new JLabel();
        icon.setIcon(new ImageIcon("images/UniCod.png"));
        panel1.add(icon);
        pane.add(panel1, BorderLayout.PAGE_START);


        JTextArea textArea = new JTextArea();


        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setBackground(Color.darkGray);
        textArea.setForeground(Color.white);
        textArea.setFont(new Font("Serif", Font.PLAIN, 20));
        textArea.setEditable(false);
        JScrollPane text = new JScrollPane(textArea);
        text.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        text.getVerticalScrollBar().setBackground(Color.lightGray);
        pane.add(text, BorderLayout.CENTER);

        Dimension d2 = new Dimension(250, 0);
        JPanel panel2 = new JPanel();
        panel2.setOpaque(false);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setOpaque(false);
        panel2.setPreferredSize(d2);
        JPanel panel2A = new JPanel(new FlowLayout());
        panel2A.setOpaque(false);
        panel2A.setPreferredSize(d2);
        JLabel image = new JLabel();
        panel2.add(image);
        JLabel firstname = new JLabel();
        firstname.setFont(new Font("Serif", Font.PLAIN, 30));
        firstname.setForeground(Color.white);
        panel2A.add(firstname);
        panel2A.setAlignmentX(0.1f);
        JPanel grid = new JPanel();
        grid.setLayout(new BoxLayout(grid, BoxLayout.Y_AXIS));
        grid.add(panel2A);
        panel2.add(panel2A);
        pane.add(panel2, BorderLayout.LINE_START);


        JPanel panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
        panel4.setOpaque(false);
        JPanel panel4A = new JPanel(new FlowLayout());
        panel4A.setOpaque(false);
        panel4A.setPreferredSize(d2);
        JPanel panel4B = new JPanel(new FlowLayout());
        panel4B.setOpaque(false);
        JLabel assistants_title = new JLabel("Lista asistenti");
        assistants_title.setFont(new Font("Serif", Font.PLAIN, 40));
        assistants_title.setForeground(Color.white);
        JList list = new JList();
        list.setFont(new Font("Serif", Font.PLAIN, 32));
        list.setForeground(Color.white);
        list.setOpaque(false);
        list.setBackground(Color.darkGray);
        panel4A.add(assistants_title);
        panel4.add(panel4A);
        panel4B.add(list);
        panel4.add(panel4B);
        pane.add(panel4, BorderLayout.LINE_END);

        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.setOpaque(false);
        JLabel label = new JLabel("Declinarea responsabilitati: Orice corelatie a numelor persoanelor reale cu a celor din aplicatie este pur intamplatoare");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(60,60,60));
        panel5.add(new JLabel("                                        "));
        panel5.add(label);
        JButton day_night = new JButton("\uD83D\uDD06");
        day_night.setBackground(Color.black);
        day_night.setForeground(Color.white);
        Dimension d4 = new Dimension(50, 20);
        day_night.setPreferredSize(d4);
        day_night.setHorizontalAlignment(JButton.LEFT);
        panel5.add(new JLabel("                                  "));
        panel5.add(day_night);
        pane.add(panel5, BorderLayout.PAGE_END);

        frame.setVisible(true);
        frame.setSize(1000,635);
        frame.setLocationRelativeTo(null);


        comboBox2.setVisible(false);
        check2.setVisible(false);
        comboBox3.setVisible(false);
        check3.setVisible(false);
        panel2.setVisible(false);
        panel4.setVisible(false);
        text.setVisible(false);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        comboBox1.addActionListener(e -> {
            comboBox2.setVisible(false);
            check2.setVisible(false);
            comboBox3.setVisible(false);
            check3.setVisible(false);
            panel2.setVisible(false);
            panel4.setVisible(false);
            text.setVisible(false);
        });

        check1.addActionListener(e -> {
            comboBox2.setVisible(true);
            check2.setVisible(true);

            int n=0;
            for (Faculty x : university.getFaculty()) {
                if(x.getName().equals(String.valueOf(comboBox1.getItemAt(comboBox1.getSelectedIndex())))) {
                    int j = 0;
                    for (Department y : x.getDepartment()) {
                        departaments[j] = y.getName();
                        j++;
                        n++;
                    }
                }
            }

            comboBox2.removeAllItems();
            int j;
            for(j=0; j<n; j++)
                comboBox2.addItem(departaments[j]);



        });


        comboBox2.addActionListener(e -> {
            comboBox3.setVisible(false);
            check3.setVisible(false);
            panel2.setVisible(false);
            panel4.setVisible(false);
            text.setVisible(false);
        });

        check2.addActionListener(e -> {
            comboBox3.setVisible(true);
            check3.setVisible(true);

            int n=0;
            for (Faculty x : university.getFaculty()) {
                if(x.getName().equals(String.valueOf(comboBox1.getItemAt(comboBox1.getSelectedIndex())))) {
                    for(Department y : x.getDepartment()) {
                        if(y.getName().equals(String.valueOf(comboBox2.getItemAt(comboBox2.getSelectedIndex())))) {
                            int j = 0;
                            for (Course z : y.getCourses()) {
                                courses[j] = z.getName();
                                j++;
                                n++;
                            }
                        }
                    }
                }
            }

            comboBox3.removeAllItems();
            int j;
            for(j=0; j<n; j++)
                comboBox3.addItem(courses[j]);

        });

        comboBox3.addActionListener(e -> {
            panel2.setVisible(false);
            panel4.setVisible(false);
            text.setVisible(false);
        });

        check3.addActionListener(e -> {
            panel2.setVisible(true);
            panel4.setVisible(true);
            text.setVisible(true);


            for (Faculty x : university.getFaculty()) {
                if(x.getName().equals(String.valueOf(comboBox1.getItemAt(comboBox1.getSelectedIndex())))) {
                    for(Department y : x.getDepartment()) {
                        if(y.getName().equals(String.valueOf(comboBox2.getItemAt(comboBox2.getSelectedIndex())))) {
                            for (Course z : y.getCourses()) {
                                if(z.getName().equals(String.valueOf(comboBox3.getItemAt(comboBox3.getSelectedIndex())))){
                                    textArea.setText(z.getDescription());
                                    firstname.setText(z.getTeacher().getLastName() + " " + z.getTeacher().getFirstName());
                                    image.setIcon(new ImageIcon(z.getTeacher().getPath()));
                                    int n=0;;
                                    int j=0;
                                    String assistants_list[] = new String[z.getAssistants().size()];
                                    for(Assistant k : z.getAssistants()) {
                                        assistants_list[j] = k.getLastName() + " " + k.getFirstName() ;
                                        j++;
                                        n++;
                                    }
                                    DefaultListModel listModel1 = new DefaultListModel();
                                    list.removeAll();
                                    for(j=0; j<n; j++)
                                        listModel1.addElement(assistants_list[j]);
                                    list.setModel(listModel1);
                                }
                            }
                        }
                    }
                }
            }

        });


        day_night.addActionListener(e -> {
            if(day_night.getText().equals("\uD83D\uDD06")) {
                day_night.setText("\uD83C\uDF19");
                day_night.setBackground(Color.lightGray);
                day_night.setForeground(Color.BLACK);
                label.setForeground(new Color(240,240,240));
                list.setForeground(Color.BLACK);
                list.setBackground(Color.WHITE);
                assistants_title.setForeground(Color.BLACK);
                text.getVerticalScrollBar().setBackground(Color.lightGray);
                textArea.setBackground(Color.WHITE);
                textArea.setForeground(Color.BLACK);
                check3.setBackground(Color.lightGray);
                check3.setForeground(Color.BLACK);
                comboBox3.setBackground(Color.WHITE);
                comboBox3.setForeground(Color.BLACK);
                check2.setBackground(Color.lightGray);
                check2.setForeground(Color.BLACK);
                comboBox2.setBackground(Color.WHITE);
                comboBox2.setForeground(Color.BLACK);
                check1.setBackground(Color.lightGray);
                check1.setForeground(Color.BLACK);
                comboBox1.setBackground(Color.WHITE);
                comboBox1.setForeground(Color.BLACK);
                firstname.setForeground(Color.BLACK);
                pane.setBackground(Color.WHITE);
                frame.setBackground(Color.WHITE);
                icon.setIcon(new ImageIcon("images/UniCod2.png"));
            }
            else{
                day_night.setText("\uD83D\uDD06");
                day_night.setBackground(Color.BLACK);
                day_night.setForeground(Color.WHITE);
                label.setForeground(new Color(60,60,60));
                list.setForeground(Color.white);
                list.setBackground(Color.darkGray);
                assistants_title.setForeground(Color.white);
                text.getVerticalScrollBar().setBackground(Color.lightGray);
                textArea.setBackground(Color.darkGray);
                textArea.setForeground(Color.white);
                check3.setBackground(Color.black);
                check3.setForeground(Color.white);
                comboBox3.setBackground(Color.darkGray);
                comboBox3.setForeground(Color.white);
                check2.setBackground(Color.black);
                check2.setForeground(Color.white);
                comboBox2.setBackground(Color.darkGray);
                comboBox2.setForeground(Color.white);
                check1.setBackground(Color.black);
                check1.setForeground(Color.white);
                comboBox1.setBackground(Color.darkGray);
                comboBox1.setForeground(Color.white);
                firstname.setForeground(Color.white);
                pane.setBackground(Color.darkGray);
                frame.setBackground(Color.darkGray);
                icon.setIcon(new ImageIcon("images/UniCod.png"));
            }
        });


    }
}
