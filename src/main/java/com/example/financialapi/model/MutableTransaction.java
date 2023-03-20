package com.example.financialapi.model;

import java.util.Objects;

public class MutableTransaction {

    public String id;
    private String title;
    private Double amount;
    private String description;

    public MutableTransaction(String id, String title, double amount, String description){

        this.id = id;
        this.title = title;
        this.amount = amount;
        this.description = description;
    }

    public String id() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutableTransaction that = (MutableTransaction) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(amount, that.amount) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, amount, description);
    }

    @Override
    public String toString() {
        return "MutableTransaction{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
