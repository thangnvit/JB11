package org.activestudy.shop.manager;

import org.activestudy.shop.product.Product;

import java.util.List;

/**
 * Created by DEV on 8/5/2016.
 */
public class ProductManager {
    private List<Product> listProduct;

    public ProductManager(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public boolean addProduct(Product prd) {
        if (prd == null) {
            return false;
        } else {
            listProduct.add(prd);
        }
        return true;
    }

    public boolean removeProduct(String productId) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId().equals(productId)) {
                listProduct.remove(i);
                return true;
            }
        }
        return false;
    }

    public Product findProduct(String productName) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(productName))
                return listProduct.get(i);
        }
        return null;
    }

    public void sortProductByName() {
        for (int i = 0; i < listProduct.size(); i++)
            for (int j = i + 1; j < listProduct.size(); j++) {
                if (listProduct.get(i).getName().compareTo(listProduct.get(j).getName()) > 0) {
                    Product temp;
                    temp = listProduct.get(i);
                    listProduct.set(i, listProduct.get(j));
                    listProduct.set(j, temp);
                }
            }
    }

    public void sortProductByPrice() {
        for (int i = 0; i < listProduct.size(); i++)
            for (int j = i + 1; j < listProduct.size(); j++) {
                if (listProduct.get(i).getPrice() > listProduct.get(j).getPrice()) {
                    Product temp;
                    temp = listProduct.get(i);
                    listProduct.set(i, listProduct.get(j));
                    listProduct.set(j, temp);
                }
            }
    }

    public void showAllProduct() {
        System.out.println(listProduct.toString());
    }
}
