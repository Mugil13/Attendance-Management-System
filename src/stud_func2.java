import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;


public class stud_func2 {

}

class consolidatedreport extends javax.swing.JFrame {

    Connection con;
    
    String user=LoginRegisterFrame.username;
    //String user="varun";
    
    double s1;
	double s2;
	double s3;
	double s4;
	double s5;
	double s6;
	double s7;
	int od1;
	int od2;
	int od3;
	int od4;
	int od5;
	int od6;
	int od7;
    
   
    public consolidatedreport() {
    	System.out.println(user);
    	
		con=MyConnection.getConnection();
    	
    	initComponents();
    	generatereport();
        
    }

                          
    private void initComponents() {
    	jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONSOLIDATED REPORT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE", "PERCENTAGE", "NUMBER OF ODS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();

    }// </editor-fold>                        

    
    public void generatereport()
    {
    	
    	
    	try
    	{
    		String q1="select count(OOPS) from "+user+";";
        	String q2="select count(OOPS) from "+user+" where OOPS='present';";
        	String q3="select count(OOPS) from "+user+" where OOPS='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od1=rs2.getInt(1);
    		s1=(100*n2)/n1;
    		System.out.println("OOPS : "+s1);
    	}
    		
    		catch(Exception e)
        	{
        		//System.out.println(e);
    			s1=0;
        	}
    	
    	
    	
    	try
    	{
    		String q1="select count(DS) from "+user+";";
    		String q2="select count(DS) from "+user+" where DS='present';";
    		String q3="select count(DS) from "+user+" where DS='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od2=rs2.getInt(1);
    		s2=(100*n2/n1);
    		System.out.println("DS: "+s2);
    	}
		
		catch(Exception e)
    	{
    		//System.out.println(e);
			s2=0;
    	}
    	
    	try
    	{
    		String q1="select count(DPSD) from "+user+";";
    		String q2="select count(DPSD) from "+user+" where DPSD='present';";
    		String q3="select count(DPSD) from "+user+" where DPSD='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od3=rs2.getInt(1);
    		s3=(100*n2/n1);
    		System.out.println("DPSD: "+s3);
    	}
		
		catch(Exception e)
    	{
    		//System.out.println(e);
			s3=0;
    	}
    	try
    	{
    		String q1="select count(TAMIL) from "+user+";";
    		String q2="select count(TAMIL) from "+user+" where TAMIL='present';";
    		String q3="select count(TAMIL) from "+user+" where TAMIL='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od4=rs2.getInt(1);
    		s4=(100*n2/n1);
    		System.out.println("TAMIL: "+s4);
    	}
		
		catch(Exception e)
    	{
    		//System.out.println(e);
			s4=0;
    	}
    	try
    	{
    		String q1="select count(UHV) from "+user+";";
    		String q2="select count(UHV) from "+user+" where UHV='present';";
    		String q3="select count(UHV) from "+user+" where UHV='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od5=rs2.getInt(1);
    		s5=(100*n2/n1);
    		System.out.println("UHV: "+s5);
    	}
		
		catch(Exception e)
    	{
    		//System.out.println(e);
			s5=0;
    	}
    	try
    	{
    		String q1="select count(MATHS) from "+user+";";
    		String q2="select count(MATHS) from "+user+" where MATHS='present';";
    		String q3="select count(MATHS) from "+user+" where MATHS='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od6=rs2.getInt(1);
    		s6=(100*n2/n1);
    		System.out.println("MATHS: "+s6);
    	}
		
		catch(Exception e)
    	{
    		//System.out.println(e);
			s6=0;
    	}
    	try
    	{
    		String q1="select count(LAB) from "+user+";";
    		String q2="select count(LAB) from "+user+" where LAB='present';";
    		String q3="select count(LAB) from "+user+" where LAB='OD';";
    		Statement st=con.createStatement();
    		Statement st1=con.createStatement();
    		Statement st2=con.createStatement();
    		ResultSet rs=st.executeQuery(q1);
    		rs.next();
    		ResultSet rs1=st1.executeQuery(q2);rs1.next();
    		ResultSet rs2 = st2.executeQuery(q3);rs2.next();
    		int n1=rs.getInt(1);
    		int n2=rs1.getInt(1);
    		od7=rs2.getInt(1);
    		s7=(100*n2/n1);
    		System.out.println("LAB: "+s7);
    	}
		
		catch(Exception e)
    	{
    		//System.out.println(e);
			s7=0;
    	}
    	
    	Object t1[]={"OOPS",s1,od1};
    	Object t2[]={"DS",s2,od2};
    	Object t3[]={"DPSD",s3,od3};
    	Object t4[]={"TAMIL",s4,od4};
    	Object t5[]={"UHV",s5,od5};
    	Object t6[]={"MATHS",s6,od6};
    	Object t7[]={"LAB",s7,od7};
    	DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
    	tblModel.addRow(t1);
    	tblModel.addRow(t2);
    	tblModel.addRow(t3);
    	tblModel.addRow(t4);
    	tblModel.addRow(t5);
    	tblModel.addRow(t6);
    	tblModel.addRow(t7);
    		
	}//generate report end

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
}


class view_teacher_attendance extends javax.swing.JFrame {

	String user=LoginRegisterFrame.username;
	//String user="karthikeyan";
    Connection con=MyConnection.getConnection();
    public view_teacher_attendance() {
        initComponents();
    }

                            
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_generate = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Faculty's Attendance Sheet");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter the Course");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OOPS", "DPSD", "DS", "UHV", "TAMIL", "MATHS", "LAB" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_generate.setText("Generate Sheet");
        jButton_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_generateActionPerformed(evt);
            }
        });

        jButton_clear.setText("Clear Sheet");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton_generate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_generate)
                    .addComponent(jButton_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void jButton_generateActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	 String course =jComboBox1.getSelectedItem().toString();
    	 String q="select teacher from teacher_info where course ='"+course+"';";
    	 
     	try {
 			Statement st=con.createStatement();
 			ResultSet rs=st.executeQuery(q);
 			rs.next();
 			String teacher=rs.getString("teacher");
 			///System.out.println(teacher+" "+user);
 			String q1="select date,status from "+teacher+" where name='"+user+"';";
 			Statement st1=con.createStatement();
 			ResultSet rs1=st1.executeQuery(q1);
 			while(rs1.next())
 			{
 				String date=rs1.getString("date");
 				System.out.println(date);
 				String status=rs1.getString("status");
 				System.out.println(status);
 				Object tbdata[]= {date,status};
				DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
				tblModel.addRow(tbdata);
 			}
 			
     	}
     	catch(Exception e)
     	{
     		JOptionPane.showMessageDialog(null,"Your attendance hasnt been updated :(");
     	}
    	
    }                                                

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {                                              
     
    	jTable1.setModel(new DefaultTableModel(null, new String[] {"Date","Status"}));
    }                                             

    

    // Variables declaration                     
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_generate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}






