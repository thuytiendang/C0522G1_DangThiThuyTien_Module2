package ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service.impl;

import ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.model.Product;
import ss12_map_treemap.exercise.arraylist_linkedlist_in_collection_framework.service.IProductService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static List<Product> list = new ArrayList<>();


    static {
        list.add(new Product(1, "sữa", 20.000f));
        list.add(new Product(2, "bút", 5.000f));
        list.add(new Product(3, "vở", 7.000f));
        list.add(new Product(4, "nước ngọt", 12.000f));
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá tiền của sản phẩm:");
        float price = Float.parseFloat(scanner.nextLine());
        list.add(new Product(id, name, price));
    }

    @Override
    public void setById(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sửa tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Sửa giá tiền của sản phẩm:");
        float price = Float.parseFloat(scanner.nextLine());
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                list.set(i, new Product(id,name,price));
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.remove(list.get(i));
            }
        }
    }

    @Override
    public void show() {
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }

    @Override
    public void findByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i).getNameOfProduct())) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    @Override
    public void increasingArrange() {
       IncreasingArrange increasingArrange = new IncreasingArrange();
        list.sort(increasingArrange);
    }

    @Override
    public void decreasingArrange() {
        DecreasingArrange decreasingArrange=new DecreasingArrange();
        list.sort(decreasingArrange);
    }

    @Override
    public boolean findId(int id) {
        for (Product product : list) {
            if (id == product.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findName(String name) {
        for (Product product : list) {
            if (name.equals(product.getNameOfProduct())) {
                return true;
            }
        }
        return false;
    }
}
