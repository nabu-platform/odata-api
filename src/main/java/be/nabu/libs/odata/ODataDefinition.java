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

package be.nabu.libs.odata;

import java.util.List;

import be.nabu.libs.odata.types.ConformanceLevel;
import be.nabu.libs.odata.types.Function;
import be.nabu.libs.odata.types.NavigationProperty;
import be.nabu.libs.types.api.TypeRegistry;

public interface ODataDefinition {
	// the odata version
	public String getVersion();
	// the scheme (http, https)
	public String getScheme();
	// the host it is available on
	public String getHost();
	// the base path on the host
	public String getBasePath();
	// e.g. application/json;odata.metadata=full;IEEE754Compatible=false;odata.streaming=true
	// metadata is typicially "full", "minimal" or "none"
	public List<String> getSupportedFormats();
	// the filter functions that are available
	public List<String> getFilterFunctions();
	
	public ConformanceLevel getConformanceLevel();
	
	public Boolean getAsynchronousRequestsSupported();
	public Boolean getBatchContinueOnErrorSupported();
	public Boolean getCrossJoinSupported();
	
	public TypeRegistry getRegistry();
	public List<Function> getFunctions();
	
	public List<NavigationProperty> getNavigationProperties();
}
