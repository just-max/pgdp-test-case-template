package PATH.TO.PACKAGE;

import java.io.File;
import java.time.Duration;

final class BuildProperties {
	
	static final String version = "devel";
	static final String resourcePath = "src/test/resources/";
	
	static File getResource(CharSequence resourceName) {
		return new File(resourcePath + resourceName);
	}

	static final Duration MAX_TEST_TIME = Duration.ofSeconds(5);
}
