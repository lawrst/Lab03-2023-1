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
        if (cabeca == null){
            return -1;
        } else {
            No posicao = cabeca;
            int minimo = cabeca.getValor();
            while(posicao != null){
                if (posicao.getValor() < minimo){
                    minimo = posicao.getValor();
                }
                posicao = posicao.getProximo();
            }
            return minimo;
        }
    }

    @Override
    public int maximo() {
       if (cabeca == null){
            return -1;
        } else {
            No posicao = cabeca;
            int maximo = cabeca.getValor();
            while(posicao != null){
                if (posicao.getValor() > maximo){
                    maximo = posicao.getValor();
                }
                posicao = posicao.getProximo();
            }
            return maximo;
    }
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
        No novo = new No(valor);
        if (cabeca == null){
            cabeca = novo;
        } else {
            No posicao = cabeca.getProximo();
            int contador = 0;
            if (buscaIndice == 0){
                insereInicio(valor);
            } else {
                while (posicao.getProximo() != null){
                    if (contador == buscaIndice){
                        novo.setProximo(posicao);
                        posicao.setProximo(novo);
                    }
                }
            }
        }
    }

    @Override
    public void insereInicio(int valor) {
        insereElemento(valor);
    }

    @Override
    public void insereFim(int valor) {
        No novo = new No(valor);
        if (cabeca == null){
            cabeca = novo;
        } else {
            No posicao = cabeca;
            while (posicao != null){
                if (posicao.getProximo() == null){
                    posicao.setProximo(novo);
                    break;
                }
                posicao = posicao.getProximo();
            }
        }
    }

    @Override
    public void remove(int valor) {
        if(cabeca != null){
            No posicao = cabeca;
            if (cabeca.getValor() == valor){
                cabeca = cabeca.getProximo();
                return;
            }
            while(posicao.getProximo() != null){
                if (posicao.getProximo().getValor() == valor){
                    posicao.setProximo(posicao.getProximo().getProximo());
                }
                posicao = posicao.getProximo();
            }
        }
    }

    @Override
    public void removeIndice(int indice) {
        if(cabeca != null){
            No posicao = cabeca;
            int contador = 0;
            if (indice == 0){
                cabeca = cabeca.getProximo();
                return;
            }
            while(posicao != null){
                if (contador + 1 == indice){
                    posicao.setProximo(posicao.getProximo().getProximo());
                }
                contador ++;
                posicao = posicao.getProximo();
            }
        }
    }

    @Override
    public void removeInicio() {
        if(cabeca != null){
            cabeca = cabeca.getProximo();
        }
    }

    @Override
    public void removeFim() {    
        if(cabeca != null){
            No posicao = cabeca;
            while (posicao.getProximo() != null) {
                if(posicao.getProximo().getProximo() == null){
                    posicao.setProximo(null);
                    return;
                }
                posicao = posicao.getProximo();
            }
        }
    }
}