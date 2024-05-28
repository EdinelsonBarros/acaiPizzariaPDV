/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.categorias;

import acaipizzariapdv.produtos.ProdutosModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.ImageIcon;
import javax.swing.Icon;

/**
 *
 * @author Usuario
 */
public class TableModelCategorias extends AbstractTableModel{
    String[] columns = { "Nome da categoria", "Segmento", "Editar", "Excluir" };
    List<CategoriasModel> categorias = new ArrayList();
    
    Icon lixeira = new ImageIcon("resources/icones/lixeira.png");
    Icon editar = new ImageIcon("resources/icones/pencil.png");
    
    // métodos obrigatórios para implementar a interface AbstractTableModel
    @Override
    public int getRowCount(){
        return categorias.size();
    }
    
    @Override
    public int getColumnCount(){
        return columns.length;
    }
    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        return switch (columnIndex) {
            case 0 -> categorias.get(rowIndex).getNome();
            case 1 -> categorias.get(rowIndex).getSegmento();
            case 2 -> lixeira;
            case 3 -> editar;
            default -> "Dados não encontrados.";
        };
    }
    
    //métodos não obrigatórios
    @Override
    public void setValueAt(Object value, int row, int col){
        
    }
            
            
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    
    }
    
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false; 
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(categorias.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    public String[] getColumns(){
        return this.columns;
    }
    
    public List<CategoriasModel> getCategorias(){
        return this.categorias;
    }
    
    public void setCategorias(List<CategoriasModel> categorias){
        this.categorias = categorias;
    }
    
}
