package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */

public class AggregateFunction {
	private String field;
	private String function;
	// Write logic for constructor
	public AggregateFunction(String field, String function) {
		
		this.field = field;
		this.function = function;
	}
	
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}
	/**
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}
	@Override
	public String toString() {
		return "AggregateFunction [field=" + field + ", function=" + function + "]";
	}
	
}