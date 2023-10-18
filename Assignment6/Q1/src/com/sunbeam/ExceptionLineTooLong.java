package com.sunbeam;

public class ExceptionLineTooLong extends Exception {

	private String fieldName;
	private String fieldValue;

	ExceptionLineTooLong() {

	}

	public ExceptionLineTooLong(String fieldName, String fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public ExceptionLineTooLong(String string, Exception exception) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [fieldName=" + fieldName + ", fieldValue=" + fieldValue + "]";
	}

}
