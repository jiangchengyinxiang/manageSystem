package backService.author;

import backMapper.author.SysRolePowerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRolePowerService {
	@Resource
    SysRolePowerMapper rolePowerMapper;
	public void removeById(Integer id) {
		rolePowerMapper.removeById(id);
	}
    public void removeByPowerSym(String powerSym) {
    	rolePowerMapper.removeByPowerSym(powerSym);
    }
    public void removeByRoleSym(String roleSym) {
    	rolePowerMapper.removeByRoleSym(roleSym);
    }
    public void removeByRoleAndPowerSym(String roleSym,String powerSym) {
    	rolePowerMapper.removeByRoleAndPowerSym(roleSym, powerSym);
    }
    public void insert(SysRolePower record) {
    	rolePowerMapper.insert(record);
    }
    public List<SysRolePower> listByRoleSym(String roleSym){
    	return rolePowerMapper.listByRoleSym(roleSym);
    }
}
