package customiterators;

import java.util.Iterator;

public class StoreClerkIterator implements Iterator{

    @Override
    public boolean hasNext() {
        System.out.println("Revisando si todavía hay productos disponibles en la tienda");
        return true;
    }

    @Override
    public Object next() {
        return "Producto disponible en la tienda";
    }
    
}

