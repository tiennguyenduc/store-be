package com.demo.store.entity;
// Generated Feb 7, 2018 1:34:34 PM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 * Sku generated by hbm2java
 */
@Entity
@Table(name = "sku", catalog = "store")
public class Sku implements java.io.Serializable {

	private static final long serialVersionUID = -5537632495086257118L;
	private Integer id;
	private Product product;
	private String externalId;
	private String name;
	private Long cost;
	private String description;
	private String longDescription;
	private Integer quantityAvaiable;
	private Date createDate;
	private Date updateDate;
	private Set<SkuMediaXref> skuMediaXrefs = new HashSet<SkuMediaXref>(0);
	private Set<SkuAttribute> skuAttributes = new HashSet<SkuAttribute>(0);

	public Sku() {
	}

	public Sku(Product product) {
		this.product = product;
	}

	public Sku(Product product, String externalId, String name, Long cost, String description, String longDescription,
			Integer quantityAvaiable, Date createDate, Date updateDate, Set<SkuMediaXref> skuMediaXrefs,
			Set<SkuAttribute> skuAttributes) {
		this.product = product;
		this.externalId = externalId;
		this.name = name;
		this.cost = cost;
		this.description = description;
		this.longDescription = longDescription;
		this.quantityAvaiable = quantityAvaiable;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.skuMediaXrefs = skuMediaXrefs;
		this.skuAttributes = skuAttributes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "external_id", length = 200)
	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cost", precision = 10, scale = 0)
	public Long getCost() {
		return this.cost;
	}

	public void setCost(Long cost) {
		this.cost = cost;
	}

	@Column(name = "description", length = 65535)
	@Type(type = "text")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "long_description", length = 65535)
	@Type(type = "text")
	public String getLongDescription() {
		return this.longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Column(name = "quantity_avaiable")
	public Integer getQuantityAvaiable() {
		return this.quantityAvaiable;
	}

	public void setQuantityAvaiable(Integer quantityAvaiable) {
		this.quantityAvaiable = quantityAvaiable;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_date", length = 19)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sku")
	public Set<SkuMediaXref> getSkuMediaXrefs() {
		return this.skuMediaXrefs;
	}

	public void setSkuMediaXrefs(Set<SkuMediaXref> skuMediaXrefs) {
		this.skuMediaXrefs = skuMediaXrefs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sku")
	public Set<SkuAttribute> getSkuAttributes() {
		return this.skuAttributes;
	}

	public void setSkuAttributes(Set<SkuAttribute> skuAttributes) {
		this.skuAttributes = skuAttributes;
	}

}
