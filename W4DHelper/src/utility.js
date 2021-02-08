////////////////////////////	Common functions ///////////////////////////////

function createMap( elementID, width, height, zIndex )
{
	//	1. Where you want to render the map - get element by ID
	var element = document.getElementById(elementID);
	
	//	2. Set mao size...
	 element.style = 'width: ' + width + 'px; height: ' + height + 'px;';
	 
	 //	3. Create Leaflet map on map element.
     var map = L.map(element);
	
	//	4. Create and configure pane
	map.createPane('labels');

	// 4a. This pane is above markers but below popups
	map.getPane('labels').style.zIndex = 650;

	// 4b. Layers in this pane are non-interactive and do not obscure mouse/touch events
	//map.getPane('labels').style.pointerEvents = 'none';
	
	return map;
}

function addOnClick(map) 
{
	map.on('click', function(e) 
	{        
        var popLocation= e.latlng;
        var popup = L.popup()
        .setLatLng(popLocation)
        .setContent('<p>Hello world!<br />TOLIK-BOLIK This is a nice popup.<br/>' + popLocation + '</p>')
        .openOn(map);        
    });
}

	
function createGeoCountries( map, fromVariable, mapColor, borderWeight, borderOpacity, borderColor, borderDashArray, fillOpacity )
{
	function mapStyle(feature) 
	{
	    return { fillColor: mapColor, weight: borderWeight, opacity: borderOpacity,
	        	 color: borderColor, dashArray: borderDashArray, illOpacity: fillOpacity };
	}
	      
	geojson = L.geoJson(fromVariable, {style: mapStyle}).addTo(map);
	return geojson;
}

function todoSomething()
{

}
