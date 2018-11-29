package cn.edu.nwsuaf.service;

import cn.edu.nwsuaf.entity.Sysrole;
import cn.edu.nwsuaf.entity.SysroleExample;
import cn.edu.nwsuaf.mapper.SysroleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xzy on 2017/5/6.
 */
@Service
public class SysroleService {
    @Autowired
    private SysroleMapper sysroleMapper;

    public Sysrole getRoleById(int id) {
        return sysroleMapper.selectByPrimaryKey(id);
    }

    public int addRole(Sysrole sysrole) {
        return sysroleMapper.insert(sysrole);
    }

    public List<Sysrole> listRole() {
        return sysroleMapper.selectByExample(new SysroleExample());
    }
}
