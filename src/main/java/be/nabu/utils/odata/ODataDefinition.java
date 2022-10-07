package be.nabu.utils.odata;

import java.util.List;

import be.nabu.libs.types.api.TypeRegistry;
import be.nabu.utils.odata.types.ConformanceLevel;
import be.nabu.utils.odata.types.Function;
import be.nabu.utils.odata.types.NavigationProperty;

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
