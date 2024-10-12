import java.util.Scanner;

public class MaxDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of points
        int N = sc.nextInt();
        
        // Read the x-coordinates and y-coordinates
        int[] x = new int[N];
        int[] y = new int[N];
        
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            y[i] = sc.nextInt();
        }
        
        // Variable to store the maximum squared distance
        int maxDistanceSquared = 0;
        
        // Brute force: check every pair of points
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Calculate the squared distance between points (x[i], y[i]) and (x[j], y[j])
                int deltaX = x[j] - x[i];
                int deltaY = y[j] - y[i];
                int distanceSquared = deltaX * deltaX + deltaY * deltaY;
                
                // Update the maximum squared distance
                if (distanceSquared > maxDistanceSquared) {
                    maxDistanceSquared = distanceSquared;
                }
            }
        }
        
        // Output the maximum squared distance
        System.out.println(maxDistanceSquared);
    }
}
