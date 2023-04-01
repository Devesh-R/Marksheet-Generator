import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class abc extends JFrame {
    String name;
    Integer age;
    JLabel l1, l2;
    JTextField t1, t2;
    JCheckBox c1, c2, c3;
    JButton b1, b2;
    JComboBox c;
    JRadioButton r1, r2;

    JMenu menu,submenu;
    JMenuItem i1,i2,i3,i4,i5;

    abc() {

        b1 = new JButton("OK");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = t1.getText();
                String a = t2.getText();
                name=n;
                age=Integer.parseInt(a);

                String d ="YOUR NAME IS "+name;
                JFrame f= new JFrame();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                int aa = JOptionPane.showConfirmDialog(f,d);
                if(aa==JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(f,"SUCCESSFULLY SAVED");
                    if(e.getSource()==b1){
                        System.out.println(name+" "+age);
                    }

                    String data= "COUNTRY "+c.getItemAt(c.getSelectedIndex());
                    System.out.println(data);

                    if(c1.isSelected() && c2.isSelected() && c3.isSelected()){
                        System.out.println(name+" is a "+c1.getText()+" "+c2.getText()+" "+c3.getText());
                    }
                    else if(c1.isSelected() && c1.isSelected()){
                        System.out.println(name+" is a "+c1.getText()+" "+c2.getText());
                    }
                    else if(c1.isSelected()){
                        System.out.println(name+" is a "+c1.getText());
                    }
                    else if(c2.isSelected()){
                        System.out.println(name+" is a "+c2.getText());
                    }
                    else if(c3.isSelected()){
                        System.out.println(name+" is a "+c3.getText());
                    }

                    if(r1.isSelected()){
                        System.out.println(name+" is  "+r1.getText());
                    }else if(r1.isSelected()){
                        System.out.println(name+" is  "+r2.getText());
                    }
                    f.dispose();

                }

                else if(aa==JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(f,"NOT SUCCESSFULLY SAVED");

                }

            }
        });

        b1.setBounds(200, 400, 80, 15);

        b2=new JButton("EXIT");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();

            }
        });
        b2.setBounds(400,400,60,16);



        l1 = new JLabel("ENTER YOUR DATA'S", JLabel.CENTER);
        l2 = new JLabel("ENTRY PANNITU PONGA", JLabel.CENTER);
        l2.setBounds(140, 70, 200, 20);
        l1.setBounds(110, 30, 250, 20);


        t1 = new JTextField( "ENTER YOUR NAME",20);
        t1.setBounds(60, 130, 160, 20);
        t2 = new JTextField("ENTER YOUR AGE",20);
        t2.setBounds(280, 130, 150, 20);

        c1 = new JCheckBox("Dancer");
        c1.setBounds(60, 180, 150, 15);
        c2 = new JCheckBox("Singer");
        c2.setBounds(60, 220, 150, 15);
        c3 = new JCheckBox("Athlete");
        c3.setBounds(60, 200, 150, 15);


        String[] country = {"India", "USA", "Indonesia", "France", "UK", "Australia"};
        c = new JComboBox(country);
        c.setBounds(150, 200, 150, 20);


        r1 = new JRadioButton("Male");
        r1.setBounds(320, 200, 150, 15);
        r2 = new JRadioButton("Female");
        r2.setBounds(320, 220, 150, 15);


        ButtonGroup b = new ButtonGroup();
        b.add(r1);
        b.add(r2);

        //menu bar,menu item,menu

        JMenuBar mb= new JMenuBar();
        menu = new JMenu("MENU");
        submenu= new JMenu("SUBMENU");
        i1= new JMenuItem("item 1");
        i2= new JMenuItem("item 2");
        i3= new JMenuItem("item 3");
        i4= new JMenuItem("item 4");
        i5= new JMenuItem("item 5");

        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if(e.getSource()==i3){
                    JFrame f= new JFrame();
                    JOptionPane.showMessageDialog(f,"WELCOME TO ITEM I3");
                //}

            }
        });

        i1.addActionListener(e->{
             if(e.getSource()==i1){
                JFrame f= new JFrame();
                JOptionPane.showMessageDialog(f,"WELCOME TO ITEM I1","WARNING",JOptionPane.WARNING_MESSAGE);
            }
        });

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        menu.add(submenu);
        submenu.add(i4);
        submenu.add(i5);

        mb.add(menu);

        add(c1);
        add(c2);
        add(c3);
        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(c);
        add(r1);
        add(r2);
        add(b1);
        add(b2);


        setJMenuBar(mb);                                //setting a menubar in this frame
        setTitle("BIOGRAPH");
        setSize(500, 500);                  //size of the frame from top left corner in pixels
        setLayout(null);                    //layout that can be to arrange the labels button etc
        setLocationRelativeTo(null);                    //used to bring the frame in center justified
        setVisible(true);                                  //setting the frame to be visible so that it can be viewed by us
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //command to stop frame execution when clicking on close option

    }
}


public class Runner {
    public static void main(String args[]) {
        abc a = new abc();

    }


}
