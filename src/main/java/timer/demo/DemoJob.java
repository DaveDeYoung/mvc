package timer.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoJob {
	
	
	public void print() {
		System.out.println("job runing");
	}

}
