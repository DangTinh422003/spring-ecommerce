package dangtinh.store.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orderDetail")
public class OrderDetail {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "quantity", nullable = false)
  private int quantity;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "product_id", referencedColumnName = "id")
  private Product product;

  @ManyToOne
  @JoinColumn(name = "order_id", nullable = false)
  private Orders order;
}
