package conteudoredesocial;

import redesocial.RedeSocial;

import java.util.ArrayList;
import java.util.Scanner;

public class Post {

    private String dia;
    private String mes;
    private String ano;
    private String minutos;
    private String hora;
    private String datafinal;
    private String horafinal;
    private String conteudo;

    public String postagemCompleta() {
        return (this.getDatafinal() + " ás " + this.getHorafinal() + " - " + "'" + this.getConteudo() + "'");
    }

    public static int quantidadePostagens = 0;

    public static ArrayList<String> listaPostagens = new ArrayList<>();

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
        postagem.datafinal = (postagem.getDia() + "/" + postagem.getMes() + "/" + postagem.getAno());
        System.out.println("Digite a hora da postagem: ");
        postagem.setHora(input);
        System.out.println("Digite os minutos da postagem: ");
        postagem.setMinutos(input);
        postagem.setHorafinal();
        System.out.println("Faça a postagem: ");
        postagem.setConteudo(input);
        quantidadePostagens++;
        listaPostagens.add(postagem.postagemCompleta());
        System.out.println("A postagem foi publicada :D");
        RedeSocial.menuUsuario(input);
    }

    public String getDia(){
        return this.dia;
    }

    public void setDia(Scanner input){
        this.dia = String.valueOf(RedeSocial.pegarIntdia(input));
    }

    public String getMes(){
        return this.mes;
    }

    public void setMes(Scanner input){
        this.mes = String.valueOf(RedeSocial.pegarIntmes(input));
    }

    public String getAno(){
        return this.ano;
    }

    public void setAno (Scanner input){
        this.ano = String.valueOf(RedeSocial.pegarIntano(input));
    }

    public String getMinutos(){
        return this.minutos;
    }

    public void setMinutos (Scanner input){
        this.minutos = String.valueOf(RedeSocial.pegarIntminutos(input));
    }

    public String getHora(){
        return this.hora;
    }

    public void setHora (Scanner input){
        this.hora = String.valueOf(RedeSocial.pegarInthorario(input));
    }

    public String getHorafinal(){
        return this.horafinal;
    }

    public void setHorafinal(){
        this.horafinal = (this.hora + ":" + this.minutos);
    }

    public String getDatafinal(){
        return this.datafinal;
    }

    public void setDatafinal() {
        this.datafinal  = (this.getDia() + "/" + this.getMes() + "/" + this.getAno());
    }

    public String getConteudo(){
        return this.conteudo;
    }

    public void setConteudo(Scanner input){
        this.conteudo = input.nextLine();
        while(this.conteudo.equals("")){
            this.conteudo = input.nextLine();
        }
    }
}
