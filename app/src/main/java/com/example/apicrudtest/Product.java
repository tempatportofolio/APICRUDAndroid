package com.example.apicrudtest;

import org.json.JSONException;
import org.json.JSONObject;

public class Product {

    private int ID,price,type;
    private String name,description;
    public static final int INSERT_TYPE = 1;
    public static final int UPDATE_TYPE = 2;
    public static final int DELETE_TYPE = 3;




    public static Product generateInsertObject(String name, int price, String description) {
        return  new Product(-1,name,price,description,Product.INSERT_TYPE);
    }

    public static Product generateUpdateObject(int id, String name, int price,  String description) {
        return new Product(id,name,price,description,Product.UPDATE_TYPE);
    }

    public static Product generateDeleteObject(int id) {
        return new Product(id,null,-1,null,Product.DELETE_TYPE);
    }

    public JSONObject getJsonProduct() {
        JSONObject obj = new JSONObject();
            try {
                obj.put("category_id", -1);
                switch (type) {
                    case Product.INSERT_TYPE:

                        obj.put("name", this.name);
                        obj.put("price", this.price);
                        obj.put("description", this.description);

                        break;
                    case Product.UPDATE_TYPE:
                        obj.put("id", this.ID);
                        obj.put("name", this.name);
                        obj.put("price", this.price);
                        obj.put("description", this.description);
                        break;
                    case Product.DELETE_TYPE:
                        obj.put("id", this.ID);
                        break;
                }
            }catch (JSONException e) {
                e.printStackTrace();
            }
            return obj;
    }

    public String getJsonString() {
        return getJsonProduct().toString();
    }

    private Product(int id, String name, int price, String description, int type) {
        this.ID = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.type = type;
    }
}
