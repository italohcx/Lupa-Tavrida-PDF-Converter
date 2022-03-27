/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author italo.francis
 */
public class PDFTableModel extends AbstractTableModel {

    private List<PDFparametro> dados = new ArrayList<>();
    private String[] colunas = {"Serial", "IA", "IB", "IC", "IN", "VA", "VB", "VC", "VR", "VS", "VT"};

    @Override
    public String getColumnName(int column) {

        return colunas[column];

    }

    public int getRowCount() {

        return dados.size();

    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {

            case 0:
                return dados.get(linha).getSerial();

            case 1:
                return dados.get(linha).getIA();
            case 2:
                return dados.get(linha).getIB();
            case 3:
                return dados.get(linha).getIC();
            case 4:
                return dados.get(linha).getIN();
            case 5:
                return dados.get(linha).getVA();
            case 6:
                return dados.get(linha).getVB();
            case 7:
                return dados.get(linha).getVC();
            case 8:
                return dados.get(linha).getVR();
            case 9:
                return dados.get(linha).getVS();
            case 10:
                return dados.get(linha).getVT();

        }
        return null;

    }

    public void addRow(PDFparametro pdf) {

        this.dados.add(pdf);
        this.fireTableDataChanged();

    }

    public void removeRow() {

        this.dados.removeAll(dados);
        this.fireTableDataChanged();

    }

}
