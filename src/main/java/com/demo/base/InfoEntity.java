package com.demo.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public class InfoEntity implements Serializable {

	private static final long serialVersionUID = 7437151380768604217L;
	
	private Boolean success;
	
	private String message;
	
	private Collection<?> data;
	
	private Map<String, ?> addon;
	
	private int total;
	
	
	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Collection<?> getData() {
		return data;
	}

	public void setData(Collection<?> data) {
		this.data = data;
	}

	public Map<String, ?> getAddon() {
		return addon;
	}

	public void setAddon(Map<String, ?> addon) {
		this.addon = addon;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public InfoEntity(Boolean success, String message, Collection<?> data, Map<String, ?> addon, Integer total){
		this.success = success;
		this.message = message;
		this.data = data;
		this.addon = addon;
		this.total = total;
	}
	
	public InfoEntity(Boolean success, String message, Collection<?> data, Integer total){
		this(success, message, data, null, total);
	}
	
	public InfoEntity(Boolean success, String message){
		this(success, message, null, 0);
	}
	
	public InfoEntity(BaseEntity entity){
		this(true, "", entity == null ? null : Arrays.asList(entity), Arrays.asList(entity).size());
	}
}
