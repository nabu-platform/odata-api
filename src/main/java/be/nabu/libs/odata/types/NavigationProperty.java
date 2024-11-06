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

import be.nabu.libs.types.api.Element;
import be.nabu.libs.types.api.ComplexType;

public interface NavigationProperty {
	// the entity the navigation is attached to
	// for example namespace Microsoft.OData.SampleService.Models.TripPin and entitytype Person
	// the qualified name is Microsoft.OData.SampleService.Models.TripPin.Person
	public String getQualifiedName();
	
	// the actual element with metadata (like max occurs, nullable...)
	public Element<?> getElement();
	
	// the element we use to update it
	public ComplexType getUpdateType();
	
	/*
	 * Whether the navigation property fully contains the target
	 */
	public default boolean isContainsTarget() {
		return false;
	}
}
