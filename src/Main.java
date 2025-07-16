public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("🎵 Reprodutor Musical");
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\n📞 Aparelho Telefônico");
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.finalizarChamada();

        System.out.println("\n🌐 Navegador de Internet");
        iphone.exibirPagina("https://apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}

