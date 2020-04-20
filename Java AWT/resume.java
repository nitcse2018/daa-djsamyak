import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;


public class resume extends Frame implements ActionListener, WindowListener, ItemListener {

    Frame f;
    TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t17, t18, t19, t20, t21, t22;
    TextArea t15, t16, t23, t24, t25;
    Label title, l0, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21,
            l22, l23, l24, l25, l26, l27, l28, l29, l30;
    Checkbox m, c, o;
    CheckboxGroup cbg;
    Choice l;
    Button b;

    resume() {
        f = new Frame();

        Font myFont = new Font("arial", Font.BOLD, 17);

        Font myFont1 = new Font("arial", Font.BOLD, 14);

        title = new Label("RESUME BUILDER");
        title.setBounds(400, 30, 150, 15);
        title.setFont(myFont);

        // personal details

        l0 = new Label("Personal Details");
        l0.setBounds(20, 80, 200, 12);
        l0.setFont(myFont);

        l1 = new Label("First name:");
        l1.setBounds(20, 120, 100, 20);

        t1 = new TextField(50);
        t1.setBounds(120, 120, 150, 20);

        l2 = new Label("Last name:");
        l2.setBounds(20, 150, 100, 20);

        t2 = new TextField(50);
        t2.setBounds(120, 150, 150, 20);

        l3 = new Label("Gender:");
        l3.setBounds(20, 180, 40, 20);

        cbg = new CheckboxGroup();
        m = new Checkbox("Male", cbg, false);
        m.setBounds(120, 180, 40, 20);

        c = new Checkbox("Female", cbg, false);
        c.setBounds(180, 180, 60, 20);

        o = new Checkbox("Others", cbg, false);
        o.setBounds(250, 180, 60, 20);

        l4 = new Label("DOB:");
        l4.setBounds(20, 210, 100, 20);

        t4 = new TextField(10);
        t4.setBounds(120, 210, 150, 20);

        l13 = new Label("Father's Name:");
        l13.setBounds(20, 240, 100, 20);

        t13 = new TextField(50);
        t13.setBounds(120, 240, 150, 20);

        l11 = new Label("Email Address: ");
        l11.setBounds(20, 270, 100, 20);

        t11 = new TextField(50);
        t11.setBounds(120, 270, 150, 20);

        l12 = new Label("Mobile Number:");
        l12.setBounds(20, 300, 100, 20);

        t12 = new TextField(15);
        t12.setBounds(120, 300, 150, 20);

        l14 = new Label("Postal Address:");
        l14.setBounds(20, 330, 100, 20);

        t14 = new TextField(150);
        t14.setBounds(120, 330, 300, 20);

        // educational details

        l5 = new Label("Educational Details");
        l5.setBounds(20, 380, 180, 20);
        l5.setFont(myFont);

        l20 = new Label("Graduation");
        l20.setBounds(20, 410, 180, 20);
        l20.setFont(myFont1);

        l6 = new Label("Institute Name:");
        l6.setBounds(20, 440, 100, 20);

        t6 = new TextField(100);
        t6.setBounds(120, 440, 300, 20);

        l8 = new Label("Branch:");
        l8.setBounds(20, 470, 80, 20);

        t8 = new TextField(10);
        t8.setBounds(120, 470, 200, 20);

        l7 = new Label("Semester:");
        l7.setBounds(20, 500, 80, 20);

        l9 = new Label("CGPA:");
        l9.setBounds(20, 530, 80, 20);

        t9 = new TextField(10);
        t9.setBounds(120, 530, 150, 20);

        l10 = new Label("Area of Interest:");
        l10.setBounds(20, 560, 100, 20);

        t10 = new TextField(20);
        t10.setBounds(120, 560, 150, 20);

        l15 = new Label("Skills:");
        l15.setBounds(20, 590, 100, 20);

        t15 = new TextArea();
        t15.setBounds(120, 590, 200, 70);

        l16 = new Label("Hobbies:");
        l16.setBounds(20, 680, 100, 20);

        t16 = new TextArea();
        t16.setBounds(120, 680, 200, 70);

        // high school

        l21 = new Label("High School");
        l21.setBounds(510, 80, 180, 20);
        l21.setFont(myFont1);

        l17 = new Label("School Name:");
        l17.setBounds(510, 120, 100, 20);

        t17 = new TextField(50);
        t17.setBounds(620, 120, 300, 20);

        l18 = new Label("Year:");
        l18.setBounds(510, 150, 100, 20);

        t18 = new TextField(50);
        t18.setBounds(620, 150, 100, 20);

        l19 = new Label("Percentage/CGPA:");
        l19.setBounds(510, 180, 100, 20);

        t19 = new TextField(50);
        t19.setBounds(620, 180, 100, 20);

        // middle School

        l22 = new Label("Middle School");
        l22.setBounds(510, 220, 180, 20);
        l22.setFont(myFont1);

        l23 = new Label("School Name:");
        l23.setBounds(510, 260, 100, 20);

        t20 = new TextField(50);
        t20.setBounds(620, 260, 300, 20);

        l24 = new Label("Year:");
        l24.setBounds(510, 290, 100, 20);

        t21 = new TextField(50);
        t21.setBounds(620, 290, 100, 20);

        l25 = new Label("Percentage/CGPA:");
        l25.setBounds(510, 320, 100, 20);

        t22 = new TextField(50);
        t22.setBounds(620, 320, 100, 20);

        // work experience

        l26 = new Label("Work Experience");
        l26.setBounds(510, 380, 180, 20);
        l26.setFont(myFont);

        l27 = new Label("Internships:");
        l27.setBounds(510, 420, 100, 20);

        t23 = new TextArea();
        t23.setBounds(620, 420, 250, 80);

        l28 = new Label("Other:");
        l28.setBounds(510, 520, 100, 20);

        t24 = new TextArea();
        t24.setBounds(620, 520, 250, 80);

        // project

        l29 = new Label("Projects");
        l29.setBounds(510, 620, 180, 20);
        l29.setFont(myFont);

        l30 = new Label("Projects:");
        l30.setBounds(510, 660, 100, 20);

        t25 = new TextArea();
        t25.setBounds(620, 660, 250, 100);

        l = new Choice();
        l.setBounds(120, 500, 150, 25);

        l.add("1");
        l.add("2");
        l.add("3");
        l.add("4");
        l.add("5");
        l.add("6");
        l.add("7");
        l.add("8");
        l.add("Completed");

        b = new Button("Submit");
        b.setBounds(450, 800, 70, 20);

        add(title);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(m);
        add(c);
        add(o);
        add(l4);
        add(t4);
        add(l13);
        add(t13);
        add(l11);
        add(t11);
        add(l12);
        add(t12);
        add(l14);
        add(t14);
        add(l5);
        add(l0);
        add(l6);
        add(t6);
        add(l7);
        add(l);
        add(l8);
        add(t8);
        add(l9);
        add(t9);
        add(l10);
        add(t10);
        add(l15);
        add(t15);
        add(l16);
        add(t16);
        add(b);
        add(l17);
        add(t17);
        add(l18);
        add(t18);
        add(l19);
        add(t19);
        add(l20);
        add(l21);
        add(l22);
        add(l23);
        add(l24);
        add(l25);
        add(t20);
        add(t21);
        add(t22);
        add(l26);
        add(l27);
        add(l28);
        add(t23);
        add(t24);
        add(l29);
        add(l30);
        add(t25);

        setLayout(null);

        setSize(950, 950);
        setVisible(true);
        addWindowListener(this);
        b.addActionListener(this);
        m.addItemListener(this);
        c.addItemListener(this);
        o.addItemListener(this);

    }

    @Override
    public void windowClosing(WindowEvent evt) {
        System.exit(0);
    }

    String str = "";

    public void itemStateChanged(ItemEvent e) {

        if (m.getState() == true)
            str = "Male";
        else if (c.getState() == true)
            str = "Female";
        else if (o.getState() == true)
            str = "Other";

    }

    public void actionPerformed(ActionEvent ae) {

        String firstName = t1.getText();
        String lastName = t2.getText();
        String dob = t4.getText();
        String fatherName = t13.getText();
        String emailAddress = t11.getText();
        String contact = t12.getText();
        String address = t14.getText();
        String instituteName = t6.getText();
        String branch = t8.getText();
        String sem = l.getSelectedItem();
        String cg = t9.getText();
        String interest = t10.getText();
        String skills = t15.getText();
        String hobbies = t16.getText();
        String highSchoolName = t17.getText();
        String highYear = t18.getText();
        String highPercent = t19.getText();
        String interSchoolName = t20.getText();
        String interYear = t21.getText();
        String interPercent = t22.getText();
        String Internships = t23.getText();
        String OtherPosts = t24.getText();
        String ProjectsDetails = t25.getText();

        try {
            FileWriter fw = new FileWriter("Resume.txt");
            fw.write("-----------------------RESUME-------------------------------\n\n\n");
            fw.write("\n\n Personal Details");
            fw.write("\n\n First Name :- " + firstName + "\t");
            fw.write(" Last Name :-" + lastName);
            fw.write("\n\n Sex :-  " + str);
            fw.write("\n\n Date of Birth :-  " + dob);
            fw.write("\n\n Father's Name :-  " + fatherName);
            fw.write("\n\n Email Address :-  " + emailAddress);
            fw.write("\n\n Mobile Number :-  " + contact);
            fw.write("\n\n Postal Address :-  " + address);
            fw.write("\n\n ----------------------------------------------------------------");
            fw.write("\n\n EDUCATIONAL DETAILS");
            fw.write("\n\n GRADUATION");
            fw.write("\n\n Institute name :- " + instituteName);
            fw.write("\n\n Branch :- " + branch);
            fw.write("\n\n Semester :- " + sem);
            fw.write("\n\n CGPA :- " + cg);
            fw.write("\n\n Interest :- " + interest);
            fw.write("\n\n Skills :- " + skills);
            fw.write("\n\n Hobbies :- " + hobbies);
            fw.write("\n\n HIGH SCHOOL");
            fw.write("\n\n School name :- " + highSchoolName);
            fw.write("\n\n Year :- " + highYear);
            fw.write("\n\n Percentage :- " + highPercent);
            fw.write("\n\n INTERMEDIATE");
            fw.write("\n\n School name :- " + interSchoolName);
            fw.write("\n\n Year :- " + interYear);
            fw.write("\n\n Percentage :- " + interPercent);
            fw.write("\n\n WORK EXPERIENCE");
            fw.write("\n\n Internships :- " + Internships);
            fw.write("\n\n Others :- " + OtherPosts);
            fw.write("\n\n PROJECT DETAILS");
            fw.write("\n\n Projects Details :- " + ProjectsDetails);

            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");

    }

    public static void main(String args[]) {
        new resume();
		 
		
	}
	 @Override public void windowOpened(WindowEvent evt) { }
	   @Override public void windowClosed(WindowEvent evt) { }
	   @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
	   @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
	   @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
	   @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated"); }
	}