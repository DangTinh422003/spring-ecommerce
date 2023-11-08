package dangtinh.store.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "description", nullable = false)
  private String description;

  @Column(name = "price", nullable = false)
  private double price;

  @Column(name = "color", nullable = false)
  private String color;

  @Column(name = "brand", nullable = false)
  private String brand;

  @Column(name = "imageUrl", nullable = false)
  private String imageUrl;

  @OneToOne(mappedBy = "product")
  private OrderDetail orderDetail;

  public Product(Long id, String name, String description, double price, String color, String brand, String imageUrl) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.color = color;
    this.brand = brand;
    this.imageUrl = imageUrl;
  }

  public Product() {
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

}
