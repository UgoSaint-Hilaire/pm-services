package com.user_auth_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id", updatable = false, nullable = false)
  private int id;

  @Column(name = "username", updatable = false, nullable = false)
  private String username;

  @Column(name = "email", updatable = false, nullable = false)
  private String email;

  @Column(name = "password", updatable = true, nullable = false)
  private String password;

  // @ManyToMany
  // @JoinColumn(name = "role_id", nullable = false)
  // private Role role;

}
