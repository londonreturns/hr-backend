package com.hr.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PreUpdate;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseDB implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public BaseDB() {
        this.createdDateTime = this.updatedDateTime = LocalDateTime.now();
    }

    @Id
    @GeneratedValue(generator = "uuid2")
    @Column(length = 36, name = "id")
    protected String id;

    @Column(name = "created_datetime")
    protected LocalDateTime createdDateTime;

    @Column(name = "updated_datetime")
    protected LocalDateTime updatedDateTime;

    @PreUpdate
    protected void onUpdate() {
        this.updatedDateTime = LocalDateTime.now();
    }
}
