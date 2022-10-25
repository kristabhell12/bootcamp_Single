package openclose;

public class Volume {
    public double get_total_volume(Cuboid[] geo_objects)
    {

        double vol_sum = 0;

        for (Cuboid geo_obj : geo_objects) {

            vol_sum += geo_obj.length * geo_obj.breadth
                    * geo_obj.height;
        }
        return vol_sum;
    }
}
