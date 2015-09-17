package datamodel;

/**
 * Created by 平山 on 2015/9/17.
 */
public class WeatherBean {

    public String cityName;

    public String date;

    public int heighTmp;

    public int lowTmp;

    public WeatherBean(String cityName, String date, int heighTmp, int lowTmp) {
        this.cityName = cityName;
        this.date = date;
        this.heighTmp = heighTmp;
        this.lowTmp = lowTmp;
    }
}
