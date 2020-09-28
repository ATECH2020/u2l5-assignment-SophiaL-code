import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        double startLat, startLong, endLat, endLong, distance;
        Scanner scanner = new Scanner(System.in);

        //passing in variables
        System.out.print("Enter the latitude of the starting location: ");
        startLat = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        startLong = scanner.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        endLat = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        endLong = scanner.nextDouble();

        GeoLocation geoLocSt = new GeoLocation(startLat, startLong);
        GeoLocation geoLocEnd = new GeoLocation(endLat, endLong);
        distance = geoLocSt.distanceFrom(geoLocEnd);
        System.out.print("The distance is " + distance + " miles.");

      }
}