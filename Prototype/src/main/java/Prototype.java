
import java.util.HashMap;
import java.util.Map;
abstract class Car implements Cloneable
{

protected String carName;

abstract void addCar();

public Object clone()
{
Object clone = null;
try
{
clone = super.clone();
}
catch (CloneNotSupportedException e)
{
e.printStackTrace();
}
return clone;
}
}

class audiCar extends Car
{
public audiCar()
{
this.carName = "Audi";
}

@Override
void addCar()
{
System.out.println("Audi car added");
}

}

class volvoColor extends Color{

public volvoColor()
{
this.carName = "Volvo";
}

@Override
void addColor()
{
System.out.println("Black color added");
}
}

class CarStore {

private static Map<String, Color> carMap = new HashMap<String, Car>();

static
{
carMap.put("audi", new AudiCar());
carMap.put("volvo", new VolvoCar());
}

public static Car getColor(String carName)
{
return (Car) carMap.get(carName).clone();
}
}

// Driver class
public class Prototype
{
public static void main (String[] args)
{
CarStore.getCar("volvo").addCar();
CarStore.getCar("audi").addCar();

}
}