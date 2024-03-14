import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class LogIn implements Serializable {
    public void logIn(University university){

        JFrame frame = new JFrame();
        frame.setBackground(Color.darkGray);

        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);

        Container pane = frame.getContentPane();
        pane.setBackground(Color.darkGray);


        JPanel frame1 = new JPanel();
        frame1.setLayout(new BoxLayout(frame1, BoxLayout.Y_AXIS));
        frame1.setOpaque(false);

        JLabel title = new JLabel();
        title.setIcon(new ImageIcon("images/UniversitateaDeCodat1.png"));
        title.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        JPanel panel1 = new JPanel(new GridLayout(1,1));
        panel1.setOpaque(false);
        JLabel email_label = new JLabel("                                        E-MAIL");
        email_label.setFont(new Font("Serif", Font.PLAIN, 20));
        email_label.setForeground(Color.WHITE);
        email_label.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
        panel1.add(email_label);


        JTextField email = new JTextField();
        email.setOpaque(false);
        email.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        email.setFont(new Font("Serif", Font.PLAIN, 17));
        email.setBorder(BorderFactory.createCompoundBorder(email.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        JLabel background1 = new JLabel(new ImageIcon("images/bar2.png"));
        background1.setLayout(new BorderLayout());
        background1.add(email);
        background1.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        JPanel panel2 = new JPanel(new GridLayout(1,1));
        panel2.setOpaque(false);
        JLabel password_label = new JLabel("                                        PAROLA");
        password_label.setFont(new Font("Serif", Font.PLAIN, 20));
        password_label.setForeground(Color.WHITE);
        password_label.setAlignmentX(JLabel.RIGHT_ALIGNMENT);
        panel2.add(password_label);


        JPanel passwd = new JPanel(new FlowLayout());
        passwd.setOpaque(false);

        JPanel passwd2 = new JPanel(new FlowLayout());
        passwd2.setOpaque(false);

        JPasswordField password = new JPasswordField();
        password.setOpaque(false);
        password.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        password.setFont(new Font("Serif", Font.PLAIN, 17));
        password.setBorder(BorderFactory.createCompoundBorder(email.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));


        JTextField password2 = new JTextField();
        password2.setOpaque(false);
        password2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        password2.setFont(new Font("Serif", Font.PLAIN, 17));
        password2.setBorder(BorderFactory.createCompoundBorder(email.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));


        JLabel background2 = new JLabel(new ImageIcon("images/bar2.png"));
        background2.setLayout(new BorderLayout());
        background2.add(password);

        JLabel background22 = new JLabel(new ImageIcon("images/bar2.png"));
        background22.setLayout(new BorderLayout());
        background22.add(password2);

        JLabel fill = new JLabel("                ");
        JLabel fill2 = new JLabel("                ");
        passwd.add(fill);
        passwd2.add(fill2);

        passwd.add(background2);
        passwd2.add(background22);


        JButton view = new JButton("\uD83D\uDC41");
        view.setBackground(Color.BLACK);
        view.setForeground(Color.WHITE);
        view.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton view2 = new JButton("︶");
        view2.setBackground(Color.BLACK);
        view2.setForeground(Color.WHITE);
        view2.setFont(new Font("Serif", Font.PLAIN, 20));


        passwd.add(view);
        passwd2.add(view2);


        Dimension d = new Dimension(100, 140);

        JButton button2 = new JButton();
        button2.setOpaque(false);
        button2.setBorderPainted(false);
        button2.setContentAreaFilled(false);
        button2.setPreferredSize(d);
        button2.setIcon(new ImageIcon("images/autentificare1.png"));
        button2.setAlignmentX(JButton.CENTER_ALIGNMENT);

        JLabel space = new JLabel(" ");
        space.setFont(new Font("Serif", Font.PLAIN, 20));



        frame1.add(title);
        frame1.add(space);
        frame1.add(space);
        frame1.add(space);
        frame1.add(panel1);
        frame1.add(background1);
        frame1.add(space);
        frame1.add(new JLabel(" "));
        frame1.add(panel2);
        frame1.add(passwd);
        frame1.add(passwd2);
        passwd2.setVisible(false);
        frame1.add(space);
        frame1.add(button2);

        pane.add(frame1, BorderLayout.CENTER);



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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button2.setIcon(new ImageIcon("images/autentificare2.png"));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button2.setIcon(new ImageIcon("images/autentificare1.png"));
            }
        });

        button2.addActionListener(e -> {

            int ok = 0;

            if(email.getText().toString().isEmpty()){
                JOptionPane.showMessageDialog(frame,"E-mailul este gol.","Alert",JOptionPane.WARNING_MESSAGE);
                ok = 1;
            }

            if(email.getText().toString().lastIndexOf(".")==email.getText().toString().length() || email.getText().toString().indexOf('@')<1 || email.getText().toString().indexOf('.')<1 || email.getText().toString().indexOf('@')>email.getText().toString().lastIndexOf('.') || email.getText().toString().lastIndexOf('.')-email.getText().toString().indexOf('@')<2 || email.getText().toString().length()-email.getText().toString().lastIndexOf('.')<2){
                JOptionPane.showMessageDialog(frame,"E-mailul este invalid.","Alert",JOptionPane.WARNING_MESSAGE);
                ok = 1;
            }


            if(passwd.isVisible() && ok == 0){
                if(password.getText().toString().isEmpty() && ok == 0){
                    JOptionPane.showMessageDialog(frame,"Parola este gola.","Alert",JOptionPane.WARNING_MESSAGE);
                    ok = 1;
                }
            }
            if(passwd2.isVisible() && ok == 0){
                if(password2.getText().toString().isEmpty() && ok == 0){
                    System.out.println("5");
                    JOptionPane.showMessageDialog(frame,"Parola este gola.","Alert",JOptionPane.WARNING_MESSAGE);
                    ok = 1;
                }
            }

            if(ok == 0){
                if(email.getText().toString().equals("admin@unicod.ro") &&
                        (String.valueOf(password.getText().toString()).equals("1234") ||
                                String.valueOf(password2.getText().toString()).equals("1234"))){

                    ArrayList<Teacher> teachers;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/teachers.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        teachers = (ArrayList<Teacher>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    ArrayList<Assistant> assistants;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/assistants.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        assistants = (ArrayList<Assistant>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }
                    ArrayList<Student> students;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/students.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        students = (ArrayList<Student>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    ArrayList<Parent> parents;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/parents.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        parents = (ArrayList<Parent>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    Admin i = new Admin();
                    i.admin(university, students, assistants, teachers, parents, day_night.getText().toString());
                    ok = 1;
                    frame.dispose();

                }
                if(email.getText().toString().contains("stud")){
                    ArrayList<Student> students;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/students.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        students = (ArrayList<Student>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    for (Student i : students) {
                        if(i.getEmail().equals(email.getText().toString()))
                        {
                            if(String.valueOf(password.getText().toString().hashCode()).equals(i.getPassword()) ||
                                    String.valueOf(password2.getText().toString().hashCode()).equals(i.getPassword())) {
                                StudentGradeBook j = new StudentGradeBook();
                                j.studentGradeBook(university, i, day_night.getText().toString());
                                frame.dispose();
                                ok = 1;
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Parola este gresita.","Alert",JOptionPane.WARNING_MESSAGE);
                                ok = 1;
                            }
                        }
                    }

                }
                else if(email.getText().toString().contains("assistant")){
                    ArrayList<Assistant> assistants;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/assistants.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        assistants = (ArrayList<Assistant>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    for (Assistant i : assistants) {
                        if(i.getEmail().equals(email.getText().toString()))
                        {
                            if(String.valueOf(password.getText().toString().hashCode()).equals(i.getPassword()) ||
                                    String.valueOf(password2.getText().toString().hashCode()).equals(i.getPassword())) {
                                AssistantGradeBook j = new AssistantGradeBook();
                                j.assistantGradeBook(university, i, day_night.getText().toString());
                                frame.dispose();
                                ok = 1;
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Parola este gresita.","Alert",JOptionPane.WARNING_MESSAGE);
                                ok = 1;
                            }
                        }
                    }

                }
                else if(email.getText().toString().contains("teacher")){
                    ArrayList<Teacher> teachers;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/teachers.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        teachers = (ArrayList<Teacher>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    for (Teacher i : teachers) {
                        if(i.getEmail().equals(email.getText().toString()))
                        {
                            if(String.valueOf(password.getText().toString().hashCode()).equals(i.getPassword()) ||
                                    String.valueOf(password2.getText().toString().hashCode()).equals(i.getPassword())) {
                                ArrayList<Assistant> assistants;
                                try
                                {
                                    FileInputStream fis = new FileInputStream("SURSE/infos/assistants.dat");
                                    ObjectInputStream ois = new ObjectInputStream(fis);

                                    assistants = (ArrayList<Assistant>) ois.readObject();

                                    ois.close();
                                    fis.close();
                                }
                                catch (IOException ioe)
                                {
                                    ioe.printStackTrace();
                                    return;
                                }
                                catch (ClassNotFoundException c)
                                {
                                    System.out.println("Class not found");
                                    c.printStackTrace();
                                    return;
                                }
                                ArrayList<Student> students;
                                try
                                {
                                    FileInputStream fis = new FileInputStream("SURSE/infos/students.dat");
                                    ObjectInputStream ois = new ObjectInputStream(fis);

                                    students = (ArrayList<Student>) ois.readObject();

                                    ois.close();
                                    fis.close();
                                }
                                catch (IOException ioe)
                                {
                                    ioe.printStackTrace();
                                    return;
                                }
                                catch (ClassNotFoundException c)
                                {
                                    System.out.println("Class not found");
                                    c.printStackTrace();
                                    return;
                                }
                                TeacherGradeBook j = new TeacherGradeBook();
                                j.teacherGradeBook(university, i, day_night.getText().toString(), students, assistants);
                                frame.dispose();
                                ok = 1;
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Parola este gresita.","Alert",JOptionPane.WARNING_MESSAGE);
                                ok = 1;
                            }
                        }
                    }

                }
                else{
                    ArrayList<Parent> parents;
                    try
                    {
                        FileInputStream fis = new FileInputStream("SURSE/infos/parents.dat");
                        ObjectInputStream ois = new ObjectInputStream(fis);

                        parents = (ArrayList<Parent>) ois.readObject();

                        ois.close();
                        fis.close();
                    }
                    catch (IOException ioe)
                    {
                        ioe.printStackTrace();
                        return;
                    }
                    catch (ClassNotFoundException c)
                    {
                        System.out.println("Class not found");
                        c.printStackTrace();
                        return;
                    }

                    for (Parent i : parents) {
                        if(i.getEmail().equals(email.getText().toString()))
                        {
                            if(String.valueOf(password.getText().toString().hashCode()).equals(i.getPassword()) ||
                                    String.valueOf(password2.getText().toString().hashCode()).equals(i.getPassword())) {
                                ParentNotification j = new ParentNotification();
                                j.parentNotification(university, i, day_night.getText().toString());
                                frame.dispose();
                                ok = 1;
                            }
                            else{
                                JOptionPane.showMessageDialog(frame,"Parola este gresita.","Alert",JOptionPane.WARNING_MESSAGE);
                                ok = 1;
                            }
                        }
                    }

                }
                if(ok == 0){
                    JOptionPane.showMessageDialog(frame,"E-mailul nu exista.","Alert",JOptionPane.WARNING_MESSAGE);
                    ok = 1;
                }
            }
            if(ok == 0){
                JOptionPane.showMessageDialog(frame,"A aparut o erroare","Alert",JOptionPane.WARNING_MESSAGE);
            }
        });


        view.addActionListener(e -> {

            String text = password.getText().toString();
            password2.setText(text);
            passwd2.setVisible(true);
            passwd.setVisible(false);

        });

        view2.addActionListener(e -> {

            String text = password2.getText().toString();
            password.setText(text);
            passwd.setVisible(true);
            passwd2.setVisible(false);
        });

        day_night.addActionListener(e -> {
            if(day_night.getText().equals("\uD83D\uDD06")) {
                day_night.setText("\uD83C\uDF19");
                day_night.setBackground(Color.WHITE);
                day_night.setForeground(Color.BLACK);
                label.setForeground(new Color(205,205,205));
                frame.setBackground(Color.lightGray);
                pane.setBackground(Color.lightGray);
                title.setIcon(new ImageIcon("images/UniversitateaDeCodat2.png"));
                email_label.setForeground(Color.BLACK);
                background1.setIcon(new ImageIcon("images/bar.png"));
                password_label.setForeground(Color.BLACK);
                background2.setIcon(new ImageIcon("images/bar.png"));
                background22.setIcon(new ImageIcon("images/bar.png"));
                view.setBackground(Color.WHITE);
                view.setForeground(Color.BLACK);
                view2.setBackground(Color.WHITE);
                view2.setForeground(Color.BLACK);


            }
            else{
                day_night.setText("\uD83D\uDD06");
                day_night.setBackground(Color.BLACK);
                day_night.setForeground(Color.WHITE);
                label.setForeground(new Color(60,60,60));
                frame.setBackground(Color.darkGray);
                pane.setBackground(Color.darkGray);
                title.setIcon(new ImageIcon("images/UniversitateaDeCodat1.png"));
                email_label.setForeground(Color.WHITE);
                background1.setIcon(new ImageIcon("images/bar2.png"));
                password_label.setForeground(Color.WHITE);
                background2.setIcon(new ImageIcon("images/bar2.png"));
                background22.setIcon(new ImageIcon("images/bar2.png"));
                view.setBackground(Color.BLACK);
                view.setForeground(Color.WHITE);
                view2.setBackground(Color.BLACK);
                view2.setForeground(Color.WHITE);

            }
        });



    }

}
