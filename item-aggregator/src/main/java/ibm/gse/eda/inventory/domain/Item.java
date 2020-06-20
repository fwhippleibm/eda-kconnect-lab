package ibm.gse.eda.inventory.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class Item {
    public Long id;
    public String storeName;
    public String itemCode;
    public int quantity;
    public Double price;
    public String timestamp;

    public Item(){}
}