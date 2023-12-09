package customiterators;

import java.util.Iterator;

public class MaintenanceAssistantIterator implements Iterator {

    @Override
    public boolean hasNext() {
        System.out.println("Revisando si todavía hay productos en reparación");
        return true;
    }

    @Override
    public Object next() {
        return "Producto en reparación";
    }
    
}

