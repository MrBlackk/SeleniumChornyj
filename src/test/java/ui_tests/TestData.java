package ui_tests;

import core.BrowserTypes;

import java.util.Arrays;
import java.util.List;

/**
 * Created by chv on 12.11.2014.
 */
public class TestData {

    //Browser Type
    public static final BrowserTypes BROWSER_NAME = BrowserTypes.CHROME;

    //TestData
    public static final String MAC_BOOK_PRO_RETINA_15_CODE = "Z0PU002JE";//Apple MacBook Pro Retina 15 (Z0PU002JE)
    //public static final String MAC_BOOK_AIR_11_CODE = "MD712UA/A"; //Apple MacBook Air 11 (MD712UA/A) (товар зник)
    public static final String MAC_BOOK_AIR_11_CODE = "MD711UA/B"; //Apple MacBook Air 11" (MD711UA/B)
    public static final List<String> MANUFACTURERS_LIST = Arrays.asList("Acer", "Apple", "Asus", "Dell", "Fujitsu", "HP (Hewlett Packard)", "Lenovo", "MSI", "Sony");

    //Sort by drop-down
    //1-от дешевых к дорогим; 2-от дорогих к дешевым; 3-популярные; 4-новинки; 5-акции; 6-последние добавленные
    public static final int SORT_DROP_DOWN_ELEMENT = 1;

    //URLs
    public static final String ROZETKA_URL = "http://rozetka.com.ua/";
    public static final String NOTEBOOKS_PAGE_URL = "http://rozetka.com.ua/notebooks/c80004/";
    public static final String APPLE_NOTEBOOKS_PAGE_URL = "http://rozetka.com.ua/notebooks/apple/c80004/v069/";
    public static final String COMPARISON_PAGE_URL = "http://rozetka.com.ua/computers-notebooks/notebooks/comparison/";
    public static final String MY_PREFERENCES_PAGE_URL = "https://my.rozetka.com.ua/";


    //Facebook
    public static final String FACEBOOK_EMAIL = "";
    public static final String FACEBOOK_PASS = "";
    public static final String FACEBOOK_NAME = "";
    public static final String MY_PREFS_EMAIL = "";


}
