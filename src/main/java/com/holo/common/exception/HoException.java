package com.holo.common.exception;


/**
 * 自定义错误 
 * @author Holo
 *
 */
public class HoException extends Exception{
	private static final long serialVersionUID = 1L;
	public HoException() {
		super();
	}
	public HoException(String message){
		super(message);
	}
}
