package cannon.cosc442.jamesbond.project5;

import java.util.regex.Pattern;

public class JamesBond {
	public boolean bondRegex(String input) {
		return input.matches("[0123456789)]*([123456789()]*007[0123456789(]*)[0123456789()]*");
	}
}
