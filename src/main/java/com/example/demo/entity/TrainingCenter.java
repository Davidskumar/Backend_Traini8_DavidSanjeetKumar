package com.example.demo.entity;

import jakarta.validation.constraints.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "training_centers")  // MongoDB Collection Name
public class TrainingCenter {

    @Id
    private String id;

    @NotBlank(message = "Center name cannot be empty")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "Center code is required")
    @Pattern(regexp = "^[A-Za-z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @Indexed  //  MongoDB index for faster queries
    private Address address;  // ✅ Keep only one definition

    @Min(value = 1, message = "Student capacity must be at least 1")
    private int studentCapacity;

    private List<String> coursesOffered;

    @Email(message = "Invalid email format")
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be 10 digits")
    private String contactPhone;

    private Long createdOn;

    public TrainingCenter() {
        this.createdOn = System.currentTimeMillis();
    }

    //  Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Long createdOn) {
        this.createdOn = createdOn;
    }
}
