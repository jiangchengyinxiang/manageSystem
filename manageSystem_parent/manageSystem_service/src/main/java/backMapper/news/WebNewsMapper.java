package backMapper.news;

import backService.news.WebNews;
import platform.mybatis.MyBatisRepository;

import java.util.HashMap;
import java.util.List;

@MyBatisRepository
public interface WebNewsMapper {
    int removeById(Integer id);

    int insert(WebNews record);

    int insertSelective(WebNews record);

    WebNews getWebNewsById(Integer id);
    
    WebNews getWebNewsBySym(String sym);

    int updateByPrimaryKeySelective(WebNews record);

    int updateById(WebNews record);
    
    List<WebNews> listByPara(HashMap<Object, Object> para);
}