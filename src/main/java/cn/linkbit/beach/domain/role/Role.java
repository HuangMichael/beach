package cn.linkbit.beach.domain.role;


import cn.linkbit.beach.domain.app.resoure.Resource;
import cn.linkbit.beach.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * Created by huangbin on 2016/03/14 0023.
 * 角色信息
 */
@Entity
@Table(name = "T_ROLE")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 20, unique = true, nullable = false)
    private String roleName;
    @Column(length = 50, unique = true, nullable = false)
    private String roleDesc;
    @Column(scale = 1000, nullable = true)
    private long sortNo;
    @Column(nullable = false, length = 1)
    private String status;
    @JsonBackReference
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "t_role_user", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<User> userList;
    @JsonBackReference("resourceList")
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "t_role_resource", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "resource_id")})
    private List<Resource> resourceList;
}

