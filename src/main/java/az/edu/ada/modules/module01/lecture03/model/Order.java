package az.edu.ada.modules.module01.lecture03.model;

import az.edu.ada.modules.module01.lecture03.model.enums.CustomerType;
import az.edu.ada.modules.module01.lecture03.model.enums.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public  class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private String id;
    private List<Item> items;
    private CustomerType customerType;  // e.g., "VIP", "REGULAR"
    private PaymentType paymentType;   // e.g., "CREDIT_CARD", "PAYPAL"
    private String customerEmail;
}