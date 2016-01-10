package com.tristan.flappy.graphics;

import com.tristan.flappy.utils.ShaderUtils;
import static org.lwjgl.opengl.GL20.*;

public class Shader {

	private final int ID;
	
	public Shader(String vertex, String fragment) {
		ID = ShaderUtils.load(vertex, fragment);
	}
	
	public void enable() {
		glUseProgram(ID);
	}
	
	public void disable() {
		
	}
}
