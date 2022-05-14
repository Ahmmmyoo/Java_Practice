

public class Car {
    public static void main(String[] args) {

        class Carr {
            double fuel ;
            double maxSpeed ;

            void getFuel() {
                System.out.print(fuel);
            }
            void getSpeed() {
                System.out.print(maxSpeed);
            }

            double getFuelValvue() {
                return fuel ;
            }
            double getSpeedValue() {
                return maxSpeed;
            }

            void setSpeed(double Speed) {
                maxSpeed = Speed ;
            }

            void setFuel(double fuel1) {
                fuel = fuel1 ;
            }

            


        }

    }
    
}
