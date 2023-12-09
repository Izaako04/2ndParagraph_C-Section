package customiterators;

import java.util.Iterator;

public class SupplierIterator implements Iterator {

    @Override
    public boolean hasNext() {
        System.out.println("Revisando si todavía hay productos que han "
                + "presentado fallas dentro del periodo de garantía");
        return true;
    }

    @Override
    public Object next() {
        return "Producto que ha presentado fallas dentro del periodo de garantía";
    }
    
}


