import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class ParentNotification  implements Serializable {

    public void parentNotification(University university, Parent parent, String button_text){
        JFrame frame = new JFrame();

        Image icon = Toolkit.getDefaultToolkit().getImage("images/icon.png");
        frame.setIconImage(icon);

        Container pane = frame.getContentPane();


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


        JPanel panel1 = new JPanel();
        panel1.setOpaque(false);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));

        JList notifications = new JList();
        for(Observer j : university.getCatalog().getObservers()) {
            if(((Parent)j).getCNP().equals(parent.getCNP())) {
                String notif[]= new String[((Parent) j).getNotifications().size()];
                int n = 0;
                for (Notification i : ((Parent) j).getNotifications()) {
                    notif[n] = i.toString();
                    n++;
                }
                int k;
                DefaultListModel listModel1 = new DefaultListModel();
                for(k=0; k<n; k++)
                    listModel1.addElement(notif[k]);
                notifications.setModel(listModel1);
            }
        }

        notifications.setOpaque(false);
        notifications.setFont(new Font("Serif", Font.PLAIN, 25));
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(notifications);
        notifications.setLayoutOrientation(JList.VERTICAL);
        panel1.add(scrollPane1);

        JPanel panel2 = new JPanel();
        panel2.setOpaque(false);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        JLabel title = new JLabel();
        title.setAlignmentX(JLabel.RIGHT);
        panel2.add(title);
        panel2.add(scrollPane1);


        pane.add(panel2, BorderLayout.CENTER);



        if(button_text.equals("\uD83D\uDD06")) {
            day_night.setText("\uD83D\uDD06");
            day_night.setBackground(Color.BLACK);
            day_night.setForeground(Color.WHITE);
            label.setForeground(new Color(60,60,60));
            frame.setBackground(Color.darkGray);
            pane.setBackground(Color.darkGray);
            scrollPane1.getViewport().setBackground(Color.darkGray);
            notifications.setBackground(Color.darkGray);
            notifications.setForeground(Color.WHITE);
            title.setIcon(new ImageIcon("images/UniCod.png"));
        }
        else{
            day_night.setText("\uD83C\uDF19");
            day_night.setBackground(Color.lightGray);
            day_night.setForeground(Color.BLACK);
            label.setForeground(new Color(240,240,240));
            frame.setBackground(Color.white);
            pane.setBackground(Color.white);
            scrollPane1.getViewport().setBackground(Color.WHITE);
            notifications.setBackground(Color.WHITE);
            notifications.setForeground(Color.BLACK);
            title.setIcon(new ImageIcon("images/UniCod2.png"));
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
                scrollPane1.getViewport().setBackground(Color.WHITE);
                notifications.setBackground(Color.WHITE);
                notifications.setForeground(Color.BLACK);
                title.setIcon(new ImageIcon("images/UniCod2.png"));

            }
            else{
                day_night.setText("\uD83D\uDD06");
                day_night.setBackground(Color.BLACK);
                day_night.setForeground(Color.WHITE);
                label.setForeground(new Color(60,60,60));
                frame.setBackground(Color.darkGray);
                pane.setBackground(Color.darkGray);
                scrollPane1.getViewport().setBackground(Color.darkGray);
                notifications.setBackground(Color.darkGray);
                notifications.setForeground(Color.WHITE);
                title.setIcon(new ImageIcon("images/UniCod.png"));

            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
