package model.bo.produto;


public class Marca {
    private int idMarca;
    private String descricao;

    public Marca() {
    }

    public Marca(int idMarca, String descricao) {
        this.idMarca = idMarca;
        this.descricao = descricao;
    }
    
    
    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

     @Override
    public String toString() {
        return this.getDescricao();
    }
}
