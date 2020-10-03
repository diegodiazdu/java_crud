
package formularios;

import crud.colegio.ConexionSQL.Conexion;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.table.DefaultTableModel;

public class sistema extends javax.swing.JFrame {

   Conexion con = new Conexion();
   Connection cn = con.conecta();
    
    public sistema() {
        initComponents();
        listarTabla();
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        cbMateria = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstudiantes = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD_JAVA/MYSQL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(111, 187, 235));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombres:");

        txtNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apellidos:");

        txtApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Materia:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Calificación:");

        txtNota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        cbEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Aprobado(a)", "Reprobado(a)" }));

        cbMateria.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Matematicas", "Lenguaje", "Ciencias", "Quimica", "Musica", " " }));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 345, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApellido)
                    .addComponent(cbMateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNota)
                    .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(484, Short.MAX_VALUE))
        );

        tableEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEstudiantes);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Buscar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        
         if((txtNombre.getText().length()==0)||(txtApellido.getText().length()==0)||(txtNota.getText().length()==0)||(cbMateria.getSelectedItem().toString().equals("..."))||(cbEstado.getSelectedItem().toString().toString().equals("..."))){
           
           JOptionPane.showMessageDialog(null, "No puede dejar campos en blanco","Error!",JOptionPane.ERROR_MESSAGE);
           
       }else{
             if(!validaNota()){
            Insertar();
        }
       }
       
            
        
        
            
            
            
        
            

        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tableEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEstudiantesMouseClicked
        
        int fila = tableEstudiantes.rowAtPoint(evt.getPoint());
        
        txtNombre.setText(tableEstudiantes.getValueAt(fila, 1).toString());
        txtApellido.setText(tableEstudiantes.getValueAt(fila, 2).toString());
        cbMateria.setSelectedItem(tableEstudiantes.getValueAt(fila, 3));
        txtNota.setText(tableEstudiantes.getValueAt(fila, 4).toString());
        cbEstado.setSelectedItem(tableEstudiantes.getValueAt(fila, 5));
        btnGuardar.setEnabled(false);
        
        
        
    }//GEN-LAST:event_tableEstudiantesMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       
         
         if((txtNombre.getText().length()==0)||(txtApellido.getText().length()==0)||(txtNota.getText().length()==0)||(cbMateria.getSelectedItem().toString().equals("..."))||(cbEstado.getSelectedItem().toString().equals("..."))){
           
           JOptionPane.showMessageDialog(null, "No puede dejar campos en blanco","Error!",JOptionPane.ERROR_MESSAGE);
           
       }else{
             if(!validaNota()){
            Actualizar();
        }
       }
       
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Borrar();
        listarTabla();
        limpiar();
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        txtNombre.requestFocus();
        btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        Buscar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarActionPerformed

    public void listarTabla(){
        
        String[] titulos = {"ID", "Nombres", "Apellidos", "Materia", "Calificación", "Estado"};
        String[] registros = new String[7];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String opSelect = ("SELECT * FROM ESTUDIANTES");
        
        try{
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(opSelect);
            
            
            while(rs.next()){
                
                registros[0] = rs.getString("EST_ID");
                registros[1] = rs.getString("EST_NOMBRE");
                registros[2] = rs.getString("EST_APELLIDO");
                registros[3] = rs.getString("EST_MATERIA");
                registros[4] = rs.getString("EST_CALIFICACION");
                registros[5] = rs.getString("EST_ESTATUS");
                
                modelo.addRow(registros);
                
      
            }
            
            tableEstudiantes.setModel(modelo);
            
        }catch(Exception e){
         
            JOptionPane.showMessageDialog(null, "Error al listar los datos "+e.getMessage());
            
        }
        
        
        
    }
    
    public void limpiar(){
        
        txtNombre.setText("");
        txtApellido.setText("");
        txtNota.setText("");
        cbMateria.setSelectedItem(null);
        cbEstado.setSelectedItem(null);
        
    }
    
   public void Insertar() {
		
		String opInsert = ("INSERT INTO ESTUDIANTES(EST_NOMBRE, EST_APELLIDO, EST_MATERIA, EST_CALIFICACION, EST_ESTATUS)VALUES(?,?,?,?,?)");
		
		try {
			
			PreparedStatement ps = cn.prepareStatement(opInsert);
			ps.setString(1, txtNombre.getText().toUpperCase());
			ps.setString(2, txtApellido.getText().toUpperCase());
			
			int seleccionado = cbMateria.getSelectedIndex();
			
			ps.setString(3, cbMateria.getItemAt(seleccionado));
			
			ps.setDouble(4, Double.parseDouble(txtNota.getText()));
			
			int seleccionado2=cbEstado.getSelectedIndex();
                        
			ps.setString(5, cbEstado.getItemAt(seleccionado2));
                        
  
                                ps.execute();
                                JOptionPane.showMessageDialog(null, "Notas registrada correctamente!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                                limpiar();
                                listarTabla();
                                txtNombre.requestFocus();
  
		}catch(Exception e) {
			
			//JOptionPane.showMessageDialog(null, "Error al editar el registro "+e.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
   
   public void Actualizar() {
		
		String opInsert = ("UPDATE ESTUDIANTES SET EST_NOMBRE=?,EST_APELLIDO=?,EST_MATERIA=?,EST_CALIFICACION=?,EST_ESTATUS=? WHERE EST_ID = ?");
               
		
		try {
			int filaSel = tableEstudiantes.getSelectedRow();
                        
                        String dato = (String)tableEstudiantes.getValueAt(filaSel, 0);
                    
			PreparedStatement ps = cn.prepareStatement(opInsert);
			ps.setString(1, txtNombre.getText().toUpperCase());
			ps.setString(2, txtApellido.getText().toUpperCase());
			
			int seleccionado = cbMateria.getSelectedIndex();
			
			ps.setString(3, cbMateria.getItemAt(seleccionado));
			
			ps.setDouble(4, Double.parseDouble(txtNota.getText()));
			
                        int seleccionado2=cbEstado.getSelectedIndex();
			
			ps.setString(5, cbEstado.getItemAt(seleccionado2));
            
                        ps.setString(6, dato);
                        
			 
                            ps.execute();
                            JOptionPane.showMessageDialog(null, "registros editados correctamente!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                            listarTabla();
                            txtNombre.setText("");
                        
			
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Error al editar registro "+e.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
			
		}
		
	}
     
   public void Borrar(){
     
       int filaSel = tableEstudiantes.getSelectedRow();
       
       try{
           
           String opDelete = ("DELETE FROM ESTUDIANTES WHERE EST_ID="+tableEstudiantes.getValueAt(filaSel, 0));
           
           Statement st = cn.createStatement();
           
           int confirma = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar todos los registros?","Precaución!",JOptionPane.YES_NO_CANCEL_OPTION);
                  
           if(confirma == YES_OPTION){
               
               st.executeUpdate(opDelete);
               JOptionPane.showMessageDialog(null, "Registro eliminado","Correcto",JOptionPane.OK_OPTION);
               listarTabla();
               
           }else{
               JOptionPane.showMessageDialog(null, "Registro no eliminado","Correcto",JOptionPane.INFORMATION_MESSAGE);
           }

       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, "Error al eliminar el registro","Error!",JOptionPane.INFORMATION_MESSAGE);
           
       }
       
   }
   
   public void Buscar(String valor){
       
        String[] titulos = {"ID", "Nombres", "Apellidos", "Materia", "Calificación", "Estado"};
        String[] registros = new String[7];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String opSelect = ("SELECT * FROM ESTUDIANTES WHERE EST_NOMBRE LIKE '%"+valor+"%'");
        
        try{
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(opSelect);
            
            
            while(rs.next()){
                
                registros[0] = rs.getString("EST_ID");
                registros[1] = rs.getString("EST_NOMBRE");
                registros[2] = rs.getString("EST_APELLIDO");
                registros[3] = rs.getString("EST_MATERIA");
                registros[4] = rs.getString("EST_CALIFICACION");
                registros[5] = rs.getString("EST_ESTATUS");
                
                modelo.addRow(registros);
                
      
            }
            
            tableEstudiantes.setModel(modelo);
            
        }catch(Exception e){
         
            JOptionPane.showMessageDialog(null, "Error al listar los datos "+e.getMessage());
            
        }
       
   }
   
   public boolean validaNota(){
       
       if(Double.parseDouble(txtNota.getText()) > 7.0){
           
            JOptionPane.showMessageDialog(null, "No puede ingresar notas superiores a 7.0","Error!",JOptionPane.ERROR_MESSAGE);
                            txtNota.setText("");
                            txtNota.requestFocus();
           
       }
       return false;
       
   }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sistema().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEstudiantes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
