import java.util.ArrayList;
import java.util.List;

public class CreateHousingListsManager implements ICreateHousingListsService {

    //Ev tiplerinin listelerinin oluşturulduğu sınıf.
    //İleride değişme ihtimali veya koda sonra baktığımızda ne olduğunu anlamak için ICreateHousingListsService
    // dan implemente ettik.

    private List<BaseHousing> homeList = new ArrayList<>();
    private List<BaseHousing> summerHouseList = new ArrayList<>();
    private List<BaseHousing> villaList = new ArrayList<>();

    public List<BaseHousing> getHomeList(){
        homeList.add(new Home(1500,100,1,1));
        homeList.add(new Home(2500,120,2,1));
        homeList.add(new Home(4000,130,3,2));
        return homeList;
    }

    public List<BaseHousing> getSummerHouseList(){
        summerHouseList.add(new SummerHouse(5500,150,2,1));
        summerHouseList.add(new SummerHouse(6500,160,2,2));
        summerHouseList.add(new SummerHouse(7000,170,4,2));
        return summerHouseList;
    }

    public List<BaseHousing> getVillaList(){
        villaList.add(new Villa(8500,190,5,1));
        villaList.add(new Villa(9500,225,4,2));
        villaList.add(new Villa(10000,250,6,2));
        return villaList;
    }






}
