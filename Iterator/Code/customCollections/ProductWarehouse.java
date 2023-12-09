package customCollections;

import com.dienarau.talleriterator.Product;
import com.dienarau.talleriterator.customiterators.*;
import java.util.Iterator;
import java.util.List;

public class ProductWarehouse {
    List<Product> products;
    
    public void addProduct(){
        System.out.println("Añadiendo Producto");
    }
    
    public void deleteProduct(){
        System.out.println("Eliminando Producto");
    }
    
    public Iterator createWebShopperIterator(){
        System.out.println("Iterador para comprador Web");
        return new WebShopperIterator();
    }
    
    public Iterator createStoreClerkIterator(){
        System.out.println("Iterador para vendedor de una tienda");
        return new StoreClerkIterator();
    }
    
    public Iterator createSupplierIterator(){
        System.out.println("Iterador para proveedor");
        return new SupplierIterator();
    }
    
    public Iterator createMaintenanceAssistantIterator(){
        System.out.println("Iterador para asistente de mantenimiento");
        return new MaintenanceAssistantIterator();
    }
    
}


