public class SimpleLocation {
  public double latitude;
  public double longitude;

  public SimpleLocation(double lat, double lon) {
    this.latitude = lat;
    this.longitude = lon;
  }

  public SimpleLocation() {
    this.latitude = 0.0;
    this.longitude = 0.0;
  }

  public double distance(SimpleLocation other) {
    /* ... */
  }

  public double distance(double lat, double lon) {
    /* ... */
  }
}
