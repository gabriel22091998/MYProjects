/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quarto;

/**
 *
 * @author Usuário
 */
public class quarto {
    private String nome;
    private String email;
    
    public quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

public String toString() {
return nome + ", " + email;
}
    
}
