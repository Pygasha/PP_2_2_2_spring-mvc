package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    private  int CAR_COUNT=0;

    @Override
    public List<Car> getCarsByCount( int count) {
        cars=new ArrayList<Car>();
        cars.add(new Car(++CAR_COUNT,"Audi","A5"));
        cars.add(new Car(++CAR_COUNT,"BMW","M3"));
        cars.add(new Car(++CAR_COUNT,"Toyota","Corolla"));
        cars.add(new Car(++CAR_COUNT,"Nissan","Sentra"));
        cars.add(new Car(++CAR_COUNT,"Honda","Accord"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}

