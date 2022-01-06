package Filas;

public class No <I>{

    private I object;
    private No <I>refno;

    public No() {
    }

    public No(I object) {
        this.refno = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(I object) {
        this.object = object;
    }

    public No getRefno() {
        return refno;
    }

    public void setRefno(No refno) {
        this.refno = refno;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
