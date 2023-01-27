import java.util.ArrayList;
import java.util.List;

public class HousingManager implements IHousingService {

    //Ev tiplerinin hesaplamalarını ve filtre işlemlerinin yapıldığı sınıf.
    //Constructor'da bir ICreateHousingListsService alıyorki başlangıçta Ev Listeleri oluşsun.
    //IHousingService'den implementte ettik çünkü ilerde değişebilir veya ne yaptığını anlamak için interface'e bakabiliriz.



    //Listelerimizi bütün fonksiyonlarda kullanacağımız için global olarak tanımladık.
    //Bütün listeleri List<BaseHousing>'dan tanımladık çünkü sumPrice ve sumArea fonksiyonları bütün ev tipleri için çalışacak şekilde ayarlandı.
    private List<BaseHousing> homeList, summerHouseList, villaList;
    private List<BaseHousing> allHomeList = new ArrayList<>();


    private ICreateHousingListsService housingManager;

    public HousingManager(ICreateHousingListsService housingManager)
    {
        //HousingManger'ı enjekte ettik.
        this.housingManager = housingManager;

        //Listelerimizi değişkenlerimize verdik.
        homeList = housingManager.getHomeList();
        villaList = housingManager.getVillaList();
        summerHouseList = housingManager.getSummerHouseList();

        //Tüm listelerimizi birleştirdik.
        mergeHousingLists(homeList, villaList, summerHouseList);
    }

    @Override
    public double totalPriceOfHouses()
    {
        return sumPrice(homeList);
    }

    @Override
    public double totalPriceOfVillas()
    {
        return sumPrice(villaList);
    }

    @Override
    public double totalPriceOfSummerHouses()
    {
        return sumPrice(summerHouseList);
    }

    @Override
    public double totalPriceOfAllHousing()
    {
        return sumPrice(allHomeList);
    }

    @Override
    public int averageAreaOfHouses()
    {
        return sumArea(homeList) / homeList.size();
    }

    @Override
    public int averageAreaOfVillas()
    {
        return sumArea(villaList) / villaList.size();
    }

    @Override
    public int averageAreaOfSummerHouses()
    {
        return sumArea(summerHouseList) / summerHouseList.size();
    }

    @Override
    public int averageAreaOfAllHousing()
    {
        return sumArea(allHomeList) / allHomeList.size();
    }

    @Override
    public List<BaseHousing> filter(int numberOfRoom, int numberOfHall)
    {
        List<BaseHousing> filteredHousingList = new ArrayList<>();

        for (BaseHousing house : allHomeList)
        {
            if (house.getNumberOfRoom() == numberOfRoom && house.getNumberOfHall() == numberOfHall)
            {
                filteredHousingList.add(house);
            }
        }

        return filteredHousingList;
    }


    private int sumPrice(List<BaseHousing> houses) {
        int total = 0;

        for (BaseHousing house : houses)
        {
            total += house.getPrice();
        }

        return total;
    }

    private int sumArea(List<BaseHousing> houses) {
        int total = 0;

        for (BaseHousing house : houses)
        {
            total += house.getArea();
        }

        return total;
    }

    private void mergeHousingLists(List<BaseHousing> ...housingList) {
        for (int i=0;i< housingList.length;i++)
        {
            allHomeList.addAll(housingList[i]);
        }
    }


}
