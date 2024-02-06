package com.example.weatherApi.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String email;
    private String password;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name="user_roles",
	        joinColumns = @JoinColumn(
	                 name ="user_id",referencedColumnName="userId"),
	        inverseJoinColumns =@JoinColumn(
	            	 name = "role_id",referencedColumnName="roleId")
			)
	private List<Role> roles ;
}
