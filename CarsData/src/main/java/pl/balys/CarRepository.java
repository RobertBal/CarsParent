package pl.balys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-03-11.
 */
public class CarRepository {

    private List<CarsData> carList;

    public CarRepository() {
        carList = new ArrayList<CarsData>();
        carList.add(new CarsData("Ford","Mustang",2001,200d));
        carList.add(new CarsData("Ford","Mustang",2002,200d));
        carList.add(new CarsData("Ford","Mustang",2003,200d));


    }

    public void setCarList(List<CarsData> carList) {
        this.carList = carList;
    }

    public List<CarsData> getCarList() {
        return carList;
    }
}
