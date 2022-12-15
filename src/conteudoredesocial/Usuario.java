package conteudoredesocial;

import java.util.Scanner;

public abstract class Usuario {
    protected String nome;
    protected String login;
    protected String senha;

    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public abstract void setNome(Scanner input);

    public abstract void setLogin(Scanner input);

    public abstract void setSenha(Scanner input);


}
