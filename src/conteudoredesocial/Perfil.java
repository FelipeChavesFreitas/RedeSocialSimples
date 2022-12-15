package conteudoredesocial;

import redesocial.RedeSocial;

import java.util.Scanner;

public class Perfil extends Usuario{

        public Perfil(String nome, String login, String senha){
                super(nome, login, senha);
        }
        public static Perfil[] perfils = new Perfil[50];

        public static int quantidadePerfils = 0;

        public void perfilInfo(){
                System.out.println("Nome: " + getNome());
                System.out.println("Login: " + getLogin());
        }

        public String getNome(){
                return this.nome;
        }

        public void setNome(Scanner input){
                this.nome = RedeSocial.pegarInfo(input);
        }

        public String getLogin(){
                return this.login;
        }

        public void setLogin(Scanner input){
                this.login = RedeSocial.pegarInfo(input);
        }

        public String getSenha(){
                return this.senha;
        }

        public void setSenha(Scanner input){
                this.senha = RedeSocial.pegarInfo(input);
        }
}
