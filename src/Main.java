public class Main {
    public static void main(String[] args) {

        ICreateHousingListsService createHousingListsManager = new CreateHousingListsManager();
        IHousingService housingManager = new HousingManager(createHousingListsManager);

        System.out.println("Evlerin toplam fiyatı: "+housingManager.totalPriceOfHouses());
        System.out.println("Villaların toplam fiyatı: "+housingManager.totalPriceOfVillas());
        System.out.println("Yazlıkların toplam fiyatı: "+housingManager.totalPriceOfSummerHouses());
        System.out.println("Tüm tipteki evlerin toplam fiyatı: "+housingManager.totalPriceOfAllHousing());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Evlerin ortalama metre karesi: "+housingManager.averageAreaOfHouses());
        System.out.println("Villaların ortalama metre karesi: "+housingManager.averageAreaOfVillas());
        System.out.println("Yazlıkların ortalama metre karesi: "+housingManager.averageAreaOfSummerHouses());
        System.out.println("Tüm tipteki evlerin ortalama metre karesi: "+housingManager.averageAreaOfAllHousing());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Dört oda ve İki salonu olan evler: "+housingManager.filter(4,2));




    }
}