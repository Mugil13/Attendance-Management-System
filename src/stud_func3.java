import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class stud_func3 {

}

class timetable extends javax.swing.JFrame {

    Connection con=MyConnection.getConnection();
    public timetable() {
        initComponents();
        view_tt();
    }

                            
    private void initComponents() {
    	 jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();
         jPanel1 = new javax.swing.JPanel();
         jLabel1 = new javax.swing.JLabel();
         jPanel2 = new javax.swing.JPanel();

         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

         jTable1.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {

             },
             new String [] {
                 "DAY", "I ", "II ", "III ", "IV  ", "V "
             }
         ) {
             boolean[] canEdit = new boolean [] {
                 false, false, false, false, false, false
             };

             public boolean isCellEditable(int rowIndex, int columnIndex) {
                 return canEdit [columnIndex];
             }
         });
         jScrollPane1.setViewportView(jTable1);

         jPanel1.setBackground(new java.awt.Color(0, 153, 153));

         jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
         jLabel1.setText("Time Table");

         javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
         jPanel1.setLayout(jPanel1Layout);
         jPanel1Layout.setHorizontalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(jPanel1Layout.createSequentialGroup()
                 .addGap(277, 277, 277)
                 .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         jPanel1Layout.setVerticalGroup(
             jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                 .addContainerGap(41, Short.MAX_VALUE)
                 .addComponent(jLabel1)
                 .addGap(31, 31, 31))
         );

         jPanel2.setBackground(new java.awt.Color(0, 153, 153));

         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
         jPanel2.setLayout(jPanel2Layout);
         jPanel2Layout.setHorizontalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGap(0, 683, Short.MAX_VALUE)
         );
         jPanel2Layout.setVerticalGroup(
             jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGap(0, 195, Short.MAX_VALUE)
         );

         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
             .addGroup(layout.createSequentialGroup()
                 .addGap(16, 16, 16)
                 .addComponent(jScrollPane1)
                 .addContainerGap())
             .addGroup(layout.createSequentialGroup()
                 .addContainerGap()
                 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addGap(18, 18, 18)
                 .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         );

         pack();
    }// </editor-fold>                        

    
    public void view_tt()
    {
    	String q="select * from timetable;";
    	try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(q);
			
			while(rs.next())
			{
					String day=rs.getString("day");
					String p1=rs.getString("I");
					String p2=rs.getString("II");
					String p3=rs.getString("III");
					String p4=rs.getString("IV");
					String p5=rs.getString("V");
					//System.out.println(stud+" "+stat);
					String tbdata[]= {day,p1,p2,p3,p4,p5};
					DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
					tblModel.addRow(tbdata);
			}
						
    	}
    	catch(Exception e)
    	{
    		
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

