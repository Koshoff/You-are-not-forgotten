package com.example.You.are.not.forgotten.entities.dto;

import com.example.You.are.not.forgotten.entities.Donation;
import com.example.You.are.not.forgotten.entities.Profile;
import com.example.You.are.not.forgotten.entities.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class DonationDTO {

    private Long id;

    private Long donorId;
    private Long recipientId;
    private double amount;
    private LocalDateTime date;
    private boolean status;

    public DonationDTO() {

    }

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public Long getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
