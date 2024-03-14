import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class StudentGradeBook {

    public void studentGradeBook(University university, Student student, String button_text){
        JFrame frame = new JFrame();

        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);


        Container pane = frame.getContentPane();
        JTabbedPane tp = new JTabbedPane();
        tp.setOpaque(false);
        JPanel panelA = new JPanel(new FlowLayout());
        JPanel panelB = new JPanel(new FlowLayout());
        tp.add("Informatii", panelA);
        tp.add("Note", panelB);

        pane.add(tp, BorderLayout.CENTER);

        Dimension d = new Dimension(210, 75);
        Dimension d2 = new Dimension(980,490);

        JPanel grid1 = new JPanel(new GridLayout(1,2));
        grid1.setPreferredSize(d2);

        grid1.setOpaque(false);
        JPanel panel1 = new JPanel();
        panel1.setOpaque(false);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        GridLayout layout1 = new GridLayout(3,1);
        layout1.setVgap(25);
        JPanel grid0 = new JPanel(layout1);
        grid0.setOpaque(false);
        JPanel panel12 = new JPanel(new FlowLayout());
        panel12.setOpaque(false);
        JLabel uni = new JLabel();
        uni.setOpaque(false);
        panel12.add(uni);
        panel1.add(panel12);
        JLabel fac = new JLabel();
        fac.setOpaque(false);
        fac.setBorder(BorderFactory.createTitledBorder("FACULTATE  "));
        ((TitledBorder)fac.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        fac.setText(student.getFaculty().getName());
        fac.setHorizontalAlignment(JLabel.CENTER);
        fac.setVerticalAlignment(JLabel.CENTER);
        fac.setPreferredSize(d);
        fac.setFont(new Font("Serif", Font.PLAIN, 25));
        grid0.add(fac);
        JLabel dep = new JLabel();
        dep.setOpaque(false);
        dep.setFont(new Font("Serif", Font.PLAIN, 25));
        dep.setBorder(BorderFactory.createTitledBorder("SPECIALIZARE  "));
        ((TitledBorder)dep.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        dep.setText(student.getDepartment().getName());
        dep.setHorizontalAlignment(JLabel.CENTER);
        dep.setVerticalAlignment(JLabel.CENTER);
        dep.setPreferredSize(d);
        grid0.add(dep);
        JLabel cnp = new JLabel();
        cnp.setOpaque(false);
        cnp.setFont(new Font("Serif", Font.PLAIN, 25));
        cnp.setText(student.getCNP());
        cnp.setBorder(BorderFactory.createTitledBorder("CNP "));
        ((TitledBorder)cnp.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        cnp.setHorizontalAlignment(JLabel.CENTER);
        cnp.setVerticalAlignment(JLabel.CENTER);
        cnp.setPreferredSize(d);
        grid0.add(cnp);
        panel1.add(grid0);
        grid1.add(panel1);


        JPanel panel2 = new JPanel();
        panel2.setOpaque(false);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        GridLayout layout11 = new GridLayout(2,1);
        layout11.setVgap(25);
        JPanel panel4 = new JPanel(layout11);
        panel4.setOpaque(false);
        grid0.setOpaque(false);

        JLabel num = new JLabel();
        num.setOpaque(false);
        num.setBorder(BorderFactory.createTitledBorder("NUME  "));
        ((TitledBorder)num.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        num.setText(student.getLastName());
        num.setHorizontalAlignment(JLabel.CENTER);
        num.setVerticalAlignment(JLabel.CENTER);
        num.setPreferredSize(d);
        num.setFont(new Font("Serif", Font.PLAIN, 40));
        panel4.add(num);
        JLabel prenum = new JLabel();
        prenum.setFont(new Font("Serif", Font.PLAIN, 40));
        prenum.setOpaque(false);
        prenum.setBorder(BorderFactory.createTitledBorder("PRENUME  "));
        prenum.setHorizontalAlignment(JLabel.CENTER);
        prenum.setVerticalAlignment(JLabel.CENTER);
        prenum.setPreferredSize(d);
        ((TitledBorder)prenum.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        prenum.setText(student.getFirstName());
        panel4.add(prenum);
        panel2.add(panel4);
        panel2.add(new JLabel(" "));
        panel2.add(new JLabel(" "));




        JPanel grid2 = new JPanel(new GridLayout(1,2));
        grid2.setOpaque(false);
        JPanel panel10 = new JPanel(new FlowLayout());
        panel10.setOpaque(false);
        JLabel photo = new JLabel();
        photo.setOpaque(false);
        photo.setIcon(new ImageIcon(student.getPath()));
        photo.setHorizontalAlignment(JLabel.CENTER);
        photo.setVerticalAlignment(JLabel.CENTER);
        panel10.add(photo);
        panel10.setBorder(BorderFactory.createTitledBorder("POZA "));
        ((TitledBorder)panel10.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel10.setAlignmentY(JPanel.CENTER_ALIGNMENT);
        grid2.add(panel10);

        String contract_list[]= new String[student.getContracts().size()];
        int n = 0;
        for(Contract i : student.getContracts()) {
            contract_list[n] = "Contract anul " + i.getYear();
            n++;
        }
        JPanel panel21 = new JPanel(new BorderLayout());
        panel21.setOpaque(false);
        panel21.setBorder(BorderFactory.createTitledBorder("CONTRACTE  "));
        ((TitledBorder)panel21.getBorder()).setTitleColor(Color.LIGHT_GRAY);

        JList list_contracts = new JList(contract_list);
        list_contracts.setOpaque(false);
        list_contracts.setFont(new Font("Serif", Font.PLAIN, 25));
        panel21.add(list_contracts, BorderLayout.NORTH);


        JButton button3 = new JButton("Vizualizeaza");
        button3.setFont(new Font("Serif", Font.PLAIN, 25));
        panel21.setPreferredSize(new Dimension(200,100));
        panel21.add(button3, BorderLayout.PAGE_END);
        grid2.add(panel21);



        panel2.add(grid2);
        grid1.add(panel2);
        panelA.add(grid1);



        JPanel grid3 = new JPanel(new GridLayout(1,3));
        grid3.setPreferredSize(d2);
        grid3.setOpaque(false);
        JPanel panel6 = new JPanel(new BorderLayout());
        panel6.setOpaque(false);
        panel6.setBorder(BorderFactory.createTitledBorder("CURSURI  "));
        ((TitledBorder)panel6.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));



        String course_list[]= new String[university.getCatalog().getStudentCourses(student).size()];
        n = 0;
        for(Course i : university.getCatalog().getStudentCourses(student)) {
            course_list[n] = i.getName();
            n++;
        }

        JList list_course = new JList(course_list);
        list_course.setOpaque(false);
        list_course.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scroll = new JScrollPane(list_course);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setPreferredSize(new Dimension(200, 870));
        panel6.add(scroll, BorderLayout.NORTH);

        JPanel panel20 = new JPanel(new FlowLayout());
        panel20.setOpaque(false);
        JButton button2 = new JButton("Vizualizeaza detalii");
        button2.setFont(new Font("Serif", Font.PLAIN, 25));
        panel20.setPreferredSize(new Dimension(200,100));
        panel20.add(button2);
        panel6.add(panel20, BorderLayout.PAGE_END);



        grid3.add(panel6);

        JPanel panel7 = new JPanel();
        panel7.setOpaque(false);
        panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
        GridLayout layout12 = new GridLayout(3,1);
        JPanel panel15 = new JPanel(layout12);
        panel15.setOpaque(false);
        panel15.setPreferredSize(new Dimension(100,100));
        JLabel prof = new JLabel();
        prof.setOpaque(false);
        prof.setBorder(BorderFactory.createTitledBorder("PROFESOR  "));
        ((TitledBorder)prof.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        prof.setHorizontalAlignment(JLabel.CENTER);
        prof.setVerticalAlignment(JLabel.CENTER);
        prof.setFont(new Font("Serif", Font.PLAIN, 25));
        panel15.add(prof);
        JLabel grup = new JLabel();
        grup.setOpaque(false);
        grup.setBorder(BorderFactory.createTitledBorder("GRUPA  "));
        ((TitledBorder)grup.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        grup.setHorizontalAlignment(JLabel.CENTER);
        grup.setVerticalAlignment(JLabel.CENTER);
        grup.setFont(new Font("Serif", Font.PLAIN, 25));
        panel15.add(grup);
        JLabel assis = new JLabel();
        assis.setOpaque(false);
        assis.setBorder(BorderFactory.createTitledBorder("ASISTENT  "));
        ((TitledBorder)assis.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        assis.setFont(new Font("Serif", Font.PLAIN, 25));
        assis.setHorizontalAlignment(JLabel.CENTER);
        assis.setVerticalAlignment(JLabel.CENTER);
        panel15.add(assis);
        panel7.add(panel15);
        JPanel panel14 = new JPanel(new FlowLayout());
        panel14.setOpaque(false);
        JList list_assi = new JList();
        list_assi.setOpaque(false);
        list_assi.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scroll2 = new JScrollPane(list_assi);
        scroll2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll2.setPreferredSize(new Dimension(300,270));
        panel14.add(scroll2);
        panel14.setBorder(BorderFactory.createTitledBorder("LISTA ASISTENTI  "));
        ((TitledBorder)panel14.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel7.add(panel14);

        grid3.add(panel7);




        JPanel panel8 = new JPanel();
        JPanel panel13 = new JPanel(new FlowLayout());
        panel13.setOpaque(false);
        panel8.setOpaque(false);
        panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
        JList list_stud = new JList();
        list_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        list_stud.setOpaque(false);
        panel13.setBorder(BorderFactory.createTitledBorder("LISTA STUDENTI GRUPA    "));
        ((TitledBorder)panel13.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        JScrollPane scroll3 = new JScrollPane(list_stud);
        scroll3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll3.setPreferredSize(new Dimension(300,270));
        panel13.add(scroll3);
        panel8.add(panel13);
        JPanel panel9 = new JPanel();
        panel9.setOpaque(false);
        panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));
        panel9.setBorder(BorderFactory.createTitledBorder("NOTE  "));
        ((TitledBorder)panel9.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        JPanel grid4 = new JPanel(new GridLayout(3,1));
        grid4.setOpaque(false);
        JLabel parti = new JLabel("Partial:");
        parti.setHorizontalAlignment(JLabel.CENTER);
        parti.setVerticalAlignment(JLabel.CENTER);
        parti.setFont(new Font("Serif", Font.PLAIN, 25));
        grid4.add(parti);
        JLabel exam = new JLabel("Examen:");
        exam.setHorizontalAlignment(JLabel.CENTER);
        exam.setVerticalAlignment(JLabel.CENTER);
        exam.setFont(new Font("Serif", Font.PLAIN, 25));
        grid4.add(exam);
        JLabel tot = new JLabel("Total:");
        tot.setHorizontalAlignment(JLabel.CENTER);
        tot.setVerticalAlignment(JLabel.CENTER);
        tot.setFont(new Font("Serif", Font.PLAIN, 25));
        grid4.add(tot);
        panel9.add(grid4);
        JPanel grid5 = new JPanel(new GridLayout(3,1));
        grid5.setOpaque(false);
        JLabel partial = new JLabel();
        partial.setOpaque(false);
        partial.setFont(new Font("Serif", Font.PLAIN, 40));
        JLabel examen = new JLabel();
        examen.setFont(new Font("Serif", Font.PLAIN, 40));
        JLabel total = new JLabel();
        total.setFont(new Font("Serif", Font.PLAIN, 40));
        grid5.add(partial);
        grid5.add(examen);
        grid5.add(total);
        panel9.add(grid5);

        panel8.add(panel9);

        grid3.add(panel8);


        panelB.add(grid3);





        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.setOpaque(false);
        JLabel label = new JLabel("Declinarea responsabilitati: Orice corelatie a numelor persoanelor reale cu a celor din aplicatie este pur intamplatoare");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel5.add(new JLabel("                                        "));
        panel5.add(label);
        JButton day_night = new JButton();
        Dimension d4 = new Dimension(50, 20);
        day_night.setPreferredSize(d4);
        day_night.setHorizontalAlignment(JButton.LEFT);
        panel5.add(new JLabel("                                  "));
        panel5.add(day_night);
        pane.add(panel5, BorderLayout.PAGE_END);

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
            uni.setIcon(new ImageIcon("images/UniCod.png"));
            fac.setForeground(Color.WHITE);
            dep.setForeground(Color.WHITE);
            cnp.setForeground(Color.WHITE);
            num.setForeground(Color.WHITE);
            prenum.setForeground(Color.WHITE);
            list_contracts.setForeground(Color.WHITE);
            list_contracts.setBackground(new Color(80,80,80));
            list_course.setForeground(Color.WHITE);
            list_course.setBackground(new Color(80,80,80));
            prof.setForeground(Color.WHITE);
            assis.setForeground(Color.WHITE);
            grup.setForeground(Color.WHITE);
            list_assi.setForeground(Color.WHITE);
            list_assi.setBackground(new Color(80,80,80));
            list_stud.setForeground(Color.WHITE);
            list_stud.setBackground(new Color(80,80,80));
            partial.setForeground(Color.WHITE);
            parti.setForeground(Color.WHITE);
            examen.setForeground(Color.WHITE);
            exam.setForeground(Color.WHITE);
            tot.setForeground(Color.WHITE);
            total.setForeground(Color.WHITE);
            scroll.getViewport().setBackground(new Color(80,80,80));
            scroll2.getViewport().setBackground(new Color(80,80,80));
            scroll3.getViewport().setBackground(new Color(80,80,80));
            button2.setBackground(Color.BLACK);
            button2.setForeground(Color.WHITE);
            button3.setBackground(Color.BLACK);
            button3.setForeground(Color.WHITE);
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
            uni.setIcon(new ImageIcon("images/UniCod2.png"));
            fac.setForeground(Color.BLACK);
            dep.setForeground(Color.BLACK);
            cnp.setForeground(Color.BLACK);
            num.setForeground(Color.BLACK);
            prenum.setForeground(Color.BLACK);
            list_contracts.setForeground(Color.BLACK);
            list_contracts.setBackground(new Color(238,238,238));
            list_course.setForeground(Color.BLACK);
            list_course.setBackground(new Color(238,238,238));
            prof.setForeground(Color.BLACK);
            assis.setForeground(Color.BLACK);
            grup.setForeground(Color.BLACK);
            list_assi.setForeground(Color.BLACK);
            list_assi.setBackground(new Color(238,238,238));
            list_stud.setForeground(Color.BLACK);
            list_stud.setBackground(new Color(238,238,238));
            partial.setForeground(Color.BLACK);
            parti.setForeground(Color.BLACK);
            examen.setForeground(Color.BLACK);
            exam.setForeground(Color.BLACK);
            tot.setForeground(Color.BLACK);
            total.setForeground(Color.BLACK);
            scroll.getViewport().setBackground(new Color(238,238,238));
            scroll2.getViewport().setBackground(new Color(238,238,238));
            scroll3.getViewport().setBackground(new Color(238,238,238));
            button2.setBackground(Color.lightGray);
            button2.setForeground(Color.BLACK);
            button3.setBackground(Color.lightGray);
            button3.setForeground(Color.BLACK);
        }

        frame.setVisible(true);
        frame.setSize(1000,635);
        frame.setLocationRelativeTo(null);




        day_night.addActionListener(e -> {
            if(day_night.getText().equals("\uD83D\uDD06")) {
                day_night.setText("\uD83C\uDF19");
                day_night.setBackground(Color.lightGray);
                day_night.setForeground(Color.BLACK);
                label.setForeground(new Color(240,240,240));
                frame.setBackground(Color.white);
                pane.setBackground(Color.white);
                tp.setBackground(Color.LIGHT_GRAY);
                tp.setForeground(Color.BLACK);
                panelA.setBackground(new Color(238,238,238));
                panelB.setBackground(new Color(238,238,238));
                uni.setIcon(new ImageIcon("images/UniCod2.png"));
                fac.setForeground(Color.BLACK);
                dep.setForeground(Color.BLACK);
                cnp.setForeground(Color.BLACK);
                num.setForeground(Color.BLACK);
                prenum.setForeground(Color.BLACK);
                list_contracts.setForeground(Color.BLACK);
                list_contracts.setBackground(new Color(238,238,238));
                list_course.setForeground(Color.BLACK);
                list_course.setBackground(new Color(238,238,238));
                prof.setForeground(Color.BLACK);
                assis.setForeground(Color.BLACK);
                grup.setForeground(Color.BLACK);
                list_assi.setForeground(Color.BLACK);
                list_assi.setBackground(new Color(238,238,238));
                list_stud.setForeground(Color.BLACK);
                list_stud.setBackground(new Color(238,238,238));
                partial.setForeground(Color.BLACK);
                parti.setForeground(Color.BLACK);
                examen.setForeground(Color.BLACK);
                exam.setForeground(Color.BLACK);
                tot.setForeground(Color.BLACK);
                total.setForeground(Color.BLACK);
                scroll.getViewport().setBackground(new Color(238,238,238));
                scroll2.getViewport().setBackground(new Color(238,238,238));
                scroll3.getViewport().setBackground(new Color(238,238,238));
                button2.setBackground(Color.lightGray);
                button2.setForeground(Color.BLACK);
                button3.setBackground(Color.lightGray);
                button3.setForeground(Color.BLACK);


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
                uni.setIcon(new ImageIcon("images/UniCod.png"));
                fac.setForeground(Color.WHITE);
                dep.setForeground(Color.WHITE);
                cnp.setForeground(Color.WHITE);
                num.setForeground(Color.WHITE);
                prenum.setForeground(Color.WHITE);
                list_contracts.setForeground(Color.WHITE);
                list_contracts.setBackground(new Color(80,80,80));
                list_course.setForeground(Color.WHITE);
                list_course.setBackground(new Color(80,80,80));
                prof.setForeground(Color.WHITE);
                assis.setForeground(Color.WHITE);
                grup.setForeground(Color.WHITE);
                list_assi.setForeground(Color.WHITE);
                list_assi.setBackground(new Color(80,80,80));
                list_stud.setForeground(Color.WHITE);
                list_stud.setBackground(new Color(80,80,80));
                partial.setForeground(Color.WHITE);
                parti.setForeground(Color.WHITE);
                examen.setForeground(Color.WHITE);
                exam.setForeground(Color.WHITE);
                tot.setForeground(Color.WHITE);
                total.setForeground(Color.WHITE);
                scroll.getViewport().setBackground(new Color(80,80,80));
                scroll2.getViewport().setBackground(new Color(80,80,80));
                scroll3.getViewport().setBackground(new Color(80,80,80));
                button2.setBackground(Color.BLACK);
                button2.setForeground(Color.WHITE);
                button3.setBackground(Color.BLACK);
                button3.setForeground(Color.WHITE);

            }
        });

        button2.addActionListener(e -> {
            for (Course i:university.getCatalog().getStudentCourses(student)) {
                if(i.getName().equals((String)list_course.getSelectedValue())){
                    prof.setText(i.getTeacher().getLastName() + " " + i.getTeacher().getFirstName());
                    grup.setText("Grupa " + i.getStudentGroup(student).getId());
                    if(i.getStudentGroup(student).getAssistant()!=null)
                        assis.setText(i.getStudentGroup(student).getAssistant().getLastName() + " " + i.getStudentGroup(student).getAssistant().getFirstName());
                    else assis.setText("");
                    int x=0;
                    int j=0;
                    String assis_list[] = new String[i.getAssistants().size()];
                    for(Assistant k : i.getAssistants()) {
                        assis_list[j] = k.getLastName() + " " + k.getFirstName() ;
                        j++;
                        x++;
                    }
                    DefaultListModel listModel1 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel1.addElement(assis_list[j]);
                    list_assi.setModel(listModel1);


                    x=0;
                    j=0;
                    String stud_list[] = new String[i.getStudentGroup(student).getStudents().size()];
                    for(Student k : i.getStudentGroup(student).getStudents()) {
                        if(!k.getCNP().equals(student.getCNP())) {
                            stud_list[j] = k.getLastName() + " " + k.getFirstName();
                            j++;
                            x++;
                        }
                    }
                    DefaultListModel listModel2 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel2.addElement(stud_list[j]);
                    list_stud.setModel(listModel2);

                    if(i.getGrade(student) != null) {
                        if (i.getGrade(student).getPartialScore() == null)
                            partial.setText("0");
                        else
                            partial.setText(String.format("%.2f", i.getGrade(student).getPartialScore()));

                        if (i.getGrade(student).getExamScore() == null)
                            examen.setText("0");
                        else
                            examen.setText(String.format("%.2f", i.getGrade(student).getExamScore()));

                        if (i.getGrade(student).getPartialScore() == null || i.getGrade(student).getExamScore() == null)
                            total.setText("0");
                        else
                            total.setText(String.format("%.2f", i.getGrade(student).getTotal()));
                    }else{
                        partial.setText("0");
                        examen.setText("0");
                        total.setText("0");

                    }

                }
            }
        });

        button3.addActionListener(e -> {
            for(Contract i : student.getContracts()) {
                if(((String)list_contracts.getSelectedValue()).equals((String)"Contract anul " + i.getYear())){
                    JLabel contract = new JLabel();
                    contract.setIcon(new ImageIcon(i.getPath()));
                    JOptionPane.showMessageDialog(frame,contract);
                }
            }

        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
