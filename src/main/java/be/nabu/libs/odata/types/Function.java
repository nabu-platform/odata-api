package be.nabu.libs.odata.types;

import be.nabu.libs.types.api.ComplexType;

public interface Function {
	// actions and functions are more or less the same. actions can have side effects, functions can not
	public boolean isAction();
	// the http method to use
	public String getMethod();
	public ComplexType getInput();
	public ComplexType getOutput();
	// We can group functions in a context, for example all the crud actions on a single item could be bound in the same context for readability
	// this will be part of the final folder structure (if available)
	public String getContext();
	// the name of the function, it must be unique within its context
	public String getName();
}
