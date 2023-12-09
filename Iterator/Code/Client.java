package client;

import customCollections.ProductWarehouse;
import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        ProductWarehouse products = new ProductWarehouse();
        
        //Navegación para comprador Web
        Iterator it1 = products.createWebShopperIterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
            //Uso de break para visualizar el funcionamiento del iterator
            break;
        }
        System.out.println();
        
        //Navegación para vendedor de una tienda
        Iterator it2 = products.createStoreClerkIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
            //Uso de break para visualizar el funcionamiento del iterator
            break;
        }
        System.out.println();
        
        //Navegación para proveedor
        Iterator it3 = products.createSupplierIterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
            //Uso de break para visualizar el funcionamiento del iterator
            break;
        }
        System.out.println();
        
        //Navegación para asistente de mantenimiento
        Iterator it4 = products.createMaintenanceAssistantIterator();
        while(it4.hasNext()){
            System.out.println(it4.next());
            //Uso de break para visualizar el funcionamiento del iterator
            break;
        }
    }
}

