/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ismae
 */
public class ApartamentoDAO {
    
    private Connection con;

    public ApartamentoDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean save(Apartamento apartamento) {
        String sql = "INSERT INTO apartamento(qtd_quarto,estado,id_condominio) VALUES(?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, apartamento.getQtdQuarto());
            stmt.setString(2, apartamento.getEstado());
            stmt.setInt(3, apartamento.getCondominio().getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public boolean updateApartamento(Apartamento apartamento) {
        String sql = "UPDATE apartamento SET estado = ? WHERE id = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, apartamento.getEstado());
            stmt.setInt(2, apartamento.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public boolean delete(Apartamento apartamento) {
        String sql = "DELETE FROM apartamento WHERE id = ? ";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, apartamento.getId());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
      public ArrayList<Apartamento> findAll() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Apartamento> Apartamentos = new ArrayList<>();
        String sql = "select * from view_apartamento"; 
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Apartamento a = new Apartamento();
                Condominio c = new Condominio();
                Locador l = new Locador(rs.getInt("id_locador"));
               
                c.setLocador(l);
                c.setId(rs.getInt("cid"));                
                c.setRua(rs.getString("rua"));
                c.setNumero(rs.getInt("numero"));
                
                a.setId(rs.getInt("id"));
                a.setQtdQuarto(rs.getInt("qtd_quarto"));
                a.setEstado(rs.getString("estado"));
                a.setCondominio(c);                
                                
                Apartamentos.add(a);
            }
        } catch (SQLException ex) {
            System.out.println("erro ao fazer select de aluguel");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return Apartamentos;
    }
    
    
    public static void main(String[] args) {
        Apartamento a = new Apartamento(3, "desoculpado", new Condominio(1));
        a.setId(1);
        ApartamentoDAO ap = new ApartamentoDAO();        
        ap.delete(a);
    }
    
    
    
}
