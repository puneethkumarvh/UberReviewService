package com.example.UberReviewService.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    Long id;
    @Column(nullable = false)
    String Content;
    Double Rating;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    Date createdAt;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    Date updatedAt;
}
