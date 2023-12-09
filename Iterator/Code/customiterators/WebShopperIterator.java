package customiterators;

import java.util.Iterator;

public class WebShopperIterator implements Iterator {

    @Override
    public boolean hasNext() {
        System.out.println("Revisando si todavía hay productos disponibles");
        return true;
    }

    @Override
    public Object next() {
        return "Producto disponible";
    }
    
}

