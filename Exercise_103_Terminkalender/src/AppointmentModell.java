
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class AppointmentModell extends AbstractListModel{

    private ArrayList<Appointment> appointments = new ArrayList<>();
    
    public void add(Appointment a)
    {
        appointments.add(a);
        fireIntervalAdded(this, appointments.size()-1, appointments.size()-1);
    }
    
    public void save(File f) throws FileNotFoundException, IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Appointment a: appointments) {
            oos.writeObject(a);
        }
        oos.flush();
        oos.close();
    }
    public void load(File f) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try{
            Object o;
            while ((o = ois.readObject()) != null)
            {
                appointments.add((Appointment) o);
            }
        } catch (Exception Ex)
        {
            
        }
    }
    
    @Override
    public int getSize() {
        return appointments.size();
    }

    @Override
    public Object getElementAt(int i) {
        return appointments.get(i);
    }
    
}
