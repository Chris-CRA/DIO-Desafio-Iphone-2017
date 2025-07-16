public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("▶ Tocando a música selecionada.");
    }

    @Override
    public void pausar() {
        System.out.println("⏸ Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("🎶 Música selecionada: " + musica);
    }

    // Telefone
    @Override
    public void ligar(String numero) {
        System.out.println("📲 Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("✅ Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📩 Correio de voz iniciado.");
    }

    @Override
    public void finalizarChamada() {
        System.out.println("📴 Chamada finalizada.");
    }

    // Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 Exibindo a página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("🆕 Nova aba aberta.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 Página atualizada.");
    }
}


