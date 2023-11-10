package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        if (cabeca == null){
            return false;
        } else {
            No posicao = cabeca;
            while (posicao != null){
                if (posicao.getValor() == valor){
                    return true;
                }
                posicao = posicao.getProximo();
            } 
            return false;
        }
    }

    @Override
    public int buscaIndice(int valor) {
        if (cabeca == null){
            return -1;
        } else {
            No posicao = cabeca;
            int contador = 0;
            while(posicao != null){
                if (contador == valor){
                    return posicao.getValor();
                }
                contador ++;
                posicao = posicao.getProximo();
            }
            return -1;

        }

    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        No novo = new No(valor);

        if (cabeca == null){
            cabeca = novo;

        } else {
            novo.setProximo(cabeca);
            cabeca = novo;
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        insereElemento(valor);
    }

    @Override
    public void insereFim(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
