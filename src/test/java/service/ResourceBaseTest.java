package service;

import javax.annotation.Resource;

import org.junit.Test;

import core.BaseServiceTest;
import mvc.model.resource.ResourceBaseInfo;
import mvc.service.IResourceBaseService;

public class ResourceBaseTest extends BaseServiceTest{
	
	
	@Resource
	IResourceBaseService baseService;
	
	@Test
	public void test1(){
		ResourceBaseInfo baseInfo = baseService.selectByPrimaryKey(35925);
		System.out.println(baseInfo.getcName());
	}

}
