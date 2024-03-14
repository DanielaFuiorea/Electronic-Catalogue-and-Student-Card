import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;

public class Admin {
    public void admin(University university, ArrayList<Student> students, ArrayList<Assistant> assistants, ArrayList<Teacher> teachers, ArrayList<Parent> parents, String button_text){


        JFrame frame = new JFrame();
        frame.setBackground(Color.darkGray);

        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);


        Container pane = frame.getContentPane();
        pane.setBackground(Color.darkGray);
        Dimension d = new Dimension(300, 40);
        Dimension d2 = new Dimension(200, 60);
        Dimension d3 = new Dimension(400, 50);

        JTabbedPane tp = new JTabbedPane();
        JPanel panelA = new JPanel(new BorderLayout());
        JPanel panelB = new JPanel(new BorderLayout());
        JPanel panelAA = new JPanel(new FlowLayout());
        JPanel panelBB = new JPanel(new FlowLayout());
        tp.add(panelA, "Utilizatori");
        tp.add(panelB, "Universitate");
        pane.add(tp, BorderLayout.CENTER);



        JPanel grid1A = new JPanel(new GridLayout(1,2));
        grid1A.setOpaque(false);
        JPanel grid2A = new JPanel(new GridLayout(3,1));
        grid2A.setOpaque(false);
        JPanel grid1B = new JPanel(new GridLayout(1,2));
        grid1B.setOpaque(false);
        JPanel grid2B = new JPanel(new GridLayout(3,1));
        grid2B.setOpaque(false);


        JPanel panel2A = new JPanel(new FlowLayout());
        panel2A.setOpaque(false);
        String string2A[]= {"Student", "Profesor", "Asistent", "Parinte"};
        JComboBox comboBox2A = new JComboBox(string2A);
        comboBox2A.setPreferredSize(d);
        panel2A.add(comboBox2A);
        JButton check2A = new JButton("✔");
        panel2A.add(check2A);
        grid2A.add(panel2A);

        JPanel panel2B = new JPanel(new FlowLayout());
        panel2B.setOpaque(false);
        String string2B[]= {"Facultate", "Departament"};
        JComboBox comboBox2B = new JComboBox(string2B);
        panel2B.add(comboBox2B);
        comboBox2B.setPreferredSize(d);
        JButton check2B = new JButton("✔");
        panel2B.add(check2B);
        grid2B.add(panel2B);

        JPanel panel1A = new JPanel(new FlowLayout());
        panel1A.setOpaque(false);
        String string1A[]= {"Adaugare", "Modificare"};
        JComboBox comboBox1A = new JComboBox(string1A);
        comboBox1A.setPreferredSize(d);
        panel1A.add(comboBox1A);
        JButton check1A = new JButton("✔");
        panel1A.add(check1A);
        grid2A.add(panel1A);

        JPanel panel1B = new JPanel(new FlowLayout());
        panel1B.setOpaque(false);
        String string1B[]= {"Adaugare", "Modificare"};
        JComboBox comboBox1B = new JComboBox(string1B);
        comboBox1B.setPreferredSize(d);
        panel1B.add(comboBox1B);
        JButton check1B = new JButton("✔");
        panel1B.add(check1B);
        grid2B.add(panel1B);

        JPanel panel3A = new JPanel(new FlowLayout());
        panel3A.setOpaque(false);
        JComboBox comboBox3A = new JComboBox();
        comboBox3A.setPreferredSize(d);
        panel3A.add(comboBox3A);
        JButton check3A = new JButton("✔");
        panel3A.add(check3A);
        grid2A.add(panel3A);

        JPanel panel3B = new JPanel(new FlowLayout());
        panel3B.setOpaque(false);
        JComboBox comboBox3B = new JComboBox();
        comboBox3B.setPreferredSize(d);
        panel3B.add(comboBox3B);
        JButton check3B = new JButton("✔");
        panel3B.add(check3B);
        grid2B.add(panel3B);

        grid1A.add(grid2A);
        JLabel uniA = new JLabel();
        grid1A.add(uniA);
        panelA.add(grid1A, BorderLayout.NORTH);

        grid1B.add(grid2B);
        JLabel uniB = new JLabel();
        grid1B.add(uniB);
        panelB.add(grid1B, BorderLayout.NORTH);





        //creaza asistent
        JPanel createAssistant = new JPanel(new BorderLayout());
        createAssistant.setOpaque(false);
        JPanel grid1 = new JPanel(new GridLayout(3,1));
        grid1.setOpaque(false);
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.setOpaque(false);
        JPanel panel001 = new JPanel(new FlowLayout());
        panel001.setOpaque(false);
        JPanel panel01 = new JPanel();
        panel01.setOpaque(false);
        panel01.setLayout(new BoxLayout(panel01, BoxLayout.Y_AXIS));
        JLabel CNP1 = new JLabel("      CNP: ");
        CNP1.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textCNP1 = new JTextField();
        textCNP1.setFont(new Font("Serif", Font.PLAIN, 25));
        textCNP1.setPreferredSize(d);
        panel001.add(CNP1);
        panel001.add(textCNP1);
        panel01.add(panel001);
        JLabel name1 = new JLabel("    Nume: ");
        name1.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName1 = new JTextField();
        textName1.setFont(new Font("Serif", Font.PLAIN, 25));
        textName1.setPreferredSize(d);
        panel1.add(name1);
        panel1.add(textName1);
        grid1.add(panel1);
        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.setOpaque(false);
        JLabel firstName1 = new JLabel("Prenume: ");
        firstName1.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName1 = new JTextField();
        textFirstName1.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName1.setPreferredSize(d);
        panel2.add(firstName1);
        panel2.add(textFirstName1);
        grid1.add(panel2);
        JPanel panel3 = new JPanel(new FlowLayout());
        panel3.setOpaque(false);
        JLabel passw1 = new JLabel("    Parola: ");
        passw1.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw1 = new JTextField();
        textPassw1.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw1.setPreferredSize(d);
        panel3.add(passw1);
        panel3.add(textPassw1);
        grid1.add(panel3);
        panel01.add(grid1);
        createAssistant.add(panel01, BorderLayout.NORTH);
        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.setOpaque(false);
        JButton add_assi = new JButton("Creaza");
        add_assi.setFont(new Font("Serif", Font.PLAIN, 25));
        add_assi.setPreferredSize(d2);
        panel4.add(add_assi);
        createAssistant.add(panel4, BorderLayout.CENTER);




        //editeaza asistent
        JPanel editAssistant = new JPanel(new BorderLayout());
        editAssistant.setOpaque(false);
        JPanel grid2 = new JPanel(new GridLayout(3,1));
        grid2.setOpaque(false);
        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.setOpaque(false);
        JLabel name2 = new JLabel("    Nume: ");
        name2.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName2 = new JTextField();
        textName2.setFont(new Font("Serif", Font.PLAIN, 25));
        textName2.setPreferredSize(d);
        panel5.add(name2);
        panel5.add(textName2);
        grid2.add(panel5);
        JPanel panel6 = new JPanel(new FlowLayout());
        panel6.setOpaque(false);
        JLabel firstName2 = new JLabel("Prenume: ");
        firstName2.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName2 = new JTextField();
        textFirstName2.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName2.setPreferredSize(d);
        panel6.add(firstName2);
        panel6.add(textFirstName2);
        grid2.add(panel6);
        JPanel panel7 = new JPanel(new FlowLayout());
        panel7.setOpaque(false);
        JLabel passw2 = new JLabel("    Parola: ");
        passw2.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw2 = new JTextField();
        textPassw2.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw2.setPreferredSize(d);
        panel7.add(passw2);
        panel7.add(textPassw2);
        grid2.add(panel7);
        editAssistant.add(grid2, BorderLayout.NORTH);
        JPanel panel8 = new JPanel(new FlowLayout());
        panel8.setOpaque(false);
        JButton edit_assi = new JButton("Modifica");
        edit_assi.setFont(new Font("Serif", Font.PLAIN, 25));
        edit_assi.setPreferredSize(d2);
        panel8.add(edit_assi);
        JButton remove_assi = new JButton("Sterge");
        remove_assi.setFont(new Font("Serif", Font.PLAIN, 25));
        remove_assi.setPreferredSize(d2);
        panel8.add(remove_assi);
        editAssistant.add(panel8, BorderLayout.CENTER);

        //creaza profesor
        JPanel createTeacher = new JPanel(new BorderLayout());
        createTeacher.setOpaque(false);
        JPanel grid3 = new JPanel(new GridLayout(2,2));
        grid3.setOpaque(false);
        JPanel panel003 = new JPanel(new FlowLayout());
        panel003.setOpaque(false);
        JPanel panel03 = new JPanel();
        panel03.setOpaque(false);
        panel03.setLayout(new BoxLayout(panel03, BoxLayout.Y_AXIS));
        JLabel CNP3 = new JLabel("CNP: ");
        CNP3.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textCNP3 = new JTextField();
        textCNP3.setFont(new Font("Serif", Font.PLAIN, 25));
        textCNP3.setPreferredSize(d);
        panel003.add(CNP3);
        panel003.add(textCNP3);
        panel03.add(panel003);
        JPanel panel9 = new JPanel(new FlowLayout());
        panel9.setOpaque(false);
        JLabel name3 = new JLabel("    Nume: ");
        name3.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName3 = new JTextField();
        textName3.setFont(new Font("Serif", Font.PLAIN, 25));
        textName3.setPreferredSize(d);
        panel9.add(name3);
        panel9.add(textName3);
        grid3.add(panel9);
        JPanel panel10 = new JPanel(new FlowLayout());
        panel10.setOpaque(false);
        JLabel passw3 = new JLabel("        Parola: ");
        passw3.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw3 = new JTextField();
        textPassw3.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw3.setPreferredSize(d);
        panel10.add(passw3);
        panel10.add(textPassw3);
        grid3.add(panel10);
        JPanel panel11 = new JPanel(new FlowLayout());
        panel11.setOpaque(false);
        JLabel firstName3 = new JLabel("Prenume: ");
        firstName3.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName3 = new JTextField();
        textFirstName3.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName3.setPreferredSize(d);
        panel11.add(firstName3);
        panel11.add(textFirstName3);
        grid3.add(panel11);
        JPanel panel12 = new JPanel(new FlowLayout());
        panel12.setOpaque(false);
        JLabel photoPath3 = new JLabel("Calea pozei: ");
        photoPath3.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPhotoPath3 = new JTextField();
        textPhotoPath3.setFont(new Font("Serif", Font.PLAIN, 25));
        textPhotoPath3.setPreferredSize(d);
        panel12.add(photoPath3);
        panel12.add(textPhotoPath3);
        grid3.add(panel12);
        panel03.add(grid3);
        createTeacher.add(panel03, BorderLayout.NORTH);
        JPanel panel13 = new JPanel(new FlowLayout());
        panel13.setOpaque(false);
        JButton create_teach = new JButton("Creaza");
        create_teach.setFont(new Font("Serif", Font.PLAIN, 25));
        create_teach.setPreferredSize(d2);
        panel13.add(create_teach);
        createTeacher.add(panel13, BorderLayout.CENTER);


        //modifica profesor
        JPanel editTeacher = new JPanel(new BorderLayout());
        editTeacher.setOpaque(false);
        JPanel grid4 = new JPanel(new GridLayout(2,2));
        grid4.setOpaque(false);
        JPanel panel14 = new JPanel(new FlowLayout());
        panel14.setOpaque(false);
        JLabel name4 = new JLabel("    Nume: ");
        name4.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName4 = new JTextField();
        textName4.setFont(new Font("Serif", Font.PLAIN, 25));
        textName4.setPreferredSize(d);
        panel14.add(name4);
        panel14.add(textName4);
        grid4.add(panel14);
        JPanel panel15 = new JPanel(new FlowLayout());
        panel15.setOpaque(false);
        JLabel passw4 = new JLabel("        Parola: ");
        passw4.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw4 = new JTextField();
        textPassw4.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw4.setPreferredSize(d);
        panel15.add(passw4);
        panel15.add(textPassw4);
        grid4.add(panel15);
        JPanel panel16 = new JPanel(new FlowLayout());
        panel16.setOpaque(false);
        JLabel firstName4 = new JLabel("Prenume: ");
        firstName4.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName4 = new JTextField();
        textFirstName4.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName4.setPreferredSize(d);
        panel16.add(firstName4);
        panel16.add(textFirstName4);
        grid4.add(panel16);
        JPanel panel17 = new JPanel(new FlowLayout());
        panel17.setOpaque(false);
        JLabel photoPath4 = new JLabel("Calea pozei: ");
        photoPath4.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPhotoPath4 = new JTextField();
        textPhotoPath4.setFont(new Font("Serif", Font.PLAIN, 25));
        textPhotoPath4.setPreferredSize(d);
        panel17.add(photoPath4);
        panel17.add(textPhotoPath4);
        grid4.add(panel17);
        editTeacher.add(grid4, BorderLayout.NORTH);
        JPanel panel18 = new JPanel(new FlowLayout());
        panel18.setOpaque(false);
        JButton edit_teach = new JButton("Modifica");
        edit_teach.setFont(new Font("Serif", Font.PLAIN, 25));
        edit_teach.setPreferredSize(d2);
        panel18.add(edit_teach);
        JButton remove_teach = new JButton("Sterge");
        remove_teach.setFont(new Font("Serif", Font.PLAIN, 25));
        remove_teach.setPreferredSize(d2);
        panel18.add(remove_teach);
        editTeacher.add(panel18, BorderLayout.CENTER);


        //creaza parinte
        JPanel createParent = new JPanel(new BorderLayout());
        createParent.setOpaque(false);
        JPanel grid5 = new JPanel(new GridLayout(2,2));
        grid5.setOpaque(false);
        JPanel panel005 = new JPanel(new FlowLayout());
        panel005.setOpaque(false);
        JPanel panel05 = new JPanel();
        panel05.setOpaque(false);
        panel05.setLayout(new BoxLayout(panel05, BoxLayout.Y_AXIS));
        JLabel CNP5 = new JLabel("CNP: ");
        CNP5.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textCNP5 = new JTextField();
        textCNP5.setFont(new Font("Serif", Font.PLAIN, 25));
        textCNP5.setPreferredSize(d);
        panel005.add(CNP5);
        panel005.add(textCNP5);
        panel05.add(panel005);
        JPanel panel19 = new JPanel(new FlowLayout());
        panel19.setOpaque(false);
        JLabel name5 = new JLabel("    Nume: ");
        name5.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName5 = new JTextField();
        textName5.setFont(new Font("Serif", Font.PLAIN, 25));
        textName5.setPreferredSize(d);
        panel19.add(name5);
        panel19.add(textName5);
        grid5.add(panel19);
        JPanel panel20 = new JPanel(new FlowLayout());
        panel20.setOpaque(false);
        JLabel passw5 = new JLabel("Parola: ");
        passw5.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw5 = new JTextField();
        textPassw5.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw5.setPreferredSize(d);
        panel20.add(passw5);
        panel20.add(textPassw5);
        grid5.add(panel20);
        JPanel panel21 = new JPanel(new FlowLayout());
        panel21.setOpaque(false);
        JLabel firstName5 = new JLabel("Prenume: ");
        firstName5.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName5 = new JTextField();
        textFirstName5.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName5.setPreferredSize(d);
        panel21.add(firstName5);
        panel21.add(textFirstName5);
        grid5.add(panel21);
        JPanel panel22 = new JPanel(new FlowLayout());
        panel22.setOpaque(false);
        JLabel email5 = new JLabel("E-mail: ");
        email5.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textEmail5 = new JTextField();
        textEmail5.setFont(new Font("Serif", Font.PLAIN, 25));
        textEmail5.setPreferredSize(d);
        panel22.add(email5);
        panel22.add(textEmail5);
        grid5.add(panel22);
        panel05.add(grid5);
        createParent.add(panel05, BorderLayout.NORTH);
        JPanel panel23 = new JPanel(new FlowLayout());
        panel23.setOpaque(false);
        JButton create_parent = new JButton("Creaza");
        create_parent.setFont(new Font("Serif", Font.PLAIN, 25));
        create_parent.setPreferredSize(d2);
        panel23.add(create_parent);
        createParent.add(panel23, BorderLayout.CENTER);


        //modifica parinte
        JPanel editParent = new JPanel(new BorderLayout());
        editParent.setOpaque(false);
        JPanel grid6 = new JPanel(new GridLayout(2,2));
        grid6.setOpaque(false);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
        buttonPanel.setOpaque(false);
        JButton observer = new JButton("         ");
        observer.setPreferredSize(new Dimension(100,50));
        buttonPanel.add(observer);
        JPanel panel24 = new JPanel(new FlowLayout());
        panel24.setOpaque(false);
        JLabel name6 = new JLabel("    Nume: ");
        name6.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName6 = new JTextField();
        textName6.setFont(new Font("Serif", Font.PLAIN, 25));
        textName6.setPreferredSize(d);
        panel24.add(name6);
        panel24.add(textName6);
        grid6.add(panel24);
        JPanel panel25 = new JPanel(new FlowLayout());
        panel25.setOpaque(false);
        JLabel passw6 = new JLabel("Parola: ");
        passw6.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw6 = new JTextField();
        textPassw6.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw6.setPreferredSize(d);
        panel25.add(passw6);
        panel25.add(textPassw6);
        grid6.add(panel25);
        JPanel panel26 = new JPanel(new FlowLayout());
        panel26.setOpaque(false);
        JLabel firstName6 = new JLabel("Prenume: ");
        firstName6.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName6 = new JTextField();
        textFirstName6.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName6.setPreferredSize(d);
        panel26.add(firstName6);
        panel26.add(textFirstName6);
        grid6.add(panel26);
        JPanel panel27 = new JPanel(new FlowLayout());
        panel27.setOpaque(false);
        JLabel email6 = new JLabel("E-mail: ");
        email6.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textEmail6 = new JTextField();
        textEmail6.setFont(new Font("Serif", Font.PLAIN, 25));
        textEmail6.setPreferredSize(d);
        panel27.add(email6);
        panel27.add(textEmail6);
        grid6.add(panel27);
        buttonPanel.add(grid6);
        editParent.add(buttonPanel, BorderLayout.NORTH);
        JPanel panel28 = new JPanel(new FlowLayout());
        panel28.setOpaque(false);
        JButton edit_parent = new JButton("Modifica");
        edit_parent.setFont(new Font("Serif", Font.PLAIN, 25));
        edit_parent.setPreferredSize(d2);
        panel28.add(edit_parent);
        JButton remove_parent = new JButton("Sterge");
        remove_parent.setFont(new Font("Serif", Font.PLAIN, 25));
        remove_parent.setPreferredSize(d2);
        panel28.add(remove_parent);
        editParent.add(panel28, BorderLayout.CENTER);


        //creaza student
        JPanel createStudent = new JPanel(new BorderLayout());
        createStudent.setOpaque(false);
        JPanel grid7 = new JPanel(new GridLayout(1,2));
        grid7.setOpaque(false);
        JPanel grid7A = new JPanel(new GridLayout(4,1));
        grid7A.setOpaque(false);
        JPanel grid7B = new JPanel(new GridLayout(4,1));
        grid7B.setOpaque(false);
        JPanel panel007 = new JPanel(new FlowLayout());
        panel007.setOpaque(false);
        JPanel panel07 = new JPanel();
        panel07.setOpaque(false);
        panel07.setLayout(new BoxLayout(panel07, BoxLayout.Y_AXIS));
        JLabel CNP7 = new JLabel("CNP: ");
        CNP7.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textCNP7 = new JTextField();
        textCNP7.setFont(new Font("Serif", Font.PLAIN, 25));
        textCNP7.setPreferredSize(d);
        panel007.add(CNP7);
        panel007.add(textCNP7);
        panel07.add(panel007);
        JPanel panel29 = new JPanel(new FlowLayout());
        panel29.setOpaque(false);
        JLabel name7 = new JLabel("         Nume: ");
        name7.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName7 = new JTextField();
        textName7.setFont(new Font("Serif", Font.PLAIN, 25));
        textName7.setPreferredSize(d);
        panel29.add(name7);
        panel29.add(textName7);
        grid7A.add(panel29);
        JPanel panel30 = new JPanel(new FlowLayout());
        panel30.setOpaque(false);
        JPanel panel31 = new JPanel(new FlowLayout());
        panel31.setOpaque(false);
        JLabel firstName7 = new JLabel("     Prenume: ");
        firstName7.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName7 = new JTextField();
        textFirstName7.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName7.setPreferredSize(d);
        panel31.add(firstName7);
        panel31.add(textFirstName7);
        grid7A.add(panel31);
        JLabel passw7 = new JLabel("        Parola: ");
        passw7.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw7 = new JTextField();
        textPassw7.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw7.setPreferredSize(d);
        panel30.add(passw7);
        panel30.add(textPassw7);
        grid7A.add(panel30);
        JPanel panel32 = new JPanel(new FlowLayout());
        panel32.setOpaque(false);
        JLabel photoPath7 = new JLabel("Calea pozei: ");
        photoPath7.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPhotoPath7 = new JTextField();
        textPhotoPath7.setFont(new Font("Serif", Font.PLAIN, 25));
        textPhotoPath7.setPreferredSize(d);
        panel32.add(photoPath7);
        panel32.add(textPhotoPath7);
        grid7A.add(panel32);
        grid7.add(grid7A);

        JPanel panel34 = new JPanel(new FlowLayout());
        panel34.setOpaque(false);
        JLabel parent17 = new JLabel("     Parinte 1: ");
        parent17.setFont(new Font("Serif", Font.PLAIN, 25));
        String parent1[] = new String[parents.size()];
        int n;
        n = 0;
        for (Parent x : parents) {
            parent1[n] = x.getLastName() + " " + x.getFirstName();
            n++;
        }
        JComboBox parent1ComboBox7 = new JComboBox(parent1);
        parent1ComboBox7.setFont(new Font("Serif", Font.PLAIN, 25));
        parent1ComboBox7.setPreferredSize(d);
        panel34.add(parent17);
        panel34.add(parent1ComboBox7);
        grid7B.add(panel34);
        JPanel panel35 = new JPanel(new FlowLayout());
        panel35.setOpaque(false);
        JLabel parent27 = new JLabel("     Parinte 2: ");
        parent27.setFont(new Font("Serif", Font.PLAIN, 25));
        String parent2[] = new String[parents.size()];
        n = 0;
        for (Parent x : parents) {
            parent2[n] = x.getLastName() + " " + x.getFirstName();
            n++;
        }
        JComboBox parent2ComboBox7 = new JComboBox(parent2);
        parent2ComboBox7.setFont(new Font("Serif", Font.PLAIN, 25));
        parent2ComboBox7.setPreferredSize(d);
        panel35.add(parent27);
        panel35.add(parent2ComboBox7);
        grid7B.add(panel35);
        JPanel panel36 = new JPanel(new FlowLayout());
        panel36.setOpaque(false);
        String faculties[] = new String[university.getFaculty().size()];
        n = 0;
        for (Faculty x : university.getFaculty()) {
            faculties[n] = x.getName();
            n++;
        }
        JLabel uni7 = new JLabel("     Facultate: ");
        uni7.setFont(new Font("Serif", Font.PLAIN, 25));
        JComboBox uniComboBox7 = new JComboBox(faculties);
        uniComboBox7.setFont(new Font("Serif", Font.PLAIN, 25));
        uniComboBox7.setPreferredSize(d);
        panel36.add(uni7);
        panel36.add(uniComboBox7);
        grid7B.add(panel36);
        JPanel panel37 = new JPanel(new FlowLayout());
        panel37.setOpaque(false);
        JLabel dep7 = new JLabel("Specializare: ");
        dep7.setFont(new Font("Serif", Font.PLAIN, 25));
        JComboBox depComboBox7 = new JComboBox();
        depComboBox7.setFont(new Font("Serif", Font.PLAIN, 25));
        depComboBox7.setPreferredSize(d);
        panel37.add(dep7);
        panel37.add(depComboBox7);
        grid7B.add(panel37);

        grid7.add(grid7B);
        panel07.add(grid7);
        createStudent.add(panel07, BorderLayout.NORTH);
        JPanel panel33 = new JPanel(new FlowLayout());
        panel33.setOpaque(false);
        JButton create_stud = new JButton("Creaza");
        create_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        create_stud.setPreferredSize(d2);
        panel33.add(create_stud);
        createStudent.add(panel33, BorderLayout.CENTER);


        //editeaza student
        JPanel editStudent = new JPanel(new BorderLayout());
        editStudent.setOpaque(false);
        JPanel grid8 = new JPanel(new GridLayout(1,2));
        grid8.setOpaque(false);
        JPanel grid8A = new JPanel(new GridLayout(4,1));
        grid8A.setOpaque(false);
        JPanel grid8B = new JPanel(new BorderLayout());
        grid8B.setOpaque(false);
        JPanel grid8C = new JPanel(new FlowLayout());
        grid8C.setOpaque(false);
        JPanel panel39 = new JPanel(new FlowLayout());
        panel39.setOpaque(false);
        JLabel name8 = new JLabel("         Nume: ");
        name8.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName8 = new JTextField();
        textName8.setFont(new Font("Serif", Font.PLAIN, 25));
        textName8.setPreferredSize(d);
        panel39.add(name8);
        panel39.add(textName8);
        grid8A.add(panel39);
        JPanel panel40 = new JPanel(new FlowLayout());
        panel40.setOpaque(false);
        JPanel panel41 = new JPanel(new FlowLayout());
        panel41.setOpaque(false);
        JLabel firstName8 = new JLabel("     Prenume: ");
        firstName8.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textFirstName8 = new JTextField();
        textFirstName8.setFont(new Font("Serif", Font.PLAIN, 25));
        textFirstName8.setPreferredSize(d);
        panel41.add(firstName8);
        panel41.add(textFirstName8);
        grid8A.add(panel41);
        JLabel passw8 = new JLabel("        Parola: ");
        passw8.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPassw8 = new JTextField();
        textPassw8.setFont(new Font("Serif", Font.PLAIN, 25));
        textPassw8.setPreferredSize(d);
        panel40.add(passw8);
        panel40.add(textPassw8);
        grid8A.add(panel40);
        JPanel panel42 = new JPanel(new FlowLayout());
        panel42.setOpaque(false);
        JLabel photoPath8 = new JLabel("Calea pozei: ");
        photoPath8.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textPhotoPath8 = new JTextField();
        textPhotoPath8.setFont(new Font("Serif", Font.PLAIN, 25));
        textPhotoPath8.setPreferredSize(d);
        panel42.add(photoPath8);
        panel42.add(textPhotoPath8);
        grid8A.add(panel42);
        grid8.add(grid8A);
        JButton remove_contract = new JButton("Sterge");
        remove_contract.setFont(new Font("Serif", Font.PLAIN, 25));
        grid8B.add(remove_contract, BorderLayout.NORTH);
        JList contracts8 = new JList();
        contracts8.setFont(new Font("Serif", Font.PLAIN, 20));
        JScrollPane cont8 = new JScrollPane(contracts8);
        cont8.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        cont8.setPreferredSize(new Dimension(100, 100));
        grid8B.add(cont8, BorderLayout.CENTER);
        JButton add_cont = new JButton("Adauga");
        add_cont.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textContract8 = new JTextField();
        textContract8.setFont(new Font("Serif", Font.PLAIN, 25));
        textContract8.setPreferredSize(d);
        grid8C.add(textContract8);
        SpinnerModel val8 = new SpinnerNumberModel(1,  1,  2, 1);
        JSpinner year8 = new JSpinner(val8);
        year8.setFont(new Font("Serif", Font.PLAIN, 25));
        grid8C.add(year8);
        grid8C.add(add_cont);
        grid8B.add(grid8C, BorderLayout.SOUTH);


        grid8.add(grid8B);
        editStudent.add(grid8, BorderLayout.NORTH);
        JPanel panel43 = new JPanel(new FlowLayout());
        panel43.setOpaque(false);
        JButton edit_stud = new JButton("Modifica");
        edit_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        edit_stud.setPreferredSize(d2);
        panel43.add(edit_stud);
        JButton remove_stud = new JButton("Sterge");
        remove_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        remove_stud.setPreferredSize(d2);
        panel43.add(remove_stud);
        editStudent.add(panel43, BorderLayout.CENTER);



        //creaza facultate
        JPanel createFaculty = new JPanel(new BorderLayout());
        createFaculty.setOpaque(false);
        JPanel grid9 = new JPanel(new GridLayout(2,1));
        grid9.setOpaque(false);
        JPanel panel44 = new JPanel(new FlowLayout());
        panel44.setOpaque(false);
        JLabel name9 = new JLabel(" Nume: ");
        name9.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName9 = new JTextField();
        textName9.setFont(new Font("Serif", Font.PLAIN, 25));
        textName9.setPreferredSize(d3);
        panel44.add(name9);
        panel44.add(textName9);
        grid9.add(panel44);
        JPanel panel45 = new JPanel(new FlowLayout());
        panel45.setOpaque(false);
        JLabel teach9 = new JLabel("Decan: ");
        teach9.setFont(new Font("Serif", Font.PLAIN, 25));
        String teacher[] = new String[teachers.size()];
        n = 0;
        for (Teacher x : teachers) {
            teacher[n] = x.getLastName() + " " + x.getFirstName();
            n++;
        }
        JComboBox teacherComboBox9 = new JComboBox(teacher);
        teacherComboBox9.setFont(new Font("Serif", Font.PLAIN, 25));
        teacherComboBox9.setPreferredSize(d3);
        panel45.add(teach9);
        panel45.add(teacherComboBox9);
        grid9.add(panel45);
        createFaculty.add(grid9, BorderLayout.NORTH);

        JPanel panel46 = new JPanel(new FlowLayout());
        panel46.setOpaque(false);
        JButton create_fac = new JButton("Creeaza");
        create_fac.setFont(new Font("Serif", Font.PLAIN, 25));
        create_fac.setPreferredSize(d2);
        panel46.add(create_fac);
        createFaculty.add(panel46, BorderLayout.CENTER);
        panelB.add(createFaculty, BorderLayout.CENTER);



        //editeaza facultate
        JPanel editFaculty = new JPanel(new BorderLayout());
        editFaculty.setOpaque(false);
        JPanel grid10 = new JPanel(new GridLayout(2,1));
        grid10.setOpaque(false);
        JPanel panel47 = new JPanel(new FlowLayout());
        panel47.setOpaque(false);
        JLabel name10 = new JLabel(" Nume: ");
        name10.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName10 = new JTextField();
        textName10.setFont(new Font("Serif", Font.PLAIN, 25));
        textName10.setPreferredSize(d3);
        panel47.add(name10);
        panel47.add(textName10);
        grid10.add(panel47);
        JPanel panel48 = new JPanel(new FlowLayout());
        panel48.setOpaque(false);
        JLabel teach10 = new JLabel("Decan: ");
        teach10.setFont(new Font("Serif", Font.PLAIN, 25));
        JComboBox teacherComboBox10 = new JComboBox(teacher);
        teacherComboBox10.setFont(new Font("Serif", Font.PLAIN, 25));
        teacherComboBox10.setPreferredSize(d3);
        panel48.add(teach10);
        panel48.add(teacherComboBox10);
        grid10.add(panel48);
        editFaculty.add(grid10, BorderLayout.NORTH);

        JPanel panel49 = new JPanel(new FlowLayout());
        panel49.setOpaque(false);
        JButton edit_fac = new JButton("Modifica");
        edit_fac.setFont(new Font("Serif", Font.PLAIN, 25));
        edit_fac.setPreferredSize(d2);
        panel49.add(edit_fac);
        JButton remove_fac = new JButton("Sterge");
        remove_fac.setFont(new Font("Serif", Font.PLAIN, 25));
        remove_fac.setPreferredSize(d2);
        panel49.add(remove_fac);
        editFaculty.add(panel49, BorderLayout.CENTER);
        panelB.add(editFaculty, BorderLayout.CENTER);



        //creaza departament
        JPanel createDepartment = new JPanel(new BorderLayout());
        createDepartment.setOpaque(false);
        JPanel grid11 = new JPanel(new GridLayout(2,1));
        grid11.setOpaque(false);
        JPanel panel50 = new JPanel(new FlowLayout());
        panel50.setOpaque(false);
        JLabel name11 = new JLabel("      Nume: ");
        name11.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName11 = new JTextField();
        textName11.setFont(new Font("Serif", Font.PLAIN, 25));
        textName11.setPreferredSize(d3);
        panel50.add(name11);
        panel50.add(textName11);
        grid11.add(panel50);
        JPanel panel51 = new JPanel(new FlowLayout());
        panel51.setOpaque(false);
        JLabel fac11 = new JLabel("Facultate: ");
        fac11.setFont(new Font("Serif", Font.PLAIN, 25));
        JComboBox facultyComboBox11 = new JComboBox(faculties);
        facultyComboBox11.setFont(new Font("Serif", Font.PLAIN, 25));
        facultyComboBox11.setPreferredSize(d3);
        panel51.add(fac11);
        panel51.add(facultyComboBox11);
        grid11.add(panel51);
        createDepartment.add(grid11, BorderLayout.NORTH);

        JPanel panel52 = new JPanel(new FlowLayout());
        panel52.setOpaque(false);
        JButton create_dep = new JButton("Creeaza");
        create_dep.setFont(new Font("Serif", Font.PLAIN, 25));
        create_dep.setPreferredSize(d2);
        panel52.add(create_dep);
        createDepartment.add(panel52, BorderLayout.CENTER);
        panelB.add(createDepartment, BorderLayout.CENTER);



        //editeaza departament
        JPanel editDepartment = new JPanel(new BorderLayout());
        editDepartment.setOpaque(false);
        JPanel grid12 = new JPanel(new GridLayout(2,1));
        grid12.setOpaque(false);
        JPanel panel53 = new JPanel(new FlowLayout());
        panel53.setOpaque(false);
        JLabel name12 = new JLabel("      Nume: ");
        name12.setFont(new Font("Serif", Font.PLAIN, 25));
        JTextField textName12 = new JTextField();
        textName12.setFont(new Font("Serif", Font.PLAIN, 25));
        textName12.setPreferredSize(d3);
        panel53.add(name12);
        panel53.add(textName12);
        grid12.add(panel53);
        editDepartment.add(grid12, BorderLayout.NORTH);

        JPanel panel55 = new JPanel(new FlowLayout());
        panel55.setOpaque(false);
        JButton edit_dep = new JButton("Modifica");
        edit_dep.setFont(new Font("Serif", Font.PLAIN, 25));
        edit_dep.setPreferredSize(d2);
        panel55.add(edit_dep);
        JButton remove_dep = new JButton("Sterge");
        remove_dep.setFont(new Font("Serif", Font.PLAIN, 25));
        remove_dep.setPreferredSize(d2);
        panel55.add(remove_dep);
        editDepartment.add(panel55, BorderLayout.CENTER);
        panelB.add(editDepartment, BorderLayout.CENTER);



        JPanel panel0 = new JPanel(new FlowLayout());
        panel0.setOpaque(false);
        JLabel label = new JLabel("Declinarea responsabilitati: Orice corelatie a numelor persoanelor reale cu a celor din aplicatie este pur intamplatoare");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(new Color(80,80,80));
        panel0.add(new JLabel("                                        "));
        panel0.add(label);
        JButton day_night = new JButton("\uD83D\uDD06");
        day_night.setBackground(Color.black);
        day_night.setForeground(Color.white);
        Dimension d4 = new Dimension(50, 20);
        day_night.setPreferredSize(d4);
        day_night.setHorizontalAlignment(JButton.LEFT);
        panel0.add(new JLabel("                                  "));
        panel0.add(day_night);
        pane.add(panel0, BorderLayout.PAGE_END);

        createStudent.setVisible(false);
        createTeacher.setVisible(false);
        createAssistant.setVisible(false);
        createParent.setVisible(false);
        editStudent.setVisible(false);
        editTeacher.setVisible(false);
        editAssistant.setVisible(false);
        editParent.setVisible(false);
        createFaculty.setVisible(false);
        createDepartment.setVisible(false);
        editFaculty.setVisible(false);
        editDepartment.setVisible(false);
        panelAA.add(createStudent);
        panelAA.add(createTeacher);
        panelAA.add(createAssistant);
        panelAA.add(createParent);
        panelAA.add(editStudent);
        panelAA.add(editTeacher);
        panelAA.add(editAssistant);
        panelAA.add(editParent);
        panelA.add(panelAA, BorderLayout.CENTER);
        panelBB.add(createFaculty);
        panelBB.add(createDepartment);
        panelBB.add(editFaculty);
        panelBB.add(editDepartment);
        panelB.add(panelBB, BorderLayout.CENTER);





        frame.setVisible(true);
        frame.setSize(1000,635);
        frame.setLocationRelativeTo(null);




        if(button_text.equals("\uD83D\uDD06")) {
            day_night.setText("\uD83D\uDD06");
            day_night.setBackground(Color.BLACK);
            day_night.setForeground(Color.WHITE);
            label.setForeground(new Color(60,60,60));
            frame.setBackground(Color.darkGray);
            pane.setBackground(Color.darkGray);


            tp.setBackground(Color.BLACK);
            tp.setForeground(Color.WHITE);
            panelA.setBackground(new Color(80,80,80));
            panelB.setBackground(new Color(80,80,80));
            panelAA.setBackground(new Color(80,80,80));
            panelBB.setBackground(new Color(80,80,80));

            name1.setForeground(Color.WHITE);
            name2.setForeground(Color.WHITE);
            name3.setForeground(Color.WHITE);
            name4.setForeground(Color.WHITE);
            name5.setForeground(Color.WHITE);
            name6.setForeground(Color.WHITE);
            name7.setForeground(Color.WHITE);
            name8.setForeground(Color.WHITE);
            name9.setForeground(Color.WHITE);
            name10.setForeground(Color.WHITE);
            name11.setForeground(Color.WHITE);
            name12.setForeground(Color.WHITE);
            firstName1.setForeground(Color.WHITE);
            firstName2.setForeground(Color.WHITE);
            firstName3.setForeground(Color.WHITE);
            firstName4.setForeground(Color.WHITE);
            firstName5.setForeground(Color.WHITE);
            firstName6.setForeground(Color.WHITE);
            firstName7.setForeground(Color.WHITE);
            firstName8.setForeground(Color.WHITE);
            passw1.setForeground(Color.WHITE);
            passw2.setForeground(Color.WHITE);
            passw3.setForeground(Color.WHITE);
            passw4.setForeground(Color.WHITE);
            passw5.setForeground(Color.WHITE);
            passw6.setForeground(Color.WHITE);
            passw7.setForeground(Color.WHITE);
            passw8.setForeground(Color.WHITE);
            CNP1.setForeground(Color.WHITE);
            CNP3.setForeground(Color.WHITE);
            CNP5.setForeground(Color.WHITE);
            CNP7.setForeground(Color.WHITE);
            email5.setForeground(Color.WHITE);
            email6.setForeground(Color.WHITE);
            photoPath3.setForeground(Color.WHITE);
            photoPath4.setForeground(Color.WHITE);
            photoPath7.setForeground(Color.WHITE);
            photoPath8.setForeground(Color.WHITE);
            parent17.setForeground(Color.WHITE);
            parent27.setForeground(Color.WHITE);
            uni7.setForeground(Color.WHITE);
            dep7.setForeground(Color.WHITE);
            teach9.setForeground(Color.WHITE);
            teach10.setForeground(Color.WHITE);
            contracts8.setForeground(Color.WHITE);
            fac11.setForeground(Color.WHITE);


            comboBox1A.setForeground(Color.WHITE);
            comboBox1B.setForeground(Color.WHITE);
            comboBox2A.setForeground(Color.WHITE);
            comboBox2B.setForeground(Color.WHITE);
            comboBox3A.setForeground(Color.WHITE);
            comboBox3B.setForeground(Color.WHITE);
            parent1ComboBox7.setForeground(Color.WHITE);
            parent2ComboBox7.setForeground(Color.WHITE);
            depComboBox7.setForeground(Color.WHITE);
            uniComboBox7.setForeground(Color.WHITE);
            facultyComboBox11.setForeground(Color.WHITE);
            teacherComboBox9.setForeground(Color.WHITE);
            teacherComboBox10.setForeground(Color.WHITE);
            check1A.setForeground(Color.WHITE);
            check2A.setForeground(Color.WHITE);
            check3A.setForeground(Color.WHITE);
            check3B.setForeground(Color.WHITE);
            check2B.setForeground(Color.WHITE);
            check1B.setForeground(Color.WHITE);
            add_cont.setForeground(Color.WHITE);
            add_assi.setForeground(Color.WHITE);
            create_parent.setForeground(Color.WHITE);
            create_teach.setForeground(Color.WHITE);
            create_stud.setForeground(Color.WHITE);
            create_dep.setForeground(Color.WHITE);
            create_fac.setForeground(Color.WHITE);
            remove_contract.setForeground(Color.WHITE);
            remove_assi.setForeground(Color.WHITE);
            remove_parent.setForeground(Color.WHITE);
            remove_teach.setForeground(Color.WHITE);
            remove_stud.setForeground(Color.WHITE);
            remove_dep.setForeground(Color.WHITE);
            remove_fac.setForeground(Color.WHITE);
            edit_assi.setForeground(Color.WHITE);
            edit_parent.setForeground(Color.WHITE);
            edit_teach.setForeground(Color.WHITE);
            edit_stud.setForeground(Color.WHITE);
            edit_dep.setForeground(Color.WHITE);
            edit_fac.setForeground(Color.WHITE);
            observer.setForeground(Color.WHITE);

            contracts8.setBackground(new Color(80,80,80));
            cont8.getViewport().setBackground(new Color(80,80,80));
            comboBox1A.setBackground(new Color(80,80,80));
            comboBox1B.setBackground(new Color(80,80,80));
            comboBox2A.setBackground(new Color(80,80,80));
            comboBox2B.setBackground(new Color(80,80,80));
            comboBox3A.setBackground(new Color(80,80,80));
            comboBox3B.setBackground(new Color(80,80,80));
            parent1ComboBox7.setBackground(new Color(80,80,80));
            parent2ComboBox7.setBackground(new Color(80,80,80));
            depComboBox7.setBackground(new Color(80,80,80));
            uniComboBox7.setBackground(new Color(80,80,80));
            facultyComboBox11.setBackground(new Color(80,80,80));
            teacherComboBox9.setBackground(new Color(80,80,80));
            teacherComboBox10.setBackground(new Color(80,80,80));
            check1A.setBackground(Color.BLACK);
            check2A.setBackground(Color.BLACK);
            check3A.setBackground(Color.BLACK);
            check3B.setBackground(Color.BLACK);
            check2B.setBackground(Color.BLACK);
            check1B.setBackground(Color.BLACK);
            add_cont.setBackground(Color.BLACK);
            add_assi.setBackground(Color.BLACK);
            create_parent.setBackground(Color.BLACK);
            create_teach.setBackground(Color.BLACK);
            create_stud.setBackground(Color.BLACK);
            create_dep.setBackground(Color.BLACK);
            create_fac.setBackground(Color.BLACK);
            remove_contract.setBackground(Color.BLACK);
            remove_assi.setBackground(Color.BLACK);
            remove_parent.setBackground(Color.BLACK);
            remove_teach.setBackground(Color.BLACK);
            remove_stud.setBackground(Color.BLACK);
            remove_dep.setBackground(Color.BLACK);
            remove_fac.setBackground(Color.BLACK);
            edit_assi.setBackground(Color.BLACK);
            edit_parent.setBackground(Color.BLACK);
            edit_teach.setBackground(Color.BLACK);
            edit_stud.setBackground(Color.BLACK);
            edit_dep.setBackground(Color.BLACK);
            edit_fac.setBackground(Color.BLACK);
            observer.setBackground(Color.BLACK);

        }
        else{
            day_night.setText("\uD83C\uDF19");
            day_night.setBackground(Color.lightGray);
            day_night.setForeground(Color.BLACK);
            label.setForeground(new Color(240,240,240));
            frame.setBackground(Color.white);
            pane.setBackground(Color.white);


            tp.setBackground(Color.lightGray);
            tp.setForeground(Color.BLACK);
            panelA.setBackground(new Color(238,238,238));
            panelB.setBackground(new Color(238,238,238));
            panelAA.setBackground(new Color(238,238,238));
            panelBB.setBackground(new Color(238,238,238));

            name1.setForeground(Color.BLACK);
            name2.setForeground(Color.BLACK);
            name3.setForeground(Color.BLACK);
            name4.setForeground(Color.BLACK);
            name5.setForeground(Color.BLACK);
            name6.setForeground(Color.BLACK);
            name7.setForeground(Color.BLACK);
            name8.setForeground(Color.BLACK);
            name9.setForeground(Color.BLACK);
            name10.setForeground(Color.BLACK);
            name11.setForeground(Color.BLACK);
            name12.setForeground(Color.BLACK);
            firstName1.setForeground(Color.BLACK);
            firstName2.setForeground(Color.BLACK);
            firstName3.setForeground(Color.BLACK);
            firstName4.setForeground(Color.BLACK);
            firstName5.setForeground(Color.BLACK);
            firstName6.setForeground(Color.BLACK);
            firstName7.setForeground(Color.BLACK);
            firstName8.setForeground(Color.BLACK);
            passw1.setForeground(Color.BLACK);
            passw2.setForeground(Color.BLACK);
            passw3.setForeground(Color.BLACK);
            passw4.setForeground(Color.BLACK);
            passw5.setForeground(Color.BLACK);
            passw6.setForeground(Color.BLACK);
            passw7.setForeground(Color.BLACK);
            passw8.setForeground(Color.BLACK);
            CNP1.setForeground(Color.BLACK);
            CNP3.setForeground(Color.BLACK);
            CNP5.setForeground(Color.BLACK);
            CNP7.setForeground(Color.BLACK);
            email5.setForeground(Color.BLACK);
            email6.setForeground(Color.BLACK);
            photoPath3.setForeground(Color.BLACK);
            photoPath4.setForeground(Color.BLACK);
            photoPath7.setForeground(Color.BLACK);
            photoPath8.setForeground(Color.BLACK);
            parent17.setForeground(Color.BLACK);
            parent27.setForeground(Color.BLACK);
            uni7.setForeground(Color.BLACK);
            dep7.setForeground(Color.BLACK);
            teach9.setForeground(Color.BLACK);
            teach10.setForeground(Color.BLACK);
            contracts8.setForeground(Color.BLACK);
            fac11.setForeground(Color.BLACK);

            comboBox1A.setForeground(Color.BLACK);
            comboBox1B.setForeground(Color.BLACK);
            comboBox2A.setForeground(Color.BLACK);
            comboBox2B.setForeground(Color.BLACK);
            comboBox3A.setForeground(Color.BLACK);
            comboBox3B.setForeground(Color.BLACK);
            parent1ComboBox7.setForeground(Color.BLACK);
            parent2ComboBox7.setForeground(Color.BLACK);
            depComboBox7.setForeground(Color.BLACK);
            uniComboBox7.setForeground(Color.BLACK);
            facultyComboBox11.setForeground(Color.BLACK);
            teacherComboBox9.setForeground(Color.BLACK);
            teacherComboBox10.setForeground(Color.BLACK);
            check1A.setForeground(Color.BLACK);
            check2A.setForeground(Color.BLACK);
            check3A.setForeground(Color.BLACK);
            check3B.setForeground(Color.BLACK);
            check2B.setForeground(Color.BLACK);
            check1B.setForeground(Color.BLACK);
            add_cont.setForeground(Color.BLACK);
            add_assi.setForeground(Color.BLACK);
            create_parent.setForeground(Color.BLACK);
            create_teach.setForeground(Color.BLACK);
            create_stud.setForeground(Color.BLACK);
            create_dep.setForeground(Color.BLACK);
            create_fac.setForeground(Color.BLACK);
            remove_contract.setForeground(Color.BLACK);
            remove_assi.setForeground(Color.BLACK);
            remove_parent.setForeground(Color.BLACK);
            remove_teach.setForeground(Color.BLACK);
            remove_stud.setForeground(Color.BLACK);
            remove_dep.setForeground(Color.BLACK);
            remove_fac.setForeground(Color.BLACK);
            edit_assi.setForeground(Color.BLACK);
            edit_parent.setForeground(Color.BLACK);
            edit_teach.setForeground(Color.BLACK);
            edit_stud.setForeground(Color.BLACK);
            edit_dep.setForeground(Color.BLACK);
            edit_fac.setForeground(Color.BLACK);
            observer.setForeground(Color.BLACK);

            contracts8.setBackground(new Color(238,238,238));
            cont8.getViewport().setBackground(new Color(238,238,238));
            comboBox1A.setBackground(new Color(238,238,238));
            comboBox1B.setBackground(new Color(238,238,238));
            comboBox2A.setBackground(new Color(238,238,238));
            comboBox2B.setBackground(new Color(238,238,238));
            comboBox3A.setBackground(new Color(238,238,238));
            comboBox3B.setBackground(new Color(238,238,238));
            parent1ComboBox7.setBackground(new Color(238,238,238));
            parent2ComboBox7.setBackground(new Color(238,238,238));
            depComboBox7.setBackground(new Color(238,238,238));
            uniComboBox7.setBackground(new Color(238,238,238));
            facultyComboBox11.setBackground(new Color(238,238,238));
            teacherComboBox9.setBackground(new Color(238,238,238));
            teacherComboBox10.setBackground(new Color(238,238,238));
            check1A.setBackground(Color.lightGray);
            check2A.setBackground(Color.lightGray);
            check3A.setBackground(Color.lightGray);
            check3B.setBackground(Color.lightGray);
            check2B.setBackground(Color.lightGray);
            check1B.setBackground(Color.lightGray);
            add_cont.setBackground(Color.lightGray);
            add_assi.setBackground(Color.lightGray);
            create_parent.setBackground(Color.lightGray);
            create_teach.setBackground(Color.lightGray);
            create_stud.setBackground(Color.lightGray);
            create_dep.setBackground(Color.lightGray);
            create_fac.setBackground(Color.lightGray);
            remove_contract.setBackground(Color.lightGray);
            remove_assi.setBackground(Color.lightGray);
            remove_parent.setBackground(Color.lightGray);
            remove_teach.setBackground(Color.lightGray);
            remove_stud.setBackground(Color.lightGray);
            remove_dep.setBackground(Color.lightGray);
            remove_fac.setBackground(Color.lightGray);
            edit_assi.setBackground(Color.lightGray);
            edit_parent.setBackground(Color.lightGray);
            edit_teach.setBackground(Color.lightGray);
            edit_stud.setBackground(Color.lightGray);
            edit_dep.setBackground(Color.lightGray);
            edit_fac.setBackground(Color.lightGray);
            observer.setBackground(Color.lightGray);

        }

        comboBox1A.setVisible(false);
        comboBox3A.setVisible(false);
        check1A.setVisible(false);
        check3A.setVisible(false);
        comboBox1B.setVisible(false);
        comboBox3B.setVisible(false);
        check1B.setVisible(false);
        check3B.setVisible(false);


        frame.setVisible(true);
        frame.setSize(1000,635);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        day_night.addActionListener(e -> {
            if(day_night.getText().equals("\uD83D\uDD06")) {
                day_night.setText("\uD83C\uDF19");
                day_night.setBackground(Color.lightGray);
                day_night.setForeground(Color.BLACK);
                label.setForeground(new Color(240,240,240));
                frame.setBackground(Color.white);
                pane.setBackground(Color.white);

                tp.setBackground(Color.lightGray);
                tp.setForeground(Color.BLACK);
                panelA.setBackground(new Color(238,238,238));
                panelB.setBackground(new Color(238,238,238));
                panelAA.setBackground(new Color(238,238,238));
                panelBB.setBackground(new Color(238,238,238));

                name1.setForeground(Color.BLACK);
                name2.setForeground(Color.BLACK);
                name3.setForeground(Color.BLACK);
                name4.setForeground(Color.BLACK);
                name5.setForeground(Color.BLACK);
                name6.setForeground(Color.BLACK);
                name7.setForeground(Color.BLACK);
                name8.setForeground(Color.BLACK);
                name9.setForeground(Color.BLACK);
                name10.setForeground(Color.BLACK);
                name11.setForeground(Color.BLACK);
                name12.setForeground(Color.BLACK);
                firstName1.setForeground(Color.BLACK);
                firstName2.setForeground(Color.BLACK);
                firstName3.setForeground(Color.BLACK);
                firstName4.setForeground(Color.BLACK);
                firstName5.setForeground(Color.BLACK);
                firstName6.setForeground(Color.BLACK);
                firstName7.setForeground(Color.BLACK);
                firstName8.setForeground(Color.BLACK);
                passw1.setForeground(Color.BLACK);
                passw2.setForeground(Color.BLACK);
                passw3.setForeground(Color.BLACK);
                passw4.setForeground(Color.BLACK);
                passw5.setForeground(Color.BLACK);
                passw6.setForeground(Color.BLACK);
                passw7.setForeground(Color.BLACK);
                passw8.setForeground(Color.BLACK);
                CNP1.setForeground(Color.BLACK);
                CNP3.setForeground(Color.BLACK);
                CNP5.setForeground(Color.BLACK);
                CNP7.setForeground(Color.BLACK);
                email5.setForeground(Color.BLACK);
                email6.setForeground(Color.BLACK);
                photoPath3.setForeground(Color.BLACK);
                photoPath4.setForeground(Color.BLACK);
                photoPath7.setForeground(Color.BLACK);
                photoPath8.setForeground(Color.BLACK);
                parent17.setForeground(Color.BLACK);
                parent27.setForeground(Color.BLACK);
                uni7.setForeground(Color.BLACK);
                dep7.setForeground(Color.BLACK);
                teach9.setForeground(Color.BLACK);
                teach10.setForeground(Color.BLACK);
                contracts8.setForeground(Color.BLACK);
                fac11.setForeground(Color.BLACK);

                comboBox1A.setForeground(Color.BLACK);
                comboBox1B.setForeground(Color.BLACK);
                comboBox2A.setForeground(Color.BLACK);
                comboBox2B.setForeground(Color.BLACK);
                comboBox3A.setForeground(Color.BLACK);
                comboBox3B.setForeground(Color.BLACK);
                parent1ComboBox7.setForeground(Color.BLACK);
                parent2ComboBox7.setForeground(Color.BLACK);
                depComboBox7.setForeground(Color.BLACK);
                uniComboBox7.setForeground(Color.BLACK);
                facultyComboBox11.setForeground(Color.BLACK);
                teacherComboBox9.setForeground(Color.BLACK);
                teacherComboBox10.setForeground(Color.BLACK);
                check1A.setForeground(Color.BLACK);
                check2A.setForeground(Color.BLACK);
                check3A.setForeground(Color.BLACK);
                check3B.setForeground(Color.BLACK);
                check2B.setForeground(Color.BLACK);
                check1B.setForeground(Color.BLACK);
                add_cont.setForeground(Color.BLACK);
                add_assi.setForeground(Color.BLACK);
                create_parent.setForeground(Color.BLACK);
                create_teach.setForeground(Color.BLACK);
                create_stud.setForeground(Color.BLACK);
                create_dep.setForeground(Color.BLACK);
                create_fac.setForeground(Color.BLACK);
                remove_contract.setForeground(Color.BLACK);
                remove_assi.setForeground(Color.BLACK);
                remove_parent.setForeground(Color.BLACK);
                remove_teach.setForeground(Color.BLACK);
                remove_stud.setForeground(Color.BLACK);
                remove_dep.setForeground(Color.BLACK);
                remove_fac.setForeground(Color.BLACK);
                edit_assi.setForeground(Color.BLACK);
                edit_parent.setForeground(Color.BLACK);
                edit_teach.setForeground(Color.BLACK);
                edit_stud.setForeground(Color.BLACK);
                edit_dep.setForeground(Color.BLACK);
                edit_fac.setForeground(Color.BLACK);
                observer.setForeground(Color.BLACK);

                contracts8.setBackground(new Color(238,238,238));
                cont8.getViewport().setBackground(new Color(238,238,238));
                comboBox1A.setBackground(new Color(238,238,238));
                comboBox1B.setBackground(new Color(238,238,238));
                comboBox2A.setBackground(new Color(238,238,238));
                comboBox2B.setBackground(new Color(238,238,238));
                comboBox3A.setBackground(new Color(238,238,238));
                comboBox3B.setBackground(new Color(238,238,238));
                parent1ComboBox7.setBackground(new Color(238,238,238));
                parent2ComboBox7.setBackground(new Color(238,238,238));
                depComboBox7.setBackground(new Color(238,238,238));
                uniComboBox7.setBackground(new Color(238,238,238));
                facultyComboBox11.setBackground(new Color(238,238,238));
                teacherComboBox9.setBackground(new Color(238,238,238));
                teacherComboBox10.setBackground(new Color(238,238,238));
                check1A.setBackground(Color.lightGray);
                check2A.setBackground(Color.lightGray);
                check3A.setBackground(Color.lightGray);
                check3B.setBackground(Color.lightGray);
                check2B.setBackground(Color.lightGray);
                check1B.setBackground(Color.lightGray);
                add_cont.setBackground(Color.lightGray);
                add_assi.setBackground(Color.lightGray);
                create_parent.setBackground(Color.lightGray);
                create_teach.setBackground(Color.lightGray);
                create_stud.setBackground(Color.lightGray);
                create_dep.setBackground(Color.lightGray);
                create_fac.setBackground(Color.lightGray);
                remove_contract.setBackground(Color.lightGray);
                remove_assi.setBackground(Color.lightGray);
                remove_parent.setBackground(Color.lightGray);
                remove_teach.setBackground(Color.lightGray);
                remove_stud.setBackground(Color.lightGray);
                remove_dep.setBackground(Color.lightGray);
                remove_fac.setBackground(Color.lightGray);
                edit_assi.setBackground(Color.lightGray);
                edit_parent.setBackground(Color.lightGray);
                edit_teach.setBackground(Color.lightGray);
                edit_stud.setBackground(Color.lightGray);
                edit_dep.setBackground(Color.lightGray);
                edit_fac.setBackground(Color.lightGray);
                observer.setBackground(Color.lightGray);

            }
            else{
                day_night.setText("\uD83D\uDD06");
                day_night.setBackground(Color.BLACK);
                day_night.setForeground(Color.WHITE);
                label.setForeground(new Color(60,60,60));
                frame.setBackground(Color.darkGray);
                pane.setBackground(Color.darkGray);

                tp.setBackground(Color.BLACK);
                tp.setForeground(Color.WHITE);
                panelA.setBackground(new Color(80,80,80));
                panelB.setBackground(new Color(80,80,80));
                panelAA.setBackground(new Color(80,80,80));
                panelBB.setBackground(new Color(80,80,80));

                name1.setForeground(Color.WHITE);
                name2.setForeground(Color.WHITE);
                name3.setForeground(Color.WHITE);
                name4.setForeground(Color.WHITE);
                name5.setForeground(Color.WHITE);
                name6.setForeground(Color.WHITE);
                name7.setForeground(Color.WHITE);
                name8.setForeground(Color.WHITE);
                name9.setForeground(Color.WHITE);
                name10.setForeground(Color.WHITE);
                name11.setForeground(Color.WHITE);
                name12.setForeground(Color.WHITE);
                firstName1.setForeground(Color.WHITE);
                firstName2.setForeground(Color.WHITE);
                firstName3.setForeground(Color.WHITE);
                firstName4.setForeground(Color.WHITE);
                firstName5.setForeground(Color.WHITE);
                firstName6.setForeground(Color.WHITE);
                firstName7.setForeground(Color.WHITE);
                firstName8.setForeground(Color.WHITE);
                passw1.setForeground(Color.WHITE);
                passw2.setForeground(Color.WHITE);
                passw3.setForeground(Color.WHITE);
                passw4.setForeground(Color.WHITE);
                passw5.setForeground(Color.WHITE);
                passw6.setForeground(Color.WHITE);
                passw7.setForeground(Color.WHITE);
                passw8.setForeground(Color.WHITE);
                CNP1.setForeground(Color.WHITE);
                CNP3.setForeground(Color.WHITE);
                CNP5.setForeground(Color.WHITE);
                CNP7.setForeground(Color.WHITE);
                email5.setForeground(Color.WHITE);
                email6.setForeground(Color.WHITE);
                photoPath3.setForeground(Color.WHITE);
                photoPath4.setForeground(Color.WHITE);
                photoPath7.setForeground(Color.WHITE);
                photoPath8.setForeground(Color.WHITE);
                parent17.setForeground(Color.WHITE);
                parent27.setForeground(Color.WHITE);
                uni7.setForeground(Color.WHITE);
                dep7.setForeground(Color.WHITE);
                teach9.setForeground(Color.WHITE);
                teach10.setForeground(Color.WHITE);
                contracts8.setForeground(Color.WHITE);
                fac11.setForeground(Color.WHITE);

                comboBox1A.setForeground(Color.WHITE);
                comboBox1B.setForeground(Color.WHITE);
                comboBox2A.setForeground(Color.WHITE);
                comboBox2B.setForeground(Color.WHITE);
                comboBox3A.setForeground(Color.WHITE);
                comboBox3B.setForeground(Color.WHITE);
                parent1ComboBox7.setForeground(Color.WHITE);
                parent2ComboBox7.setForeground(Color.WHITE);
                depComboBox7.setForeground(Color.WHITE);
                uniComboBox7.setForeground(Color.WHITE);
                facultyComboBox11.setForeground(Color.WHITE);
                teacherComboBox9.setForeground(Color.WHITE);
                teacherComboBox10.setForeground(Color.WHITE);
                check1A.setForeground(Color.WHITE);
                check2A.setForeground(Color.WHITE);
                check3A.setForeground(Color.WHITE);
                check3B.setForeground(Color.WHITE);
                check2B.setForeground(Color.WHITE);
                check1B.setForeground(Color.WHITE);
                add_cont.setForeground(Color.WHITE);
                add_assi.setForeground(Color.WHITE);
                create_parent.setForeground(Color.WHITE);
                create_teach.setForeground(Color.WHITE);
                create_stud.setForeground(Color.WHITE);
                create_dep.setForeground(Color.WHITE);
                create_fac.setForeground(Color.WHITE);
                remove_contract.setForeground(Color.WHITE);
                remove_assi.setForeground(Color.WHITE);
                remove_parent.setForeground(Color.WHITE);
                remove_teach.setForeground(Color.WHITE);
                remove_stud.setForeground(Color.WHITE);
                remove_dep.setForeground(Color.WHITE);
                remove_fac.setForeground(Color.WHITE);
                edit_assi.setForeground(Color.WHITE);
                edit_parent.setForeground(Color.WHITE);
                edit_teach.setForeground(Color.WHITE);
                edit_stud.setForeground(Color.WHITE);
                edit_dep.setForeground(Color.WHITE);
                edit_fac.setForeground(Color.WHITE);
                observer.setForeground(Color.WHITE);

                contracts8.setBackground(new Color(80,80,80));
                cont8.getViewport().setBackground(new Color(80,80,80));
                comboBox1A.setBackground(new Color(80,80,80));
                comboBox1B.setBackground(new Color(80,80,80));
                comboBox2A.setBackground(new Color(80,80,80));
                comboBox2B.setBackground(new Color(80,80,80));
                comboBox3A.setBackground(new Color(80,80,80));
                comboBox3B.setBackground(new Color(80,80,80));
                parent1ComboBox7.setBackground(new Color(80,80,80));
                parent2ComboBox7.setBackground(new Color(80,80,80));
                depComboBox7.setBackground(new Color(80,80,80));
                uniComboBox7.setBackground(new Color(80,80,80));
                facultyComboBox11.setBackground(new Color(80,80,80));
                teacherComboBox9.setBackground(new Color(80,80,80));
                teacherComboBox10.setBackground(new Color(80,80,80));
                check1A.setBackground(Color.BLACK);
                check2A.setBackground(Color.BLACK);
                check3A.setBackground(Color.BLACK);
                check3B.setBackground(Color.BLACK);
                check2B.setBackground(Color.BLACK);
                check1B.setBackground(Color.BLACK);
                add_cont.setBackground(Color.BLACK);
                add_assi.setBackground(Color.BLACK);
                create_parent.setBackground(Color.BLACK);
                create_teach.setBackground(Color.BLACK);
                create_stud.setBackground(Color.BLACK);
                create_dep.setBackground(Color.BLACK);
                create_fac.setBackground(Color.BLACK);
                remove_contract.setBackground(Color.BLACK);
                remove_assi.setBackground(Color.BLACK);
                remove_parent.setBackground(Color.BLACK);
                remove_teach.setBackground(Color.BLACK);
                remove_stud.setBackground(Color.BLACK);
                remove_dep.setBackground(Color.BLACK);
                remove_fac.setBackground(Color.BLACK);
                edit_assi.setBackground(Color.BLACK);
                edit_parent.setBackground(Color.BLACK);
                edit_teach.setBackground(Color.BLACK);
                edit_stud.setBackground(Color.BLACK);
                edit_dep.setBackground(Color.BLACK);
                edit_fac.setBackground(Color.BLACK);
                observer.setBackground(Color.BLACK);

            }
        });



        comboBox2A.addActionListener(e->{
            comboBox1A.setVisible(false);
            comboBox3A.setVisible(false);
            check1A.setVisible(false);
            check3A.setVisible(false);
            createStudent.setVisible(false);
            createTeacher.setVisible(false);
            createAssistant.setVisible(false);
            createParent.setVisible(false);
            editStudent.setVisible(false);
            editTeacher.setVisible(false);
            editAssistant.setVisible(false);
            editParent.setVisible(false);

        });

        check2A.addActionListener(e->{
            comboBox1A.setVisible(true);
            check1A.setVisible(true);
        });

        comboBox1A.addActionListener(e->{
            comboBox3A.setVisible(false);
            check3A.setVisible(false);
            createStudent.setVisible(false);
            createTeacher.setVisible(false);
            createAssistant.setVisible(false);
            createParent.setVisible(false);
            editStudent.setVisible(false);
            editTeacher.setVisible(false);
            editAssistant.setVisible(false);
            editParent.setVisible(false);

        });

        check1A.addActionListener(e->{
            if(String.valueOf(comboBox1A.getItemAt(comboBox1A.getSelectedIndex())).equals("Modificare")) {
                comboBox3A.setVisible(true);
                check3A.setVisible(true);
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Student")){
                    String student[] = new String[students.size()];
                    int i = 0;
                    for (Student x : students) {
                        student[i] = x.getLastName() + " " + x.getFirstName();
                        i++;
                    }
                    int x = i;
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    for(i=0; i<x; i++)
                        model.addElement(student[i]);
                    comboBox3A.setModel(model);
                }
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Profesor")){
                    String teacher2[] = new String[teachers.size()];
                    int i = 0;
                    for (Teacher x : teachers) {
                        teacher2[i] = x.getLastName() + " " + x.getFirstName();
                        i++;
                    }
                    int x = i;
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    for(i=0; i<x; i++)
                        model.addElement(teacher2[i]);
                    comboBox3A.setModel(model);
                }
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Asistent")){
                    String assistant[] = new String[assistants.size()];
                    int i = 0;
                    for (Assistant x : assistants) {
                        assistant[i] = x.getLastName() + " " + x.getFirstName();
                        i++;
                    }
                    int x = i;
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    for(i=0; i<x; i++)
                        model.addElement(assistant[i]);
                    comboBox3A.setModel(model);
                }
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Parinte")){
                    String parent[] = new String[parents.size()];
                    int i = 0;
                    for (Parent x : parents) {
                        parent[i] = x.getLastName() + " " + x.getFirstName();
                        i++;
                    }
                    int x = i;
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    for(i=0; i<x; i++)
                        model.addElement(parent[i]);
                    comboBox3A.setModel(model);
                }
            }
            else {
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Student")){
                    createStudent.setVisible(true);
                }
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Profesor")){
                    createTeacher.setVisible(true);
                }
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Asistent")){
                    createAssistant.setVisible(true);
                }
                if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Parinte")){
                    createParent.setVisible(true);
                }
            }
        });

        comboBox3A.addActionListener(e->{
            createStudent.setVisible(false);
            createTeacher.setVisible(false);
            createAssistant.setVisible(false);
            createParent.setVisible(false);
            editStudent.setVisible(false);
            editTeacher.setVisible(false);
            editAssistant.setVisible(false);
            editParent.setVisible(false);

        });

        check3A.addActionListener(e->{
            if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Student")){
                editStudent.setVisible(true);
                for (Student i : students) {
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                        textName8.setText(i.getLastName());
                        textFirstName8.setText(i.getFirstName());
                        textPassw8.setText("");
                        textPhotoPath8.setText(i.getPath());
                        String contract[] = new String[i.getContracts().size()];
                        int x=0;
                        for(Contract j : i.getContracts()) {
                            contract[x] = "Contract anul " + j.getYear();
                            x++;
                        }
                        int y=x;
                        DefaultListModel model = new DefaultListModel();
                        for(x=0; x<y; x++)
                            model.addElement(contract[x]);
                        contracts8.setModel(model);

                    }
                }
            }
            if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Profesor")){
                editTeacher.setVisible(true);
                for (Teacher i : teachers) {
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                        textName4.setText(i.getLastName());
                        textFirstName4.setText(i.getFirstName());
                        textPassw4.setText("");
                        textPhotoPath4.setText(i.getPath());
                    }
                }
            }
            if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Asistent")){
                editAssistant.setVisible(true);
                for (Assistant i : assistants) {
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                        textName2.setText(i.getLastName());
                        textFirstName2.setText(i.getFirstName());
                        textPassw2.setText("");
                    }
                }
            }
            if(String.valueOf(comboBox2A.getItemAt(comboBox2A.getSelectedIndex())).equals("Parinte")){
                editParent.setVisible(true);
                for (Parent i : parents) {
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                        textName6.setText(i.getLastName());
                        textFirstName6.setText(i.getFirstName());
                        textPassw6.setText("");
                        textEmail6.setText(i.getEmail());

                    }
                }
                boolean ok = false;
                for(Observer i : university.getCatalog().getObservers())
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(((Parent)i).getLastName() + " " + ((Parent)i).getFirstName())) {
                        observer.setText("Dezaboneaza");
                        ok = true;
                    }
                if(!ok) {
                    observer.setText("Aboneaza");
                }
            }
        });




        comboBox2B.addActionListener(e->{
            comboBox1B.setVisible(false);
            comboBox3B.setVisible(false);
            check1B.setVisible(false);
            check3B.setVisible(false);
            createFaculty.setVisible(false);
            createDepartment.setVisible(false);
            editFaculty.setVisible(false);
            editDepartment.setVisible(false);
        });

        check2B.addActionListener(e->{
            comboBox1B.setVisible(true);
            check1B.setVisible(true);
        });

        comboBox1B.addActionListener(e->{
            comboBox3B.setVisible(false);
            check3B.setVisible(false);
            createFaculty.setVisible(false);
            createDepartment.setVisible(false);
            editFaculty.setVisible(false);
            editDepartment.setVisible(false);
        });

        check1B.addActionListener(e->{
            if(String.valueOf(comboBox1B.getItemAt(comboBox1B.getSelectedIndex())).equals("Modificare")) {
                comboBox3B.setVisible(true);
                check3B.setVisible(true);
                if(String.valueOf(comboBox2B.getItemAt(comboBox2B.getSelectedIndex())).equals("Facultate")){
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    int i;
                    for(i=0; i<university.getFaculty().size(); i++)
                        model.addElement(faculties[i]);
                    comboBox3B.setModel(model);
                }
                if(String.valueOf(comboBox2B.getItemAt(comboBox2B.getSelectedIndex())).equals("Departament")){
                    String deps[] = new String[university.getDepartments().size()];
                    int i = 0;
                    for (Department x : university.getDepartments()) {
                        deps[i] = x.getName();
                        i++;
                    }
                    int x = i;
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    for(i=0; i<x; i++)
                        model.addElement(deps[i]);
                    comboBox3B.setModel(model);
                }
            }
            else {
                if(String.valueOf(comboBox2B.getItemAt(comboBox2B.getSelectedIndex())).equals("Facultate")){
                    createFaculty.setVisible(true);
                }
                if(String.valueOf(comboBox2B.getItemAt(comboBox2B.getSelectedIndex())).equals("Departament")){
                    createDepartment.setVisible(true);
                }
            }
        });

        comboBox3B.addActionListener(e->{
            createStudent.setVisible(false);
            createTeacher.setVisible(false);
            createAssistant.setVisible(false);
            createParent.setVisible(false);
            editStudent.setVisible(false);
            editTeacher.setVisible(false);
            editAssistant.setVisible(false);
            editParent.setVisible(false);
            createFaculty.setVisible(false);
            createDepartment.setVisible(false);
            editFaculty.setVisible(false);
            editDepartment.setVisible(false);
        });

        check3B.addActionListener(e->{
            if(String.valueOf(comboBox2B.getItemAt(comboBox2B.getSelectedIndex())).equals("Facultate")){
                editFaculty.setVisible(true);
                for (Faculty i : university.getFaculty()) {
                    if(String.valueOf(comboBox3B.getItemAt(comboBox3B.getSelectedIndex())).equals(i.getName())){
                        textName10.setText(i.getName());
                    }
                }
            }
            if(String.valueOf(comboBox2B.getItemAt(comboBox2B.getSelectedIndex())).equals("Departament")){
                editDepartment.setVisible(true);
                for (Department i : university.getDepartments()) {
                    if(String.valueOf(comboBox3B.getItemAt(comboBox3B.getSelectedIndex())).equals(i.getName())){
                        textName12.setText(i.getName());
                    }
                }
            }
        });

        uniComboBox7.addActionListener(e -> {
            for (Faculty i : university.getFaculty())
                if (String.valueOf(uniComboBox7.getItemAt(uniComboBox7.getSelectedIndex())).equals(i.getName())){
                    String deps[] = new String[i.getDepartment().size()];
                    int k = 0;
                    for (Department j : i.getDepartment()) {
                        deps[k] = j.getName();
                        k++;
                    }
                    int x = k;
                    DefaultComboBoxModel model = new DefaultComboBoxModel();
                    for(k=0; k<x; k++)
                        model.addElement(deps[k]);
                    depComboBox7.setModel(model);
                }
        });


        create_stud.addActionListener(e -> {
            if(String.valueOf(parent1ComboBox7.getItemAt(parent1ComboBox7.getSelectedIndex())).equals(String.valueOf(parent2ComboBox7.getItemAt(parent2ComboBox7.getSelectedIndex())))){
                JOptionPane.showMessageDialog(frame,"Ambii parinti sunt aceeasi persoana","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(textFirstName7.getText().equals("") || textName7.getText().equals("") || textPassw7.getText().equals("") || textCNP7.getText().equals("")){
                JOptionPane.showMessageDialog(frame,"Exista campuri necompletate","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else {
                Faculty faculty = null;
                Department department = null;
                for (Faculty i : university.getFaculty())
                    if (String.valueOf(uniComboBox7.getItemAt(uniComboBox7.getSelectedIndex())).equals(i.getName()))
                        faculty = i;
                for (Department i : university.getDepartments())
                    if (String.valueOf(depComboBox7.getItemAt(depComboBox7.getSelectedIndex())).equals(i.getName()))
                        department = i;
                Student student = new Student(textFirstName7.getText(), textName7.getText(), faculty, department);
                for (Parent i : parents)
                    if (String.valueOf(parent1ComboBox7.getItemAt(parent1ComboBox7.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName()))
                        student.setFather(i);
                for (Parent i : parents)
                    if (String.valueOf(parent2ComboBox7.getItemAt(parent2ComboBox7.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName()))
                        student.setMother(i);
                student.setPath(textPhotoPath7.getText());
                student.setPassword(textPassw7.getText());
                student.setCNP(textCNP7.getText());
                students.add(student);

                try (FileOutputStream fos = new FileOutputStream("SURSE/infos/students.dat");
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                    oos.writeObject(students);

                    oos.close();
                    fos.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        create_teach.addActionListener(e -> {
            if(textFirstName3.getText().equals("") || textName3.getText().equals("") || textPassw3.getText().equals("") || textCNP3.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            else{
                Teacher teacher1 = new Teacher(textFirstName3.getText(), textName3.getText());
                teacher1.setCNP(textCNP3.getText());
                teacher1.setPath(textPhotoPath3.getText());
                teacher1.setPassword(textPassw3.getText());
                teachers.add(teacher1);

                try (FileOutputStream fos = new FileOutputStream("SURSE/infos/teachers.dat");
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                    oos.writeObject(teachers);

                    oos.close();
                    fos.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        add_assi.addActionListener(e -> {
            if(textFirstName1.getText().equals("") || textName1.getText().equals("") || textPassw1.getText().equals("") || textCNP1.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            else {
                Assistant assistant = new Assistant(textFirstName1.getText(), textName1.getText());
                assistant.setCNP(textCNP1.getText());
                assistant.setPassword(textPassw1.getText());
                assistants.add(assistant);

                try (FileOutputStream fos = new FileOutputStream("SURSE/infos/assistants.dat");
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                    oos.writeObject(assistants);

                    oos.close();
                    fos.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        create_parent.addActionListener(e -> {
            if(textFirstName5.getText().equals("") || textName5.getText().equals("") || textPassw5.getText().equals("") || textCNP5.getText().equals("") || textEmail5.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            else {
                Parent parent = new Parent(textFirstName5.getText(), textName5.getText());
                parent.setCNP(textCNP5.getText());
                parent.setEmail(textEmail5.getText());
                parent.setPassword(textPassw5.getText());
                parents.add(parent);
                try (FileOutputStream fos = new FileOutputStream("SURSE/infos/parents.dat");
                     ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                    oos.writeObject(parents);

                    oos.close();
                    fos.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        create_fac.addActionListener(e -> {
            for(Teacher i : teachers)
                if(String.valueOf(teacherComboBox9.getItemAt(teacherComboBox9.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    Faculty faculty = new Faculty(textName9.getText(), i);
                    university.addFaculty(faculty);

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        });

        create_dep.addActionListener(e -> {
            Department department = new Department(textName11.getText());
            for(Faculty i : university.getFaculty())
                if(String.valueOf(facultyComboBox11.getItemAt(facultyComboBox11.getSelectedIndex())).equals(i.getName())){

                    i.addDepartment(department);

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        });

        edit_stud.addActionListener(e -> {
            if(textName8.getText().equals("") || textFirstName8.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            for (Student i : students) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName8.getText());
                    i.setFirstName(textFirstName8.getText());
                    i.setPath(textPhotoPath8.getText());
                    i.updateEmail();
                    if(!textPassw8.getText().equals(""))
                        i.setPassword(textPassw8.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/students.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(students);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

            }
            for (Student i : university.getCatalog().getStudents())
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName8.getText());
                    i.setFirstName(textFirstName8.getText());
                    i.setPath(textPhotoPath8.getText());
                    i.updateEmail();
                    if(!textPassw8.getText().equals(""))
                        i.setPassword(textPassw8.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
        });

        edit_teach.addActionListener(e -> {
            if(textName4.getText().equals("") || textFirstName4.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            for (Teacher i : teachers) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName4.getText());
                    i.setFirstName(textFirstName4.getText());
                    i.setPath(textPhotoPath4.getText());
                    i.updateEmail();
                    if(!textPassw4.getText().equals(""))
                        i.setPassword(textPassw4.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/teachers.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(teachers);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            for (Teacher i : university.getCatalog().getTeachers()) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName4.getText());
                    i.setFirstName(textFirstName4.getText());
                    i.setPath(textPhotoPath4.getText());
                    i.updateEmail();
                    if(!textPassw4.getText().equals(""))
                        i.setPassword(textPassw4.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        edit_assi.addActionListener(e -> {
            if(textName2.getText().equals("") || textFirstName2.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            for (Assistant i : assistants) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName2.getText());
                    i.setFirstName(textFirstName2.getText());
                    i.updateEmail();
                    if(!textPassw2.getText().equals(""))
                        i.setPassword(textPassw2.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/assistants.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(assistants);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            for (Assistant i : university.getCatalog().getAssistants()) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName2.getText());
                    i.setFirstName(textFirstName2.getText());
                    i.updateEmail();
                    if(!textPassw2.getText().equals(""))
                        i.setPassword(textPassw2.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        edit_parent.addActionListener(e -> {
            if(textName6.getText().equals("") || textFirstName6.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            Parent parent = null;
            for (Parent i : parents) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    i.setLastName(textName6.getText());
                    i.setFirstName(textFirstName6.getText());
                    i.setEmail(textEmail6.getText());
                    if(!textPassw6.getText().equals(""))
                        i.setPassword(textPassw6.getText());

                    parent = i;

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/parents.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(parents);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }


            for(Student i : university.getCatalog().getStudents())
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getMother().getLastName() + " " + i.getMother().getFirstName())){
                        i.getMother().setLastName(textName6.getText());
                        i.getMother().setFirstName(textFirstName6.getText());
                        i.getMother().setEmail(textEmail6.getText());
                        if(!textPassw6.getText().equals(""))
                            i.getMother().setPassword(textPassw6.getText());
                    }
                    else if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getFather().getLastName() + " " + i.getFather().getFirstName())){
                        i.getFather().setLastName(textName6.getText());
                        i.getFather().setFirstName(textFirstName6.getText());
                        i.getFather().setEmail(textEmail6.getText());
                        if(!textPassw6.getText().equals(""))
                            i.getFather().setPassword(textPassw6.getText());
                    }

            for(Observer i : university.getCatalog().getObservers())
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(((Parent)i).getLastName() + " " + ((Parent)i).getFirstName()))
                    i = (Observer) parent;

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        edit_fac.addActionListener(e -> {
            if(textName10.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            for (Faculty i : university.getFaculty()) {
                if(String.valueOf(comboBox3B.getItemAt(comboBox3B.getSelectedIndex())).equals(i.getName())){
                    i.setName(textName10.getText());
                    for(Teacher j : teachers)
                        if(String.valueOf(teacherComboBox9.getItemAt(teacherComboBox9.getSelectedIndex())).equals(j.getLastName() + " " + j.getFirstName()))
                            i.setDean(j);

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        edit_dep.addActionListener(e -> {
            if(textName12.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Exista campuri necompletate", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            for (Department i : university.getDepartments()) {
                if(String.valueOf(comboBox3B.getItemAt(comboBox3B.getSelectedIndex())).equals(i.getName())){
                    i.setName(textName12.getText());

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        remove_stud.addActionListener(e -> {
            Student student = null;
            for (Student i : students) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    student = i;
                }
            }
            students.remove(student);

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/students.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(students);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            for(Course i : university.getCatalog().getCourses())
                for(Student j : i.getAllStudents()) {
                    ArrayList<ScoreVisitor.Triplet<Student, String, Double>> list = new ArrayList<>();
                    if (j.getCNP().equals(student.getCNP()))
                        i.removeStudent(j);
                    for (Map.Entry<Teacher, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> k : university.getCatalog().getExamScores().entrySet())
                        for(ScoreVisitor.Triplet<Student, String, Double> l : k.getValue())
                            if(l.getKey().getCNP().equals(j.getCNP())){
                                list.add(l);
                            }
                    for(ScoreVisitor.Triplet<Student, String, Double> k : list)
                        university.getCatalog().removeExamScore(k);

                    list = new ArrayList<>();

                    for (Map.Entry<Assistant, ArrayList<ScoreVisitor.Triplet<Student, String, Double>>> k : university.getCatalog().getPartialScores().entrySet())
                        for(ScoreVisitor.Triplet<Student, String, Double> l : k.getValue())
                            if(l.getKey().getCNP().equals(j.getCNP())){
                                list.add(l);
                            }
                    for(ScoreVisitor.Triplet<Student, String, Double> k : list)
                        university.getCatalog().removePartialScore(k);


                }

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        remove_teach.addActionListener(e -> {
            Teacher teacher1 = null;
            for (Teacher i : teachers) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    teacher1 = i;
                }
            }
            teachers.remove(teacher1);

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/teachers.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(teachers);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }


            ArrayList<Course> courses = new ArrayList<>();
            for(Course i : university.getCatalog().getCourses())
                if(i.getTeacher().getCNP().equals(teacher1.getCNP())) {
                    for(Student j : i.getAllStudents())
                        i.removeStudent(j);
                    i.removeAllGroups();
                    i.removeAllAssistants();
                    courses.add(i);
                }

            for(Course i : courses) {
                university.getCatalog().removeCourse(i);
                for(Department j : university.getDepartments())
                    if(j.getCourses().contains(i))
                        j.removeCourse(i.getName());
            }

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        remove_assi.addActionListener(e -> {
            Assistant assistant = null;
            for (Assistant i : assistants) {
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())){
                    assistant = i;
                }
            }
            assistants.remove(assistant);

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/assistants.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(assistants);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            for(Course i : university.getCatalog().getCourses())
                for(Assistant k : i.getAssistants())
                    if(k.getCNP().equals(assistant.getCNP())) {
                        System.out.println(i.getName());
                        for (Group j : i.getGroups())
                            if (j.getAssistant().getCNP().equals(assistant.getCNP())) {
                                j.setAssistant(null);
                                System.out.println(j.getId() + " s-a gasit");
                            }
                        i.removeAssistant(assistant);
                        System.out.println("S-a sters asistentul");
                        System.out.println(i.getAssistants());
                    }

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        remove_parent.addActionListener(e -> {
            boolean ok = false;
            Parent parent = null;
            for(Student i : university.getCatalog().getStudents())
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getMother().getLastName() + " " + i.getMother().getFirstName())){
                    ok = true;
                }
                else if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getFather().getLastName() + " " + i.getFather().getFirstName())){
                    ok = true;
                }
                if(!ok){
                    for(Parent i : parents)
                        if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName()))
                            parent = i;

                    university.getCatalog().removeObserver(parent);
                    parents.remove(parent);

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/parents.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(parents);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(university);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    }
                if(ok)  JOptionPane.showMessageDialog(frame, "Parintele nu poate fi sters", "Alert", JOptionPane.WARNING_MESSAGE);

        });

        remove_fac.addActionListener(e -> {
            Faculty faculty = null;
            for (Faculty i : university.getFaculty())
                if (String.valueOf(comboBox3B.getItemAt(comboBox3B.getSelectedIndex())).equals(i.getName())) {

                    faculty = i;
                }

            for (Department i : faculty.getDepartment())
                i.removeAllCourses();

            faculty.removeAllDepartments();

            university.removeFaculty(faculty);

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        remove_dep.addActionListener(e -> {
            Department department = null;
            for (Faculty i : university.getFaculty())
                for (Department j : i.getDepartment()) {
                    if (String.valueOf(comboBox3B.getItemAt(comboBox3B.getSelectedIndex())).equals(j.getName())) {
                        department = j;
                    }
                }

            department.removeAllCourses();

            for (Faculty i : university.getFaculty())
                if(i.getDepartment().contains(department))
                    i.removeDepartment(department);

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        add_cont.addActionListener(e -> {
            if(textContract8.getText().equals("")) {
                JOptionPane.showMessageDialog(frame, "Calea este necompletata", "Alert", JOptionPane.WARNING_MESSAGE);
            }
            Contract contract = new Contract(textContract8.getText(), (int)year8.getValue());
            Student student = null;
            for (Student i : students)
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName()))
                    i.addContract(contract);

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/students.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(students);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        remove_contract.addActionListener(e -> {
            for (Student i : students)
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName())) {
                    Contract contract = null;
                    for (Contract j : i.getContracts())
                        if (((String) contracts8.getSelectedValue()).equals("Contract anul " + j.getYear()))
                            contract = j;
                    i.removeContract(contract);

                    try (FileOutputStream fos = new FileOutputStream("SURSE/infos/students.dat");
                         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                        oos.writeObject(students);

                        oos.close();
                        fos.close();

                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }

        });

        observer.addActionListener(e -> {
            Parent parent = null;
            Observer observer1 = null;
            for (Parent i : parents)
                if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(i.getLastName() + " " + i.getFirstName()))
                    parent = i;
            if(observer.getText().equals("Aboneaza")) {
                university.getCatalog().addObserver(parent);
                observer.setText("Dezaboneaza");
            }
            else {
                boolean ok = false;
                for(Observer i : university.getCatalog().getObservers())
                    if(String.valueOf(comboBox3A.getItemAt(comboBox3A.getSelectedIndex())).equals(((Parent)i).getLastName() + " " + ((Parent)i).getFirstName()))
                        observer1 = i;
                university.getCatalog().removeObserver(observer1);
                observer.setText("Aboneaza");
            }

            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                oos.writeObject(university);

                oos.close();
                fos.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
    }
}
