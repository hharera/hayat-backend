package com.harera.hayat.donations.model.food;

import com.harera.hayat.donations.model.Donation;
import com.harera.hayat.framework.model.food.FoodCategory;
import com.harera.hayat.framework.model.food.FoodUnit;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Setter
@Getter
@Entity
@Table(name = "food_donation")
public class FoodDonation extends Donation {

    @Basic
    @Column(name = "food_expiration_date")
    private OffsetDateTime foodExpirationDate;

    @ManyToOne
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private FoodUnit unit;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private FoodCategory foodCategory;

    @Basic
    @Column(name = "amount")
    private Float amount;
}