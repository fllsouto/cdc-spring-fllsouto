package br.com.caelum.cdcspring.model.form;

import br.com.caelum.cdcspring.model.Autor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class AutorForm {

    @NotBlank(message = "Nome inválido, por favor verifique o valor digitado!")
    private String nome;

    @Email(message = "Não é um endereço de email válido, por favor verifique o valor digitado!")
    @NotBlank(message = "Email inválido, por favor verifique o valor digitado!")
    private String email;

    public AutorForm() {
    }

    public AutorForm(Autor autor) {
        this.nome = autor.getNome();
        this.email = autor.getEmail();
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
        return  new Autor(this.nome, this.email);
    }

    @Override
    public String toString() {
        return "AutorForm{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
