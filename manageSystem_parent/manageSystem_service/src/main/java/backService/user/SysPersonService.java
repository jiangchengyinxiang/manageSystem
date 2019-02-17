package backService.user;

import backMapper.user.SysPersonMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class SysPersonService {
	@Resource
	SysPersonMapper personMapper;

	public void removeById(Integer id) {
		personMapper.removeById(id);
	}

	public void insert(SysPerson record) {
		personMapper.insert(record);
	}

	public SysPerson getPersonById(Integer id) {
		return personMapper.getPersonById(id);
	}

	public void updateById(SysPerson record) {
		personMapper.updateById(record);
	}

	public List<SysPerson> listByPara(HashMap<Object, Object> para) {
		return personMapper.listByPara(para);
	}
}
