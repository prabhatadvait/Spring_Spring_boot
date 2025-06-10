package com.prabhat.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity // when you want to create table.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    //@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")  // it is usded to convert the object into json and vice versa.
    // I have commented because in react frontend , it will handle these things

    private Date releaseDate;
    private int stockQuantity;
    private boolean productAvailable;

    //To deal with Image
    private String imageName;
    private String imageType;
    @Lob // large object
    private byte[] imageData; // to store the actual image data.
}
