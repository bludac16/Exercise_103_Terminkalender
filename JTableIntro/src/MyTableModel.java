
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class MyTableModel extends AbstractTableModel{
    
    private static String[] colNames ={"Firstname", "Lastname", "Birthday", "Haircolor"};
    
    private ArrayList<Student> students = new ArrayList<>();
    
    public void add(Student s)
    {
        students.add(s);
        fireTableRowsInserted(students.size()-1, students.size()-1);
    }

    
    @Override
    public String getColumnClass(int i) {
        return colNames[i];
    }
    
    
    
    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIdx, int colIdx) {
        Student s = students.get(rowIdx);
       /* switch(colIdx)
        {
            case 0: return s.getFirstname();
            case 1: return s.getLastname();
            case 2: return s.getBirthday();
            case 3: return s.getHairColor();
            default: return "???";
        }*/ return s;
    }
    
}
