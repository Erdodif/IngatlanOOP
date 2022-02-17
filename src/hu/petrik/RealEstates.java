package hu.petrik;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RealEstates {
    private List<RealEstate> realEstateList;

    public RealEstates(String fileName) {
        realEstateList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            String line = br.readLine();
            while (line != null) {
                realEstateList.add(new RealEstate(line));
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Stream<RealEstate> getStream() {
        return this.realEstateList.stream();
    }

    public long getSalesCount() {
        return this.getStream().count();
    }

    public RealEstate getMax() {
        return this.getStream()
                .max(Comparator.comparingInt(RealEstate::getSqFt))
                .get();
    }

    public long getPriceSum() {
        return this.getStream()
                .mapToInt(RealEstate::getPrice)
                .sum();
    }

    public long getCountWithoutSize() {
        return this.getStream().filter(realEstate -> realEstate.getSqFt() == 0).count();
    }

    public boolean hasCity(String cityName) {
        return this.getStream().anyMatch(realEstate -> realEstate.getCity().equals(cityName));
    }

    public Stream<RealEstate> getCityEstates(String cityName) {
        return this.getStream().filter(realEstate -> realEstate.getCity().equals(cityName));
    }

    public long salesCountInCity(String cityName) {
        return this.getCityEstates(cityName).count();
    }

    public long salesSumInCity(String cityName) {
        return this.getCityEstates(cityName).mapToInt(RealEstate::getPrice).sum();
    }

    public List<RealEstate> getRealEstatesByCity(String cityName){
        return this.getCityEstates(cityName).collect(Collectors.toList());
    }

    public List<String> getCities(){
        return this.getStream()
    }

    @Override
    public String toString() {
        StringBuilder boby = new StringBuilder();
        for (RealEstate re : this.realEstateList) {
            boby.append(re.toString());
        }
        return boby.toString();
    }
}
