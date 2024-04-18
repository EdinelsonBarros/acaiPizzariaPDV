/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.produtos;

/**
 *
 * @author Usuario
 */
public class ProdutosModel {
    public int id;
    public String nome;
    public int preco;
    public String medida;
    
   public ProdutosModel(int id, String nome, int preco, String medida){
       this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.medida = medida;
    }
    
   public ProdutosModel(String nome, int preco, String medida){
        this.nome = nome;
        this.preco = preco;
        this.medida = medida;
    }
   
   public ProdutosModel(){
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
    
    @Override
    public String toString(){
        return "Id: " + getId() + ", Nome: " + getNome() + ", Preço: " + getPreco() + ", Unidade Medida: " + getMedida();
        
    } 
    
    
}
