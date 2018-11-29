package cn.edu.nwsuaf.shiro;

import java.io.Serializable;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by xzy on 2017/4/17.
 */

public class ShiroDbRealm extends AuthorizingRealm {

 /*   @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;
    @Autowired
    private PermissionService permissionService;*/

    /**
     * 认证回调函数,登录时调用.
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken authcToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
     /*   User user = userService.getByUserName(token.getUsername());
        if (user != null) {
            return new SimpleAuthenticationInfo(new ShiroUser(user.getUsername(), user.getNickname()), user.getPassword(),getName());
        } else {
            return null;
        }*/
        return null;
    }

    /**
     * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        ShiroUser shiroUser = (ShiroUser) principals.getPrimaryPrincipal();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
     /*   // 加载用户的roles
        List<Role> roles = roleService.getByUserName(shiroUser.username);
        List<String> stringRoles = new ArrayList<String>(roles.size());
        for (Role role : roles) {
            stringRoles.add(role.getRolename());
        }
        info.addRoles(stringRoles);

        // 加载用户的permissions
        List<Permission> permissions = permissionService.getByUserName(shiroUser.username);
        Set<String> stringPermissions = new HashSet<String>(permissions.size());
        for (Permission permission : permissions) {
            stringPermissions.add(permission.getPermissionname());
        }
        info.setStringPermissions(stringPermissions);*/

        return info;
    }

    /**
     * 自定义Authentication对象，使得Subject除了携带用户的登录名外还可以携带更多信息.
     */
    public static class ShiroUser implements Serializable {
        private static final long serialVersionUID = -1373760761780840081L;
        private String username;
        private String nickname;

        public ShiroUser(String username, String nickname) {
            this.username = username;
            this.nickname = nickname;
        }

        /**
         * ------getset略--------
         */
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }
    }
}