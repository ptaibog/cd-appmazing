package com.campusdual.appmazing.model.dto;

import com.campusdual.appmazing.model.Category;

import java.math.BigDecimal;
import java.util.Date;

public class ProductDTO {


        private int id;
        private String name;
        private int stock;
        private BigDecimal price;
        private Boolean active;
        private Date date_added;
        private Category category;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStock() {
            return stock;
        }

        public void setStock(int stock) {
            this.stock = stock;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public Date getDate_added() {
            return date_added;
        }

        public void setDate_added(Date date_added) {
            this.date_added = date_added;
        }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

