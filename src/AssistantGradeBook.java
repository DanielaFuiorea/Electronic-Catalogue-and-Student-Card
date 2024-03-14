import javax.swing.*;
import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AssistantGradeBook {

    public void assistantGradeBook(University university, Assistant assistant, String button_text) {
        JFrame frame = new JFrame();

        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);


        Container pane = frame.getContentPane();
        JTabbedPane tp = new JTabbedPane();
        JPanel panelA = new JPanel(new FlowLayout());

        pane.add(panelA, BorderLayout.CENTER);

        Dimension d = new Dimension(210, 75);
        Dimension d2 = new Dimension(980, 540);


        JPanel grid1 = new JPanel(new GridLayout(1, 5));
        grid1.setPreferredSize(d2);
        grid1.setOpaque(false);
        JPanel panel1 = new JPanel();
        panel1.setOpaque(false);
        panel1.setBorder(BorderFactory.createTitledBorder("CURSURI  "));
        ((javax.swing.border.TitledBorder) panel1.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        String course_list[] = new String[university.getCatalog().getAssistantCourses(assistant).size()];
        int n = 0;
        for (Course i : university.getCatalog().getAssistantCourses(assistant)) {
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
        panel21.setPreferredSize(new Dimension(200, 100));
        panel21.add(button3, BorderLayout.PAGE_END);
        grid1.add(panel21);


        JPanel panel32 = new JPanel(new GridLayout(1, 1));
        JPanel panel33 = new JPanel();
        JPanel panel34 = new JPanel(new FlowLayout());
        panel32.setOpaque(false);
        panel32.setBorder(BorderFactory.createTitledBorder("NOTE DE VALIDAT  "));
        ((javax.swing.border.TitledBorder) panel32.getBorder()).setTitleColor(Color.LIGHT_GRAY);
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

        JPanel panel35 = new JPanel(new GridLayout(2, 1));
        JButton button6 = new JButton("Valid. una");
        button6.setFont(new Font("Serif", Font.PLAIN, 25));
        panel35.setPreferredSize(new Dimension(200, 100));
        JButton button5 = new JButton("Valid. tot");
        button5.setFont(new Font("Serif", Font.PLAIN, 25));
        panel23.setPreferredSize(new Dimension(200, 100));
        panel35.add(button6);
        panel35.add(button5);
        panel23.add(panel35, BorderLayout.PAGE_END);
        panel32.add(panel23);

        grid1.add(panel32);


        JPanel panel2 = new JPanel(new GridLayout(1, 1));
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel(new FlowLayout());
        panel2.setOpaque(false);
        panel2.setBorder(BorderFactory.createTitledBorder("STUDENTI  "));
        ((javax.swing.border.TitledBorder) panel2.getBorder()).setTitleColor(Color.LIGHT_GRAY);
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
        panel22.setPreferredSize(new Dimension(200, 100));
        panel22.add(button4, BorderLayout.PAGE_END);
        panel2.add(panel22);


        JLabel best = new JLabel();
        best.setHorizontalAlignment(JLabel.CENTER);
        best.setVerticalAlignment(JLabel.CENTER);
        best.setFont(new Font("Serif", Font.PLAIN, 25));
        panel4.setBorder(BorderFactory.createTitledBorder("CEL MAI BUN STUDENT  "));
        ((javax.swing.border.TitledBorder) panel4.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel4.setSize(d);
        panel3.add(panel2);
        panel3.add(new JLabel(""));
        panel4.add(best);
        panel3.add(panel4);
        grid1.add(panel3);


        JPanel panel8 = new JPanel(new GridLayout(2, 1));
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel(new FlowLayout());
        panel8.setOpaque(false);
        panel8.setBorder(BorderFactory.createTitledBorder("VALIDARE NOTA  "));
        ((javax.swing.border.TitledBorder) panel8.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel6.setOpaque(false);
        panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
        panel7.setOpaque(false);
        JLabel stud = new JLabel();

        stud.setHorizontalAlignment(JLabel.CENTER);
        stud.setVerticalAlignment(JLabel.CENTER);
        stud.setFont(new Font("Serif", Font.PLAIN, 25));
        panel8.add(stud);
        SpinnerModel val = new SpinnerNumberModel(0, 0, 6, 0.1);
        JSpinner nota = new JSpinner(val);
        nota.setPreferredSize(new Dimension(60, 40));
        nota.setFont(new Font("Serif", Font.PLAIN, 20));
        panel7.add(nota);
        JButton ok = new JButton("Valideaza");
        ok.setPreferredSize(new Dimension(110, 40));
        ok.setFont(new Font("Serif", Font.PLAIN, 18));
        panel7.add(ok);
        panel8.add(panel7);
        panel6.add(panel8);
        JPanel panel9 = new JPanel(new GridLayout(1, 1));
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
        ((javax.swing.border.TitledBorder) panel9.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        panel6.add(panel9);
        grid1.add(panel6);

        JPanel panel13 = new JPanel(new GridLayout(1, 1));
        panel13.setOpaque(false);
        panel13.setBorder(BorderFactory.createTitledBorder("STUDENTI ABSOLVENTI  "));
        ((javax.swing.border.TitledBorder) panel13.getBorder()).setTitleColor(Color.LIGHT_GRAY);
        JList list_stud3 = new JList();
        list_stud3.setOpaque(false);
        list_stud3.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane5 = new JScrollPane();
        scrollPane5.setViewportView(list_stud3);
        list_stud3.setLayoutOrientation(JList.VERTICAL);
        panel13.add(scrollPane5);
        grid1.add(panel13);

        panelA.add(grid1);


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

        if (button_text.equals("\uD83D\uDD06")) {
            day_night.setText("\uD83D\uDD06");
            day_night.setBackground(Color.BLACK);
            day_night.setForeground(Color.WHITE);
            label.setForeground(new Color(60, 60, 60));
            frame.setBackground(Color.darkGray);
            pane.setBackground(Color.darkGray);
            tp.setBackground(Color.BLACK);
            tp.setForeground(Color.WHITE);
            panelA.setBackground(new Color(80, 80, 80));
            list_course.setBackground(new Color(80, 80, 80));
            list_course.setForeground(Color.WHITE);
            list_stud.setBackground(new Color(80, 80, 80));
            list_stud.setForeground(Color.WHITE);
            best.setForeground(Color.WHITE);
            stud.setForeground(Color.WHITE);
            ok.setBackground(Color.BLACK);
            ok.setForeground(Color.WHITE);
            list_studval.setBackground(new Color(80, 80, 80));
            list_studval.setForeground(Color.WHITE);
            scrollPane3.getViewport().setBackground(new Color(80, 80, 80));
            scrollPane2.getViewport().setBackground(new Color(80, 80, 80));
            scrollPane1.getViewport().setBackground(new Color(80, 80, 80));

            list_stud3.setBackground(new Color(80, 80, 80));
            list_stud3.setForeground(Color.WHITE);
            scrollPane5.getViewport().setBackground(new Color(80, 80, 80));

            list_stud3.setBackground(new Color(80, 80, 80));
            list_stud3.setForeground(Color.WHITE);
            scrollPane5.getViewport().setBackground(new Color(80, 80, 80));

            button3.setBackground(Color.BLACK);
            button3.setForeground(Color.WHITE);
            button4.setBackground(Color.BLACK);
            button4.setForeground(Color.WHITE);

            button5.setBackground(Color.BLACK);
            button5.setForeground(Color.WHITE);
            button6.setBackground(Color.BLACK);
            button6.setForeground(Color.WHITE);
            list_val.setBackground(new Color(80, 80, 80));
            list_val.setForeground(Color.WHITE);
            scrollPane6.getViewport().setBackground(new Color(80, 80, 80));


        } else {
            day_night.setText("\uD83C\uDF19");
            day_night.setBackground(Color.lightGray);
            day_night.setForeground(Color.BLACK);
            label.setForeground(new Color(240, 240, 240));
            frame.setBackground(Color.white);
            pane.setBackground(Color.white);
            tp.setBackground(Color.lightGray);
            tp.setForeground(Color.BLACK);
            panelA.setBackground(new Color(238, 238, 238));
            list_course.setBackground(new Color(238, 238, 238));
            list_course.setForeground(Color.BLACK);
            list_stud.setBackground(new Color(238, 238, 238));
            list_stud.setForeground(Color.BLACK);
            best.setForeground(Color.BLACK);
            stud.setForeground(Color.BLACK);
            ok.setBackground(Color.LIGHT_GRAY);
            ok.setForeground(Color.BLACK);
            list_studval.setBackground(new Color(238, 238, 238));
            list_studval.setForeground(Color.BLACK);
            scrollPane3.getViewport().setBackground(new Color(238, 238, 238));
            scrollPane2.getViewport().setBackground(new Color(238, 238, 238));
            scrollPane1.getViewport().setBackground(new Color(238, 238, 238));

            list_stud3.setBackground(new Color(238, 238, 238));
            list_stud3.setForeground(Color.BLACK);
            scrollPane5.getViewport().setBackground(new Color(238, 238, 238));

            button3.setBackground(Color.lightGray);
            button3.setForeground(Color.BLACK);
            button4.setBackground(Color.lightGray);
            button4.setForeground(Color.BLACK);

            button5.setBackground(Color.lightGray);
            button5.setForeground(Color.BLACK);
            button6.setBackground(Color.lightGray);
            button6.setForeground(Color.BLACK);
            list_val.setBackground(new Color(238, 238, 238));
            list_val.setForeground(Color.BLACK);
            scrollPane6.getViewport().setBackground(new Color(238, 238, 238));

        }

        frame.setVisible(true);
        frame.setSize(1000, 635);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        day_night.addActionListener(e -> {
            if (day_night.getText().equals("\uD83D\uDD06")) {
                day_night.setText("\uD83C\uDF19");
                day_night.setBackground(Color.lightGray);
                day_night.setForeground(Color.BLACK);
                label.setForeground(new Color(240, 240, 240));
                frame.setBackground(Color.white);
                pane.setBackground(Color.white);
                tp.setBackground(Color.LIGHT_GRAY);
                tp.setForeground(Color.BLACK);
                panelA.setBackground(new Color(238, 238, 238));
                list_course.setBackground(new Color(238, 238, 238));
                list_course.setForeground(Color.BLACK);
                list_stud.setBackground(new Color(238, 238, 238));
                list_stud.setForeground(Color.BLACK);
                best.setForeground(Color.BLACK);
                stud.setForeground(Color.BLACK);
                ok.setBackground(Color.LIGHT_GRAY);
                ok.setForeground(Color.BLACK);
                list_studval.setBackground(new Color(238, 238, 238));
                list_studval.setForeground(Color.BLACK);
                scrollPane3.getViewport().setBackground(new Color(238, 238, 238));
                scrollPane2.getViewport().setBackground(new Color(238, 238, 238));
                scrollPane1.getViewport().setBackground(new Color(238, 238, 238));


                list_stud3.setBackground(new Color(238, 238, 238));
                list_stud3.setForeground(Color.BLACK);
                scrollPane5.getViewport().setBackground(new Color(238, 238, 238));

                button3.setBackground(Color.lightGray);
                button3.setForeground(Color.BLACK);
                button4.setBackground(Color.lightGray);
                button4.setForeground(Color.black);

                button5.setBackground(Color.lightGray);
                button5.setForeground(Color.BLACK);
                button6.setBackground(Color.lightGray);
                button6.setForeground(Color.BLACK);
                list_val.setBackground(new Color(238, 238, 238));
                list_val.setForeground(Color.BLACK);
                scrollPane6.getViewport().setBackground(new Color(238, 238, 238));

            } else {
                day_night.setText("\uD83D\uDD06");
                day_night.setBackground(Color.BLACK);
                day_night.setForeground(Color.WHITE);
                label.setForeground(new Color(60, 60, 60));
                frame.setBackground(Color.darkGray);
                pane.setBackground(Color.darkGray);
                tp.setBackground(Color.BLACK);
                tp.setForeground(Color.WHITE);
                panelA.setBackground(new Color(80, 80, 80));
                list_course.setBackground(new Color(80, 80, 80));
                list_course.setForeground(Color.WHITE);
                list_stud.setBackground(new Color(80, 80, 80));
                list_stud.setForeground(Color.WHITE);
                best.setForeground(Color.WHITE);
                stud.setForeground(Color.WHITE);
                ok.setBackground(Color.BLACK);
                ok.setForeground(Color.WHITE);
                list_studval.setBackground(new Color(80, 80, 80));
                list_studval.setForeground(Color.WHITE);
                scrollPane3.getViewport().setBackground(new Color(80, 80, 80));
                scrollPane2.getViewport().setBackground(new Color(80, 80, 80));
                scrollPane1.getViewport().setBackground(new Color(80, 80, 80));


                list_stud3.setBackground(new Color(80, 80, 80));
                list_stud3.setForeground(Color.WHITE);
                scrollPane5.getViewport().setBackground(new Color(80, 80, 80));


                button3.setBackground(Color.BLACK);
                button3.setForeground(Color.WHITE);
                button4.setBackground(Color.BLACK);
                button4.setForeground(Color.WHITE);

                button5.setBackground(Color.BLACK);
                button5.setForeground(Color.WHITE);
                button6.setBackground(Color.BLACK);
                button6.setForeground(Color.WHITE);
                list_val.setBackground(new Color(80, 80, 80));
                list_val.setForeground(Color.WHITE);
                scrollPane6.getViewport().setBackground(new Color(80, 80, 80));

            }
        });


        button3.addActionListener(e -> {
            for (Course i : university.getCatalog().getAssistantCourses(assistant)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    if (i.getBestStudent() != null)
                        best.setText(i.getBestStudent().getLastName() + " " + i.getBestStudent().getFirstName());
                    int x = 0;
                    int j = 0;
                    String stud_list[] = new String[i.getAllStudents().size()];
                    for (Student k : i.getAllStudents()) {
                        stud_list[j] = k.getLastName() + " " + k.getFirstName();
                        j++;
                        x++;
                    }
                    DefaultListModel listModel1 = new DefaultListModel();
                    for (j = 0; j < x; j++)
                        listModel1.addElement(stud_list[j]);
                    list_stud.setModel(listModel1);


                    x = 0;
                    j = 0;
                    String studval_list[] = new String[i.getAsistantValidatedGrades(assistant).size()];
                    for (Student k : i.getAsistantValidatedGrades(assistant)) {
                        studval_list[j] = k.getLastName() + " " + k.getFirstName();
                        j++;
                        x++;
                    }
                    DefaultListModel listModel2 = new DefaultListModel();
                    for (j = 0; j < x; j++)
                        listModel2.addElement(studval_list[j]);
                    list_studval.setModel(listModel2);

                    x = 0;
                    j = 0;
                    String stud3_list[] = new String[i.getGraduatedStudents().size()];
                    for (Student k : i.getGraduatedStudents()) {
                        stud3_list[j] = k.getLastName() + " " + k.getFirstName();
                        j++;
                        x++;
                    }
                    DefaultListModel listModel3 = new DefaultListModel();
                    for (j = 0; j < x; j++)
                        listModel3.addElement(stud3_list[j]);
                    list_stud3.setModel(listModel3);

                    x = 0;
                    j = 0;
                    String stud4_list[] = new String[university.getCatalog().getAssistantTODO(assistant, i.getName()).size()];
                    for (ScoreVisitor.Triplet<Student, String, Double> k : university.getCatalog().getAssistantTODO(assistant, i.getName())) {
                        stud4_list[j] = k.getKey().getLastName() + " " + k.getKey().getFirstName() + ": " + String.valueOf(k.getValue2());
                        j++;
                        x++;
                    }
                    DefaultListModel listModel4 = new DefaultListModel();
                    for (j = 0; j < x; j++)
                        listModel4.addElement(stud4_list[j]);
                    list_val.setModel(listModel4);

                }
            }
        });

        ok.addActionListener(e -> {
            for (Course i : university.getCatalog().getAssistantCourses(assistant)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    for (Student j : i.getAllStudents()) {
                        if (((String) list_stud.getSelectedValue()).equals(j.getLastName() + " " + j.getFirstName())) {

                            Grade grade = new Grade(i.getName(), j);
                            grade.setPartialScore((double) nota.getValue());
                            grade.setAssistant(assistant);
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
            stud.setText((String) list_stud.getSelectedValue());
        });

        button6.addActionListener(e -> {
            for (Course i : university.getCatalog().getAssistantCourses(assistant)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    for (ScoreVisitor.Triplet<Student, String, Double> j : university.getCatalog().getAssistantTODO(assistant, i.getName())) {
                        if (((String) list_val.getSelectedValue()).equals(j.getKey().getLastName() + " " + j.getKey().getFirstName() + ": " + String.valueOf(j.getValue2()))) {

                            Grade grade = new Grade(i.getName(),j.getKey());
                            grade.setPartialScore((double)j.getValue2());
                            grade.setAssistant(assistant);
                            i.addGrade(grade);
                            university.getCatalog().notifyObservers(grade);

                            university.getCatalog().removeAssistantTODO(assistant, j);
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
            for (Course i : university.getCatalog().getAssistantCourses(assistant)) {
                if (i.getName().equals((String) list_course.getSelectedValue())) {
                    for (ScoreVisitor.Triplet<Student, String, Double> j : university.getCatalog().getAssistantTODO(assistant, i.getName())) {

                        Grade grade = new Grade(i.getName(),j.getKey());
                        grade.setPartialScore((double)j.getValue2());
                        grade.setAssistant(assistant);
                        i.addGrade(grade);
                        university.getCatalog().notifyObservers(grade);

                        university.getCatalog().removeAssistantTODO(assistant, j);

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


    }

}