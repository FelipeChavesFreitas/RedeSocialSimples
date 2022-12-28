package conteudoredesocial;

import redesocial.RedeSocial;

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

    public static void postar(Scanner input){
        Post postagem = new Post();
        System.out.println("Digite o dia da postagem: ");
        postagem.setDia(input);
        System.out.println("Digite o mês da postagem: ");
        postagem.setMes(input);
        while (postagem.getDia().equals("31") && !(postagem.getMes().equals("1")) && !(postagem.getMes().equals("3")) && !(postagem.getMes().equals("5")) && !(postagem.getMes().equals("7")) && !(postagem.getMes().equals("8")) && !(postagem.getMes().equals("10")) && !(postagem.getMes().equals("12"))){
            System.out.println("Mês inválido #_# Digite novamente(meses disponíveis: '1','3','5','7','8','10','12'):");
            postagem.setMes(input);
        }
        System.out.println("Digite o ano da postagem: ");
        postagem.setAno(input);
        postagem.setDatafinal();
        System.out.println("Digite a hora da postagem: ");
        postagem.setHora(input);
        System.out.println("Digite os minutos da postagem: ");
        postagem.setMinutos(input);
        postagem.setHorafinal();
        System.out.println("Faça a postagem: ");
        postagem.setConteudo(input);
        Post.quantidadePostagens++;
        Post.listaPostagens.add(postagem.postagemCompleta());
        System.out.println("A postagem foi publicada :D");
        RedeSocial.menuUsuario(input);
    }

    public abstract void setNome(Scanner input);

    public abstract void setLogin(Scanner input);

    public abstract void setSenha(Scanner input);


}
