package com.tristan.flappy.graphics;

import static org.lwjgl.opengl.GL20.*;
import com.tristan.flappy.utils.ShaderUtils;

public class Shader {

	private final int ID;
	
	public Shader(String vertex, String fragment) {
		ID = ShaderUtils.load(vertex, fragment);
	}
	
	public int getUniform(String name) {
		return glGetUniform(ID, name);
	}
	
	public void setUniform1i(String name, int value) {
		glUniformi(location, v0);
	}
	
	public void enable() {
		glUseProgram(ID);
	}
	
	public void disable() {
		
	}
}
