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
}
