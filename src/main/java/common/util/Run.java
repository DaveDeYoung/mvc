package common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * 
 * ClassName: Run
 * 
 * @Description: TODO(mybatis逆向工程)
 * @author huangwu
 * @date 2016-8-13 下午2:53:45
 */
public class Run {

	public static void run1() throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("E:\\hik-workspace\\mvc\\src\\main\\resources\\generator.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);
	}
	
	public static void main(String[] args) throws Exception {
		run1();
		System.out.println("wanbi...");
	}

}
