/*
* Copyright (C) 2022 Alexander Verbruggen
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Lesser General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU Lesser General Public License for more details.
*
* You should have received a copy of the GNU Lesser General Public License
* along with this program. If not, see <https://www.gnu.org/licenses/>.
*/

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
