package br.com.despezza.despezza_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
    private Float value;
    private String description;

    @CreationTimestamp // Autocomplete on INSERT
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss") // Format in the output JSON
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) // Request Format
    @Column(nullable = false, updatable = false)
        private LocalDateTime dateTime;

    public Expense() {
    }

    public Expense(Long id, Float value, String description, LocalDateTime dateTime) {
        this.id = id;
        this.value = value;
        this.description = description;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Float getValue() {
        return value;
    }
    public void setValue(Float value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
