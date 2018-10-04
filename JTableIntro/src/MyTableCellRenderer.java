
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class MyTableCellRenderer implements TableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean bln1, int i, int i1) {
        Student s = (Student) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(s.getHairColor());
        
        switch(column)
        {
            case 0: label.setText(s.getFirstname()); break;
            case 1: label.setText(s.getLastname()); break;
            case 2: label.setText(s.getBirthday().toString()); break;
            case 3: label.setText(""); break;
        }
        
        return label;
    }
    
}
