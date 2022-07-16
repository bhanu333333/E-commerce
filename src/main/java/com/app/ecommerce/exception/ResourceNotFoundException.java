package com.app.ecommerce.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	
	private static final int serialVersionUID=(int) 1L;
 private String resourceName;
 private String fieldName;
 private Object filedvalue;
public ResourceNotFoundException(String resourceName, String fieldName, Object filedvalue) {
	super(String.format("%s not found with %s : '%s' ",resourceName,fieldName,filedvalue));
	this.resourceName = resourceName;
	this.fieldName = fieldName;
	this.filedvalue = filedvalue;
	
}
public String getResourceName() {
	return resourceName;
}
public String getFieldName() {
	return fieldName;
}
public Object getFiledvalue() {
	return filedvalue;
}


 
 
}
