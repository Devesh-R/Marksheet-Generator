import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import java.awt.font.*;
import java.util.Map;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import javax.swing.table.DefaultTableCellRenderer;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.DB;
import com.mongodb.Cursor;
import com.mongodb.*;
import org.bson.types.ObjectId;
//

class printMarksheet extends JFrame{
   public int check=0;
   void getSheet(printMarksheet pFrame,String inName) throws IOException {
     //  System.out.println("\nHI devesh");
       //  printMarksheet pFrame = new printMarksheet();
       pFrame.setTitle("MARKSHEET GENERATOR");
       pFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //label creation
       JLabel questionLabel = new JLabel("ENTER THE NAME OF THE CANDIDATE |  ");
       questionLabel.setPreferredSize(new Dimension(260, 50));
       JTextArea candNameArea = new JTextArea(1, 7);
       candNameArea.append(inName);
       JPanel somePanel = new JPanel();
       JButton but1 = new JButton("Exit");

       but1.setBounds(160,300,100,18);
       but1.addActionListener(e->{
           pFrame.dispose();
       });

           String someText = candNameArea.getText();
           if (someText.equals("Aadhithya")) {
               check = 1;
           } else if (someText.equals("Deexith")) {
               check = 2;
           } else if (someText.equals("Devesh")) {
               check = 4;
           } else if (someText.equals("Harishma")) {
               check = 3;
           }
//           else if (someText.equals("")) {
//               check = 2;
//           }

//      }
//   });

        somePanel.add(questionLabel);
        somePanel.add(candNameArea);
        pFrame.add(but1);
        pFrame.add(somePanel);
        pFrame.setSize(400,500);
        pFrame.setVisible(true);
    }

        //final String someText;

        //frame creation


}


//

public class marksheet1 extends JFrame{

    void getSecondframe(String mongoName,String mongoGender,String mongoRegno,String mongoDob,String mongos1,String mongos2,String mongos3,String mongos4,String mongos1m,String mongos2m,String mongos3m,String mongos4m) throws IOException {
       // Scanner myObj = new Scanner(System.in);

        //frame creation
        marksheet1 frame = new marksheet1();
        frame.setTitle("ANNA UNIVERSITY DEGREE SHEET");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // final JTextArea textArea =new JTextArea(20,20);
        //JScrollPane scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //  frame.add(scroll);
        //TITLE Table 1
        JLabel l = new JLabel("ANNA UNIVERSITY END SEMESTER EXAMINATIONS GRADE SHEET",SwingConstants.CENTER);
        l.setPreferredSize(new Dimension(400,70));
        l.setFont(new Font("Serif", Font.PLAIN, 12));
        Font font = l.getFont();
        Map attributes = font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        l.setFont(font.deriveFont(attributes));

        //Table 3 creation
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);

        tableModel.addColumn("Sem No.");
        tableModel.addColumn("Course Code");
        tableModel.addColumn("Course Title");
        tableModel.addColumn("Credits");
        tableModel.addColumn("Grade");
        tableModel.addColumn("Result");

        tableModel.addRow(new Object[] { "01", "191CSC404T", mongos1, mongos1m, "A", "PASS"});
        tableModel.addRow(new Object[] { "01", "191CSC404T", mongos2, mongos2m, "A", "PASS"});
        tableModel.addRow(new Object[] { "01", "191CSC404T", mongos3, mongos3m, "A", "PASS"});
        tableModel.addRow(new Object[] { "01", "191CSC404T", mongos4, mongos4m, "A", "PASS"});
        tableModel.addRow(new Object[] { "", "", "\n*** End of Statement ***\n", "", "", ""});

        //row height customization
        table.setRowHeight(table.getRowHeight() + 20);
        table.getColumnModel().getColumn(2).setPreferredWidth(400);
        table.getColumnModel().getColumn(1).setPreferredWidth(250);

        //alignment in table cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        table.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

        //text field
        JLabel lDob = new JLabel("DOB | ");
        //lDob.setPreferredSize(new Dimension(150,200));
        JTextArea dobArea = new JTextArea(mongoDob);
        dobArea.setEditable(false);

        JLabel lName = new JLabel("CANDIDATE NAME | ");
        //lDob.setPreferredSize(new Dimension(150,200));
        //  JTextArea nameArea = new JTextArea("DEEXITH PARANDAMAN");
        JTextArea nameArea = new JTextArea(mongoName);
        nameArea.setEditable(false);

        JLabel lGender = new JLabel("GENDER | ");

        //lGender.setPreferredSize(new Dimension(150,200));
        JTextArea genArea = new JTextArea(mongoGender);
        genArea.setEditable(false);

        JLabel lRegno = new JLabel("REGNO | ");
        //lRegno.setPreferredSize(new Dimension(150,200));
        JTextArea regNoArea = new JTextArea(mongoRegno);
        regNoArea.setEditable(false);

        JLabel lDate = new JLabel("MON-YR | ");
        //lDate.setPreferredSize(new Dimension(150,200));
        JTextArea dateArea = new JTextArea("NOV-2022");
        dateArea.setEditable(false);

        JLabel lColName = new JLabel("COLLEGE | ");
        JTextArea colArea = new JTextArea("EASWARI ENGINEERING COLLEGE");
        colArea.setEditable(false);

        JLabel regulationName = new JLabel("REGULATION | ");
        JTextArea regulationArea = new JTextArea("2019");
        regulationArea.setEditable(false);

        nameArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        colArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        regulationArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        dobArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        genArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        regNoArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        dateArea.setBorder(BorderFactory.createCompoundBorder(colArea.getBorder(),BorderFactory.createEmptyBorder(5, 5, 5, 5)));

        //icon
        Image icon = Toolkit.getDefaultToolkit().getImage("/Users/devesh/Intellij/Marksheet/src/main/java/Anna_University_Logo.svg.png");


        //image left
        BufferedImage img = ImageIO.read(new File("/Users/devesh/Intellij/Marksheet/src/main/java/Easwari_Engineering_College_logo.png"));

        Image dimg = img.getScaledInstance(50, 50, Image.SCALE_DEFAULT);

        ImageIcon imageIcon = new ImageIcon(dimg);
        JLabel picLabel = new JLabel(imageIcon);

        //image Right
        BufferedImage imgRight = ImageIO.read(new File("/Users/devesh/Intellij/Marksheet/src/main/java/graduate.jpg"));

        Image dimgRight = imgRight.getScaledInstance(50, 50, Image.SCALE_DEFAULT);

        ImageIcon imageIconRight = new ImageIcon(dimgRight);
        JLabel picLabelRight = new JLabel(imageIconRight);


        //final part (Signature, Stamp, Date of issue) ((width,height))
        BufferedImage sign = ImageIO.read(new File("/Users/devesh/Intellij/Marksheet/src/main/java/sign.png"));
        Image dimgSign = sign.getScaledInstance(100, 50, Image.SCALE_DEFAULT);
        ImageIcon imageIconSign = new ImageIcon(dimgSign);
        JLabel picLabelSign = new JLabel(imageIconSign);
        picLabelSign.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 60));

        //JLabel signText = new JLabel(" CONTROLLER OF EXAMINATIONS ",JLabel.RIGHT);
       // signText.setForeground(Color.gray);


        BufferedImage stamp = ImageIO.read(new File("/Users/devesh/Intellij/Marksheet/src/main/java/stamp.png"));
        Image dimgStamp = stamp.getScaledInstance(100, 50, Image.SCALE_DEFAULT);
        ImageIcon imageIconStamp = new ImageIcon(dimgStamp);
        JLabel picLabelStamp = new JLabel(imageIconStamp);
        picLabelStamp.setBorder(BorderFactory.createEmptyBorder(10, 60, 10, 60));

        JLabel lIssueDate = new JLabel("DATE OF ISSUE | 14/11/2002");
        lIssueDate.setForeground(Color.gray);

        //panel where all components are going to be added

        JPanel p = new JPanel();
        JPanel top = new JPanel();
        JPanel mid1 = new JPanel();
        JPanel mid2 = new JPanel();
        JPanel mid3 = new JPanel();
        JPanel bottom = new JPanel();
        JPanel signPanel = new JPanel();

        //adding all components in the panel

       // signPanel.add(signText);

        bottom.add(picLabelStamp);
        bottom.add(lIssueDate);
        bottom.add(picLabelSign);

        top.add(picLabel);
        top.add(l);
        top.add(picLabelRight);

        mid1.add(lName);
        mid1.add(nameArea);

        mid2.add(lDob);
        mid2.add(dobArea);

        mid1.add(lRegno);
        mid1.add(regNoArea);

        mid2.add(lGender);
        mid2.add(genArea);

        mid2.add(lDate);
        mid2.add(dateArea);

        mid3.add(lColName);
        mid3.add(colArea);

        mid3.add(regulationName);
        mid3.add(regulationArea);

        //subpanels
        p.add(top);
        p.add(mid1);
        p.add(mid2);
        p.add(mid3);

        //this table is directly added without inserting in a subpanel
        p.add(new JScrollPane(table));
        p.add(bottom);
        p.add(signPanel);

        //added panel to frame
        frame.add(p);


        //frame visibility
        frame.setIconImage(icon);
        frame.setSize(700,1000);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        //frame.setLayout(null);


    }

    public static void main(String args[]) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String inName;
        System.out.println("\nEnter the candidate name :");
        inName=sc.next();

        marksheet1 marks = new marksheet1();
        printMarksheet pFrame= new printMarksheet();
        pFrame.getSheet(pFrame,inName);


        //int input;
        //variable declaration for db
        String mongoDob=null,mongoName = null,mongoRegno=null,mongoGender=null,mongos1=null,mongos2=null,mongos3=null,mongos4=null,mongos1m=null,mongos2m=null,mongos3m=null,mongos4m=null;
        //mongo client creation

        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        DB db = mongoClient.getDB("Marksheet");
        // MongoDatabase db=mongoClient.getDatabase("Marksheet");
        DBCollection mongoTable = (DBCollection) db.getCollection("marks");
        //  MongoCollection<Document> mongoTable=db.getCollection("marks");
        DBCursor cursor = mongoTable.find();


        //DBCursor cursor = mongoTable.find();
        // while(cursor.hasNext()) {
        DBObject obj= cursor.next();

       // System.out.println("\nEnter the Student marksheet you want to print : \n1.AADHITHYA\n2.DEEXITH\n3.HARISHMA\n4.DEVESH\n");
       //  input=sc.nextInt();
        switch (pFrame.check) {
            case 1 -> {

                // System.out.println(cursor.next());
                mongoName = (String) obj.get("name");
                mongoRegno = (String) obj.get("regno");
                mongoGender = (String) obj.get("gender");
                mongos1m = (String) obj.get("s1m");
                mongos2m = (String) obj.get("sm2");
                mongos3m = (String) obj.get("sm3");
                mongos4m = (String) obj.get("s4m");
                mongos1 = (String) obj.get("s1");
                mongos2 = (String) obj.get("s2");
                mongos3 = (String) obj.get("s3");
                mongos4 = (String) obj.get("s4");
                mongoDob = (String) obj.get("dob");
                marks.getSecondframe(mongoName, mongoGender, mongoRegno, mongoDob, mongos1, mongos2, mongos3, mongos4, mongos1m, mongos2m, mongos3m
                        , mongos4m);
            }
            case 2 -> {
                // System.out.println(cursor.next());
                obj = cursor.next();
                mongoName = (String) obj.get("name");
                mongoRegno = (String) obj.get("regno");
                mongoGender = (String) obj.get("gender");
                mongos1m = (String) obj.get("s1m");
                mongos2m = (String) obj.get("sm2");
                mongos3m = (String) obj.get("sm3");
                mongos4m = (String) obj.get("s4m");
                mongos1 = (String) obj.get("s1");
                mongos2 = (String) obj.get("s2");
                mongos3 = (String) obj.get("s3");
                mongos4 = (String) obj.get("s4");
                mongoDob = (String) obj.get("dob");
                marks.getSecondframe(mongoName, mongoGender, mongoRegno, mongoDob, mongos1, mongos2, mongos3, mongos4, mongos1m, mongos2m, mongos3m
                        , mongos4m);
            }
            case 3 -> {
                // System.out.println(cursor.next());
                obj = cursor.next();
                obj = cursor.next();
                mongoName = (String) obj.get("name");
                mongoRegno = (String) obj.get("regno");
                mongoGender = (String) obj.get("gender");
                mongos1m = (String) obj.get("s1m");
                mongos2m = (String) obj.get("sm2");
                mongos3m = (String) obj.get("sm3");
                mongos4m = (String) obj.get("s4m");
                mongos1 = (String) obj.get("s1");
                mongos2 = (String) obj.get("s2");
                mongos3 = (String) obj.get("s3");
                mongos4 = (String) obj.get("s4");
                mongoDob = (String) obj.get("dob");
                marks.getSecondframe(mongoName, mongoGender, mongoRegno, mongoDob, mongos1, mongos2, mongos3, mongos4, mongos1m, mongos2m, mongos3m
                        , mongos4m);
            }
            case 4 -> {
                // System.out.println(cursor.next());
                obj = cursor.next();
                obj = cursor.next();
                obj = cursor.next();
                mongoName = (String) obj.get("name");
                mongoRegno = (String) obj.get("regno");
                mongoGender = (String) obj.get("gender");
                mongos1m = (String) obj.get("s1m");
                mongos2m = (String) obj.get("sm2");
                mongos3m = (String) obj.get("sm3");
                mongos4m = (String) obj.get("s4m");
                mongos1 = (String) obj.get("s1");
                mongos2 = (String) obj.get("s2");
                mongos3 = (String) obj.get("s3");
                mongos4 = (String) obj.get("s4");
                mongoDob = (String) obj.get("dob");
                marks.getSecondframe(mongoName, mongoGender, mongoRegno, mongoDob, mongos1, mongos2, mongos3, mongos4, mongos1m, mongos2m, mongos3m
                        , mongos4m);

            }
        }


        //}



        //
        //initialization
        //String semno,courseCode,courseTitle,credits,letterGrade,result;

        //inputs

    }
}