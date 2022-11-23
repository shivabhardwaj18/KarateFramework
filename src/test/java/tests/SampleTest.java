package tests;

import com.intuit.karate.junit5.Karate;

public class SampleTest {
	@Karate.Test
	 Karate testSample() {
		return Karate.run("sample").relativeTo(getClass());
	}
	
	@Karate.Test
	 Karate testTags() {
		return Karate.run("sample").tags("@second").relativeTo(getClass());
	}
//	@Karate.Test
//    Karate testSystemProperty() {
//        return Karate.run("classpath:src/test/java/")
//                .tags("@second")
//                .karateEnv("dev")
//                .systemProperty("foo", "bar");
//    }

}
