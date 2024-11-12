package com.sp.main;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {
	public static void main(String[] args) {
		// Step 1: Initialize Nashorn Script Engine
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("nashorn");

		try {
			// Step 2: Execute JavaScript code directly
			engine.eval("print('Hello from Nashorn');");

			// Step 3: Define a JavaScript function and call it
			String script = "function greet(name) { return 'Hello, ' + name; }";
			engine.eval(script);

			// Casting ScriptEngine to Invocable to call functions
			Invocable invocable = (Invocable) engine;
			String greeting = (String) invocable.invokeFunction("greet", "Alice");
			System.out.println(greeting); // Output: Hello, Alice

			// Step 4: Access Java variables in JavaScript
			engine.put("name", "Bob");
			engine.eval("print('Hello, ' + name);"); // Output: Hello, Bob

			// Step 5: Use Java classes inside JavaScript
			engine.eval("var ArrayList = Java.type('java.util.ArrayList');");
			engine.eval("var list = new ArrayList(); list.add('Apple'); list.add('Banana');");
			engine.eval("print('Java ArrayList from JavaScript: ' + list);");

		} catch (ScriptException | NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
