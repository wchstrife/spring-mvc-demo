package app03a.domain;

/**
 * Created by wangchenghao on 2017/7/20.
 */
public class Product {
    private static final long serialVersionUID = 748392348L;
    private String name;
    private String description;
    private float price;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
