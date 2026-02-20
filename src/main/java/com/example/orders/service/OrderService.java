package com.example.orders.service;

import com.example.orders.model.Order;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private static final String ORDERS_FILE = "orders.txt";

    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        File file = new File(ORDERS_FILE);
        if (!file.exists()) {
            return orders;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length != 5) {
                    continue; // línea mal formada
                }
                try {
                    Long id = Long.parseLong(parts[0]);
                    String date = parts[1];
                    String client = parts[2];
                    BigDecimal total = parts[3].isEmpty() ? null : new BigDecimal(parts[3]);
                    String status = parts[4];
                    orders.add(new Order(id, date, client, total, status));
                } catch (Exception e) {
                    // Ignorar línea mal formada
                }
            }
        } catch (Exception e) {
            // Ignorar errores de lectura
        }
        return orders;
    }
}
