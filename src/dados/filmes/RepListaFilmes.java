

import javax.management.RuntimeErrorException;
import dados.filmes.Filmes;


class RepListaFilmes implements RepFilme{
    private Filmes filme;
    private RepFilmesLista proximo;

    RepFilmesLista() {
        this.filme = null;
        this.proximo = null;

    }

    public void inserir(Filmes novoFilme) {
        if (this.filme == null) {
            this.filme = novoFilme;
            this.proximo = new RepFilmesLista();
        } else {
            this.proximo.inserir(novoFilme);
        }
    }

    public void remover(String nome){
        if(this.filme != null){
        if(this.filme.getNome().equals(nome)) {
            this.filme=this.proximo.filme;
            this.proximo=this.proximo.proximo;
        } else{
            this.proximo.remover(filmeRemover);        
        }
    }else {
        throw new RuntimeErrorException("Error. Filme nao encontrado.");
    }

    }

    public boolean buscar(Filmes filmeBuscar) { // implementar busca
        if (this.filme != null) {

        } else {
            throw new RuntimeErrorException("Error. Filme nao encontrado.");
        }

        return null;
    }

}