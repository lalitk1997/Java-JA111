package ex11;

public class Demo {
    // Interface Class Return Type
    public Hotel provideFood(int amt){
        Hotel hotel = null;
        if(amt > 500){
            hotel = new TajHotel();
        }else {
            hotel = new RoadSideHotel();
        }
        return hotel;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Hotel h = d1.provideFood(500);
        if(h instanceof TajHotel){
            System.out.println("From Taj Hotel");
        }else if(h instanceof RoadSideHotel){
            System.out.println("From RoadSideHotel");
        }
    }
}
