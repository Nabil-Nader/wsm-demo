package com.wsmsdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
public class ListModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String staff_name;

    @Column(nullable = true)
    private Integer check_code;

    @Column(nullable = false)
    private Boolean is_delete;

    @Column(nullable = false)
    private Boolean is_lock;

    @Column(nullable = false)
    private Integer error_check_code_counter;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public Integer getCheck_code() {
        return check_code;
    }

    public void setCheck_code(Integer check_code) {
        this.check_code = check_code;
    }

    public Boolean getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Boolean is_delete) {
        this.is_delete = is_delete;
    }

    public Boolean getIs_lock() {
        return is_lock;
    }

    public void setIs_lock(Boolean is_lock) {
        this.is_lock = is_lock;
    }

    public Integer getError_check_code_counter() {
        return error_check_code_counter;
    }

    public void setError_check_code_counter(Integer error_check_code_counter) {
        this.error_check_code_counter = error_check_code_counter;
    }
}
