/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acaipizzariapdv.caixa.saidasEntradas;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;

public class TableModelEntradasSaidas  extends AbstractTableModel{

    String[] columns = {"Valor", "Categoria", "Solicitante"};
    List<SaidasEntradasModel> saidasEntradas = new ArrayList();
    
    @Override
    public int getRowCount(){
       return saidasEntradas.size();
    }

    @Override
    public int getColumnCount(){
        return columns.length;
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return columns[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        return switch (columnIndex) {
            case 0 -> saidasEntradas.get(rowIndex).getValor();
            case 1 -> saidasEntradas.get(rowIndex).getCategoria();
            case 2 -> saidasEntradas.get(rowIndex).getSolicitante();
            default -> "Não foi possível obter dados de entradas e saídas.";
        };
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        if(saidasEntradas.isEmpty()){
            return Object.class;
        }
        return this.getValueAt(0, columnIndex).getClass();
    }

    public String[] getColumns(){
        return columns;
    }

   
    public List<SaidasEntradasModel> getSaidasEntradas() {
        return saidasEntradas;
    }

    public void setSaidasEntradas(List<SaidasEntradasModel> saidasEntradas) {
        this.saidasEntradas = saidasEntradas;
    }
}
