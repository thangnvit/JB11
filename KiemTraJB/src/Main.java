import org.activestudy.shop.manager.ProductManager;
import org.activestudy.shop.product.Case;
import org.activestudy.shop.product.Cpu;
import org.activestudy.shop.product.Product;
import org.activestudy.shop.product.Ram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by DEV on 8/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Ram ram = new Ram("id1","gt111",12000,2);
        Ram ram1 = new Ram("id2","abc",25000,3);
        Cpu cpu = new Cpu("id3","cpu",30000,4);
        Case ab = new Case("id4","case1",ram,cpu);
        List<Product> a = new ArrayList<>();
        a.add(ram);
        a.add(ram1);
        a.add(ab);
        ProductManager prdManager = new ProductManager(a);
        prdManager.showAllProduct();

<<<<<<< HEAD
=======

>>>>>>> refs/heads/master
    }
}
