package Filas;

public class Fila<I> {

    private No<I> refNoEntradaFila;


    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(I obj){
        No novoNo = new No(obj);
        novoNo.setRefno(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public I first(){
        if(!this. isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefno() != null){
                    primeiroNo = primeiroNo.getRefno();
                }else{
                    break;
                }
            }
            return(I) primeiroNo.getObject();
        }
        return null;

    }

    public I dequeue(){
        if(!this. isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getRefno() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefno();
                }else{
                    noAuxiliar.setRefno(null);
                    break;
                }
            }
            return (I) primeiroNo.getObject();
        }
        return null;

    }



    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;


        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]------";
                noAuxiliar = noAuxiliar.getRefno();
                if (noAuxiliar.getRefno() != null) {
                    noAuxiliar = noAuxiliar.getRefno();

                }else{
                    stringRetorno += "null";
                    break;
                }
            }

        }else{

        }

        return stringRetorno;
    }
}
