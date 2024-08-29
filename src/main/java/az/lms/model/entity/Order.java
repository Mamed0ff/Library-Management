package az.lms.model.entity;

import az.lms.model.enums.OrderType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    Long studentId;
    @Column(nullable = false)
    Long bookId;
    @CreationTimestamp
    LocalDateTime orderTime;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    OrderType orderType;
}
