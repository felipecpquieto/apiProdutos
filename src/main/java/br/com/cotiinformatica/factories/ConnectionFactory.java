package br.com.cotiinformatica.factories;

public class ConnectionFactory {
	
	/*
	 * metodo para subir conexao com o banco de dados
	 */
	public connection getConnection() {
		    
            try {
                var host = "jbdcc:postgresql://localhost:5436/apiprodutos";
                var user = "admin";
                var password = "admin123";
                
                return DriverManager.getConnection(host, user, pass);
                } catch (Exception e) {
					e.printStackTrace();
					return null;
                }

	}
}
