public class Perfil {
        String nome;
        String login;
        String senha;

        public static Perfil[] perfils = new Perfil[50];

        public static int quantidadePerfils = 0;

        void perfilInfo(){
                System.out.println("Nome: " + nome);
                System.out.println("Login: " + login);
        }
}
