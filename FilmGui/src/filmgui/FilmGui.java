/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmgui;
import BDUtilities.BDUtilities;
import java.awt.List;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import oracle.jdbc.internal.OracleTypes;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;
/**
 *
 * @author 'Toine
 */
public class FilmGui extends javax.swing.JFrame {

    BDUtilities uti;
    String ip;
    int port;
    /**
     * Creates new form FilmGui
     */
    public FilmGui() {
        try {
            initComponents();
            ip = "localhost";
            port = 1521;
            uti = new BDUtilities(ip,port);
        } catch (Exception ex) {
            Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titreLabel = new javax.swing.JLabel();
        acteurLabel = new javax.swing.JLabel();
        identifiantLabel = new javax.swing.JLabel();
        titreTF = new javax.swing.JTextField();
        acteurTF = new javax.swing.JTextField();
        identifiantTF = new javax.swing.JTextField();
        resultScrollPanel = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        rechercheButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        directeurTF = new javax.swing.JTextField();
        detailsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titreLabel.setText("Recherche Titre:");

        acteurLabel.setText("Recherche Acteur:");

        identifiantLabel.setText("Recherche Identifiant:");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        resultScrollPanel.setViewportView(resultTable);

        rechercheButton.setText("Recherche");
        rechercheButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Recherche Directeur:");

        detailsButton.setText("details");
        detailsButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailsButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acteurLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(resultScrollPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identifiantLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(identifiantTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acteurTF, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(directeurTF))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(rechercheButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(detailsButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titreLabel)
                    .addComponent(identifiantLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identifiantTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acteurLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acteurTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(directeurTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechercheButton)
                    .addComponent(detailsButton))
                .addGap(18, 18, 18)
                .addComponent(resultScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheButtonMouseClicked
        // TODO add your handling code here:
        String rechercheStr=null;
        String tmpStr=null;
        String[] dirStr=null;
        String[] actStr=null;
        StringTokenizer strTok;
        int nbrTok=0;
        ArrayDescriptor des = null;
        try
        {
            des = ArrayDescriptor.createDescriptor("PKG_RECHCB.STR_ARRAY", uti.getCon());
        }
        catch(SQLException ex)
        {
            Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        strTok = new StringTokenizer(directeurTF.getText(), ",");
        nbrTok = strTok.countTokens();
        dirStr = new String[nbrTok==0?1:nbrTok];
        if(nbrTok==0)
            dirStr[0]=".*";
        System.out.println(""+nbrTok);
        for(int i=0; i<nbrTok;i++)
        {
            dirStr[i]= new String(strTok.nextToken());
            System.out.println(""+i+" -- "+dirStr[i]);
        }
        strTok = new StringTokenizer(acteurTF.getText(), ",");
        nbrTok = strTok.countTokens();
        actStr = new String[nbrTok==0? 1:nbrTok];
        if(nbrTok==0)
            actStr[0]=".*";
        System.out.println(""+nbrTok);
        for(int i=0; i<nbrTok;i++)
        {
            actStr[i]= new String(strTok.nextToken());
            System.out.println(""+i+" -- "+actStr[i]);
        }
        //recherche
        CallableStatement cs = null;
        //PreparedStatement cs = null;
        ResultSet rs=null;
        //String sql = "{call pkg_rechcb.rechcbfct(?,?,?,?)}";
        String sql = "{call pkg_rechcb.RechCB2(?,?,?,?,?)}";
        Ref result = null;
        try {
            cs = uti.getCon().prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //cs = uti.getCon().prepareStatement(sql);
            cs.setString(1, identifiantTF.getText().equals("")?"%":identifiantTF.getText());
            cs.setString(2, titreTF.getText().equals("")?"%":titreTF.getText());
            ARRAY arrayAct = new ARRAY(des,uti.getCon(),actStr);
            ARRAY arrayDir = new ARRAY(des,uti.getCon(),dirStr);
            cs.setArray(3, arrayAct);
            cs.setArray(4, arrayDir);
            cs.registerOutParameter(5, OracleTypes.CURSOR);
            //rs = (ResultSet) cs.executeQuery();
            cs.execute();
            //rs = (ResultSet) cs.getArray(5);
            rs = (ResultSet) cs.getObject(5);
            resultTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //affichag0
        int i =0;
        DefaultTableModel dtm = (DefaultTableModel) resultTable.getModel();
        ResultSetMetaData meta=null;
        int numberOfColumns=0;
        try {
            meta = rs.getMetaData();
            numberOfColumns = meta.getColumnCount();
            System.out.println("number : "+numberOfColumns);
            while(rs.next())
            {
                Object[] obj = new Object[numberOfColumns];
                String[] str = new String[numberOfColumns];
                for(i=0; i<obj.length;i++)
                {
                    obj[i] = rs.getObject(i+1);
                    str[i] = rs.getObject(i+1).toString();
                    System.out.print(""+obj[i]+" - ");
                }
                dtm.addRow(str);
                System.out.println();
            }
            //resultTable.setModel(dtm);
            //dtm.fireTableDataChanged();
        } catch (SQLException ex) {
            Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("RECHERCHE FAITES!");
    }//GEN-LAST:event_rechercheButtonMouseClicked

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2)
        {
            //recherche film
            String FilmStr = (String)resultTable.getValueAt(resultTable.getSelectedRow(), 0);
            ArrayList info= new ArrayList();
            String sql = "{call pkg_rechcb.GetFilmInfo(?,?)}";
            Ref result = null;
            ResultSet rs=null;
            CallableStatement cs = null;
            try {
                cs = uti.getCon().prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                //cs = uti.getCon().prepareStatement(sql);
                cs.setString(1, FilmStr);
                cs.registerOutParameter(2, OracleTypes.CURSOR);
                cs.execute();
                rs = (ResultSet) cs.getObject(2);
                resultTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                //
                rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            ResultSetMetaData meta=null;
            int numberOfColumns=0;
            try {
                meta = rs.getMetaData();
                numberOfColumns = meta.getColumnCount();
                for(int i=0;i<numberOfColumns;i++){
                    info.add(rs.getObject(i));
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            //on affiche le gui details
            DetailsGui dg = new DetailsGui();
            dg.currentFilm = info;
            
            
        }
    }//GEN-LAST:event_resultTableMouseClicked

    private void detailsButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsButtonMouseClicked
        // TODO add your handling code here:
        //recherche film
            String FilmStr = (String)resultTable.getValueAt(resultTable.getSelectedRow(), 0);
            ArrayList info= new ArrayList();
            String sql = "{call pkg_rechcb.GetFilmInfo(?,?)}";
            Ref result = null;
            ResultSet rs=null;
            CallableStatement cs = null;
            try {
                cs = uti.getCon().prepareCall(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                //cs = uti.getCon().prepareStatement(sql);
                cs.setString(1, FilmStr);
                cs.registerOutParameter(2, OracleTypes.CURSOR);
                cs.execute();
                rs = (ResultSet) cs.getObject(2);
                //resultTable.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (SQLException ex) {
                Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                //
                rs.next();
            } catch (SQLException ex) {
                Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            ResultSetMetaData meta=null;
            int numberOfColumns=0;
            try {
                meta = rs.getMetaData();
                numberOfColumns = meta.getColumnCount();
                for(int i=0;i<numberOfColumns;i++){
                    info.add(rs.getObject(i+1)==null ? "null":rs.getObject(i+1));
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(FilmGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            //on affiche le gui details
            DetailsGui dg = new DetailsGui();
            dg.currentFilm = info;
            dg.setAllValue(info);
            dg.setVisible(true);
    }//GEN-LAST:event_detailsButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilmGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FilmGui().setVisible(true);
            }
        });
    }
    class MyTableModel extends AbstractTableModel {
        private final String[] tableHeaders;
        public Object[][] lObj=null;
        ResultSet rs;
        ResultSetMetaData rsmd;

        public MyTableModel(ResultSet prs){
            rs = prs;
            try {
                rsmd = rs.getMetaData();
            } catch (SQLException ex) {
                Logger.getLogger(MyTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableHeaders = new String[getColumnCount()];
            for(int i = 0; i < getColumnCount(); i++)
            {
                try {
                    tableHeaders[i] = rsmd.getColumnName(i+1);
                } catch (SQLException ex) {
                    Logger.getLogger(MyTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                while(rs.next())
                {
                    
                }
            } catch (Exception e) {
            }
        }

        @Override
        public String getColumnName(int columnIndex) {
            return tableHeaders[columnIndex];
        }
 
        @Override
        public int getRowCount(){
            int ret = 0;
            try {
                ret = rs.getFetchSize();
            } catch (SQLException ex) {
                Logger.getLogger(MyTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            return ret;
        }

        @Override
        public int getColumnCount(){
            try {
                return rsmd.getColumnCount();
            } catch (SQLException ex) {
                Logger.getLogger(MyTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            return 0;
        }

        @Override
        public Object getValueAt(int row, int column){
            
            Object myObj = null;
            try {
                if(column==0)
                    rs.next();
                if(row == getRowCount()-2)
                {
                    rs.first();
                }
                myObj = rs.getObject(column+1);
            } catch (SQLException ex) {
                Logger.getLogger(MyTableModel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(myObj == null)
                return "NULL";
            return myObj;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acteurLabel;
    private javax.swing.JTextField acteurTF;
    private javax.swing.JButton detailsButton;
    private javax.swing.JTextField directeurTF;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JTextField identifiantTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton rechercheButton;
    private javax.swing.JScrollPane resultScrollPanel;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel titreLabel;
    private javax.swing.JTextField titreTF;
    // End of variables declaration//GEN-END:variables
}
