
//importing the packages 
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
import java.awt.Color;

class INGNepal implements ActionListener {

    // initilizing the instances
    ArrayList<StaffHire> staffList = new ArrayList<StaffHire>();
    JFrame frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9, frame10;
    JButton btnAddFullTimeVacancy, btnAddPartTimeVacancy, btnHirePartTimeStaff, btnHireFullTimeStaff,
            btnDisplayPartTime, backB, backB2, backB3, backB4, btnDisplayFullTime, btnTerminateFunction, btnTerminate,
            btnSavePartTimeVacancy, btnSavePartTimeStaff, btnSaveFullTimeVacancy, btnSaveFullTimeStaff, clear1, clear2,
            clear3, clear4, /** displayPartTimeVB, displayFullTimeVB, */
            exit, showNameB;
    JTextField wagesPerHourTF, DesignationTF, VacancyNumPT, jobTypeTF/** for hiting part time staff */
            , joinedDatePTF, staffNamePTF, qualificationPTF, appointedByPTF, lblStaffNameToTerminateTF, vacancyNoFTF,
            designationFTF, jobTypeFTF, salaryFTF, staffNameFTF, joiningDateFTF, qualificationFTF, appointedByFTF;
    // JFormattedTextField joinedDateTF;
    JLabel lblworkingHourPartTime, lblShift, lblWagesPerHour, lblDesignationPartTime, lblVacanyNoPartTime,
            lblJobTypePartTime, /** for part time staff hire */
            lblStaffNamePartTime, lblJoiningDatePartTime, lblQualificationPartTimeStaff, lblAppointedByPartTime,
            lblVacancyNumberPartTime, lblVavancyNoTerminate, lblStaffNameToTerminate, lblVacancyNumberToTerminate,
            lblVacancyFulTimeStaff, lblworkingHourFullTime, lblDesignationFullTime, lbljobTypeFullTime,
            lblSalaryFullTimeStaff, lblStaffNameFullTimeStaff, lblJoiningDateFullTimeStaff,
            lblQualificationFullTimeStaff, lblAppointedByFullTimeStaff, lblVacancyNoFullTimeStaff2;
    JComboBox<Integer> comboWorkingHourPartTime, comboVacancyNumberPartTime, terminatingVacncy,
            comboVacancyNumberFullTime, comboWorkingHourFullTime;
    JComboBox<String> comboShift;
    DefaultTableModel  model2,  model4;
    JTable  table2,  table4;

    INGNepal() {

        // color, title and fonts
        Color c = new Color(255, 255, 255);
        JLabel title3 = new JLabel();
        JLabel title4 = new JLabel();
        title3.setText("Full Time Vacancy Registration Form");
        title4.setText("Full Time Staff Hire Registration Form");

        Font f = new Font("Times New Roman", Font.PLAIN, 25);
        title3.setBounds(50, 20, 400, 70);
        title4.setBounds(50, 20, 400, 70);
        title3.setFont(f);
        title4.setFont(f);

        JLabel title = new JLabel();
        JLabel title2 = new JLabel();
        title.setText("Part Time Vacancy Registration Form");
        title2.setText("Part Time Staff Hire Registration Form");

        title.setBounds(50, 20, 400, 70);
        title2.setBounds(50, 20, 400, 70);
        title.setFont(f);
        title2.setFont(f);
        // frame1
        frame1 = new JFrame("Staff Hire");
        frame1.setSize(700, 400);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // buttons
        btnAddFullTimeVacancy = new JButton("Add vacancy for full time staff");
        btnAddPartTimeVacancy = new JButton("Add vacancy for part time staff");
        btnDisplayPartTime = new JButton("Display part time staff information");
        btnDisplayFullTime = new JButton("Display full time staff information");
        btnTerminateFunction = new JButton("Terminate a staff");
        btnHirePartTimeStaff = new JButton("Hire a part time staff");
        btnHireFullTimeStaff = new JButton("Hire a full time staff");

        exit = new JButton("EXIT");
        // setting bounds
        btnAddPartTimeVacancy.setBounds(50, 40, 300, 40);
        btnAddFullTimeVacancy.setBounds(50, 100, 300, 40);
        btnDisplayPartTime.setBounds(50, 160, 600, 40);
        btnDisplayFullTime.setBounds(50, 220, 600, 40);
        btnTerminateFunction.setBounds(50, 280, 300, 40);
        btnHireFullTimeStaff.setBounds(360, 100, 290, 40);
        btnHirePartTimeStaff.setBounds(360, 40, 290, 40);
        exit.setBounds(360, 280, 290, 40);
        // adding action listener
        btnAddFullTimeVacancy.addActionListener(this);
        btnAddPartTimeVacancy.addActionListener(this);
        btnDisplayFullTime.addActionListener(this);
        btnDisplayPartTime.addActionListener(this);
        btnTerminateFunction.addActionListener(this);

        btnHireFullTimeStaff.addActionListener(this);
        btnHirePartTimeStaff.addActionListener(this);
        exit.addActionListener(this);

        // adding to the frame1
        frame1.add(btnAddFullTimeVacancy);
        frame1.add(btnAddPartTimeVacancy);
        frame1.add(btnDisplayPartTime);
        frame1.add(btnDisplayFullTime);
        frame1.add(btnTerminateFunction);
        frame1.add(exit);
        frame1.add(btnHireFullTimeStaff);
        frame1.add(btnHirePartTimeStaff);
        // frame2
        frame2 = new JFrame("Hire Part Time staff hire");
        backB = new JButton("Go Back");
        backB2 = new JButton("Go Back");
        backB3 = new JButton("Go Back");
        backB4 = new JButton("Go Back");
        lblworkingHourPartTime = new JLabel("Working Hours :");
        comboWorkingHourPartTime = new JComboBox<Integer>();
        lblWagesPerHour = new JLabel("Wages per hour:");
        lblDesignationPartTime = new JLabel("Designation:");
        DesignationTF = new JTextField(25);
        wagesPerHourTF = new JTextField();
        lblVacanyNoPartTime = new JLabel("Vacancy No:");
        VacancyNumPT = new JTextField();
        lblShift = new JLabel("Shift:");
        comboShift = new JComboBox<String>();
        btnSavePartTimeVacancy = new JButton("Save");
        clear1 = new JButton("Clear");
        lblJobTypePartTime = new JLabel("Job Type:");
        jobTypeTF = new JTextField();

        clear1.addActionListener(this);
        btnSavePartTimeVacancy.addActionListener(this);
        backB.addActionListener(this);
        backB2.addActionListener(this);
        backB3.addActionListener(this);
        backB4.addActionListener(this);
        backB.setBounds(50, 300, 100, 40);
        backB2.setBounds(50, 300, 100, 40);
        backB3.setBounds(50, 300, 100, 40);
        backB4.setBounds(50, 300, 100, 40);
        lblworkingHourPartTime.setBounds(50, 100, 300, 40);
        comboWorkingHourPartTime.setBounds(150, 105, 80, 25);
        lblWagesPerHour.setBounds(250, 100, 300, 40);
        wagesPerHourTF.setBounds(350, 105, 100, 25);
        lblDesignationPartTime.setBounds(250, 150, 300, 40);
        DesignationTF.setBounds(350, 160, 100, 25);
        lblJobTypePartTime.setBounds(250, 205, 300, 40);
        jobTypeTF.setBounds(350, 210, 100, 25);
        lblVacanyNoPartTime.setBounds(50, 150, 300, 40);
        VacancyNumPT.setBounds(150, 155, 20, 30);
        VacancyNumPT.setEditable(false);
        lblShift.setBounds(50, 200, 300, 40);
        comboShift.setBounds(150, 205, 80, 30);
        comboShift.addItem("Morning");
        comboShift.addItem("Day");
        comboShift.addItem("Night");
        clear1.setBounds(200, 300, 80, 40);
        btnSavePartTimeVacancy.setBounds(330, 300, 130, 40);
        frame2.setLayout(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(120, 60, 500, 450);
        // frame3
        frame3 = new JFrame();
        // only allowing user to input int in wages per hour
        wagesPerHourTF.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {

                } else {
try{

	Integer.parseInt(String.valueOf(ke.getKeyChar()));
}
catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(frame3, "Warning", "wage cant be in string",
                            JOptionPane.WARNING_MESSAGE);
                    wagesPerHourTF.setText("");
                }
            }}
        });
        for (int i = 4; i < 8; i++) {
            comboWorkingHourPartTime.addItem(i);
        }

        // adding elements to the frame2
        frame2.add(title);
        frame2.getContentPane().setBackground(c);
        frame2.add(backB);
        frame2.add(lblworkingHourPartTime);
        frame2.add(comboWorkingHourPartTime);
        frame2.add(lblWagesPerHour);
        frame2.add(wagesPerHourTF);
        frame2.add(lblDesignationPartTime);
        frame2.add(DesignationTF);
        frame2.add(lblVacanyNoPartTime);
        frame2.add(lblShift);
        frame2.add(comboShift);
        frame2.add(btnSavePartTimeVacancy);
        frame2.add(clear1);
        frame2.add(jobTypeTF);
        frame2.add(lblJobTypePartTime);
        frame2.add(VacancyNumPT);
        // auto increasing the value of vachancy number

      
        // frame4
        lblJoiningDatePartTime = new JLabel("Joining date");
        lblStaffNamePartTime = new JLabel("Staff Name");
        lblQualificationPartTimeStaff = new JLabel("Qualification");
        lblAppointedByPartTime = new JLabel("Appointed By");
        lblVacancyNumberPartTime = new JLabel("vacancy number");
        comboVacancyNumberPartTime = new JComboBox<Integer>();
        btnSavePartTimeStaff = new JButton("save");
        clear2 = new JButton("clear");

        btnSavePartTimeStaff.setBounds(330, 300, 130, 40);
        lblStaffNamePartTime.setBounds(50, 100, 300, 40);
        lblJoiningDatePartTime.setBounds(260, 100, 300, 40);
        lblQualificationPartTimeStaff.setBounds(50, 150, 300, 40);
        lblAppointedByPartTime.setBounds(260, 150, 300, 40);
        comboVacancyNumberPartTime.setBounds(200, 220, 50, 25);
        lblVacancyNumberPartTime.setBounds(50, 210, 300, 40);
        clear2.setBounds(200, 300, 80, 40);
        clear2.addActionListener(this);
        btnSavePartTimeStaff.addActionListener(this);
        joinedDatePTF = new JTextField();
        staffNamePTF = new JTextField();
        qualificationPTF = new JTextField();
        appointedByPTF = new JTextField();

        joinedDatePTF.setBounds(350, 110, 100, 25);
        staffNamePTF.setBounds(150, 110, 100, 25);
        qualificationPTF.setBounds(150, 160, 100, 25);
        appointedByPTF.setBounds(350, 160, 100, 25);

        frame4 = new JFrame("Hire a part time staff");
        frame4.setLayout(null);
        frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame4.add(title2);
        frame4.getContentPane().setBackground(c);
        frame4.setBounds(120, 60, 500, 450);
        frame4.add(backB2);
        frame4.add(lblStaffNamePartTime);
        frame4.add(lblQualificationPartTimeStaff);
        frame4.add(lblJoiningDatePartTime);
        frame4.add(lblAppointedByPartTime);
        frame4.add(joinedDatePTF);
        frame4.add(staffNamePTF);
        frame4.add(qualificationPTF);
        frame4.add(appointedByPTF);
        frame4.add(comboVacancyNumberPartTime);
        frame4.add(lblVacancyNumberPartTime);
        frame4.add(clear2);
        frame4.add(btnSavePartTimeStaff);
        // frame 5 for display of part time staffs
        Object[] column2 = { "vacancy number", "designation", "wages per hour", "Job type", "working hour", "shift",
                "Staff Name", "joining date", "qualification", "appointed by" };
        // Jtable for vacancy of part time staff
        model2 = new DefaultTableModel();
        table2 = new JTable(model2);
        for (int i = 0; i < 10; i++) {
            model2.addColumn(column2[i]);
        }
        frame5 = new JFrame("Display part time staffs");
        JScrollPane sp2 = new JScrollPane(table2);
        frame5.add(sp2);
        frame5.setBounds(100, 100, 900, 500);
        // add columns to model
        // frame6 for terminating the staff
        frame6 = new JFrame("Terminate a staff");
        frame6.setBounds(120, 30, 700, 250);
        frame6.setLayout(null);

        lblStaffNameToTerminate = new JLabel("Staff's name");
        lblVacancyNumberToTerminate = new JLabel("Vacancy Number");
        showNameB = new JButton("show staff name");
        showNameB.setBounds(50, 140, 180, 40);
        showNameB.addActionListener(this);
        btnTerminate = new JButton("Terminate the staff");
        btnTerminate.setBounds(250, 140, 200, 40);
        btnTerminate.addActionListener(this);
        lblStaffNameToTerminateTF = new JTextField();
        lblStaffNameToTerminateTF.setBounds(380, 85, 100, 30);
        terminatingVacncy = new JComboBox<Integer>();
        terminatingVacncy.setBounds(200, 90, 100, 20);
        lblStaffNameToTerminate.setBounds(300, 80, 100, 40);
        lblVacancyNumberToTerminate.setBounds(100, 80, 180, 40);
        frame6.add(lblStaffNameToTerminate);
        frame6.add(lblVacancyNumberToTerminate);
        frame6.add(btnTerminate);
        frame6.add(lblStaffNameToTerminateTF);
        frame6.add(showNameB);
        // frame7 for creating vacancy of full time staff
        frame7 = new JFrame("Create vacancy for full time staff");
        frame7.setBounds(120, 60, 500, 450);
        frame7.setLayout(null);

        vacancyNoFTF = new JTextField();
        lblVacancyFulTimeStaff = new JLabel("Vacancy Number");
        lblworkingHourFullTime = new JLabel("Working Hour");
        lblDesignationFullTime = new JLabel("Designation");
        lbljobTypeFullTime = new JLabel("Job Type");
        lblSalaryFullTimeStaff = new JLabel("Salary");
        comboWorkingHourFullTime = new JComboBox<Integer>();
        designationFTF = new JTextField();
        jobTypeFTF = new JTextField();
        salaryFTF = new JTextField();
        clear3 = new JButton("Clear");
        btnSaveFullTimeVacancy = new JButton("Save");

        for (int i = 8; i < 13; i++) {
            comboWorkingHourFullTime.addItem(i);
        }

        lblVacancyFulTimeStaff.setBounds(50, 150, 300, 40);
        lblworkingHourFullTime.setBounds(50, 100, 300, 40);
        lblDesignationFullTime.setBounds(250, 150, 300, 25);
        lbljobTypeFullTime.setBounds(250, 205, 300, 40);
        lblSalaryFullTimeStaff.setBounds(250, 105, 300, 40);
        vacancyNoFTF.setBounds(150, 160, 30, 20);
        vacancyNoFTF.setEditable(false);
        comboWorkingHourFullTime.setBounds(150, 110, 50, 25);
        designationFTF.setBounds(350, 150, 100, 25);
        jobTypeFTF.setBounds(350, 215, 100, 25);
        salaryFTF.setBounds(350, 115, 100, 25);
        clear3.setBounds(200, 300, 80, 40);
        btnSaveFullTimeVacancy.setBounds(330, 300, 130, 40);
        clear3.addActionListener(this);
        btnSaveFullTimeVacancy.addActionListener(this);
        salaryFTF.addKeyListener(new KeyAdapter() {
	@Override
            public void keyPressed(KeyEvent ke) {
	   if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
    }
else{
	try{
	Integer.parseInt(String.valueOf(ke.getKeyChar()));
}
catch(NumberFormatException e){

JOptionPane.showMessageDialog(frame7, "Salary can't be string String", "warning",
		JOptionPane.WARNING_MESSAGE);
salaryFTF.setText("");
}

}


            }
        });
        vacancyNoFTF.setText(String.valueOf(staffList.size() + 1));

        frame7.add(lblVacancyFulTimeStaff);
        frame7.add(lblworkingHourFullTime);
        frame7.add(lblDesignationFullTime);
        frame7.add(lbljobTypeFullTime);
        frame7.add(lblSalaryFullTimeStaff);
        frame7.add(vacancyNoFTF);
        frame7.add(comboWorkingHourFullTime);
        frame7.add(designationFTF);
        frame7.add(jobTypeFTF);
        frame7.add(salaryFTF);
        frame7.add(title3);
        frame7.add(backB3);
        frame7.add(clear3);
        frame7.add(btnSaveFullTimeVacancy);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        lblStaffNameFullTimeStaff = new JLabel("Staff Nmae");
        lblJoiningDateFullTimeStaff = new JLabel("Joining Date");
        lblQualificationFullTimeStaff = new JLabel("Qualification");
        lblAppointedByFullTimeStaff = new JLabel("Appointed By");
        lblVacancyNoFullTimeStaff2 = new JLabel("Choose Vacancy Number");

        btnSaveFullTimeStaff = new JButton("Save");
        clear4 = new JButton("clear");
        btnSaveFullTimeStaff.setBounds(330, 300, 130, 40);
        clear4.setBounds(200, 300, 80, 40);
        staffNameFTF = new JTextField();
        joiningDateFTF = new JTextField();
        qualificationFTF = new JTextField();
        appointedByFTF = new JTextField();
        comboVacancyNumberFullTime = new JComboBox<Integer>();
        comboVacancyNumberFullTime.setBounds(250, 220, 50, 25);
        lblQualificationFullTimeStaff = new JLabel("qualification");

        lblStaffNameFullTimeStaff.setBounds(50, 100, 300, 40);
        lblJoiningDateFullTimeStaff.setBounds(260, 100, 300, 40);
        lblQualificationFullTimeStaff.setBounds(50, 150, 300, 40);
        lblAppointedByFullTimeStaff.setBounds(260, 150, 300, 40);
        lblVacancyNoFullTimeStaff2.setBounds(50, 220, 150, 25);
        joiningDateFTF.setBounds(350, 110, 100, 25);
        staffNameFTF.setBounds(150, 110, 100, 25);
        qualificationFTF.setBounds(150, 160, 100, 25);
        appointedByFTF.setBounds(350, 160, 100, 25);

        btnSaveFullTimeStaff.addActionListener(this);
        clear4.addActionListener(this);

        frame9 = new JFrame("Hire Full time staff");
        frame9.setBounds(120, 60, 500, 450);
        frame9.add(title4);
        frame9.add(btnSaveFullTimeStaff);
        frame9.add(backB4);
        frame9.add(clear4);
        frame9.add(staffNameFTF);
        frame9.add(joiningDateFTF);
        frame9.add(lblJoiningDateFullTimeStaff);

        frame9.add(lblStaffNameFullTimeStaff);
        frame9.add(qualificationFTF);
        frame9.add(lblQualificationFullTimeStaff);
        frame9.add(appointedByFTF);
        frame9.add(lblAppointedByFullTimeStaff);
        frame9.add(comboVacancyNumberFullTime);
        frame9.setLayout(null);
        frame9.add(lblVacancyNoFullTimeStaff2);
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame6.add(terminatingVacncy);
        vacancyNoFTF.setText(String.valueOf(staffList.size()+ 1));
        VacancyNumPT.setText(String.valueOf(partTimeStaffCount() +1));
        // frame10 for displaying the full time staff details
        frame10 = new JFrame("Display full time staff details");
        model4 = new DefaultTableModel();

        Object[] column1 = { "vacancy number", "designation", "Job Type", "Salary", "working hour", "Staff Name",
                "joining date", "qualification", "appointed by" };
        for (int i = 0; i < 9; i++) {
            model4.addColumn(column1[i]);
        }

        table4 = new JTable(model4);
        JScrollPane sp4 = new JScrollPane(table4);
        frame10.setBounds(100, 100, 900, 500);
        frame10.add(sp4);
    }

    public static void main(String[] args) {
        new INGNepal();
    }

    public void back() {

        frame1.setVisible(true);
        frame2.setVisible(false);
        frame4.setVisible(false);
        frame7.setVisible(false);
        frame9.setVisible(false);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddPartTimeVacancy) {
            frame1.setVisible(false);
            frame2.setVisible(true);
        } else if (e.getSource() == btnAddFullTimeVacancy) {
            frame7.setVisible(true);
            frame1.setVisible(false);
        } else if (e.getSource() == backB || e.getSource() == backB2 || e.getSource() == backB3
                || e.getSource() == backB4) {
            back();
        } else if (e.getSource() == clear1 || e.getSource() == clear2 || e.getSource() == clear3
                || e.getSource() == clear4) {
            clearM();
        } else if (e.getSource() == btnSavePartTimeVacancy) {
            if (wagesPerHourTF.getText().trim().isEmpty() || jobTypeTF.getText().trim().isEmpty()
                    || DesignationTF.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all the information");
            } else {

                int vn = Integer.parseInt(VacancyNumPT.getText());
                

                
                int wh = Integer.parseInt(comboWorkingHourPartTime.getSelectedItem().toString());
                String sh = (String) comboShift.getSelectedItem();
                int wph = Integer.parseInt(wagesPerHourTF.getText());
                staffList.add(new PartTimeStaffHire(vn, DesignationTF.getText(), wph, jobTypeTF.getText(), wh, sh));
                JOptionPane.showMessageDialog(null, "Record saved");
                clearM();
                vacancyNoFTF.setText(String.valueOf(staffList.size()+ 1));
                VacancyNumPT.setText(String.valueOf(staffList.size()+ 1));
                                    }
               vacancySet();                 

        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == btnHirePartTimeStaff) {
            if ( partTimeStaffCount() == 0) {
                JOptionPane.showMessageDialog(null, "No empty vacancy");
            } else {
                frame1.setVisible(false);
                frame4.setVisible(true);
            }
        } else if (e.getSource() == btnSavePartTimeStaff) {
            String date = joinedDatePTF.getText();
            String name = staffNamePTF.getText();
            String qualification = qualificationPTF.getText();
            String appointedBy = appointedByPTF.getText();
            if (date.trim().isEmpty() || name.trim().isEmpty() | qualification.trim().isEmpty()
                    || appointedBy.trim().isEmpty()) {
                JOptionPane.showMessageDialog(frame9, "Erroe", "Please fill all the informatio",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                int vn = Integer.parseInt(comboVacancyNumberPartTime.getSelectedItem().toString());

                if(staffList.get(vn-1) instanceof FullTImeStaffHire){

                    JOptionPane.showMessageDialog(frame9, "Cant hire part time staff in full time satff vacancy", "Inane error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(vn - 1);
                if (!staff.getJoined()) {
                    staff.hirePartTimeStaff(staffNamePTF.getText(), joinedDatePTF.getText(), qualificationPTF.getText(),
                            appointedByPTF.getText());
                    JOptionPane.showMessageDialog(null, "Staff has been hired");
                    
                    clearM();

                } else {

                    JOptionPane.showMessageDialog(frame4, "Staff has already joined in this vacancy", "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                }

              }  }
        } else if (e.getSource() == btnDisplayPartTime) {
            add();
            frame5.setVisible(true);
            //model4.setRowCount(0);
        } else if (e.getSource() == btnTerminateFunction) {
            if (partTimeStaffCount() == 0) {

                JOptionPane.showMessageDialog(null, "No staff to terminate");
            } else {
                lblStaffNameToTerminateTF.setEditable(false);
                frame6.setVisible(true);
            }
        } else if (e.getSource() == showNameB) {
            PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(Integer.parseInt(terminatingVacncy.getSelectedItem().toString())-1);
            lblStaffNameToTerminateTF.setText(
                    staff.getStaffName());
        } else if (e.getSource() == btnTerminate) {
            int vn = Integer.parseInt(comboVacancyNumberPartTime.getSelectedItem().toString());
            if(staffList.get(vn-1) instanceof FullTImeStaffHire){
                JOptionPane.showMessageDialog(frame4, "Error", "Can't terminate a full time staff",
                            JOptionPane.ERROR_MESSAGE);
            }
            else{ 
            PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(vn - 1);
            if (staff.getTerminated()) {

                JOptionPane.showMessageDialog(null, "Staff has already been terminated");
            } else {
                staff.terminateStaff();
            JOptionPane.showMessageDialog(null, "Staff has been terminated");
            }
        } }else if (e.getSource() == btnSaveFullTimeVacancy) {

            if (designationFTF.getText().trim().isEmpty() || jobTypeFTF.getText().trim().isEmpty()
                    || salaryFTF.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all the information");
            } else {
                int vn = Integer.parseInt(vacancyNoFTF.getText());
                int wh = Integer.parseInt(comboWorkingHourFullTime.getSelectedItem().toString());
                int salary = Integer.parseInt(salaryFTF.getText());
                staffList.add(new FullTImeStaffHire(vn, designationFTF.getText(), jobTypeFTF.getText(), salary, wh));
                JOptionPane.showMessageDialog(null, "Record saved");
                clearM();
              
                VacancyNumPT.setText(String.valueOf(partTimeStaffCount() +1));
                vacancyNoFTF.setText(String.valueOf(staffList.size()+ 1));
              vacancySet();
            }

        }

        else if (e.getSource() == btnHireFullTimeStaff) {
            if (fullTimeStaffCount()== 0) {
                JOptionPane.showMessageDialog(null, "no vacancy to hire");
            } else {
                frame9.setVisible(true);
                frame1.setVisible(false);
            }

        } else if (e.getSource() == btnSaveFullTimeStaff) {

            String date = joiningDateFTF.getText();
            String name = staffNameFTF.getText();
            String qualification = qualificationFTF.getText();
            String appointedBy = appointedByFTF.getText();
            if (date.trim().isEmpty() || name.trim().isEmpty() | qualification.trim().isEmpty()
                    || appointedBy.trim().isEmpty()) {

                JOptionPane.showMessageDialog(frame9, "Please fill all the information", "Inane error",
                        JOptionPane.ERROR_MESSAGE);

            } else {

                int vn = Integer.parseInt(comboVacancyNumberFullTime.getSelectedItem().toString());

                if(staffList.get(vn-1) instanceof PartTimeStaffHire){

                    JOptionPane.showMessageDialog(frame9, "Cant hire full time staff in part time satff vacancy", "Inane error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                FullTImeStaffHire staff = (FullTImeStaffHire) staffList.get(vn - 1);
                if (!staff.getJoined()) {
                    staff.hireFullTimeStaff(staffNameFTF.getText(), joinedDatePTF.getText(), qualificationFTF.getText(),
                            appointedByFTF.getText());
                    JOptionPane.showMessageDialog(null, "Staff has been hired");
                    clearM();
                } else {

                    JOptionPane.showMessageDialog(frame9, "Staff has already been hired in this vacancy", "Inane error", JOptionPane.ERROR_MESSAGE);
                }
            }}
        } else if (e.getSource() == btnDisplayFullTime) {
            add();
            frame10.setVisible(true);
        }

    }

    public void clearM() {
        joinedDatePTF.setText("");
        staffNamePTF.setText("");
        qualificationPTF.setText("");
        appointedByPTF.setText("");
        wagesPerHourTF.setText("");
        DesignationTF.setText("");
        jobTypeTF.setText("");
        designationFTF.setText("");
        jobTypeFTF.setText("");
        salaryFTF.setText("");
        staffNameFTF.setText("");
        jobTypeFTF.setText("");
        qualificationFTF.setText("");
        appointedByFTF.setText("");
        joiningDateFTF.setText("");
    }

    public int partTimeStaffCount() {
        int partTimeCount = 0;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i) instanceof PartTimeStaffHire) {
                partTimeCount += 1;
            }
        }
        return partTimeCount;
    }

    public int fullTimeStaffCount() {
        int fullTimeCount = 0;
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i) instanceof FullTImeStaffHire) {
                fullTimeCount += 1;
            }
        }
        return fullTimeCount;
    }
    public void vacancySet(){
        terminatingVacncy.removeAllItems();
        for (int i=0; i<staffList.size();i++){
            if(staffList.get(i) instanceof PartTimeStaffHire){

            terminatingVacncy.addItem(i+1);
            }
        }
                comboVacancyNumberPartTime.addItem(staffList.size());
            comboVacancyNumberFullTime.addItem(staffList.size());
    }
    public void add() {
            VacancyNumPT.setText(String.valueOf(staffList.size() +1));
            model2.setRowCount(0);
            model4.setRowCount(0);
        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i) instanceof PartTimeStaffHire) {
                PartTimeStaffHire staff = (PartTimeStaffHire) staffList.get(i);
                if (staff.getJoined()) {
                    model2.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(),
                            staff.getWagesPerHour(), staff.getJobType(), staff.getWorkingHours(), staff.getShifts(),
                            staff.getStaffName(), staff.getJoiningDate(), staff.getQualification(),
                            staff.getAppointedBy() });
                } else {

                    model2.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(),
                            staff.getWagesPerHour(), staff.getJobType(), staff.getWorkingHours(), staff.getShifts() });
                }
            } else {
                FullTImeStaffHire staff = (FullTImeStaffHire) staffList.get(i);
                if (staff.getJoined()) {
                    model4.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(), staff.getJobType(),
                            staff.getSalary(), staff.getWorkingHours(), staff.getStaffName(), staff.getJoiningDate(),
                            staff.getQualification(), staff.getAppointedBy() });
                } else {

                    model4.addRow(new Object[] { staff.getVacancyNumber(), staff.getDesignation(), staff.getSalary(),
                            staff.getJobType(), staff.getWorkingHours() });
                }
            }
        }
    }

}
