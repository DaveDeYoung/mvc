package mvc.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import mvc.dao.resource.ResourceBaseInfoMapper;
import mvc.model.resource.ResourceBaseInfo;
import mvc.service.IResourceBaseService;

@Service
public class ResourceBaseServiceImpl implements IResourceBaseService {
	
	@Resource
	ResourceBaseInfoMapper resourceBaseInfoMapper;

	public ResourceBaseInfo selectByPrimaryKey(Integer iId) {
		ResourceBaseInfo info = resourceBaseInfoMapper.selectByPrimaryKey(iId);
		return info;
	}

}
