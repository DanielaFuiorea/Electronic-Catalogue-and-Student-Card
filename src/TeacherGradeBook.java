import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeacherGradeBook {

    public void teacherGradeBook(University university, Teacher teacher, String button_text, ArrayList<Student> students, ArrayList<Assistant> assistants) {
        JFrame frame = new JFrame();


        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);



        Container pane = frame.getContentPane();
        JTabbedPane tp = new JTabbedPane();
        tp.setOpaque(false);
        JPanel panelA = new JPanel(new FlowLayout());
        JPanel panelB = new JPanel(new FlowLayout());
        JPanel panelC = new JPanel(new FlowLayout());
        JPanel panelD = new JPanel(new FlowLayout());
        tp.add("Note", panelA);
        tp.add("Detalii si Asistenti", panelB);
        tp.add("Studenti si Grupe", panelC);
        tp.add("Creare Curs", panelD);

        pane.add(tp, BorderLayout.CENTER);

        Dimension d = new Dimension(210, 75);
        Dimension d2 = new Dimension(980,540);


        JPanel grid1 = new JPanel(new GridLayout(1,5));
        grid1.setPreferredSize(d2);
        grid1.setOpaque(false);
        JPanel panel1 = new JPanel();
        panel1.setOpaque(false);
        panel1.setBorder(BorderFactory.createTitledBorder("CURSURI  "));
        ((javax.swing.border.TitledBorder)panel1.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        String course_list[]= new String[university.getCatalog().getTeacherCourses(teacher).size()];
        int n = 0;
        for(Course i : university.getCatalog().getTeacherCourses(teacher)) {
            course_list[n] = i.getName();
            n++;
        }

        JList list_course = new JList(course_list);



        list_course.setOpaque(false);
        list_course.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(list_course);
        list_course.setLayoutOrientation(JList.VERTICAL);
        scrollPane1.setPreferredSize(new Dimension(200, 470));
        panel1.add(scrollPane1);

        JPanel panel21 = new JPanel(new BorderLayout());
        panel21.setOpaque(false);
        panel21.add(panel1, BorderLayout.NORTH);


        JButton button3 = new JButton("Detalii");
        button3.setFont(new Font("Serif", Font.PLAIN, 25));
        panel21.setPreferredSize(new Dimension(200,100));
        panel21.add(button3, BorderLayout.PAGE_END);
        grid1.add(panel21);






        JPanel panel32 = new JPanel(new GridLayout(1,1));
        JPanel panel33 = new JPanel();
        JPanel panel34 = new JPanel(new FlowLayout());
        panel32.setOpaque(false);
        panel32.setBorder(BorderFactory.createTitledBorder("NOTE DE VALIDAT  "));
        ((javax.swing.border.TitledBorder)panel32.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel33.setOpaque(false);
        panel33.setLayout(new BoxLayout(panel33, BoxLayout.Y_AXIS));
        panel34.setOpaque(false);
        JList list_val = new JList();
        list_val.setOpaque(false);
        list_val.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane6 = new JScrollPane();
        scrollPane6.setViewportView(list_val);
        scrollPane6.setPreferredSize(new Dimension(200, 420));
        list_val.setLayoutOrientation(JList.VERTICAL);

        JPanel panel23 = new JPanel(new BorderLayout());
        panel23.setOpaque(false);
        panel23.add(scrollPane6, BorderLayout.NORTH);

        JPanel panel35 = new JPanel(new GridLayout(2,1));
        JButton button6 = new JButton("Valid. una");
        button6.setFont(new Font("Serif", Font.PLAIN, 25));
        panel35.setPreferredSize(new Dimension(200,100));
        JButton button5 = new JButton("Valid. tot");
        button5.setFont(new Font("Serif", Font.PLAIN, 25));
        panel23.setPreferredSize(new Dimension(200,100));
        panel35.add(button6);
        panel35.add(button5);
        panel23.add(panel35, BorderLayout.PAGE_END);
        panel32.add(panel23);

        grid1.add(panel32);




        JPanel panel2 = new JPanel(new GridLayout(1,1));
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel(new FlowLayout());
        panel2.setOpaque(false);
        panel2.setBorder(BorderFactory.createTitledBorder("STUDENTI  "));
        ((javax.swing.border.TitledBorder)panel2.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel3.setOpaque(false);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        panel4.setOpaque(false);
        JList list_stud = new JList();
        list_stud.setOpaque(false);
        list_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane2 = new JScrollPane();
        scrollPane2.setViewportView(list_stud);
        scrollPane2.setPreferredSize(new Dimension(200, 230));
        list_stud.setLayoutOrientation(JList.VERTICAL);

        JPanel panel22 = new JPanel(new BorderLayout());
        panel22.setOpaque(false);
        panel22.add(scrollPane2, BorderLayout.NORTH);


        JButton button4 = new JButton("Selecteaza");
        button4.setFont(new Font("Serif", Font.PLAIN, 25));
        panel22.setPreferredSize(new Dimension(200,100));
        panel22.add(button4, BorderLayout.PAGE_END);
        panel2.add(panel22);



        JLabel best = new JLabel();
        best.setHorizontalAlignment(JLabel.CENTER);
        best.setVerticalAlignment(JLabel.CENTER);
        best.setFont(new Font("Serif", Font.PLAIN, 25));
        panel4.setBorder(BorderFactory.createTitledBorder("CEL MAI BUN STUDENT  "));
        ((javax.swing.border.TitledBorder)panel4.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel4.setSize(d);
        panel3.add(panel2);
        panel3.add(new JLabel(""));
        panel4.add(best);
        panel3.add(panel4);
        grid1.add(panel3);




        JPanel panel8 = new JPanel(new GridLayout(2,1));
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel(new FlowLayout());
        panel8.setOpaque(false);
        panel8.setBorder(BorderFactory.createTitledBorder("VALIDARE NOTA  "));
        ((javax.swing.border.TitledBorder)panel8.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel6.setOpaque(false);
        panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
        panel7.setOpaque(false);
        JLabel stud = new JLabel();

        stud.setHorizontalAlignment(JLabel.CENTER);
        stud.setVerticalAlignment(JLabel.CENTER);
        stud.setFont(new Font("Serif", Font.PLAIN, 25));
        panel8.add(stud);
        SpinnerModel val = new SpinnerNumberModel(0,  0,  4, 0.1);
        JSpinner nota = new JSpinner(val);
        nota.setPreferredSize(new Dimension(60,40));
        nota.setFont(new Font("Serif", Font.PLAIN, 20));
        panel7.add(nota);
        JButton ok = new JButton("Valideaza");
        ok.setPreferredSize(new Dimension(110,40));
        ok.setFont(new Font("Serif", Font.PLAIN, 18));
        panel7.add(ok);
        panel8.add(panel7);
        panel6.add(panel8);
        JPanel panel9 = new JPanel(new GridLayout(1,1));
        panel9.setOpaque(false);
        JList list_studval = new JList();
        list_studval.setOpaque(false);
        list_studval.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane3 = new JScrollPane();
        scrollPane3.setOpaque(false);
        scrollPane3.setViewportView(list_studval);
        list_studval.setLayoutOrientation(JList.VERTICAL);
        panel9.add(scrollPane3);
        panel9.setBorder(BorderFactory.createTitledBorder("STUDENTI CU NOTA VALIDATA  "));
        ((javax.swing.border.TitledBorder)panel9.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel6.add(panel9);
        grid1.add(panel6);

        JPanel panel13 = new JPanel(new GridLayout(1,1));
        panel13.setOpaque(false);
        panel13.setBorder(BorderFactory.createTitledBorder("STUDENTI ABSOLVENTI  "));
        ((javax.swing.border.TitledBorder)panel13.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        JList list_stud3 = new JList();
        list_stud3.setOpaque(false);
        list_stud3.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane5 = new JScrollPane();
        scrollPane5.setViewportView(list_stud3);
        list_stud3.setLayoutOrientation(JList.VERTICAL);
        panel13.add(scrollPane5);
        grid1.add(panel13);

        panelA.add(grid1);


        JPanel grid3 = new JPanel(new GridLayout(1,2));
        grid3.setPreferredSize(d2);
        grid3.setOpaque(false);

        JPanel grid5 = new JPanel(new GridLayout(1,2));
        grid5.setOpaque(false);
        grid5.setBorder(BorderFactory.createTitledBorder("DETALII CURS  "));
        ((javax.swing.border.TitledBorder)grid5.getBorder()).setTitleColor(Color.LIGHT_GRAY);

        JPanel grid6 = new JPanel(new GridLayout(1,2));
        grid6.setOpaque(false);
        grid6.setBorder(BorderFactory.createTitledBorder("ASISTENTI  "));
        ((javax.swing.border.TitledBorder)grid6.getBorder()).setTitleColor(Color.LIGHT_GRAY);


        JPanel panel12 = new JPanel(new BorderLayout());
        panel12.setOpaque(false);
        JTextArea textArea = new JTextArea();
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setFont(new Font("Serif", Font.PLAIN, 20));
        textArea.setEditable(true);
        JScrollPane text = new JScrollPane(textArea);
        text.setPreferredSize(new Dimension(300,420));
        text.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel12.add(text, BorderLayout.NORTH);


        JPanel panel20 = new JPanel(new GridLayout(2,1));
        panel20.setOpaque(false);
        JTextField course_name = new JTextField();
        course_name.setFont(new Font("Serif", Font.PLAIN, 25));
        panel20.add(course_name);
        String strat_list[]= {"Cea mai mare nota in examen", "Cea mai mare nota la activitate", "Cea mai mare medie totala"};
        JComboBox<String> list_strat = new JComboBox<>(strat_list);
        list_strat.setOpaque(false);
        list_strat.setFont(new Font("Serif", Font.PLAIN, 20));
        panel20.add(list_strat);
        panel12.add(panel20, BorderLayout.CENTER);

        JPanel panel14 = new JPanel(new GridLayout(1,2));
        panel14.setOpaque(false);
        SpinnerModel val2 = new SpinnerNumberModel(1,  1,  10, 1);
        JSpinner credits = new JSpinner(val2);
        credits.setFont(new Font("Serif", Font.PLAIN, 25));
        panel14.add(credits);


        JButton save = new JButton("Salveaza");
        save.setFont(new Font("Serif", Font.PLAIN, 25));
        panel14.add(save);
        panel12.add(panel14, BorderLayout.SOUTH);
        grid5.add(panel12);



        JPanel panel17 = new JPanel(new GridLayout(2,1));
        panel17.setBorder(BorderFactory.createTitledBorder("DEPARTAMENT  "));
        ((javax.swing.border.TitledBorder)panel17.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel17.setOpaque(false);
        JPanel panel18 = new JPanel(new BorderLayout());
        panel18.setOpaque(false);
        JList<String> list_departments = new JList<>();
        list_departments.setFont(new Font("Serif", Font.PLAIN, 25));
        list_departments.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane departments1 = new JScrollPane(list_departments);
        departments1.setPreferredSize(new Dimension(300,210));
        departments1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel18.add(departments1, BorderLayout.NORTH);
        JButton delete_dep = new JButton("Sterge");
        delete_dep.setFont(new Font("Serif", Font.PLAIN, 25));
        panel18.add(delete_dep);
        panel17.add(panel18);


        JPanel panel19 = new JPanel(new BorderLayout());
        panel19.setOpaque(false);
        JList<String> list_departments2 = new JList<>();
        list_departments2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list_departments2.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane departments2 = new JScrollPane(list_departments2);
        departments2.setPreferredSize(new Dimension(300,210));
        departments2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel19.add(departments2, BorderLayout.NORTH);
        JButton add_dep = new JButton("Adauga");
        add_dep.setFont(new Font("Serif", Font.PLAIN, 25));
        panel19.add(add_dep);
        panel17.add(panel19);
        grid5.add(panel17);

        JPanel panel15 = new JPanel(new BorderLayout());
        panel15.setOpaque(false);
        JList<String> list_assistants = new JList<>();
        list_assistants.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list_assistants.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane assistants1 = new JScrollPane(list_assistants);
        assistants1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        assistants1.setPreferredSize(new Dimension(300,480));
        panel15.add(assistants1, BorderLayout.NORTH);
        JButton delete_assi = new JButton("Sterge");
        delete_assi.setFont(new Font("Serif", Font.PLAIN, 25));
        panel15.add(delete_assi);
        grid6.add(panel15);




        JPanel panel16 = new JPanel(new BorderLayout());
        panel16.setOpaque(false);
        JList<String> list_assistants2 = new JList<>();
        list_assistants2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        list_assistants2.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane assistants2 = new JScrollPane(list_assistants2);
        assistants2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        assistants2.setPreferredSize(new Dimension(300,480));
        panel16.add(assistants2, BorderLayout.NORTH);
        JButton add_assi = new JButton("Adauga");
        add_assi.setFont(new Font("Serif", Font.PLAIN, 25));
        panel16.add(add_assi);
        grid6.add(panel16);

        grid3.add(grid5);
        grid3.add(grid6);



        panelB.add(grid3);


        JPanel grid4 = new JPanel(new GridLayout(1,2));
        grid4.setOpaque(false);
        grid4.setPreferredSize(d2);

        JPanel grid7 = new JPanel(new GridLayout(1,2));
        grid7.setOpaque(false);
        grid7.setBorder(BorderFactory.createTitledBorder("STUDENTI  "));
        ((javax.swing.border.TitledBorder)grid7.getBorder()).setTitleColor(Color.LIGHT_GRAY);

        JPanel grid8 = new JPanel(new GridLayout(1,2));
        grid8.setOpaque(false);
        grid8.setBorder(BorderFactory.createTitledBorder("GRUPE  "));
        ((javax.swing.border.TitledBorder)grid8.getBorder()).setTitleColor(Color.LIGHT_GRAY);

        JPanel panel30 = new JPanel(new BorderLayout());
        panel30.setOpaque(false);
        JButton del_stud = new JButton("Sterge");
        del_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        panel30.add(del_stud, BorderLayout.NORTH);
        JList<String> list_students = new JList<>();
        list_students.setFont(new Font("Serif", Font.PLAIN, 25));
        list_students.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane students1 = new JScrollPane(list_students);
        students1.setPreferredSize(new Dimension(300,210));
        students1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel30.add(students1, BorderLayout.CENTER);
        JPanel panel31 = new JPanel(new GridLayout(2,1));
        JComboBox<String> comboGroup = new JComboBox<>();
        comboGroup.setFont(new Font("Serif", Font.PLAIN, 25));
        panel31.add(comboGroup);
        panel31.setOpaque(false);
        JButton move_stud = new JButton("Muta");
        move_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        panel31.add(move_stud);
        panel30.add(panel31, BorderLayout.SOUTH);
        grid7.add(panel30);



        JPanel panel38 = new JPanel(new BorderLayout());
        panel38.setOpaque(false);
        JList<String> list_students2 = new JList<>();
        list_students2.setFont(new Font("Serif", Font.PLAIN, 25));
        list_students2.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane students2 = new JScrollPane(list_students2);
        students2.setPreferredSize(new Dimension(300,210));
        students2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel38.add(students2, BorderLayout.CENTER);
        JPanel panel39 = new JPanel(new GridLayout(2,1));
        panel39.setOpaque(false);
        JComboBox<String> comboGroup2 = new JComboBox<>();
        comboGroup2.setFont(new Font("Serif", Font.PLAIN, 25));
        panel39.add(comboGroup2);
        JButton add_stud = new JButton("Adauga");
        add_stud.setFont(new Font("Serif", Font.PLAIN, 25));
        panel39.add(add_stud);
        panel38.add(panel39, BorderLayout.SOUTH);
        grid7.add(panel38);



        JPanel panel40 = new JPanel(new BorderLayout());
        panel40.setOpaque(false);
        JButton del_group = new JButton("Sterge");
        del_group.setFont(new Font("Serif", Font.PLAIN, 25));
        panel40.add(del_group, BorderLayout.NORTH);
        JPanel panel51 = new JPanel(new GridLayout(2,1));
        panel51.setOpaque(false);
        JList<String> list_null_groups = new JList<>();
        list_null_groups.setFont(new Font("Serif", Font.PLAIN, 25));
        list_null_groups.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane null_group = new JScrollPane(list_null_groups);
        null_group.setPreferredSize(new Dimension(300,100));
        null_group.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel51.add(null_group);
        JList<String> list_groups = new JList<>();
        list_groups.setFont(new Font("Serif", Font.PLAIN, 25));
        list_groups.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane group = new JScrollPane(list_groups);
        group.setPreferredSize(new Dimension(300,100));
        group.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel51.add(group);
        panel40.add(panel51, BorderLayout.CENTER);
        JPanel panel41 = new JPanel(new GridLayout(2,1));
        panel41.setOpaque(false);
        JComboBox<String> comboAssi = new JComboBox<>();
        comboAssi.setFont(new Font("Serif", Font.PLAIN, 25));
        panel41.add(comboAssi);
        JButton add_assis = new JButton("Schimba");
        add_assis.setFont(new Font("Serif", Font.PLAIN, 25));
        panel41.add(add_assis);
        panel40.add(panel41, BorderLayout.SOUTH);
        grid8.add(panel40);




        JPanel panel42 = new JPanel(new BorderLayout());
        panel42.setOpaque(false);
        JPanel panel43 = new JPanel(new GridLayout(2,1));
        panel43.setOpaque(false);
        JTextField name_group = new JTextField();
        name_group.setFont(new Font("Serif", Font.PLAIN, 25));
        panel43.add(name_group);
        JComboBox<String> comboAssi2 = new JComboBox<>();
        comboAssi2.setFont(new Font("Serif", Font.PLAIN, 25));
        panel43.add(comboAssi2);
        panel42.add(panel43, BorderLayout.NORTH);
        JList<String> list_allStudents = new JList<>();
        list_allStudents.setFont(new Font("Serif", Font.PLAIN, 25));
        list_allStudents.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane allStudents = new JScrollPane(list_allStudents);
        allStudents.setPreferredSize(new Dimension(300,210));
        allStudents.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel42.add(allStudents, BorderLayout.CENTER);
        JButton create_group = new JButton("Creaza");
        create_group.setFont(new Font("Serif", Font.PLAIN, 25));
        panel42.add(create_group, BorderLayout.SOUTH);
        grid8.add(panel42);

        grid4.add(grid7);
        grid4.add(grid8);

        panelC.add(grid4);

        JPanel grid9 = new JPanel(new GridLayout(1,3));
        grid9.setPreferredSize(d2);
        grid9.setOpaque(false);
        JPanel grid10 = new JPanel(new GridLayout(3,1));
        grid10.setOpaque(false);
        JPanel grid11 = new JPanel(new GridLayout(2,1));
        grid11.setOpaque(false);
        JPanel grid12 = new JPanel(new GridLayout(2,1));
        grid12.setOpaque(false);
        String type_list[]= {"Prag examen si activitate", "Prag medie finala"};
        JComboBox<String> list_type = new JComboBox<>(type_list);
        list_type.setFont(new Font("Serif", Font.PLAIN, 20));
        grid11.add(list_type);
        JTextField course_name2 = new JTextField();
        course_name2.setFont(new Font("Serif", Font.PLAIN, 20));
        grid11.add(course_name2);
        grid10.add(grid11);
        SpinnerModel val3 = new SpinnerNumberModel(1,  1,  10, 1);
        JSpinner credits2 = new JSpinner(val3);
        credits2.setFont(new Font("Serif", Font.PLAIN, 20));
        grid12.add(credits2);
        String strat_list2[]= {"Cea mai mare nota in examen", "Cea mai mare nota la activitate", "Cea mai mare medie totala"};
        JComboBox<String> list_strat2 = new JComboBox<>(strat_list2);
        list_strat2.setFont(new Font("Serif", Font.PLAIN, 20));
        grid12.add(list_strat2);
        grid10.add(grid12);
        String assi3_list[]= new String[assistants.size()];
        n = 0;
        for(Assistant i: assistants){
            assi3_list[n] = i.getLastName() + " " + i.getFirstName();
            n++;
        }
        JList<String> list_assi3 = new JList<>(assi3_list);
        list_assi3.setFont(new Font("Serif", Font.PLAIN, 20));
        list_assi3.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane assi3 = new JScrollPane(list_assi3);
        assi3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        grid10.add(assi3);
        grid9.add(grid10);
        JTextArea textArea2 = new JTextArea();
        textArea2.setFont(new Font("Serif", Font.PLAIN, 20));
        textArea2.setWrapStyleWord(true);
        textArea2.setLineWrap(true);
        JScrollPane desc2 = new JScrollPane(textArea2);
        desc2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        grid9.add(desc2);
        JPanel panel45 = new JPanel(new BorderLayout());
        String dep3_list[]= new String[university.getDepartments().size()];
        n = 0;
        for(Department i: university.getDepartments()){
            dep3_list[n] = i.getName();
            n++;
        }
        JList<String> list_dep3 = new JList<>(dep3_list);
        list_dep3.setFont(new Font("Serif", Font.PLAIN, 20));
        JScrollPane dep3 = new JScrollPane(list_dep3);
        dep3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        dep3.setPreferredSize(new Dimension(400, 500));
        panel45.add(dep3, BorderLayout.NORTH);
        JButton make_course = new JButton("Creaza");
        make_course.setFont(new Font("Serif", Font.PLAIN, 20));
        panel45.add(make_course, BorderLayout.SOUTH);
        grid9.add(panel45);

        panelD.add(grid9);





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
            list_course.setBackground(new Color(80,80,80));
            list_course.setForeground(Color.WHITE);
            list_stud.setBackground(new Color(80,80,80));
            list_stud.setForeground(Color.WHITE);
            best.setForeground(Color.WHITE);
            stud.setForeground(Color.WHITE);
            ok.setBackground(Color.BLACK);
            ok.setForeground(Color.WHITE);
            list_studval.setBackground(new Color(80,80,80));
            list_studval.setForeground(Color.WHITE);
            scrollPane3.getViewport().setBackground(new Color(80,80,80));
            scrollPane2.getViewport().setBackground(new Color(80,80,80));
            scrollPane1.getViewport().setBackground(new Color(80,80,80));

            list_stud3.setBackground(new Color(80,80,80));
            list_stud3.setForeground(Color.WHITE);
            scrollPane5.getViewport().setBackground(new Color(80,80,80));
            textArea.setBackground(new Color(80,80,80));
            textArea.setForeground(Color.WHITE);

            list_stud3.setBackground(new Color(80,80,80));
            list_stud3.setForeground(Color.WHITE);
            scrollPane5.getViewport().setBackground(new Color(80,80,80));
            list_strat.setBackground(new Color(80,80,80));
            list_strat.setForeground(Color.WHITE);
            save.setBackground(Color.BLACK);
            save.setForeground(Color.WHITE);

            button3.setBackground(Color.BLACK);
            button3.setForeground(Color.WHITE);
            button4.setBackground(Color.BLACK);
            button4.setForeground(Color.WHITE);

            button5.setBackground(Color.BLACK);
            button5.setForeground(Color.WHITE);
            button6.setBackground(Color.BLACK);
            button6.setForeground(Color.WHITE);
            list_val.setBackground(new Color(80,80,80));
            list_val.setForeground(Color.WHITE);
            scrollPane6.getViewport().setBackground(new Color(80,80,80));


            panelC.setBackground(new Color(80,80,80));
            comboGroup.setForeground(Color.WHITE);
            comboGroup2.setForeground(Color.WHITE);
            comboAssi.setForeground(Color.WHITE);
            comboAssi2.setForeground(Color.WHITE);
            comboGroup.setBackground(new Color(80,80,80));
            comboGroup2.setBackground(new Color(80,80,80));
            comboAssi.setBackground(new Color(80,80,80));
            comboAssi2.setBackground(new Color(80,80,80));
            save.setForeground(Color.WHITE);
            save.setBackground(Color.BLACK);
            list_departments.setForeground(Color.WHITE);
            list_departments.setBackground(new Color(80,80,80));
            departments1.getViewport().setBackground(new Color(80,80,80));
            delete_dep.setForeground(Color.WHITE);
            delete_dep.setBackground(Color.BLACK);
            list_departments2.setForeground(Color.WHITE);
            list_departments2.setBackground(new Color(80,80,80));
            departments2.getViewport().setBackground(new Color(80,80,80));
            add_dep.setForeground(Color.WHITE);
            add_dep.setBackground(Color.BLACK);
            list_assistants.setForeground(Color.WHITE);
            list_assistants.setBackground(new Color(80,80,80));
            assistants1.getViewport().setBackground(new Color(80,80,80));
            delete_assi.setForeground(Color.WHITE);
            delete_assi.setBackground(Color.BLACK);
            list_assistants2.setForeground(Color.WHITE);
            list_assistants2.setBackground(new Color(80,80,80));
            assistants2.getViewport().setBackground(new Color(80,80,80));
            add_assi.setForeground(Color.WHITE);
            add_assi.setBackground(Color.BLACK);
            del_stud.setForeground(Color.WHITE);
            del_stud.setBackground(Color.BLACK);
            list_students.setForeground(Color.WHITE);
            list_students.setBackground(new Color(80,80,80));
            students1.getViewport().setBackground(new Color(80,80,80));
            move_stud.setForeground(Color.WHITE);
            move_stud.setBackground(Color.BLACK);
            list_students2.setForeground(Color.WHITE);
            list_students2.setBackground(new Color(80,80,80));
            students2.getViewport().setBackground(new Color(80,80,80));
            add_stud.setForeground(Color.WHITE);
            add_stud.setBackground(Color.BLACK);
            del_group.setForeground(Color.WHITE);
            del_group.setBackground(Color.BLACK);
            list_null_groups.setForeground(Color.WHITE);
            list_null_groups.setBackground(new Color(80,80,80));
            null_group.getViewport().setBackground(new Color(80,80,80));
            list_groups.setForeground(Color.WHITE);
            list_groups.setBackground(new Color(80,80,80));
            group.getViewport().setBackground(new Color(80,80,80));
            add_assis.setForeground(Color.WHITE);
            add_assis.setBackground(Color.BLACK);
            list_allStudents.setForeground(Color.WHITE);
            list_allStudents.setBackground(new Color(80,80,80));
            allStudents.getViewport().setBackground(new Color(80,80,80));
            create_group.setForeground(Color.WHITE);
            create_group.setBackground(Color.BLACK);

            list_strat2.setForeground(Color.WHITE);;
            list_type.setForeground(Color.WHITE);;
            list_strat2.setBackground(new Color(80,80,80));
            list_type.setBackground(new Color(80,80,80));
            textArea2.setForeground(Color.WHITE);;
            textArea2.setBackground(new Color(80,80,80));
            list_assi3.setForeground(Color.WHITE);;
            list_assi3.setBackground(new Color(80,80,80));
            assi3.getViewport().setBackground(new Color(80,80,80));
            desc2.getViewport().setBackground(new Color(80,80,80));
            list_dep3.setForeground(Color.WHITE);;
            list_dep3.setBackground(new Color(80,80,80));
            dep3.getViewport().setBackground(new Color(80,80,80));
            make_course.setForeground(Color.WHITE);
            make_course.setBackground(Color.BLACK);

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
            list_course.setBackground(new Color(238,238,238));
            list_course.setForeground(Color.BLACK);
            list_stud.setBackground(new Color(238,238,238));
            list_stud.setForeground(Color.BLACK);
            best.setForeground(Color.BLACK);
            stud.setForeground(Color.BLACK);
            ok.setBackground(Color.LIGHT_GRAY);
            ok.setForeground(Color.BLACK);
            list_studval.setBackground(new Color(238,238,238));
            list_studval.setForeground(Color.BLACK);
            scrollPane3.getViewport().setBackground(new Color(238,238,238));
            scrollPane2.getViewport().setBackground(new Color(238,238,238));
            scrollPane1.getViewport().setBackground(new Color(238,238,238));

            textArea.setBackground(new Color(238,238,238));
            textArea.setForeground(Color.BLACK);

            list_stud3.setBackground(new Color(238,238,238));
            list_stud3.setForeground(Color.BLACK);
            scrollPane5.getViewport().setBackground(new Color(238,238,238));
            list_strat.setBackground(new Color(238,238,238));
            list_strat.setForeground(Color.BLACK);
            save.setBackground(Color.LIGHT_GRAY);
            save.setForeground(Color.BLACK);

            button3.setBackground(Color.lightGray);
            button3.setForeground(Color.BLACK);
            button4.setBackground(Color.lightGray);
            button4.setForeground(Color.BLACK);

            button5.setBackground(Color.lightGray);
            button5.setForeground(Color.BLACK);
            button6.setBackground(Color.lightGray);
            button6.setForeground(Color.BLACK);
            list_val.setBackground(new Color(238,238,238));
            list_val.setForeground(Color.BLACK);
            scrollPane6.getViewport().setBackground(new Color(238,238,238));


            panelC.setBackground(new Color(238,238,238));
            comboGroup.setForeground(Color.BLACK);
            comboGroup2.setForeground(Color.BLACK);
            comboAssi.setForeground(Color.BLACK);
            comboAssi2.setForeground(Color.BLACK);
            comboGroup.setBackground(new Color(238,238,238));
            comboGroup2.setBackground(new Color(238,238,238));
            comboAssi.setBackground(new Color(238,238,238));
            comboAssi2.setBackground(new Color(238,238,238));
            save.setForeground(Color.BLACK);
            save.setBackground(Color.LIGHT_GRAY);
            list_departments.setForeground(Color.BLACK);
            list_departments.setBackground(new Color(238,238,238));
            departments1.getViewport().setBackground(new Color(238,238,238));
            delete_dep.setForeground(Color.BLACK);
            delete_dep.setBackground(Color.LIGHT_GRAY);
            list_departments2.setForeground(Color.BLACK);
            list_departments2.setBackground(new Color(238,238,238));
            departments2.getViewport().setBackground(new Color(238,238,238));
            add_dep.setForeground(Color.BLACK);
            add_dep.setBackground(Color.LIGHT_GRAY);
            list_assistants.setForeground(Color.BLACK);
            list_assistants.setBackground(new Color(238,238,238));
            assistants1.getViewport().setBackground(new Color(238,238,238));
            delete_assi.setForeground(Color.BLACK);
            delete_assi.setBackground(Color.LIGHT_GRAY);
            list_assistants2.setForeground(Color.BLACK);
            list_assistants2.setBackground(new Color(238,238,238));
            assistants2.getViewport().setBackground(new Color(238,238,238));
            add_assi.setForeground(Color.BLACK);
            add_assi.setBackground(Color.LIGHT_GRAY);
            del_stud.setForeground(Color.BLACK);
            del_stud.setBackground(Color.LIGHT_GRAY);
            list_students.setForeground(Color.BLACK);
            list_students.setBackground(new Color(238,238,238));
            students1.getViewport().setBackground(new Color(238,238,238));
            move_stud.setForeground(Color.BLACK);
            move_stud.setBackground(Color.LIGHT_GRAY);
            list_students2.setForeground(Color.BLACK);
            list_students2.setBackground(new Color(238,238,238));
            students2.getViewport().setBackground(new Color(238,238,238));
            add_stud.setForeground(Color.BLACK);
            add_stud.setBackground(Color.LIGHT_GRAY);
            del_group.setForeground(Color.BLACK);
            del_group.setBackground(Color.LIGHT_GRAY);
            list_null_groups.setForeground(Color.BLACK);
            list_null_groups.setBackground(new Color(238,238,238));
            null_group.getViewport().setBackground(new Color(238,238,238));
            list_groups.setForeground(Color.BLACK);
            list_groups.setBackground(new Color(238,238,238));
            group.getViewport().setBackground(new Color(238,238,238));
            add_assis.setForeground(Color.BLACK);
            add_assis.setBackground(Color.LIGHT_GRAY);
            list_allStudents.setForeground(Color.BLACK);
            list_allStudents.setBackground(new Color(238,238,238));
            allStudents.getViewport().setBackground(new Color(238,238,238));
            create_group.setForeground(Color.BLACK);
            create_group.setBackground(Color.LIGHT_GRAY);

            list_strat2.setForeground(Color.BLACK);
            list_type.setForeground(Color.BLACK);
            list_strat2.setBackground(new Color(238,238,238));
            list_type.setBackground(new Color(238,238,238));
            textArea2.setForeground(Color.BLACK);
            textArea2.setBackground(new Color(238,238,238));
            list_assi3.setForeground(Color.BLACK);
            list_assi3.setBackground(new Color(238,238,238));
            assi3.getViewport().setBackground(new Color(238,238,238));
            desc2.getViewport().setBackground(new Color(238,238,238));
            list_dep3.setForeground(Color.BLACK);
            list_dep3.setBackground(new Color(238,238,238));
            dep3.getViewport().setBackground(new Color(238,238,238));
            make_course.setForeground(Color.BLACK);
            make_course.setBackground(Color.LIGHT_GRAY);

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
                list_course.setBackground(new Color(238,238,238));
                list_course.setForeground(Color.BLACK);
                list_stud.setBackground(new Color(238,238,238));
                list_stud.setForeground(Color.BLACK);
                best.setForeground(Color.BLACK);
                stud.setForeground(Color.BLACK);
                ok.setBackground(Color.LIGHT_GRAY);
                ok.setForeground(Color.BLACK);
                list_studval.setBackground(new Color(238,238,238));
                list_studval.setForeground(Color.BLACK);
                scrollPane3.getViewport().setBackground(new Color(238,238,238));
                scrollPane2.getViewport().setBackground(new Color(238,238,238));
                scrollPane1.getViewport().setBackground(new Color(238,238,238));

                textArea.setBackground(new Color(238,238,238));
                textArea.setForeground(Color.BLACK);

                list_stud3.setBackground(new Color(238,238,238));
                list_stud3.setForeground(Color.BLACK);
                scrollPane5.getViewport().setBackground(new Color(238,238,238));
                list_strat.setBackground(new Color(238,238,238));
                list_strat.setForeground(Color.BLACK);
                save.setBackground(Color.LIGHT_GRAY);
                save.setForeground(Color.BLACK);

                button3.setBackground(Color.lightGray);
                button3.setForeground(Color.BLACK);
                button4.setBackground(Color.lightGray);
                button4.setForeground(Color.black);

                button5.setBackground(Color.lightGray);
                button5.setForeground(Color.BLACK);
                button6.setBackground(Color.lightGray);
                button6.setForeground(Color.BLACK);
                list_val.setBackground(new Color(238,238,238));
                list_val.setForeground(Color.BLACK);
                scrollPane6.getViewport().setBackground(new Color(238,238,238));


                panelC.setBackground(new Color(238,238,238));
                comboGroup.setForeground(Color.BLACK);
                comboGroup2.setForeground(Color.BLACK);
                comboAssi.setForeground(Color.BLACK);
                comboAssi2.setForeground(Color.BLACK);
                comboGroup.setBackground(new Color(238,238,238));
                comboGroup2.setBackground(new Color(238,238,238));
                comboAssi.setBackground(new Color(238,238,238));
                comboAssi2.setBackground(new Color(238,238,238));
                save.setForeground(Color.BLACK);
                save.setBackground(Color.LIGHT_GRAY);
                list_departments.setForeground(Color.BLACK);
                list_departments.setBackground(new Color(238,238,238));
                departments1.getViewport().setBackground(new Color(238,238,238));
                delete_dep.setForeground(Color.BLACK);
                delete_dep.setBackground(Color.LIGHT_GRAY);
                list_departments2.setForeground(Color.BLACK);
                list_departments2.setBackground(new Color(238,238,238));
                departments2.getViewport().setBackground(new Color(238,238,238));
                add_dep.setForeground(Color.BLACK);
                add_dep.setBackground(Color.LIGHT_GRAY);
                list_assistants.setForeground(Color.BLACK);
                list_assistants.setBackground(new Color(238,238,238));
                assistants1.getViewport().setBackground(new Color(238,238,238));
                delete_assi.setForeground(Color.BLACK);
                delete_assi.setBackground(Color.LIGHT_GRAY);
                list_assistants2.setForeground(Color.BLACK);
                list_assistants2.setBackground(new Color(238,238,238));
                assistants2.getViewport().setBackground(new Color(238,238,238));
                add_assi.setForeground(Color.BLACK);
                add_assi.setBackground(Color.LIGHT_GRAY);
                del_stud.setForeground(Color.BLACK);
                del_stud.setBackground(Color.LIGHT_GRAY);
                list_students.setForeground(Color.BLACK);
                list_students.setBackground(new Color(238,238,238));
                students1.getViewport().setBackground(new Color(238,238,238));
                move_stud.setForeground(Color.BLACK);
                move_stud.setBackground(Color.LIGHT_GRAY);
                list_students2.setForeground(Color.BLACK);
                list_students2.setBackground(new Color(238,238,238));
                students2.getViewport().setBackground(new Color(238,238,238));
                add_stud.setForeground(Color.BLACK);
                add_stud.setBackground(Color.LIGHT_GRAY);
                del_group.setForeground(Color.BLACK);
                del_group.setBackground(Color.LIGHT_GRAY);
                list_null_groups.setForeground(Color.BLACK);
                list_null_groups.setBackground(new Color(238,238,238));
                null_group.getViewport().setBackground(new Color(238,238,238));
                list_groups.setForeground(Color.BLACK);
                list_groups.setBackground(new Color(238,238,238));
                group.getViewport().setBackground(new Color(238,238,238));
                add_assis.setForeground(Color.BLACK);
                add_assis.setBackground(Color.LIGHT_GRAY);
                list_allStudents.setForeground(Color.BLACK);
                list_allStudents.setBackground(new Color(238,238,238));
                allStudents.getViewport().setBackground(new Color(238,238,238));
                create_group.setForeground(Color.BLACK);
                create_group.setBackground(Color.LIGHT_GRAY);

                list_strat2.setForeground(Color.BLACK);
                list_type.setForeground(Color.BLACK);
                list_strat2.setBackground(new Color(238,238,238));
                list_type.setBackground(new Color(238,238,238));
                textArea2.setForeground(Color.BLACK);
                textArea2.setBackground(new Color(238,238,238));
                list_assi3.setForeground(Color.BLACK);
                list_assi3.setBackground(new Color(238,238,238));
                assi3.getViewport().setBackground(new Color(238,238,238));
                desc2.getViewport().setBackground(new Color(238,238,238));
                list_dep3.setForeground(Color.BLACK);
                list_dep3.setBackground(new Color(238,238,238));
                dep3.getViewport().setBackground(new Color(238,238,238));
                make_course.setForeground(Color.BLACK);
                make_course.setBackground(Color.LIGHT_GRAY);

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
                list_course.setBackground(new Color(80,80,80));
                list_course.setForeground(Color.WHITE);
                list_stud.setBackground(new Color(80,80,80));
                list_stud.setForeground(Color.WHITE);
                best.setForeground(Color.WHITE);
                stud.setForeground(Color.WHITE);
                ok.setBackground(Color.BLACK);
                ok.setForeground(Color.WHITE);
                list_studval.setBackground(new Color(80,80,80));
                list_studval.setForeground(Color.WHITE);
                scrollPane3.getViewport().setBackground(new Color(80,80,80));
                scrollPane2.getViewport().setBackground(new Color(80,80,80));
                scrollPane1.getViewport().setBackground(new Color(80,80,80));

                textArea.setBackground(new Color(80,80,80));
                textArea.setForeground(Color.WHITE);

                list_stud3.setBackground(new Color(80,80,80));
                list_stud3.setForeground(Color.WHITE);
                scrollPane5.getViewport().setBackground(new Color(80,80,80));
                list_strat.setBackground(new Color(80,80,80));
                list_strat.setForeground(Color.WHITE);
                save.setBackground(Color.BLACK);
                save.setForeground(Color.WHITE);

                button3.setBackground(Color.BLACK);
                button3.setForeground(Color.WHITE);
                button4.setBackground(Color.BLACK);
                button4.setForeground(Color.WHITE);

                button5.setBackground(Color.BLACK);
                button5.setForeground(Color.WHITE);
                button6.setBackground(Color.BLACK);
                button6.setForeground(Color.WHITE);
                list_val.setBackground(new Color(80,80,80));
                list_val.setForeground(Color.WHITE);
                scrollPane6.getViewport().setBackground(new Color(80,80,80));


                panelC.setBackground(new Color(80,80,80));
                comboGroup.setForeground(Color.WHITE);
                comboGroup2.setForeground(Color.WHITE);
                comboAssi.setForeground(Color.WHITE);
                comboAssi2.setForeground(Color.WHITE);
                comboGroup.setBackground(new Color(80,80,80));
                comboGroup2.setBackground(new Color(80,80,80));
                comboAssi.setBackground(new Color(80,80,80));
                comboAssi2.setBackground(new Color(80,80,80));
                save.setForeground(Color.WHITE);
                save.setBackground(Color.BLACK);
                list_departments.setForeground(Color.WHITE);
                list_departments.setBackground(new Color(80,80,80));
                departments1.getViewport().setBackground(new Color(80,80,80));
                delete_dep.setForeground(Color.WHITE);
                delete_dep.setBackground(Color.BLACK);
                list_departments2.setForeground(Color.WHITE);
                list_departments2.setBackground(new Color(80,80,80));
                departments2.getViewport().setBackground(new Color(80,80,80));
                add_dep.setForeground(Color.WHITE);
                add_dep.setBackground(Color.BLACK);
                list_assistants.setForeground(Color.WHITE);
                list_assistants.setBackground(new Color(80,80,80));
                assistants1.getViewport().setBackground(new Color(80,80,80));
                delete_assi.setForeground(Color.WHITE);
                delete_assi.setBackground(Color.BLACK);
                list_assistants2.setForeground(Color.WHITE);
                list_assistants2.setBackground(new Color(80,80,80));
                assistants2.getViewport().setBackground(new Color(80,80,80));
                add_assi.setForeground(Color.WHITE);
                add_assi.setBackground(Color.BLACK);
                del_stud.setForeground(Color.WHITE);
                del_stud.setBackground(Color.BLACK);
                list_students.setForeground(Color.WHITE);
                list_students.setBackground(new Color(80,80,80));
                students1.getViewport().setBackground(new Color(80,80,80));
                move_stud.setForeground(Color.WHITE);
                move_stud.setBackground(Color.BLACK);
                list_students2.setForeground(Color.WHITE);
                list_students2.setBackground(new Color(80,80,80));
                students2.getViewport().setBackground(new Color(80,80,80));
                add_stud.setForeground(Color.WHITE);
                add_stud.setBackground(Color.BLACK);
                del_group.setForeground(Color.WHITE);
                del_group.setBackground(Color.BLACK);
                list_null_groups.setForeground(Color.WHITE);
                list_null_groups.setBackground(new Color(80,80,80));
                null_group.getViewport().setBackground(new Color(80,80,80));
                list_groups.setForeground(Color.WHITE);
                list_groups.setBackground(new Color(80,80,80));
                group.getViewport().setBackground(new Color(80,80,80));
                add_assis.setForeground(Color.WHITE);
                add_assis.setBackground(Color.BLACK);
                list_allStudents.setForeground(Color.WHITE);
                list_allStudents.setBackground(new Color(80,80,80));
                allStudents.getViewport().setBackground(new Color(80,80,80));
                create_group.setForeground(Color.WHITE);
                create_group.setBackground(Color.BLACK);

                list_strat2.setForeground(Color.WHITE);;
                list_type.setForeground(Color.WHITE);;
                list_strat2.setBackground(new Color(80,80,80));
                list_type.setBackground(new Color(80,80,80));
                textArea2.setForeground(Color.WHITE);;
                textArea2.setBackground(new Color(80,80,80));
                list_assi3.setForeground(Color.WHITE);;
                list_assi3.setBackground(new Color(80,80,80));
                assi3.getViewport().setBackground(new Color(80,80,80));
                desc2.getViewport().setBackground(new Color(80,80,80));
                list_dep3.setForeground(Color.WHITE);;
                list_dep3.setBackground(new Color(80,80,80));
                dep3.getViewport().setBackground(new Color(80,80,80));
                make_course.setForeground(Color.WHITE);
                make_course.setBackground(Color.BLACK);

            }
        });


        button3.addActionListener(e -> {
            for (Course i:  university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())){
                    if(i.getAllStudents().size() != 0) {
                        if (i.getBestStudent() != null)
                            best.setText(i.getBestStudent().getLastName() + " " + i.getBestStudent().getFirstName());
                        else best.setText("");
                    }
                    textArea.setText(i.getDescription());
                    course_name.setText(i.getName());
                    int x=0;
                    int j=0;
                    ArrayList<String> studCNP = new ArrayList<>();
                    String stud_list[] = new String[i.getAllStudents().size()];
                    for(Student k : i.getAllStudents()) {
                        stud_list[j] = k.getLastName() + " " + k.getFirstName() ;
                        studCNP.add(k.getCNP());
                        j++;
                        x++;
                    }
                    DefaultListModel listModel1 = new DefaultListModel();
                    DefaultListModel listModel0 = new DefaultListModel();
                    for(j=0; j<x; j++) {
                        listModel1.addElement(stud_list[j]);
                        listModel0.addElement(stud_list[j]);
                    }
                    list_stud.setModel(listModel1);
                    list_students.setModel(listModel1);


                    x=0;
                    j=0;
                    String studval_list[] = new String[i.getTeacherValidatedGrades(teacher).size()];
                    for(Student k : i.getTeacherValidatedGrades(teacher)) {
                            studval_list[j] = k.getLastName() + " " + k.getFirstName();
                            j++;
                            x++;
                    }
                    DefaultListModel listModel2 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel2.addElement(studval_list[j]);
                    list_studval.setModel(listModel2);

                    x=0;
                    j=0;
                    String stud3_list[] = new String[i.getGraduatedStudents().size()];
                    for(Student k : i.getGraduatedStudents()) {
                        stud3_list[j] = k.getLastName() + " " + k.getFirstName();
                        j++;
                        x++;
                    }
                    DefaultListModel listModel3 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel3.addElement(stud3_list[j]);
                    list_stud3.setModel(listModel3);

                    x=0;
                    j=0;
                    String stud4_list[] = new String[university.getCatalog().getTeacherTODO(teacher, i.getName()).size()];
                    for(ScoreVisitor.Triplet<Student, String, Double> k : university.getCatalog().getTeacherTODO(teacher, i.getName())) {
                        stud4_list[j] = k.getKey().getLastName() + " " + k.getKey().getFirstName() + ": " + String.valueOf(k.getValue2());
                        j++;
                        x++;
                    }
                    DefaultListModel listModel4 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel4.addElement(stud4_list[j]);
                    list_val.setModel(listModel4);

                    x=0;
                    j=0;
                    String assistants_list[] = new String[i.getAssistants().size()];
                    for(Assistant k : i.getAssistants()) {
                        assistants_list[j] = k.getLastName() + " " + k.getFirstName();
                        j++;
                        x++;
                    }

                    DefaultListModel listModel5 = new DefaultListModel();
                    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel<>();
                    DefaultComboBoxModel comboBoxModel5 = new DefaultComboBoxModel<>();
                    for(j=0; j<x; j++) {
                        listModel5.addElement(assistants_list[j]);
                        comboBoxModel.addElement(assistants_list[j]);
                        comboBoxModel5.addElement(assistants_list[j]);
                    }
                    list_assistants.setModel(listModel5);
                    comboAssi.setModel(comboBoxModel);
                    comboAssi2.setModel(comboBoxModel5);

                    x=0;
                    j=0;
                    ArrayList<String> cnps = new ArrayList<>();
                    for(Assistant k : i.getAssistants())
                        cnps.add(k.getCNP());

                    String assistants_list2[] = new String[assistants.size()];
                    for(Assistant k : assistants)
                        if(!cnps.contains(k.getCNP())) {
                            assistants_list2[j] = k.getLastName() + " " + k.getFirstName();
                            j++;
                            x++;
                    }
                    DefaultListModel listModel6 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel6.addElement(assistants_list2[j]);
                    list_assistants2.setModel(listModel6);

                    x=0;
                    j=0;
                    String department_list[] = new String[university.getDepartments().size()];
                    for(Department k : university.getDepartments()) {
                        if(k.getCourses().contains(i)) {
                            department_list[j] = k.getName();
                            j++;
                            x++;
                        }
                    }
                    DefaultListModel listModel7 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel7.addElement(department_list[j]);
                    list_departments.setModel(listModel7);

                    x=0;
                    j=0;
                    String department2_list[] = new String[university.getDepartments().size()];
                    for(Department k : university.getDepartments()) {
                        if(!k.getCourses().contains(i)) {
                            department2_list[j] = k.getName();
                            j++;
                            x++;
                        }
                    }
                    DefaultListModel listModel8 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel8.addElement(department2_list[j]);
                    list_departments2.setModel(listModel8);

                    x=0;
                    j=0;
                    int j2=0;
                    int j3=0;
                    int x2=0;
                    int x3=0;
                    String group_list[] = new String[i.getGroups().size()];
                    String group_list2[] = new String[i.getGroups().size()];
                    String group_list3[] = new String[i.getGroups().size()];
                    for(Group k : i.getGroups()) {
                        group_list[j] = k.getId();
                        if(k.getAssistant()==null) {
                            group_list2[j] = k.getId();
                            j2++;
                            x2++;
                        }
                        else {
                            group_list3[j] = k.getId();
                            j3++;
                            x3++;
                        }
                        j++;
                        x++;
                    }
                    DefaultListModel listModel9 = new DefaultListModel();
                    DefaultListModel listModel22 = new DefaultListModel();
                    DefaultComboBoxModel comboBoxModel4 = new DefaultComboBoxModel<>();
                    DefaultComboBoxModel comboBoxModel2 = new DefaultComboBoxModel<>();
                    for(j=0; j<x; j++) {
                        comboBoxModel2.addElement(group_list[j]);
                        comboBoxModel4.addElement(group_list[j]);
                    }
                    for(j=0; j<group_list2.length; j++) {
                        listModel9.addElement(group_list2[j]);
                    }
                    for(j=0; j<group_list3.length; j++) {
                        listModel22.addElement(group_list3[j]);
                    }
                    list_null_groups.setModel(listModel9);
                    list_groups.setModel(listModel22);
                    comboGroup.setModel(comboBoxModel2);
                    comboGroup2.setModel(comboBoxModel4);


                    String stud_list2[] = new String[students.size()];
                    for(Student k : students)
                        if(!studCNP.contains(k.getCNP())) {
                            stud_list2[j] = k.getLastName() + " " + k.getFirstName();
                            j++;
                            x++;
                        }
                    DefaultListModel listModel10 = new DefaultListModel();
                    for(j=0; j<x; j++)
                        listModel10.addElement(stud_list2[j]);
                    list_students2.setModel(listModel10);

                    DefaultListModel listModel11 = new DefaultListModel();
                    for(Student k : students){
                        listModel11.addElement(k.getLastName() + " " + k.getFirstName());
                            j++;
                            x++;
                        }

                    list_allStudents.setModel(listModel11);

                }
            }
        });

        ok.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())){
                    for (Student j : i.getAllStudents()){
                        if(((String)list_stud.getSelectedValue()).equals(j.getLastName() + " " + j.getFirstName())){

                            Grade grade = new Grade(i.getName(),j);
                            grade.setExamScore((double)nota.getValue());
                            grade.setTeacher(teacher);
                            i.addGrade(grade);
                            university.getCatalog().notifyObservers(grade);
                            stud.setText("");
                            val.setValue(0);

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

                }
            }
        });

        button4.addActionListener(e -> {
            stud.setText((String)list_stud.getSelectedValue());
        });

        button6.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())){
                    for(ScoreVisitor.Triplet<Student, String, Double> j : university.getCatalog().getTeacherTODO(teacher, i.getName())){
                        if(((String)list_val.getSelectedValue()).equals(j.getKey().getLastName() + " " + j.getKey().getFirstName() + ": " + String.valueOf(j.getValue2()))){

                            Grade grade = new Grade(i.getName(),j.getKey());
                            grade.setExamScore((double)j.getValue2());
                            grade.setTeacher(teacher);
                            i.addGrade(grade);
                            university.getCatalog().notifyObservers(grade);

                            university.getCatalog().removeTeacherTODO(teacher, j);
                            list_val.remove(list_val.getSelectedIndex());

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

                }
            }
        });

        button5.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())){
                    for(ScoreVisitor.Triplet<Student, String, Double> j : university.getCatalog().getTeacherTODO(teacher, i.getName())){

                            Grade grade = new Grade(i.getName(),j.getKey());
                            grade.setExamScore((double)j.getValue2());
                            grade.setTeacher(teacher);
                            i.addGrade(grade);
                            university.getCatalog().notifyObservers(grade);

                            university.getCatalog().removeTeacherTODO(teacher, j);

                            try (FileOutputStream fos = new FileOutputStream("SURSE/infos/catalog.dat");
                                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                                oos.writeObject(university);

                                oos.close();
                                fos.close();

                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                    }
                    list_val.removeAll();

                }
            }
        });





        save.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    if("Cea mai mare nota in examen".equals(String.valueOf(list_strat.getItemAt(list_strat.getSelectedIndex()))))
                        i.strategy = new BestExamScore();
                    if("Cea mai mare nota la activitate".equals(String.valueOf(list_strat.getItemAt(list_strat.getSelectedIndex()))))
                        i.strategy = new BestPartialScore();
                    if("Cea mai mare medie totala".equals(String.valueOf(list_strat.getItemAt(list_strat.getSelectedIndex()))))
                        i.strategy = new BestTotalScore();
                    i.setDescription(textArea.getText());
                    i.setCredits((int)credits.getValue());
                }
            }

            for(Faculty i : university.getFaculty()){
                for(Department j : i.getDepartment()){
                    for(Course k : j.getCourses()){
                        if(k.getName().equals((String)list_course.getSelectedValue())){
                            k.setDescription(textArea.getText());
                            k.setName(course_name.getText());
                        }
                    }
                }
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

        del_stud.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    List<String> studs = list_students.getSelectedValuesList();;
                    System.out.println(studs);
                    for (Student j : i.getAllStudents()) {
                        if (studs.contains(j.getLastName() + " " + j.getFirstName())) {
                            i.getStudentGroup(j).removeStudent(j);
                        }
                    }
                }
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

        delete_assi.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    List<String> assis = list_assistants.getSelectedValuesList();
                    for (Assistant j : i.getAssistants()) {
                        if (assis.contains(j.getLastName() + " " + j.getFirstName())) {
                            for(Group k : i.getGroups())
                                if(k.getAssistant().equals(j))
                                    k.setAssistant(null);
                            i.removeAssistant(j);
                        }
                    }
                }
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

        delete_dep.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    List<String> deps = list_departments.getSelectedValuesList();
                    for(Department j : university.getDepartments())
                        if(deps.contains(j.getName()))
                            j.removeCourse(i.getName());

                }
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

        del_group.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    List<String> groups = list_groups.getSelectedValuesList();
                    for(Group j : i.getGroups())
                        if(groups.contains(j.getId())) {
                            i.removeGroup(j.getId());
                        }
                }
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

        add_dep.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    List<String> deps = list_departments2.getSelectedValuesList();
                    for(Department j : university.getDepartments())
                        if(deps.contains(j.getName()))
                            j.addCourse(i);

                }
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

        add_assis.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    List<String> group2 = list_groups.getSelectedValuesList();
                    for (Group j : i.getGroups()) {
                        if (group2.contains(j.getId())) {
                            for (Assistant k : i.getAssistants())
                                if(String.valueOf(comboAssi.getItemAt(comboAssi.getSelectedIndex())).equals(k.getLastName() + " " + k.getFirstName())) {
                                    i.addAssistant(j.getId(), k);
                                }
                        }
                    }
                    List<String> group3 = list_null_groups.getSelectedValuesList();
                    for (Group j : i.getGroups()) {
                        if (group3.contains(j.getId())) {
                            for (Assistant k : i.getAssistants())
                                if(String.valueOf(comboAssi.getItemAt(comboAssi.getSelectedIndex())).equals(k.getLastName() + " " + k.getFirstName())) {
                                    i.addAssistant(j.getId(), k);
                                }
                        }
                    }
                }
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

        add_stud.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    List<String> studs = list_students2.getSelectedValuesList();
                    for (Student j : students) {
                        if (studs.contains(j.getLastName() + " " + j.getFirstName())) {
                            i.addStudent(String.valueOf(comboGroup2.getItemAt(comboGroup2.getSelectedIndex())), j);
                            i.addGrade(new Grade(i.getName(), j));
                        }
                    }
                }
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

        add_assi.addActionListener(e -> {
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    List<String> assis = list_assistants2.getSelectedValuesList();
                    for (Assistant j : assistants) {
                        if (assis.contains(j.getLastName() + " " + j.getFirstName())) {
                            i.addAssistant(j);
                        }
                    }
                }
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

        move_stud.addActionListener(e -> {
            Course course = null;
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    course = i;
                }
            }

            List<String> studs = list_students.getSelectedValuesList();
            for (Student j : course.getAllStudents()) {
                if (studs.contains(j.getLastName() + " " + j.getFirstName())) {
                    course.changeStudent(String.valueOf(comboGroup.getItemAt(comboGroup.getSelectedIndex())), j);
                }
            }

            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    i = course;
                }
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

        create_group.addActionListener(e -> {
            Group group1 = null;
            Course course = null;
            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    course = i;
                    for (Assistant j : assistants) {
                        if (String.valueOf(comboAssi2.getItemAt(comboAssi2.getSelectedIndex())).equals(j.getLastName() + " " + j.getFirstName())) {
                            group1 = new Group(name_group.getText(), j);
                        }
                    }
                }
            }

            ArrayList<Student> studs2 = new ArrayList<>();
            List<String> studs = list_allStudents.getSelectedValuesList();
            for(Group i : course.getGroups())
                for(Student j : i.getStudents())
                   if(studs.contains(j.getLastName() + " " + j.getFirstName()))
                        studs2.add(j);
            for(Group i : course.getGroups())
                for(Student j : studs2)
                    if(i.getStudents().contains(j))
                        i.removeStudent(j);


            for(Student i : students)
                if(studs.contains(i.getLastName() + " " + i.getFirstName()))
                    group1.addStudent(i);


            course.addGroup(group1);


            for(Group i : course.getGroups()) {
                if (i.getId().equals(group1))
                    i = group1;
            }

            for(Student i : course.getAllStudents()){
                course.addGrade(new Grade(course.getName(), i));
            }

            for (Course i:university.getCatalog().getTeacherCourses(teacher)) {
                if(i.getName().equals((String)list_course.getSelectedValue())) {
                    i = course;
                }
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

        make_course.addActionListener(e ->{
            if(course_name2.getText()!=null){
                Course course = null;
                if(String.valueOf(list_type.getItemAt(list_type.getSelectedIndex())).equals("Prag examen si activitate")){
                    course = new PartialCourse(new PartialCourse.PartialCourseBuilder(course_name2.getText(), (int)credits2.getValue()));
                }
                else{
                    course = new FullCourse(new FullCourse.FullCourseBuilder(course_name2.getText(), (int)credits2.getValue()));
                }
                course.setTeacher(teacher);
                if("Cea mai mare nota in examen".equals(String.valueOf(list_strat2.getItemAt(list_strat2.getSelectedIndex()))))
                    course.strategy = new BestExamScore();
                if("Cea mai mare nota la activitate".equals(String.valueOf(list_strat2.getItemAt(list_strat2.getSelectedIndex()))))
                    course.strategy = new BestPartialScore();
                if("Cea mai mare medie totala".equals(String.valueOf(list_strat2.getItemAt(list_strat2.getSelectedIndex()))))
                    course.strategy = new BestTotalScore();
                if(textArea2.getText()!=null)
                    course.setDescription(textArea2.getText());
                if(list_assi3.getSelectedValues()!=null){
                    List<String> assi = list_assi3.getSelectedValuesList();
                    for(Assistant j : assistants)
                        if(assi.contains(j.getLastName() + " " + j.getFirstName()))
                            course.addAssistant(j);
                }
                if(list_dep3.getSelectedValues()!=null){
                    List<String> dep = list_dep3.getSelectedValuesList();
                    for(Department j : university.getDepartments())
                        if(dep.contains(j.getName()))
                            j.addCourse(course);
                }
                university.getCatalog().addCourse(course);

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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
