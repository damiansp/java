public class SimpleLocation {
  private double latitude;
  private double longitude;

  public SimpleLocation(double lat, double lon) {
    this.latitude = lat;
    this.longitude = lon;
  }

  public SimpleLocation() {
    this.latitude = 0.0;
    this.longitude = 0.0;
  }

  public double getLatitude() {
    return this.latitude;
  }

  public void setLatitude(double lat) {
    if (lat < -180 || lat > 180) {
      System.out.println("Illegal value for latitude: " + lat);
    } else {
      this.latitude = lat;
    }
  }

  public double distance(SimpleLocation other) {
    /* ... */
  }

  public double distance(double lat, double lon) {
    /* ... */
  }
}
