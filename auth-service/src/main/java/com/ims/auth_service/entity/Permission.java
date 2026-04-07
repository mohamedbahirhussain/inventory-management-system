package com.ims.auth_service.entity;

import com.ims.auth_service.enums.PermissionName;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="permission")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false, unique = true)
    private PermissionName name;

    @Column(name = "description")
    private String description;
}
