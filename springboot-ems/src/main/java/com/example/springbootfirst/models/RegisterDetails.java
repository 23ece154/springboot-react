package com.example.springbootfirst.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_details")
public class RegisterDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int empId;
  @Column(nullable = false)
  private String name;
  @Column(name = "user_name", nullable = false, unique = true)
  private String userName;
  @Column(nullable = false, unique = true)
  private String email;
  @Column(nullable = false)
  private String password;
  @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinTable(name = "user_roles",
          joinColumns = @JoinColumn(name = "user_id" , referencedColumnName = "empId"),
          inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "roleId")
  )
  private Set<Roles> roles;
}
