
package com.fujitsu.app;

import java.util.ArrayList;
import java.util.List;

public class AppConst {

	// Create one ArrayList and store the allowed operator

	public static final List<String> allowedOperators = new ArrayList<String>() {

		private static final long serialVersionUID = 1L;

		{
			add("+");
			add("-");
			add("*");
			add("/");
			add("&");
			add("=");

		}
	};
}
