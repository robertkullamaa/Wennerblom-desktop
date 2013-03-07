package Util;


import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Access point to the shared resourceBundle
 */
public class LanguageResourceBundle {

    public static final String LANGUAGE_BUNDLE = "language";

    public static final Locale DEFAULT_LOCALE = new Locale("ee");

    private static ResourceBundle bundle;

    /**
     * Reads the new language strings into the bundle.
     * @param lang Locale
     */
    public static void setLocale(Locale lang) {
        bundle.clearCache();
        bundle = ResourceBundle.getBundle(LANGUAGE_BUNDLE, lang);
    }

    /**
     * Getter for the ResourceBundle
     * @return ResourceBundle
     */
    public static ResourceBundle getBundle() {
        if (bundle == null) {
            setLocale(DEFAULT_LOCALE);
        }
        return bundle;
    }
}
