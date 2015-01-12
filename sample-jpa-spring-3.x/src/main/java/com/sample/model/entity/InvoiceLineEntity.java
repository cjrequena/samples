package com.sample.model.entity;

import java.io.Serializable;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Configurable;

import java.math.BigDecimal;


/**
 * The persistent class for the invoiceline database table.
 * 
 */
@Configurable
@Entity
@Table(name="invoiceline")
@NamedQuery(name="InvoiceLineEntity.findAll", query="SELECT i FROM InvoicelineEntity i")
public class InvoiceLineEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int invoiceLineId;

	private int invoiceId;

	private int quantity;

	private int trackId;

	private BigDecimal unitPrice;

	public InvoiceLineEntity() {
	}

	public int getInvoiceLineId() {
		return this.invoiceLineId;
	}

	public void setInvoiceLineId(int invoiceLineId) {
		this.invoiceLineId = invoiceLineId;
	}

	public int getInvoiceId() {
		return this.invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTrackId() {
		return this.trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}