package exercicios.exercicio05;

public class Ebook {
    // atributos = características, possui, é
    private int totalPaginas, paginaAtual;
    private String titulo, autor;

    // construtuor
    public Ebook(int totalPaginas, int paginaAtual, String autor, String titulo) {
    //setPaginaAtual(paginaAtual); // valida a pagina atual
    this.paginaAtual = 0;
    this.titulo = titulo;
    this.totalPaginas = totalPaginas;
    this.autor = autor;
        }

    public void mostrarCapa() {
        System.out.println(titulo);
        System.out.println("Autor - " + autor);
        System.out.println("Total de páginas - " + totalPaginas);
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            this.paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if (paginaAtual > 0) {
            this.paginaAtual--;
        }
    }

    public void irParaPagina(int pagina) {
        if (pagina >= 0 && pagina <= totalPaginas) {
            this.paginaAtual = pagina;
        }
    }

    public int exibirPagina() {
       
      // System.out.println("pagina : " + paginaAtual);
       return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        if (paginaAtual > 00 && paginaAtual <= totalPaginas) {
            this.paginaAtual = paginaAtual;
        }
    }

}
