import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Post {

    String datafinal;
    String hora;
    String conteudo;

    public String postagemCompleta() {
        return (datafinal + " ás " + hora + " - " + "'" + conteudo + "'");
    }

    public static int quantidadePostagens = 0;

    public static ArrayList<String> listaPostagens = new ArrayList<>();

    static void postar(){
        Scanner entrada = new Scanner(System.in);
        Post postagem = new Post();
        System.out.println("Digite o dia da postagem: ");
        String dia = String.valueOf(RedeSocial.pegarIntdia(entrada));
        System.out.println("Digite o mês da postagem: ");
        String mes = String.valueOf(RedeSocial.pegarIntmes(entrada));
        while (dia.equals("31") && !(mes.equals("1")) && !(mes.equals("3")) && !(mes.equals("5")) && !(mes.equals("7")) && !(mes.equals("8")) && !(mes.equals("10")) && !(mes.equals("12"))){
            System.out.println("Mês inválido #_# Digite novamente(meses disponíveis: '1','3','5','7','8','10','12'):");
            mes = String.valueOf(RedeSocial.pegarIntmes(entrada));
        }
        System.out.println("Digite o ano da postagem: ");
        String ano = String.valueOf(RedeSocial.pegarIntano(entrada));
        postagem.datafinal = (dia + "/" + mes + "/" + ano);
        System.out.println("Digite a hora da postagem: ");
        String hora = String.valueOf(RedeSocial.pegarInthorario(entrada));
        System.out.println("Digite os minutos da postagem: ");
        String minutos = String.valueOf(RedeSocial.pegarIntminutos(entrada));
        postagem.hora = (hora + ":" + minutos);
        System.out.println("Faça a postagem: ");
        postagem.conteudo = entrada.nextLine();
        while(postagem.conteudo.equals("")){
            postagem.conteudo = entrada.nextLine();
        }
        quantidadePostagens++;
        listaPostagens.add(postagem.postagemCompleta());
        System.out.println("A postagem foi publicada :D");
        RedeSocial.menuUsuario(entrada);
    }
}
