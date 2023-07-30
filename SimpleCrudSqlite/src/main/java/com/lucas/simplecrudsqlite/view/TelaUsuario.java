/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.simplecrudsqlite.view;


import com.lucas.simplecrudsqlite.control.UsuarioControl;
import com.lucas.simplecrudsqlite.model.domain.Usuario;
import com.towel.swing.table.ObjectTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class TelaUsuario extends javax.swing.JInternalFrame {
    
    private final ObjectTableModel<Usuario> otmUsuario = new ObjectTableModel<>(Usuario.class, "codigo,nome,funcao");
    
    private final UsuarioControl usuarioControl = new UsuarioControl();
    
    private Usuario usuario;

    /**
     * Creates new form TelaDepartamento
     */
    public TelaUsuario() {
        initComponents();
        habilitarFormulario(false);
        carregarGrade();
    }
    
    private void carregarGrade() {
        
        try {      
            otmUsuario.setData(usuarioControl.listarTodos());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
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

        pBarraFerramentas = new javax.swing.JPanel();
        bNovoUsuario = new javax.swing.JButton();
        bSalvarUsuario = new javax.swing.JButton();
        bRemoverUsuario = new javax.swing.JButton();
        bCancelarUsuario = new javax.swing.JButton();
        pConteudo = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpUsuario = new javax.swing.JTable();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lblCargo = new javax.swing.JLabel();
        txtFuncao = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Usuário");

        bNovoUsuario.setText("Novo");
        bNovoUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNovoUsuarioActionPerformed(evt);
            }
        });

        bSalvarUsuario.setText("Salvar");
        bSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarUsuarioActionPerformed(evt);
            }
        });

        bRemoverUsuario.setText("Remover");
        bRemoverUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverUsuarioActionPerformed(evt);
            }
        });

        bCancelarUsuario.setText("Cancelar");
        bCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pBarraFerramentasLayout = new javax.swing.GroupLayout(pBarraFerramentas);
        pBarraFerramentas.setLayout(pBarraFerramentasLayout);
        pBarraFerramentasLayout.setHorizontalGroup(
            pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(bNovoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalvarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bRemoverUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pBarraFerramentasLayout.setVerticalGroup(
            pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pBarraFerramentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCancelarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pBarraFerramentasLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(bRemoverUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addComponent(bNovoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bSalvarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblNome.setText("Nome:");

        tpUsuario.setModel(otmUsuario);
        tpUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tpUsuario);

        lblLogin.setText("Login:");

        lblSenha.setText("Senha:");

        lblCargo.setText("Função:");

        javax.swing.GroupLayout pConteudoLayout = new javax.swing.GroupLayout(pConteudo);
        pConteudo.setLayout(pConteudoLayout);
        pConteudoLayout.setHorizontalGroup(
            pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConteudoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pConteudoLayout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFuncao)
                        .addGap(18, 18, 18)
                        .addComponent(lblLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pConteudoLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pConteudoLayout.setVerticalGroup(
            pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pConteudoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBarraFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pBarraFerramentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNovoUsuarioActionPerformed
        usuario = new Usuario();
        usuario.setCodigo(0l);
        habilitarFormulario(true);
        bRemoverUsuario.setEnabled(false);
        txtNome.requestFocus();
    }//GEN-LAST:event_bNovoUsuarioActionPerformed

    private void bSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarUsuarioActionPerformed
        if (validarFormulario()) {
            usuario.setNome(txtNome.getText().trim());
            usuario.setFuncao(txtFuncao.getText());
            usuario.setLogin(txtLogin.getText());
            usuario.setSenha(pfSenha.getText());

            if (usuario.getCodigo() == 0) {
                try {
                    usuarioControl.inserirUsuario(usuario);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao cadastrar o usuário.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                try {
                    usuarioControl.alterarUsuario(usuario);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao alterar o usuário.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_bSalvarUsuarioActionPerformed

    private void bRemoverUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverUsuarioActionPerformed
        int opcao = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir o usuário " + usuario + "?");
        if (opcao == 0) {
            try {
                usuarioControl.excluirUsuario(usuario);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir o funcionário.\n" + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            habilitarFormulario(false);
            carregarGrade();
        }
    }//GEN-LAST:event_bRemoverUsuarioActionPerformed

    private void bCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarUsuarioActionPerformed
        habilitarFormulario(false);
    }//GEN-LAST:event_bCancelarUsuarioActionPerformed

    private void tpUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpUsuarioMouseClicked
        if (evt.getClickCount() >= 2) {
            usuario = otmUsuario.getValue(tpUsuario.getSelectedRow());

            txtNome.setText(usuario.getNome());
            txtFuncao.setText(usuario.getFuncao());
            txtLogin.setText(usuario.getLogin());
            pfSenha.setText(usuario.getSenha());

            habilitarFormulario(true);

        }
    }//GEN-LAST:event_tpUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarUsuario;
    private javax.swing.JButton bNovoUsuario;
    private javax.swing.JButton bRemoverUsuario;
    private javax.swing.JButton bSalvarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPanel pBarraFerramentas;
    private javax.swing.JPanel pConteudo;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTable tpUsuario;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    
    
    private void habilitarFormulario(boolean b) {
        bNovoUsuario.setEnabled(!b);
        bSalvarUsuario.setEnabled(b);
        bRemoverUsuario.setEnabled(b);
        bCancelarUsuario.setEnabled(b);
        txtNome.setEnabled(b);
        txtFuncao.setEnabled(b);
        txtLogin.setEnabled(b);
        pfSenha.setEnabled(b);
        tpUsuario.setEnabled(!b);

        if (!b) {
            limpaFormulario();
        }
    }

    private void limpaFormulario() {
        usuario = null;
        txtNome.setText("");
        txtFuncao.setText("");
        txtLogin.setText("");
        pfSenha.setText("");
    }
    
    private boolean validarFormulario() {
        if (txtNome.getText().trim().length() < 3) {
            JOptionPane.showMessageDialog(this, "Nome inválido.", "Alerta", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();
            return false;
        }

        return true;
    }


}



