package runtime;

import java.io.IOException;

public class RunTimeTest {
	
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.maxMemory());
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
	}

}
