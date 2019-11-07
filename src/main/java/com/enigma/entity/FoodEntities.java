package com.enigma.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "food_menu")
public class FoodEntities {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid",strategy = "uuid")
    private String idFood;
    private String foodName;
    private String type;
    private BigDecimal price;
    private Integer quantity;

    public FoodEntities(String foodName, String type, BigDecimal price, Integer quantity) {
        this.foodName = foodName;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public FoodEntities() {
    }

    public String getIdFood() {
        return idFood;
    }

    public void setIdFood(String idFood) {
        this.idFood = idFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodEntities that = (FoodEntities) o;
        return Objects.equals(idFood, that.idFood) &&
                Objects.equals(foodName, that.foodName) &&
                Objects.equals(type, that.type) &&
                Objects.equals(quantity, that.quantity) &&
                price.compareTo(that.getPrice())==0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFood, foodName, type, price, quantity);
    }
}
