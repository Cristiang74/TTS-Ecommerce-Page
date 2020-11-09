package com.tts.ecommercepage.model;

import java.util.Collection;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class User implements UserDetails {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    private String user;

    @ElementCollection
	protected Map<Product, Integer> cart;

    private String username;
    private String password;
    

    public User() {
    }

    public User(Long id, String user, String username, String password) {
        this.id = id;
        this.user = user;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", password=" + password + ", user=" + user + ", username=" + username + "]";
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    // TODO Auto-generated method stub
    return null;
    }

    @Override
    public boolean isAccountNonExpired() {
    // TODO Auto-generated method stub
    return true;
    }

    @Override
    public boolean isAccountNonLocked() {
    // TODO Auto-generated method stub
    return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
    // TODO Auto-generated method stub
    return true;
    }

    @Override
    public boolean isEnabled() {
    // TODO Auto-generated method stub
    return true;
    }

   



}
