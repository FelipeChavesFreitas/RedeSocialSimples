import java.util.*;

public class RedeSocial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrarRedeSocial(entrada);
        entrada.close();
    }

    public static String pegarFrases(Scanner input) {
        try {
            return input.nextLine();
        } catch (InputMismatchException | NumberFormatException e) {
            input.nextLine();
            System.out.println("Escolha inválida.\nDigite novamente:");
            return pegarFrases(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Escolha não foi computada por conta de um erro :(");
            return pegarFrases(input);
        }
    }

    public static String pegarInfo(Scanner input) {
        try {
            String a = input.nextLine();
            if (a.equals("")){
                System.out.println("Erro ao computar entrada #_#\nDigite novamente: ");
                return pegarInfo(input);
            }else{
                return a;
             }
        } catch (InputMismatchException | NullPointerException e) {
            input.nextLine();
            System.out.println("Escolha inválida.\nDigite novamente:");
            return pegarInfo(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Escolha não foi computada por conta de um erro :(");
            return pegarInfo(input);
        }
    }

    public static String entrarRedeSocial(Scanner input){
        int i = 0;
        System.out.println("Bem vindo a rede social :D");
        System.out.println("Digite uma das opções abaixo: ");
        System.out.println("=== OPÇÕES ===");
        System.out.println("C (para cadastrar) | E (para entrar) | F (para fechar o programa)");
        String a = pegarFrases(input);
        while (!a.toUpperCase().equals("C") && !a.toUpperCase().equals("E") && !a.toUpperCase().equals("F")){
            System.out.println("Escolha inválida, tente novamente #_#");
            System.out.println("Digite uma das opções abaixo: ");
            System.out.println("=== OPÇÕES ===");
            System.out.println("C (para cadastrar) | E (para entrar) | F (para fechar o programa)");
            a = pegarFrases(input);
        }do{
            if (a.toUpperCase(Locale.ROOT).equals("F")){
                System.exit(0);
            }else if(a.toUpperCase(Locale.ROOT).equals("C")) {
                cadastrar(input);
                System.out.println("Conta criada :D");
                System.out.println("Agora vamos te redirecionar ao menu inicial para logar :)");
                a = entrarRedeSocial(input);
             }
         }while(!a.toUpperCase().equals("E"));
        login(input);
        return "0";
    }

    public static void menuUsuario(Scanner input){
        System.out.println("O que deseja fazer hoje?");
        System.out.println("p ou postar (para postar algo) | t ou timeline (para ir para timeline) | s ou sair (para sair)");
        String escolha = pegarFrases(input);
        while (!escolha.toLowerCase(Locale.ROOT).equals("p") && !escolha.toLowerCase(Locale.ROOT).equals("postar") && !escolha.toLowerCase(Locale.ROOT).equals("t") && !escolha.toLowerCase(Locale.ROOT).equals("timeline") && !escolha.toLowerCase(Locale.ROOT).equals("s") && !escolha.toLowerCase(Locale.ROOT).equals("sair")){
            System.out.println("Esolha inválida digite novamente: ");
            System.out.println("p ou postar (para postar algo) | t ou timeline (para ir para timeline) | s ou sair (para sair)");
            escolha = pegarFrases(input);
        }
        if (escolha.toLowerCase(Locale.ROOT).equals("s") || escolha.toLowerCase(Locale.ROOT).equals("sair")){
            System.out.println("Tudo bem, vamos voltar a o menu inicial.");
            System.out.println("Tenha um bom dia ;)");
            System.out.println("\n");
            if(Post.quantidadePostagens >= 1){
                Post.listaPostagens.clear();
                Post.quantidadePostagens = 0;
            }
            entrarRedeSocial(input);
        } else if (escolha.toLowerCase(Locale.ROOT).equals("p") || escolha.toLowerCase(Locale.ROOT).equals("postar")){
            Perfil.perfils[RedeSocial.j].perfilInfo();
            System.out.println("================");
            Post.postar();
        } else{
            Perfil.perfils[RedeSocial.j].perfilInfo();
            System.out.println("==========TIMELINE=========");
            timeline(input);
        }
    }

    public static int pegarIntdia(Scanner input){
        try {
            int numero = input.nextInt();
            while (numero < 0 || numero > 31){
                System.out.println("Número inválido.\nDigite novamente: ");
                numero = pegarIntdia(input);
            }
            return numero;
        } catch (InputMismatchException | NumberFormatException e) {
            input.nextLine();
            System.out.println("Número inválido.\nDigite novamente:");
            return pegarIntdia(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Valor não foi computado por conta de um erro :(\nDigite novamente: ");
            return pegarIntdia(input);
        }
    }

    public static int pegarIntmes(Scanner input){
        try {
            int numero = input.nextInt();
            while (numero <= 0 || numero > 12){
                System.out.println("Número inválido (O mês só é aceito em números de 1 a 12).\nDigite novamente: ");
                numero = pegarIntmes(input);
            }
            return numero;
        } catch (InputMismatchException | NumberFormatException e) {
            input.nextLine();
            System.out.println("Número inválido (O mês só é aceito em números de 1 a 12).\nDigite novamente:");
            return pegarIntmes(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Valor não foi computado por conta de um erro :(\nDigite novamente: ");
            return pegarIntmes(input);
        }
    }

    public static int pegarIntano(Scanner input){
        try {
            int numero = input.nextInt();
            while (numero < 1990 || numero > 2022){
                System.out.println("Número inválido (O ano só pode estar entre 1990 e 2022).\nDigite novamente: ");
                numero = pegarIntano(input);
            }
            return numero;
        } catch (InputMismatchException | NumberFormatException e) {
            input.nextLine();
            System.out.println("Número inválido.\nDigite novamente:");
            return pegarIntano(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Valor não foi computado por conta de um erro :(\nDigite novamente: ");
            return pegarIntano(input);
        }
    }

    public static int pegarInthorario(Scanner input){
        try {
            int numero = input.nextInt();
            while (numero < 0 || numero > 23){
                System.out.println("Número inválido.\nDigite novamente: ");
                numero = pegarInthorario(input);
            }
            return numero;
        } catch (InputMismatchException | NumberFormatException e) {
            input.nextLine();
            System.out.println("Número inválido.\nDigite novamente:");
            return pegarInthorario(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Valor não foi computado por conta de um erro :(\nDigite novamente: ");
            return pegarInthorario(input);
        }
    }

    public static int pegarIntminutos(Scanner input){
        try {
            int numero = input.nextInt();
            while (numero < 0 || numero > 60){
                System.out.println("Número inválido.\nDigite novamente: ");
                numero = pegarIntminutos(input);
            }
            return numero;
        } catch (InputMismatchException | NumberFormatException e) {
            input.nextLine();
            System.out.println("Número inválido.\nDigite novamente:");
            return pegarIntminutos(input);
        } catch (Exception e) {
            input.nextLine();
            System.out.println("Valor não foi computado por conta de um erro :(\nDigite novamente: ");
            return pegarIntminutos(input);
        }
    }

    public static void login(Scanner input){
        System.out.println("Digite seu login: ");
        String login = pegarInfo(input);
        int z = 1;
        for(RedeSocial.j = 0; j < Perfil.quantidadePerfils; j++){
            if (login.equals(Perfil.perfils[j].login)){
                break;
            } else{
                z++;
                if(z>Perfil.quantidadePerfils){
                    System.out.println("Perfil não encontrado :(");
                    System.out.println("Por favor, tente novamente.");
                    login(input);
                }
            }
        }
        if (Perfil.quantidadePerfils == 0){
            System.out.println("Perfil não encontrado :(");
            System.out.println("Por favor, tente novamente.");
            login(input);
        }
        System.out.println("Digite seu senha: ");
        String senha = pegarInfo(input);
        while (!senha.equals(Perfil.perfils[j].senha)){
            System.out.println("Senha incorreta, digite novamente: ");
            senha = pegarInfo(input);
        }
        System.out.println("Bem vindo " + login);
        menuUsuario(input);
    }

    static void cadastrar(Scanner input){
        Perfil usuario = new Perfil();
        Perfil.perfils[Perfil.quantidadePerfils++] = usuario;
        System.out.println("Digite seu nome completo: ");
        usuario.nome = pegarInfo(input);
        System.out.println("Digite um login: ");
        usuario.login = pegarInfo(input);
        int c;
        int z = Perfil.quantidadePerfils-1;
        boolean passou = true;
        for(c = 0; c < Perfil.quantidadePerfils; c++) {
            if(Perfil.quantidadePerfils ==1){
                passou = true;
                break;
            }if (usuario.login.equals(Perfil.perfils[c].login) && !(c == z)) {
                System.out.println("O login já existe :(\nTente criar uma conta novamente.");
                passou = false;
                break;
            }
        }
        if (passou == false){
            cadastrar(input);
        }else{
            System.out.println("Digite uma senha: ");
            usuario.senha = pegarInfo(input);
         }
    }

    public static void timeline(Scanner input){
        if (Post.quantidadePostagens == 0){
            System.out.println("Ainda nã há posts :(");
        }else {
            for (int i = 0; i < Post.quantidadePostagens; i++) {
                System.out.println(Post.listaPostagens.get(i));
            }
         }
        System.out.println("\n");
        menuUsuario(input);
    }

    public static int j = 0;
}
