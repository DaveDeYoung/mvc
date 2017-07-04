package mvc.service;

import mvc.model.resource.ResourceBaseInfo;

public interface IResourceBaseService {
	
	ResourceBaseInfo selectByPrimaryKey(Integer iId);

}