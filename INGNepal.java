
//importing the packages 
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.util.*;
import java.awt.Font;
import java.awt.Color;

class INGNepal implements ActionListener {

    // initilizing the instances
    ArrayList<FullTImeStaffHire> FSH = new ArrayList<FullTImeStaffHire>();
    ArrayList<PartTimeStaffHire> PSH = new ArrayList<PartTimeStaffHire>();
    JFrame frame1, frame2, frame3, frame4, frame5, frame6, frame7, frame8, frame9,frame10;
    JButton addVacFullTimeB, addVacPartTimeB, hirePartTimeStaffB, hireFullTimeStaffB, displayPartB, backB, backB2,
            backB3, backB4, displayFullB, terminateAPartTimeStaff, terminateB, terminatePTS, savePT, savePTH, saveFT,
            saveFTH, clear1, clear2, clear3, clear4, displayPartTimeVB, displayFullTimeVB, exit, showNameB;
    JTextField wagesPerHourTF, DesignationTF, VacancyNumPT, jobTypeTF/** for hiting part time staff */
            , joinedDatePTF, staffNamePTF, qualificationPTF, appointedByPTF, staffNameTerminateTF, vacancyNoFTF,
            designationFTF, jobTypeFTF, salaryFTF, staffNameFTF, joiningDateFTF, qualificationFTF, appointedByFTF;
    // JFormattedTextField joinedDateTF;
    JLabel workingHourL, shiftL, wagesPerHourL, DesignationL, VacancyNumL, jobTypeL, /** for part time staff hire */
            staffNamePTL, joiningDatePTL, qualifactionPTL, appointeedByPTL, vacancyNoPTL, terminatingStaffL,
            vacancyNoTerminateL, staffNameTerminate, vacancyNumberTerminate, vacancyNoFTL, workingHourFTL,
            designationFTL, jobTypeFTL, salaryFTL, staffNameFTL, joiningDateFTL, qualificationFTL, appointedByFTL,vacancyNoFTH;
    JComboBox<Integer> vacancyNoC;
    JComboBox<Integer> workingHourC, vacancyNoPTC, terminatingVacncy, vacancyNoFTC, workingHourFTC;
    JComboBox<String> shiftCB;
    DefaultTableModel model, model2, model3, model4;
    // JScrollPane scrollPane, scrollPane2,scrollPane3,scrollPane4;
    JTable table, table2, table3, table4;

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
        addVacFullTimeB = new JButton("Add vacancy for full time staff");
        addVacPartTimeB = new JButton("Add vacancy for part time staff");
        displayPartB = new JButton("Display part time staff information");
        displayFullB = new JButton("Display full time staff information");
        terminateB = new JButton("Terminate a staff");
        displayPartTimeVB = new JButton("Display part time vacancy");
        displayFullTimeVB = new JButton("Display full time staff vacancy");
        hirePartTimeStaffB = new JButton("Hire a part time staff");
        hireFullTimeStaffB = new JButton("Hire a full time staff");

        exit = new JButton("EXIT");
        // setting bounds
        addVacPartTimeB.setBounds(50, 40, 300, 40);
        addVacFullTimeB.setBounds(50, 100, 300, 40);
        displayPartB.setBounds(50, 160, 300, 40);
        displayFullB.setBounds(50, 220, 300, 40);
        terminateB.setBounds(50, 280, 300, 40);
        displayPartTimeVB.setBounds(360, 160, 290, 40);
        displayFullTimeVB.setBounds(360, 220, 290, 40);
        hireFullTimeStaffB.setBounds(360, 100, 290, 40);
        hirePartTimeStaffB.setBounds(360, 40, 290, 40);
        exit.setBounds(360, 280, 290, 40);
        // adding action listener
        addVacFullTimeB.addActionListener(this);
        addVacPartTimeB.addActionListener(this);
        displayFullB.addActionListener(this);
        displayPartB.addActionListener(this);
        terminateB.addActionListener(this);
        displayPartTimeVB.addActionListener(this);
        displayFullTimeVB.addActionListener(this);
        hireFullTimeStaffB.addActionListener(this);
        hirePartTimeStaffB.addActionListener(this);
        exit.addActionListener(this);

        // adding to the frame1
        frame1.add(addVacFullTimeB);
        frame1.add(addVacPartTimeB);
        frame1.add(displayPartB);
        frame1.add(displayFullB);
        frame1.add(terminateB);
        frame1.add(displayPartTimeVB);
        frame1.add(displayFullTimeVB);
        frame1.add(exit);
        frame1.add(hireFullTimeStaffB);
        frame1.add(hirePartTimeStaffB);
        // frame2
        frame2 = new JFrame("Hire Part Time staff hire");
        backB = new JButton("Go Back");
        backB2 = new JButton("Go Back");
        backB3 = new JButton("Go Back");
        backB4 = new JButton("Go Back");
        workingHourL = new JLabel("Working Hours :");
        workingHourC = new JComboBox<Integer>();
        wagesPerHourL = new JLabel("Wages per hour:");
        DesignationL = new JLabel("Designation:");
        DesignationTF = new JTextField(25);
        wagesPerHourTF = new JTextField();
        VacancyNumL = new JLabel("Vacancy No:");
        VacancyNumPT = new JTextField();
        shiftL = new JLabel("Shift:");
        shiftCB = new JComboBox<String>();
        savePT = new JButton("Save");
        clear1 = new JButton("Clear");
        jobTypeL = new JLabel("Job Type:");
        jobTypeTF = new JTextField();

        clear1.addActionListener(this);
        savePT.addActionListener(this);
        backB.addActionListener(this);
        backB2.addActionListener(this);
        backB3.addActionListener(this);
        backB4.addActionListener(this);
        backB.setBounds(50, 300, 100, 40);
        backB2.setBounds(50, 300, 100, 40);
        backB3.setBounds(50, 300, 100, 40);
        backB4.setBounds(50, 300, 100, 40);
        workingHourL.setBounds(50, 100, 300, 40);
        workingHourC.setBounds(150, 105, 80, 25);
        wagesPerHourL.setBounds(250, 100, 300, 40);
        wagesPerHourTF.setBounds(350, 105, 100, 25);
        DesignationL.setBounds(250, 150, 300, 40);
        DesignationTF.setBounds(350, 160, 100, 25);
        jobTypeL.setBounds(250, 205, 300, 40);
        jobTypeTF.setBounds(350, 210, 100, 25);
        VacancyNumL.setBounds(50, 150, 300, 40);
        VacancyNumPT.setBounds(150, 155, 20, 30);
        VacancyNumPT.setEditable(false);
        shiftL.setBounds(50, 200, 300, 40);
        shiftCB.setBounds(150, 205, 80, 30);
        shiftCB.addItem("Morning");
        shiftCB.addItem("Day");
        shiftCB.addItem("Night");
        clear1.setBounds(200, 300, 80, 40);
        savePT.setBounds(330, 300, 130, 40);
        frame2.setLayout(null);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setBounds(120, 60, 500, 450);
        // frame3
        frame3 = new JFrame();
        // only allowing user to input int in wages per hour
        wagesPerHourTF.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    wagesPerHourTF.setEditable(true);

                } else {
                    JOptionPane.showMessageDialog(frame3, "Warning", "wage cant be in string",
                            JOptionPane.WARNING_MESSAGE);
                    wagesPerHourTF.setText("");
                }
            }
        });
        for (int i = 4; i < 8; i++) {
            workingHourC.addItem(i);
        }

        // adding elements to the frame2
        frame2.add(title);
        frame2.getContentPane().setBackground(c);
        frame2.add(backB);
        frame2.add(workingHourL);
        frame2.add(workingHourC);
        frame2.add(wagesPerHourL);
        frame2.add(wagesPerHourTF);
        frame2.add(DesignationL);
        frame2.add(DesignationTF);
        frame2.add(VacancyNumL);
        frame2.add(shiftL);
        frame2.add(shiftCB);
        frame2.add(savePT);
        frame2.add(clear1);
        frame2.add(jobTypeTF);
        frame2.add(jobTypeL);
        frame2.add(VacancyNumPT);
        // auto increasing the value of vachancy number
        VacancyNumPT.setText(String.valueOf(PSH.size() + 1));

        // setting column for j table
        String column[] = { "Vacancy No.", "Designation", "Wage per hour", "Job Type", "Working Hour", "Shift" };
        model = new DefaultTableModel();
        table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        frame3.add(sp);
        frame3.setBounds(400, 100, 600, 500);
        // add columns to model
        for (int i = 0; i < 6; i++) {
            model.addColumn(column[i]);
        }
        // frame4
        joiningDatePTL = new JLabel("Joining date");
        staffNamePTL = new JLabel("Staff Name");
        qualifactionPTL = new JLabel("Qualification");
        appointeedByPTL = new JLabel("Appointed By");
        vacancyNoPTL = new JLabel("vacancy number");
        vacancyNoPTC = new JComboBox<Integer>();
        savePTH = new JButton("save");
        clear2 = new JButton("clear");

        savePTH.setBounds(330, 300, 130, 40);
        staffNamePTL.setBounds(50, 100, 300, 40);
        joiningDatePTL.setBounds(260, 100, 300, 40);
        qualifactionPTL.setBounds(50, 150, 300, 40);
        appointeedByPTL.setBounds(260, 150, 300, 40);
        vacancyNoPTC.setBounds(200, 220, 50, 25);
        vacancyNoPTL.setBounds(50, 210, 300, 40);
        clear2.setBounds(200, 300, 80, 40);
        clear2.addActionListener(this);
        savePTH.addActionListener(this);
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
        frame4.add(staffNamePTL);
        frame4.add(qualifactionPTL);
        frame4.add(joiningDatePTL);
        frame4.add(appointeedByPTL);
        frame4.add(joinedDatePTF);
        frame4.add(staffNamePTF);
        frame4.add(qualificationPTF);
        frame4.add(appointedByPTF);
        frame4.add(vacancyNoPTC);
        frame4.add(vacancyNoPTL);
        frame4.add(clear2);
        frame4.add(savePTH);
        // frame 5 for display of part time staffs
        frame5 = new JFrame("Display part time staffs");
        frame5.setBounds(400, 100, 600, 500);
        String column2[] = { "vacancy", "Staff Name", "Joining date", "Qualification", "Appointed By" };

        // Jtable for vacancy of part time staff
        model2 = new DefaultTableModel();
        table2 = new JTable(model2);
        JScrollPane sp2 = new JScrollPane(table2);
        frame5.add(sp2);
        frame5.setBounds(400, 100, 600, 500);
        // add columns to model
        for (int i = 0; i < 5; i++) {
            model2.addColumn(column2[i]);
        }
        // frame6 for terminating the staff
        frame6 = new JFrame("Terminate a staff");
        frame6.setBounds(120, 30, 700, 250);
        frame6.setLayout(null);

        staffNameTerminate = new JLabel("Staff's name");
        vacancyNumberTerminate = new JLabel("Vacancy Number");
        showNameB = new JButton("show staff name");
        showNameB.setBounds(50, 140, 180, 40);
        showNameB.addActionListener(this);
        terminatePTS = new JButton("Terminate the staff");
        terminatePTS.setBounds(250, 140, 200, 40);
        terminatePTS.addActionListener(this);
        staffNameTerminateTF = new JTextField();
        staffNameTerminateTF.setBounds(380, 85, 100, 30);
        terminatingVacncy = new JComboBox<Integer>();
        terminatingVacncy.setBounds(200, 90, 100, 20);
        staffNameTerminate.setBounds(300, 80, 100, 40);
        vacancyNumberTerminate.setBounds(100, 80, 180, 40);
        frame6.add(staffNameTerminate);
        frame6.add(vacancyNumberTerminate);
        frame6.add(terminatePTS);
        frame6.add(staffNameTerminateTF);
        frame6.add(showNameB);
        // frame7 for creating vacancy of full time staff
        frame7 = new JFrame("Create vacancy for full time staff");
        frame7.setBounds(120, 60, 500, 450);
        frame7.setLayout(null);
        // frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        vacancyNoFTF = new JTextField();
        vacancyNoFTL = new JLabel("Vacancy Number");
        workingHourFTL = new JLabel("Working Hour");
        designationFTL = new JLabel("Designation");
        jobTypeFTL = new JLabel("Job Type");
        salaryFTL = new JLabel("Salary");
        workingHourFTC = new JComboBox<Integer>();
        designationFTF = new JTextField();
        jobTypeFTF = new JTextField();
        salaryFTF = new JTextField();
        clear3 = new JButton("Clear");
        saveFT = new JButton("Save");

        for (int i = 8; i < 13; i++) {
            workingHourFTC.addItem(i);
        }

        vacancyNoFTL.setBounds(50, 150, 300, 40);
        workingHourFTL.setBounds(50, 100, 300, 40);
        designationFTL.setBounds(250, 150, 300, 25);
        jobTypeFTL.setBounds(250, 205, 300, 40);
        salaryFTL.setBounds(250, 105, 300, 40);
        vacancyNoFTF.setBounds(150, 160, 30, 20);
        vacancyNoFTF.setEditable(false);
        workingHourFTC.setBounds(150, 110, 50, 25);
        designationFTF.setBounds(350, 150, 100, 25);
        jobTypeFTF.setBounds(350, 215, 100, 25);
        salaryFTF.setBounds(350, 115, 100, 25);
        clear3.setBounds(200, 300, 80, 40);
        saveFT.setBounds(330, 300, 130, 40);
        clear3.addActionListener(this);
        saveFT.addActionListener(this);
        salaryFTF.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {

                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    salaryFTF.setEditable(true);

                } else {
                    JOptionPane.showMessageDialog(frame7, "Salary can't be string String", "warning",
                            JOptionPane.WARNING_MESSAGE);
                    salaryFTF.setText("");
                }
            }
        });
        vacancyNoFTF.setText(String.valueOf(PSH.size() + FSH.size() + 1));

        frame7.add(vacancyNoFTL);
        frame7.add(workingHourFTL);
        frame7.add(designationFTL);
        frame7.add(jobTypeFTL);
        frame7.add(salaryFTL);
        frame7.add(vacancyNoFTF);
        frame7.add(workingHourFTC);
        frame7.add(designationFTF);
        frame7.add(jobTypeFTF);
        frame7.add(salaryFTF);
        // frame7.setVisible(true);
        frame7.add(title3);
        frame7.add(backB3);
        frame7.add(clear3);
        frame7.add(saveFT);
        frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String column3[] = { "vacancy", "designation", "salary", "job type", "working Hour" };

        // Jtable for vacancy of part time staff
        frame8 = new JFrame("display full time staff vacancy");
        model3 = new DefaultTableModel();
        for (int i = 0; i < 5; i++) {
            model3.addColumn(column3[i]);
        }

        table3 = new JTable(model3);
        JScrollPane sp3 = new JScrollPane(table3);
        frame8.add(sp3);
        frame8.setBounds(400, 100, 600, 500);
        // frame8.setLayout(null);
        // frame9 for hiring full time staff
        staffNameFTL = new JLabel("Staff Nmae");
        joiningDateFTL = new JLabel("Joining Date");
        qualificationFTL = new JLabel("Qualification");
        appointedByFTL = new JLabel("Appointed By");
        vacancyNoFTH = new JLabel("Choose Vacancy Number");


        saveFTH = new JButton("Save");
        clear4 = new JButton("clear");
        saveFTH.setBounds(330, 300, 130, 40);
        clear4.setBounds(200, 300, 80, 40);
        staffNameFTF = new JTextField();
        joiningDateFTF = new JTextField();
        qualificationFTF = new JTextField();
        appointedByFTF = new JTextField();
        vacancyNoFTC = new JComboBox<Integer>();
        vacancyNoFTC.setBounds(250,220,50,25);
        qualificationFTL = new JLabel("qualification");
        for (int i =0; i<FSH.size();i++){

        vacancyNoFTC.addItem(i+1);
        }

        staffNameFTL.setBounds(50, 100, 300, 40);
        joiningDateFTL.setBounds(260, 100, 300, 40);
        qualificationFTL.setBounds(50, 150, 300, 40);
        appointedByFTL.setBounds(260, 150, 300, 40);
        vacancyNoFTH.setBounds(50,220,150,25);
        joiningDateFTF.setBounds(350, 110, 100, 25);
        staffNameFTF.setBounds(150, 110, 100, 25);
        qualificationFTF.setBounds(150, 160, 100, 25);
        appointedByFTF.setBounds(350, 160, 100, 25);

        saveFTH.addActionListener(this);
        clear4.addActionListener(this);

        frame9 = new JFrame("Hire Full time staff");
        frame9.setBounds(120, 60, 500, 450);
        frame9.add(title4);
        frame9.add(saveFTH);
        frame9.add(backB4);
        frame9.add(clear4);
        frame9.add(staffNameFTF);
        frame9.add(joiningDateFTF);
        frame9.add(joiningDateFTL);

        frame9.add(staffNameFTL);
        frame9.add(qualificationFTF);
        frame9.add(qualificationFTL);
     frame9.add(appointedByFTF);
        frame9.add(appointedByFTL);
        frame9.add(vacancyNoFTC);
        frame9.setLayout(null);
        frame9.add(vacancyNoFTH);
        frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame10 for displaying the full time staff details
        frame10 = new JFrame("Display full time staff details");
        model4 = new DefaultTableModel();

        for (int i=0;i<5;i++){
            model4.addColumn(column2[i]);
        }
        
        table4 = new JTable(model4);
        JScrollPane sp4 = new JScrollPane(table4);
        frame10.setBounds(400, 100, 600, 500);
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
        if (e.getSource() == addVacPartTimeB) {
            frame1.setVisible(false);
            frame2.setVisible(true);
        } else if (e.getSource() == addVacFullTimeB) {
            frame7.setVisible(true);
            frame1.setVisible(false);
        } else if (e.getSource() == backB || e.getSource() == backB2 || e.getSource() == backB3
                || e.getSource() == backB4) {
            back();
        } else if (e.getSource() == clear1 || e.getSource() == clear2 || e.getSource() == clear3
                || e.getSource() == clear4) {
            clearM();
        } else if (e.getSource() == savePT) {
            if (wagesPerHourTF.getText().trim().isEmpty() || jobTypeTF.getText().trim().isEmpty()
                    || DesignationTF.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all the information");
            } else {
                int vn = Integer.parseInt(VacancyNumPT.getText());
                int wh = Integer.parseInt(workingHourC.getSelectedItem().toString());
                String sh = (String) shiftCB.getSelectedItem();
                int wph = Integer.parseInt(wagesPerHourTF.getText());
                PSH.add(new PartTimeStaffHire(vn, DesignationTF.getText(), wph, jobTypeTF.getText(), wh, sh));
                JOptionPane.showMessageDialog(null, "Record saved");
                clearM();

                vacancyNoFTF.setText(String.valueOf(FSH.size()+ PSH.size() + FSH.size() + 1));
                VacancyNumPT.setText(String.valueOf(PSH.size() + 1));
                ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
                ArrayList<String> vacancy = new ArrayList<String>();
                ArrayList<String> deg = new ArrayList<String>();
                ArrayList<String> wage = new ArrayList<String>();
                ArrayList<String> jt = new ArrayList<String>();
                ArrayList<String> wa = new ArrayList<String>();
                ArrayList<String> shift = new ArrayList<String>();

                vacancy.add(Integer.toString(PSH.get(PSH.size() - 1).getVacancyNumber()));
                deg.add(PSH.get(PSH.size() - 1).getDesignation());
                wage.add(Integer.toString(PSH.get(PSH.size() - 1).getWagesPerHour()));
                jt.add(PSH.get(PSH.size() - 1).getJobType());
                wa.add(Integer.toString(PSH.get(PSH.size() - 1).getWorkingHours()));
                shift.add(PSH.get(PSH.size() - 1).getShifts());

                data.add(vacancy);
                data.add(deg);
                data.add(wage);
                data.add(jt);
                data.add(wa);
                data.add(shift);

                model.addRow(data.toArray());
                vacancyNoPTC.addItem(PSH.size());
            }
        } else if (e.getSource() == displayPartTimeVB) {
            frame3.setVisible(true);
        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == hirePartTimeStaffB) {
            if (PSH.size() == 0) {
                JOptionPane.showMessageDialog(null, "No empty vacancy");
            } else {
                frame1.setVisible(false);
                frame4.setVisible(true);
            }
        } else if (e.getSource() == savePTH) {
            String date = joinedDatePTF.getText();
            String name = staffNamePTF.getText();
            String qualification = qualificationPTF.getText();
            String appointedBy = appointedByPTF.getText();
            if (date.trim().isEmpty() || name.trim().isEmpty() | qualification.trim().isEmpty()
                    || appointedBy.trim().isEmpty()) {


                JOptionPane.showMessageDialog(frame9, "Please fill all the information","Inane error",
                JOptionPane.ERROR_MESSAGE);
            } else {

                ArrayList<PartTimeStaffHire> PSHired = new ArrayList<PartTimeStaffHire>();
                int vn = Integer.parseInt(vacancyNoPTC.getSelectedItem().toString());

                PartTimeStaffHire staff = (PartTimeStaffHire) PSH.get(vn - 1);
                if (!staff.getJoined()) {
                    staff.hirePartTimeStaff(staffNamePTF.getText(), joinedDatePTF.getText(), qualificationPTF.getText(),
                            appointedByPTF.getText());
                    JOptionPane.showMessageDialog(null, "Staff has been hired");
                    terminatingVacncy.addItem(staff.getVacancyNumber());
                    clearM();

                    for (int i = 0; i < PSH.size(); i++) {
                        if (PSH.get(i).getJoined() == true) {
                            PSHired.add(PSH.get(i));
                        }
                    }
                } else {

                    JOptionPane.showMessageDialog(frame4, "Eggs are not supposed to be green.", "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                }
                ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
                if (PSHired.size() > 0) {
                    ArrayList<String> vacancy = new ArrayList<String>();
                    ArrayList<String> staffName = new ArrayList<String>();
                    ArrayList<String> joinDate = new ArrayList<String>();
                    ArrayList<String> qualifaction = new ArrayList<String>();
                    ArrayList<String> appBy = new ArrayList<String>();
                    vacancy.add(Integer.toString(staff.getVacancyNumber()));
                    staffName.add(PSHired.get(PSHired.size() - 1).getStaffName());
                    joinDate.add(PSHired.get(PSHired.size() - 1).getJoiningDate());
                    qualifaction.add(PSHired.get(PSHired.size() - 1).getQualification());
                    appBy.add(PSHired.get(PSHired.size() - 1).getAppointedBy());

                    data.add(vacancy);
                    data.add(staffName);
                    data.add(joinDate);
                    data.add(qualifaction);
                    data.add(appBy);

                    model2.addRow(data.toArray());

                    // if (PSH.get(PSH.size() - 1).getJoined() == true) {
                     terminatingVacncy.addItem(PSH.get(PSH.size() - 1).getVacancyNumber());
                    // }
                }

            }

            frame6.add(terminatingVacncy);
        } else if (e.getSource() == displayPartB) {
            frame5.setVisible(true);
        } else if (e.getSource() == terminateB) {
            if (model2.getRowCount() == 0) {

                JOptionPane.showMessageDialog(null, "No staff to terminate");
            } else {
                staffNameTerminateTF.setEditable(false);
                staffNameTerminateTF.setText(
                        PSH.get(Integer.parseInt(terminatingVacncy.getSelectedItem().toString()) - 1).getStaffName());

                frame6.setVisible(true);
            }
        } else if (e.getSource() == showNameB) {
            staffNameTerminateTF.setText(
                    PSH.get((Integer.parseInt(terminatingVacncy.getSelectedItem().toString())) - 1).getStaffName());
        } else if (e.getSource() == terminatePTS) {
            int vn = Integer.parseInt(vacancyNoPTC.getSelectedItem().toString());
            PartTimeStaffHire staff = (PartTimeStaffHire) PSH.get(vn - 1);
            if (staff.getTerminated()) {

                JOptionPane.showMessageDialog(null, "Staff has been terminated");
            } else {
                staff.terminateStaff();

            }
            JOptionPane.showMessageDialog(null, "Staff has been terminated");
            for (int i = 0; i < model2.getRowCount(); i++) {
                if (((ArrayList<String>) model2.getValueAt(i, 0)).toString().equals(Integer.toString(vn)))
                    ;
                {
                    model2.removeRow(i);
                } // end of if block
            } // en
        } else if (e.getSource() == saveFT) {

            if (designationFTF.getText().trim().isEmpty() || jobTypeFTF.getText().trim().isEmpty()
                    || salaryFTF.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Please fill all the information");
            } else {
                int vn = Integer.parseInt(vacancyNoFTF.getText());
                int wh = Integer.parseInt(workingHourFTC.getSelectedItem().toString());
                int salary = Integer.parseInt(salaryFTF.getText());
                FSH.add(new FullTImeStaffHire(vn, designationFTF.getText(), jobTypeFTF.getText(), salary, wh));
                JOptionPane.showMessageDialog(null, "Record saved");
                clearM();
                vacancyNoFTF.setText(String.valueOf(PSH.size() + FSH.size() + 1));

                ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
                ArrayList<String> vacancy = new ArrayList<String>();
                ArrayList<String> deg = new ArrayList<String>();
                ArrayList<String> salaryFT = new ArrayList<String>();
                ArrayList<String> jt = new ArrayList<String>();
                ArrayList<String> wa = new ArrayList<String>();

                vacancy.add(Integer.toString(FSH.get(FSH.size() - 1).getVacancyNumber()));
                deg.add(FSH.get(FSH.size() - 1).getDesignation());
                salaryFT.add(Integer.toString(FSH.get(FSH.size() - 1).getSalary()));
                jt.add(FSH.get(FSH.size() - 1).getJobType());
                wa.add(Integer.toString(FSH.get(FSH.size() - 1).getWorkingHours()));

                data.add(vacancy);
                data.add(deg);
                data.add(salaryFT);
                data.add(jt);
                data.add(wa);

                model3.addRow(data.toArray());
                // vacancyNoF .addItem(FSH.size());
                     vacancyNoFTC.addItem(FSH.get(FSH.size() - 1).getVacancyNumber());
            }

        }

        else if (e.getSource() == hireFullTimeStaffB) {
            if (FSH.size() == 0) {
JOptionPane.showMessageDialog(null, "no vacancy to hire");
            }
            else {
                frame9.setVisible(true);
                frame1.setVisible(false);
            }
        } else if (e.getSource() == displayFullTimeVB) {
            frame8.setVisible(true);
        }
        else if(e.getSource() ==saveFTH){
        
            String date = joiningDateFTF.getText();
            String name = staffNameFTF.getText();
            String qualification = qualificationFTF.getText();
            String appointedBy = appointedByFTF.getText();
            if (date.trim().isEmpty() || name.trim().isEmpty() | qualification.trim().isEmpty()
                    || appointedBy.trim().isEmpty()) {

                JOptionPane.showMessageDialog(frame9, "Please fill all the information","Inane error",
                JOptionPane.ERROR_MESSAGE);

            } else {

                ArrayList<FullTImeStaffHire> FSHired = new ArrayList<FullTImeStaffHire>();
                int vn = Integer.parseInt(vacancyNoFTC.getSelectedItem().toString());

                FullTImeStaffHire staff = (FullTImeStaffHire) FSH.get(vn - 1);
                if (!staff.getJoined()) {
                    staff.hireFullTimeStaff(staffNameFTF.getText(), joinedDatePTF.getText(), qualificationFTF.getText(),
                            appointedByFTF.getText());
                    JOptionPane.showMessageDialog(null, "Staff has been hired");
                    clearM();

                    for (int i = 0; i < FSH.size(); i++) {
                        if (FSH.get(i).getJoined() == true) {
                            FSHired.add(FSH.get(i));
               } }}
               else {

                    JOptionPane.showMessageDialog(frame9, "Staff has already been hired in this vacancy", "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                }
                ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
                if (FSHired.size() > 0) {
                    ArrayList<String> vacancy = new ArrayList<String>();
                    ArrayList<String> staffName = new ArrayList<String>();
                    ArrayList<String> joinDate = new ArrayList<String>();
                    ArrayList<String> qualifaction = new ArrayList<String>();
                    ArrayList<String> appBy = new ArrayList<String>();
                    vacancy.add(Integer.toString(staff.getVacancyNumber()));
                    staffName.add(FSHired.get(FSHired.size() - 1).getStaffName());
                    joinDate.add(FSHired.get(FSHired.size() - 1).getJoiningDate());
                    qualifaction.add(FSHired.get(FSHired.size() - 1).getQualification());
                    appBy.add(FSHired.get(FSHired.size() - 1).getAppointedBy());

                    data.add(vacancy);
                    data.add(staffName);
                    data.add(joinDate);
                    data.add(qualifaction);
                    data.add(appBy);

                    model4.addRow(data.toArray());

            }
        }
    }
    else if (e.getSource()==displayFullB){
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

}
