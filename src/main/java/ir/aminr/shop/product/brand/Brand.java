package ir.aminr.shop.product.brand;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Optional;

@Entity(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(generator = "BRAND_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BRAND_SEQ", sequenceName = "BRAND_SEQ", allocationSize = 1)
    @Column(unique = true)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String logo;

    @Column(unique = true)
    private Long brandeCode;

    private Long productCode;

    private LocalDate createdAt;

    private LocalDate modifiedAt;

    private Long createdBy;

    private Long modifiedBy;

    public Brand() {
    }

    public Brand(
            Long id,
            String name,
            Long brandeCode,
            Long productCode,
            String logo,
            LocalDate createdAt,
            LocalDate modifiedAt,
            Long createdBy,
            Long modifiedBy
    ) {
        this.id = id;
        this.name = name;
        this.brandeCode = brandeCode;
        this.productCode = productCode;
        this.logo = logo;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getBrandeCode() {
        return brandeCode;
    }

    public void setBrandeCode(Long brandeCode) {
        this.brandeCode = brandeCode;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Optional<LocalDate> getModifiedAt() {
        return Optional.ofNullable(modifiedAt);
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Optional<Long> getModifiedBy() {
        return Optional.ofNullable(modifiedBy);
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Long getProductCode() {
        return productCode;
    }

    public void setProductCode(Long productCode) {
        this.productCode = productCode;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
