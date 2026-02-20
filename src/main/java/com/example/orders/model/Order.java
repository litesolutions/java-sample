package com.example.orders.model;

import java.math.BigDecimal;

public class Order {
    private Long id;
    private String date;
    private String client;
    private BigDecimal total;
    private String status;

    public Order(Long id, String date, String client, BigDecimal total, String status) {
        this.id = id;
        this.date = date;
        this.client = client;
        this.total = total;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getDate() { return date; }
    public String getClient() { return client; }
    public BigDecimal getTotal() { return total; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setDate(String date) { this.date = date; }
    public void setClient(String client) { this.client = client; }
    public void setTotal(BigDecimal total) { this.total = total; }
    public void setStatus(String status) { this.status = status; }
}
