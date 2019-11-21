package br.com.caelum.cdcspring.model.form;

import br.com.caelum.cdcspring.model.Autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AutorForm {

    private Long autorId;

    @NotBlank(message = "Nome inválido, por favor verifique o valor digitado!")
    private String nome;

    @Email(message = "Não é um endereço de email válido, por favor verifique o valor digitado!")
    @NotBlank(message = "Email inválido, por favor verifique o valor digitado!")
    private String email;

    public Long getAutorId() {
        return autorId;
    }

    public void setAutorId(Long autorId) {
        this.autorId = autorId;
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

    public Autor toAutor() {
        Autor autor = new Autor(this.nome, this.email);
        autor.setId(this.autorId);
        return autor;
    }

    @Override
    public String toString() {
        return "AutorForm{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
