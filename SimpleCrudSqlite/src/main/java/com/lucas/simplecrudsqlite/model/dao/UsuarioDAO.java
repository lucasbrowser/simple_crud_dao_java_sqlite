/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lucas.simplecrudsqlite.model.dao;


import com.lucas.simplecrudsqlite.bd.ConexaoSqlite;
import com.lucas.simplecrudsqlite.model.domain.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class UsuarioDAO extends ConexaoSqlite{
    
    public List<Usuario> listarTodos() throws Exception {
        List<Usuario> lUsuario = new LinkedList<>();
        try {
            this.conectar();
            String sql = "SELECT * FROM TBUSUARIO ORDER BY CODIGO";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setCodigo(rs.getLong("CODIGO"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setFuncao(rs.getString("FUNCAO"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setSenha(rs.getString("SENHA"));
                lUsuario.add(usuario);
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return lUsuario;
    }
    
    public Usuario logar(String login, String senha) throws Exception {
        Usuario usuario = new Usuario();
        try {
            this.conectar();
            String sql = "SELECT * FROM TBUSUARIO WHERE LOGIN=? AND SENHA=?";
            PreparedStatement ps = this.getCon().prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                usuario.setCodigo(rs.getLong("CODIGO"));
                usuario.setNome(rs.getString("NOME"));
                usuario.setFuncao(rs.getString("FUNCAO"));
                usuario.setLogin(rs.getString("LOGIN"));
                usuario.setSenha(rs.getString("SENHA"));
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return usuario;
    }
    
    public void inserir(Usuario usuario) throws Exception {
        try {
            this.conectar();
            this.insertSQL("INSERT INTO TBUSUARIO (NOME, FUNCAO, LOGIN, SENHA) "
                    + "VALUES ("
                    + "'" + usuario.getNome() + "',"
                    + "'" + usuario.getFuncao() + "',"
                    + "'" + usuario.getLogin() + "',"
                    + "'" + usuario.getSenha() + "'"
                    + ");"
            );
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }
    
    public void alterar(Usuario usuario) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "UPDATE TBUSUARIO SET "
                    + "NOME = '" + usuario.getNome() + "',"
                    + "FUNCAO = '" + usuario.getFuncao() + "',"
                    + "LOGIN = '" + usuario.getLogin() + "',"
                    + "SENHA = '" + usuario.getSenha() + "'"
                + " WHERE "
                    + "CODIGO = '" + usuario.getCodigo() + "'"
                + ";"
            );
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }
    
    public void excluir(Usuario usuario) throws Exception {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                "DELETE FROM TBUSUARIO "
                + " WHERE "
                    + "CODIGO = '" + usuario.getCodigo() + "'"
                + ";"
            );
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
    }
}
