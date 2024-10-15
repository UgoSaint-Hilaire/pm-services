package com.user_auth_service.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", updatable = false, nullable = false)
  private long id;

  @Column(name = "username", updatable = false, nullable = false)
  private String username;

  @Column(name = "email", updatable = false, nullable = false)
  private String email;

  @Column(name = "password", updatable = true, nullable = false)
  private String password;

  // @Column(name = "")
}
