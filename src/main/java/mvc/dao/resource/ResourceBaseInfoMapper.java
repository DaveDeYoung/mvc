package mvc.dao.resource;

import mvc.model.resource.ResourceBaseInfo;

public interface ResourceBaseInfoMapper {
    int deleteByPrimaryKey(Integer iId);

    int insert(ResourceBaseInfo record);

    int insertSelective(ResourceBaseInfo record);

    ResourceBaseInfo selectByPrimaryKey(Integer iId);

    int updateByPrimaryKeySelective(ResourceBaseInfo record);

    int updateByPrimaryKey(ResourceBaseInfo record);
}