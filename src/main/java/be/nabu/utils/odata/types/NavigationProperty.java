package be.nabu.utils.odata.types;

import be.nabu.libs.types.api.Element;

public interface NavigationProperty {
	// the entity the navigation is attached to
	// for example namespace Microsoft.OData.SampleService.Models.TripPin and entitytype Person
	// the qualified name is Microsoft.OData.SampleService.Models.TripPin.Person
	public String getQualifiedName();
	
	// the actual element with metadata (like max occurs, nullable...)
	public Element<?> getElement();
}
