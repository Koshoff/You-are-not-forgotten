package com.example.You.are.not.forgotten.entities;

import com.example.You.are.not.forgotten.entities.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="donations")
public class Donation extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "donor_id", nullable = false)
    private User donor;

    @ManyToOne
    @JoinColumn(name = "recipient_id", nullable = false)
    private Profile recipient;

    private double amount;

    private LocalDateTime date;

    private boolean status;

    public Donation() {

    }

    public User getDonor() {
        return donor;
    }

    public void setDonor(User donor) {
        this.donor = donor;
    }

    public Profile getRecipient() {
        return recipient;
    }

    public void setRecipient(Profile recipient) {
        this.recipient = recipient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
