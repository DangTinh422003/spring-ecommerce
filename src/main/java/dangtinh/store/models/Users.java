package dangtinh.store.models;

import java.util.List;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "fullname", nullable = false)
  private String fullname;

  @Column(name = "age", nullable = false)
  private int age;

  @Column(name = "address", nullable = false)
  private String address;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "gender", nullable = false)
  private boolean gender;

  @Column(name = "role", nullable = false)
  private String role;

  @OneToOne(mappedBy = "users")
  private Account account;

  @OneToOne(mappedBy = "users")
  private Cart cart;

  @OneToMany(mappedBy = "users")
  private List<Orders> orders;

  public Users(Long id, String fullname, int age, String address, String email, boolean gender, String role) {
    this.id = id;
    this.fullname = fullname;
    this.age = age;
    this.address = address;
    this.email = email;
    this.gender = gender;
    this.role = role;
  }

  public Users() {
  }

}
