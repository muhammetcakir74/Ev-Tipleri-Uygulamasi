import java.util.List;

public interface IHousingService {

    public double totalPriceOfHouses();
    public double totalPriceOfVillas();
    public double totalPriceOfSummerHouses();
    public double totalPriceOfAllHousing();
    public int averageAreaOfHouses();
    public int averageAreaOfVillas();
    public int averageAreaOfSummerHouses();
    public int averageAreaOfAllHousing();
    public List<BaseHousing> filter(int numberOfRoom, int numberOfHall);


}
