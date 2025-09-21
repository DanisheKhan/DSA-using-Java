package UHeap;

import java.util.*;

public class DNearbyCars {
  static class Car {
    int id;
    int x, y;

    public Car(int id, int x, int y) {
      this.id = id;
      this.x = x;
      this.y = y;
    }

    public int distanceSq() {
      return x * x + y * y;
    }
  }

  public static List<Car> findNearbyCars(List<Car> cars, int k) {
    PriorityQueue<Car> maxHeap = new PriorityQueue<>((a, b) -> b.distanceSq() - a.distanceSq());
    for (Car car : cars) {
      maxHeap.offer(car);
      if (maxHeap.size() > k) {
        maxHeap.poll();
      }
    }
    List<Car> result = new ArrayList<>(maxHeap);
    return result;
  }

  public static void main(String[] args) {
    List<Car> cars = Arrays.asList(new Car(1, 1, 2), new Car(2, 2, 4), new Car(3, 3, 1), new Car(4, 0, 2));
    int k = 2;
    List<Car> nearby = findNearbyCars(cars, k);
    for (Car car : nearby) {
      System.out.println("Car ID: " + car.id + " at (" + car.x + "," + car.y + ")");
    }
  }
}
