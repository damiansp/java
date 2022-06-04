package module1;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;


/** TwoMaps
 * An application with two maps side-by-side zoomed in on different
 * locations.
 * Author: UC San Diego Coursera Intermediate Programming team
 * @author Damian Satterthwaite-Phillips
 * Date: 2022-06-03
 */
public class TwoMaps extends PApplet {
	private static final long serialVersionUID = 1L;
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	private static final boolean offline = false;
	UnfoldingMap map1;
	UnfoldingMap map2;

  
	public void setup() {
		size(800, 600, P2D);
		this.background(20, 20, 20);
		AbstractMapProvider provider = new Google.GoogleTerrainProvider();
		int zoomLevel = 10;

    if (offline) {
			provider = new MBTilesMapProvider(mbTilesString);
			zoomLevel = 3;
		}
		map1 = new UnfoldingMap(this, 50, 50, 350, 500, provider);
    map1.zoomAndPanTo(zoomLevel, new Location(32.9f, -117.2f));
		MapUtils.createDefaultEventDispatcher(this, map1);		
		map2 = new UnfoldingMap(this, 50, 50, 350, 500, provider);
    map2.zoomAndPanTo(zoomLevel, new Location(44.1, -123.1));
    MapUtils.createDefaultEventDispatcher(this, map2);
	}

	public void draw() {
		map1.draw();
    map2.draw();
	}
}
