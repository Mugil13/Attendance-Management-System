import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.sql.*;
public class stud_func1 {

}

class markAttendance extends javax.swing.JFrame {
	
	Connection con;
	String user=LoginRegisterFrame.username;
	//String user="srk";
	String date=java.time.LocalDate.now().toString();
	public markAttendance()
	{
		
		 con=MyConnection.getConnection();
		 PreparedStatement st;
		 String query="create table if not exists "+user+" (date varchar(10) NOT NULL,OOPS char(10),DS char(10),UHV char(10),DPSD char(10),TAMIL char(10),MATHS char(10),LAB char(10),PRIMARY KEY (date));";
		 try
		 {
			 st=con.prepareStatement(query);
			 if (st.executeUpdate()>0)
	            {
				 	System.out.println(user);
	            }
		 }
		 catch(SQLException e)
		 {
			 System.out.println(e);
		 }
		 	
	      
	      String q="insert into "+user+"(date) values('" + date+ "');" ;
	       try
	       {
	    	   st=con.prepareStatement(q);
	    	   st.executeUpdate();
	       }
	       catch(Exception e1)
	       {
	    	   //System.out.println(e1);
	       }
		 initComponents();
	}
	
	 private void initComponents() {

		 jPanel1 = new javax.swing.JPanel();
	        jPanel2 = new javax.swing.JPanel();
	        jLabel2 = new javax.swing.JLabel();
	        jButton_close = new javax.swing.JButton();
	        jLabel1 = new javax.swing.JLabel();
	        jLabel10 = new javax.swing.JLabel();
	        jLabel11 = new javax.swing.JLabel();
	        jLabel12 = new javax.swing.JLabel();
	        jLabel13 = new javax.swing.JLabel();
	        jLabel14 = new javax.swing.JLabel();
	        jLabel15 = new javax.swing.JLabel();
	        jButton_a_oops = new javax.swing.JButton();
	        jButton_od_oops = new javax.swing.JButton();
	        jButton_p_ds = new javax.swing.JButton();
	        jButton_p_uhv = new javax.swing.JButton();
	        jButton_p_tam = new javax.swing.JButton();
	        jButton_p_oops = new javax.swing.JButton();
	        jButton_p_mat = new javax.swing.JButton();
	        jButton_p_lab = new javax.swing.JButton();
	        jButton_p_dpsd = new javax.swing.JButton();
	        jButton_a_ds = new javax.swing.JButton();
	        jButton_a_dpsd = new javax.swing.JButton();
	        jButton_a_mat = new javax.swing.JButton();
	        jButton_a_tam = new javax.swing.JButton();
	        jButton_a_lab = new javax.swing.JButton();
	        jButton_a_uhv = new javax.swing.JButton();
	        jButton_od_uhv = new javax.swing.JButton();
	        jButton_od_ds = new javax.swing.JButton();
	        jButton_od_dpsd = new javax.swing.JButton();
	        jButton_od_tam = new javax.swing.JButton();
	        jButton_od_mat = new javax.swing.JButton();
	        jButton_od_lab = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

	        jPanel1.setBackground(new java.awt.Color(102, 0, 153));

	        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
	        jPanel2.setForeground(new java.awt.Color(255, 204, 0));

	        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel2.setText("Add attendance corresponding to each course");

	        jButton_close.setBackground(new java.awt.Color(255, 153, 0));
	        jButton_close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jButton_close.setText("X");
	        jButton_close.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_closeActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addGap(156, 156, 156)
	                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(39, 39, 39)
	                .addComponent(jButton_close, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(22, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
	                .addContainerGap(21, Short.MAX_VALUE)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel2)
	                    .addComponent(jButton_close))
	                .addGap(10, 10, 10))
	        );

	        jLabel1.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel1.setText("DS");
	        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel10.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel10.setText("UHV");
	        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel11.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel11.setText("OOPS");
	        jLabel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel12.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel12.setText("MATHS");
	        jLabel12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel13.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel13.setText("LAB");
	        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel14.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel14.setText("DPSD");
	        jLabel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jLabel15.setBackground(new java.awt.Color(255, 255, 0));
	        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
	        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
	        jLabel15.setText("TAMIL");
	        jLabel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

	        jButton_a_oops.setText("ABSENT");
	        jButton_a_oops.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_oopsActionPerformed(evt);
	            }
	        });

	        jButton_od_oops.setText("OD");
	        jButton_od_oops.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_oopsActionPerformed(evt);
	            }
	        });

	        jButton_p_ds.setText("PRESENT");
	        jButton_p_ds.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_dsActionPerformed(evt);
	            }
	        });

	        jButton_p_uhv.setText("PRESENT");
	        jButton_p_uhv.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_uhvActionPerformed(evt);
	            }
	        });

	        jButton_p_tam.setText("PRESENT");
	        jButton_p_tam.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_tamActionPerformed(evt);
	            }
	        });

	        jButton_p_oops.setText("PRESENT");
	        jButton_p_oops.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_oopsActionPerformed(evt);
	            }
	        });

	        jButton_p_mat.setText("PRESENT");
	        jButton_p_mat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_matActionPerformed(evt);
	            }
	        });

	        jButton_p_lab.setText("PRESENT");
	        jButton_p_lab.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_labActionPerformed(evt);
	            }
	        });

	        jButton_p_dpsd.setText("PRESENT");
	        jButton_p_dpsd.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_p_dpsdActionPerformed(evt);
	            }
	        });

	        jButton_a_ds.setText("ABSENT");
	        jButton_a_ds.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_dsActionPerformed(evt);
	            }
	        });

	        jButton_a_dpsd.setText("ABSENT");
	        jButton_a_dpsd.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_dpsdActionPerformed(evt);
	            }
	        });

	        jButton_a_mat.setText("ABSENT");
	        jButton_a_mat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_matActionPerformed(evt);
	            }
	        });

	        jButton_a_tam.setText("ABSENT");
	        jButton_a_tam.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_tamActionPerformed(evt);
	            }
	        });

	        jButton_a_lab.setText("ABSENT");
	        jButton_a_lab.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_labActionPerformed(evt);
	            }
	        });

	        jButton_a_uhv.setText("ABSENT");
	        jButton_a_uhv.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_a_uhvActionPerformed(evt);
	            }
	        });

	        jButton_od_uhv.setText("OD");
	        jButton_od_uhv.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_uhvActionPerformed(evt);
	            }
	        });

	        jButton_od_ds.setText("OD");
	        jButton_od_ds.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_dsActionPerformed(evt);
	            }
	        });

	        jButton_od_dpsd.setText("OD");
	        jButton_od_dpsd.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_dpsdActionPerformed(evt);
	            }
	        });

	        jButton_od_tam.setText("OD");
	        jButton_od_tam.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_tamActionPerformed(evt);
	            }
	        });

	        jButton_od_mat.setText("OD");
	        jButton_od_mat.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_matActionPerformed(evt);
	            }
	        });

	        jButton_od_lab.setText("OD");
	        jButton_od_lab.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton_od_labActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addGap(35, 35, 35)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(82, 82, 82)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jButton_p_oops)
	                    .addComponent(jButton_p_uhv)
	                    .addComponent(jButton_p_ds)
	                    .addComponent(jButton_p_mat)
	                    .addComponent(jButton_p_tam)
	                    .addComponent(jButton_p_dpsd)
	                    .addComponent(jButton_p_lab))
	                .addGap(40, 40, 40)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(jButton_a_uhv)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton_a_oops)
	                            .addComponent(jButton_a_ds))
	                        .addGap(53, 53, 53)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton_od_uhv)
	                            .addComponent(jButton_od_oops)
	                            .addComponent(jButton_od_ds)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton_a_dpsd)
	                            .addComponent(jButton_a_mat))
	                        .addGap(53, 53, 53)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton_od_dpsd)
	                            .addComponent(jButton_od_mat)))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton_a_lab)
	                            .addComponent(jButton_a_tam))
	                        .addGap(53, 53, 53)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(jButton_od_tam)
	                            .addComponent(jButton_od_lab))))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jButton_a_oops)
	                        .addComponent(jButton_od_oops)
	                        .addComponent(jButton_p_oops)))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                        .addComponent(jButton_p_ds)
	                        .addComponent(jButton_a_ds)
	                        .addComponent(jButton_od_ds)))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton_p_uhv)
	                    .addComponent(jButton_a_uhv)
	                    .addComponent(jButton_od_uhv))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton_p_dpsd)
	                    .addComponent(jButton_a_dpsd)
	                    .addComponent(jButton_od_dpsd))
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(18, 18, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(jButton_p_mat)
	                            .addComponent(jButton_a_mat)
	                            .addComponent(jButton_od_mat))
	                        .addGap(18, 18, 18)
	                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel1Layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(jButton_p_tam)
	                            .addComponent(jButton_a_tam)
	                            .addComponent(jButton_od_tam))))
	                .addGap(18, 18, 18)
	                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(jButton_p_lab)
	                    .addComponent(jButton_a_lab)
	                    .addComponent(jButton_od_lab))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        );

	        pack();
	    }// </editor-fold>   
	 

	    private void jButton_p_dpsdActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set DPSD='present' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    	
	    }                                              

	    private void jButton_a_dsActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set DS='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                            

	    private void jButton_a_dpsdActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set DPSD='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                              

	    private void jButton_od_uhvActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set UHV='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                              

	    private void jButton_od_dsActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set DS='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_od_dpsdActionPerformed(java.awt.event.ActionEvent evt) {                                                
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set DPSD='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                               

	    private void jButton_od_tamActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set TAMIL='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                              

	    private void jButton_od_matActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set MATHS='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                              

	    private void jButton_od_labActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set LAB='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                              

	    private void jButton_p_oopsActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	        PreparedStatement s;
	        String q="update "+user+" set OOPS='present';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException el)
	        {
	        	System.out.println(el);
	        }
	        
	        
	    }                                              

	    private void jButton_a_oopsActionPerformed(java.awt.event.ActionEvent evt) {                                               
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set OOPS='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                              

	    private void jButton_od_oopsActionPerformed(java.awt.event.ActionEvent evt) {                                                
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set OOPS='OD' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ee)
	        {
	        	
	        }
	    }                                               

	    private void jButton_p_dsActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set DS='present' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                            

	    private void jButton_p_uhvActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set UHV='present' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_a_uhvActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set UHV='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_p_matActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set MATHS='present' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_a_matActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set MATHS='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_p_tamActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set TAMIL='present' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_a_tamActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set TAMIL='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_p_labActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set LAB='present' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    }                                             

	    private void jButton_a_labActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	PreparedStatement s;
	    	String q="update "+user+" set LAB='absent' where date='"+date+"';";
	        try
	        {
	        	s=con.prepareStatement(q);
	        	s.executeUpdate();
	        }
	        catch(SQLException ef)
	        {
	        
	        }
	    } 
	    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        // TODO add your handling code here:
	    	this.dispose();
	    }  
	    
	    private javax.swing.JButton jButton_a_dpsd;
	    private javax.swing.JButton jButton_a_ds;
	    private javax.swing.JButton jButton_a_lab;
	    private javax.swing.JButton jButton_a_mat;
	    private javax.swing.JButton jButton_a_oops;
	    private javax.swing.JButton jButton_a_tam;
	    private javax.swing.JButton jButton_a_uhv;
	    private javax.swing.JButton jButton_close;
	    private javax.swing.JButton jButton_od_dpsd;
	    private javax.swing.JButton jButton_od_ds;
	    private javax.swing.JButton jButton_od_lab;
	    private javax.swing.JButton jButton_od_mat;
	    private javax.swing.JButton jButton_od_oops;
	    private javax.swing.JButton jButton_od_tam;
	    private javax.swing.JButton jButton_od_uhv;
	    private javax.swing.JButton jButton_p_dpsd;
	    private javax.swing.JButton jButton_p_ds;
	    private javax.swing.JButton jButton_p_lab;
	    private javax.swing.JButton jButton_p_mat;
	    private javax.swing.JButton jButton_p_oops;
	    private javax.swing.JButton jButton_p_tam;
	    private javax.swing.JButton jButton_p_uhv;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel10;
	    private javax.swing.JLabel jLabel11;
	    private javax.swing.JLabel jLabel12;
	    private javax.swing.JLabel jLabel13;
	    private javax.swing.JLabel jLabel14;
	    private javax.swing.JLabel jLabel15;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	
}

class view_attendance extends javax.swing.JFrame {

    
	String user=LoginRegisterFrame.username;
    public view_attendance() {
        
        initComponents();
        displayAttendance();
    }

                         
    private void initComponents() {

    	 jPanel1 = new javax.swing.JPanel();
         jPanel2 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();

         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

         jPanel1.setBackground(new java.awt.Color(0, 0, 204));

         jPanel2.setBackground(new java.awt.Color(255, 255, 0));

         jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
         jLabel1.setText("Attendance Sheet ");

         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
         jPanel2.setLayout(jPanel2Layout);
         jPanel2Layout.setHorizontalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addGap(214, 214, 214)
                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         jPanel2Layout.setVerticalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel2Layout.createSequentialGroup()
                 .addGap(41, 41, 41)
                 .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                 .addGap(25, 25, 25))
         );

         jTable1.setBorder(new javax.swing.border.MatteBorder(null));
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {

             },
             new String [] {
                 "DATE", "OOPS", "DS", "DPSD", "TAMIL", "UHV", "MATHS", "LAB"
             }
         ) {
             boolean[] canEdit = new boolean [] {
                 false, false, false, false, false, false, false, false
             };

             public boolean isCellEditable(int rowIndex, int columnIndex) {
                 return canEdit [columnIndex];
             }
         });
         jScrollPane1.setViewportView(jTable1);
         if (jTable1.getColumnModel().getColumnCount() > 0) {
             jTable1.getColumnModel().getColumn(0).setResizable(false);
             jTable1.getColumnModel().getColumn(0).setPreferredWidth(120);
         }

         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(15, Short.MAX_VALUE))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(29, 29, 29)
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(0, 41, Short.MAX_VALUE))
         );

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         );

         pack();
    }// </editor-fold>                        

    
    public void displayAttendance()
    {
    	Connection con=null;
        
		con=MyConnection.getConnection();
        
        String q="select * from "+user;
        try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(q);
			while (rs.next())
			{
				String date=rs.getString("date");
				String oops=rs.getString("OOPS");
				String ds=rs.getString("DS");
				String dpsd=rs.getString("DPSD");
				String tamil=rs.getString("TAMIL");
				String uhv=rs.getString("UHV");
				String math=rs.getString("MATHS");
				String lab=rs.getString("LAB");
				
				try
				{
				String tbdata[]= {date,oops,ds,dpsd,tamil,uhv,math,lab};
				DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
				
				tblModel.addRow(tbdata);
				}
				catch(Exception e)
				{
					JOptionPane.showMessageDialog(null,"Attendance hasnt been marked yet!");
				}
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Attendance hasnt been marked yet!");
		}
        
        
        
        
    }

    // Variables declaration                    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}

class Update extends javax.swing.JFrame {

	 Connection con;
	 String date;
	 String course;
	 String status;  
	String user=LoginRegisterFrame.username;
	 //String user="varun";
   
   public Update() {
       initComponents();

   	date=jTextField_date.getText().toString();
   	con=MyConnection.getConnection();
    }

                          
   private void initComponents() {

   	jScrollBar1 = new javax.swing.JScrollBar();
       jPanel1 = new javax.swing.JPanel();
       jPanel2 = new javax.swing.JPanel();
       jLabel1 = new javax.swing.JLabel();
       jButton4 = new javax.swing.JButton();
       jLabel2 = new javax.swing.JLabel();
       jTextField_date = new javax.swing.JTextField();
       jLabel3 = new javax.swing.JLabel();
       jLabel4 = new javax.swing.JLabel();
       jButton1 = new javax.swing.JButton();
       jButton2 = new javax.swing.JButton();
       jButton3 = new javax.swing.JButton();
       jComboBox1 = new javax.swing.JComboBox<>();

       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

       jPanel1.setBackground(new java.awt.Color(0, 0, 153));
       jPanel1.setForeground(new java.awt.Color(51, 0, 102));

       jPanel2.setBackground(new java.awt.Color(0, 255, 255));

       jLabel1.setBackground(new java.awt.Color(0, 0, 153));
       jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
       jLabel1.setText("Update Attendance");

       jButton4.setText("X");
       jButton4.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton4ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
       jPanel2.setLayout(jPanel2Layout);
       jPanel2Layout.setHorizontalGroup(
           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(41, 41, 41)
               .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(41, 41, 41))
       );
       jPanel2Layout.setVerticalGroup(
           jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
               .addContainerGap(28, Short.MAX_VALUE)
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(21, 21, 21))
           .addGroup(jPanel2Layout.createSequentialGroup()
               .addGap(15, 15, 15)
               .addComponent(jButton4)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
       jLabel2.setForeground(new java.awt.Color(255, 255, 255));
       jLabel2.setText("Enter the date : ");

       jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
       jLabel3.setForeground(new java.awt.Color(255, 255, 255));
       jLabel3.setText("Course : ");

       jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
       jLabel4.setForeground(new java.awt.Color(255, 255, 255));
       jLabel4.setText("Status");

       jButton1.setText("present");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       jButton2.setText("absent");
       jButton2.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton2ActionPerformed(evt);
           }
       });

       jButton3.setText("OD");
       jButton3.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton3ActionPerformed(evt);
           }
       });

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OOPS", "DS", "DPSD", "TAMIL", "UHV", "MATHS", "LAB" }));
       jComboBox1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jComboBox1ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       jPanel1.setLayout(jPanel1Layout);
       jPanel1Layout.setHorizontalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addGap(33, 33, 33)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                       .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                   .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(26, 26, 26)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jTextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jButton1)
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addComponent(jButton2)
                       .addGap(18, 18, 18)
                       .addComponent(jButton3))
                   .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addContainerGap(46, Short.MAX_VALUE))
       );
       jPanel1Layout.setVerticalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGap(43, 43, 43)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jTextField_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(32, 32, 32)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel3)
                   .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(32, 32, 32)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel4)
                   .addComponent(jButton1)
                   .addComponent(jButton2)
                   .addComponent(jButton3))
               .addGap(0, 58, Short.MAX_VALUE))
       );

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
       );

       pack();
   }// </editor-fold>                        

   
   
   
   
   
   
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   	//present
   	status="present";
   	date=jTextField_date.getText().toString();
   
   	String q="update "+user+" set "+course+"='present' where date='"+date+"';";
   	try
   	{
   		Statement s=con.createStatement();
   		s.executeUpdate(q);
   	}
   	catch(SQLException e)
   	{
   		System.out.println(e);
   	}
   	
   	
   }                                        

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   	//absent
   	status="absent";
   	date=jTextField_date.getText().toString();
  
   	String q="update "+user+" set "+course+"='absent' where date='"+date+"';";
   	try
   	{
   		Statement s=con.createStatement();
   		s.executeUpdate(q);
   	}
   	catch(SQLException e)
   	{
   		System.out.println(e);
   	}
   }                                        

   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
   	//OD
   	status="OD";
   	date=jTextField_date.getText().toString();
   	
   	
   	String q="update "+user+" set "+course+"='OD' where date='"+date+"';";
   	try
   	{
   		Statement s=con.createStatement();
   		s.executeUpdate(q);
   	}
   	catch(SQLException e)
   	{
   		System.out.println(e);
   	}
   }
   
   private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       // TODO add your handling code here:////scrollll barrrr
   	course=jComboBox1.getSelectedItem().toString();
       ///System.out.println(course);
   }   
   
   
   
   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
       this.dispose();
   }                                        

  

   // Variables declaration                  
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JTextField jTextField_date;
   // End of variables declaration                   
}



