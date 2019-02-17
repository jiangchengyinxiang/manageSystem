package backMapper.friendLink;

import backService.friendLink.WebFriendLink;
import platform.mybatis.MyBatisRepository;

import java.util.HashMap;
import java.util.List;

@MyBatisRepository
public interface WebFriendLinkMapper {
    int removeById(Integer id);

    int insert(WebFriendLink record);

    int insertSelective(WebFriendLink record);

    WebFriendLink getWebFriendLinkById(Integer id);
    
    WebFriendLink getWebFriendLinkBySym(String sym);

    int updateByPrimaryKeySelective(WebFriendLink record);

    int updateById(WebFriendLink record);
    
    List<WebFriendLink> listByPara(HashMap<Object, Object> para);
}