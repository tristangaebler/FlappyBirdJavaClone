package com.tristan.flappy.graphics;

import static org.lwjgl.opengl.GL20.*;

import java.util.HashMap;
import java.util.Map;

import com.tristan.flappy.utils.ShaderUtils;

public class Shader {

	private final int ID;
	private Map<String, Integer> locationCache = new HashMap<String, Integer>();
	
	public Shader(String vertex, String fragment) {
		ID = ShaderUtils.load(vertex, fragment);
	}
	
	public int getUniform(String name) {
		if(locationCache.containsKey(name)) {
			return locationCache.get(name);
		}
		
		int result = glGetUniformLocation(ID, name);
		
		if(result == -1) 
			System.err.println("Could not find uniform variable " + name + " !");
		else
			locationCache.put(name, result);
		return result;
	}
	
	public void setUniform1i(String name, int value) {
		glUniform1i(getUniform(name), value);
	}
	
	public void enable() {
		glUseProgram(ID);
	}
	
	public void disable() {
		
	}
}
