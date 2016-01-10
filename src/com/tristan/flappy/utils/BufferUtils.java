package com.tristan.flappy.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class BufferUtils {
	
	private BufferUtils() {
		
	}
	
	public static ByteBuffer createByteBuffer(byte []array) {
		ByteBuffer result = ByteBuffer.allocate(array.length).order(ByteOrder.nativeOrder());
		result.put(array).flip();
		return result;
	}
	
	public static FloatBuffer createFloatBuffer(float []array) {
		FloatBuffer result = ByteBuffer.allocate(array.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
		result.put(array).flip();
		return result;
	}
	
	public static IntBuffer createFloatBuffer(int []array) {
		IntBuffer result = ByteBuffer.allocate(array.length << 2).order(ByteOrder.nativeOrder()).asIntBuffer();
		result.put(array).flip();
		return result;
	}
	
	
}
