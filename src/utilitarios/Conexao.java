/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Luis
 */
public class Conexao
{
    public Connection con;
    public ResultSet rs;
    private String driver = "";
    private String url = "";
    private String usuario = "";
    private String senha = "";
//    private String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=databaseacademia[sa em dbo];name=sa;password=123456";
//    public Connection conn;
//
//    public void conecta()
//    {
//        try
//        {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//            conn = DriverManager.getConnection(connectionUrl);
//            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
//
//        } catch (Exception e)
//        {
//           JOptionPane.showMessageDialog(null, "Não foi possivel conectar!\nERRO: " + e.getMessage());
//        }
//    }

}
