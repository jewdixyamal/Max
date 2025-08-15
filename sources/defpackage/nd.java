package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.util.Pair;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: nd  reason: default package */
public final class nd implements rke {
    public static final Address b = new Address(Locale.ROOT);
    public static final Map c = Collections.synchronizedMap(new i56(100, 0));
    public final khe a;

    public nd(Context context, khe khe) {
        this.a = new khe(new md(context, khe));
    }

    public static String a(Address address, String str, Address address2) {
        if (address2 == null) {
            return str;
        }
        String locality = address.getLocality();
        return (!e(locality) && !oag.d(locality, address2.getLocality())) ? rh4.j(locality, ", ", str) : str;
    }

    public static String b(Address address, String str, Address address2) {
        if (address2 == null) {
            return str;
        }
        String countryName = address.getCountryName();
        return (!e(countryName) && !oag.d(countryName, address2.getCountryName())) ? rh4.j(countryName, ", ", str) : str;
    }

    public static boolean e(String str) {
        return oag.t(str) || oag.d(str, "Unnamed Road") || oag.d(str, "Null");
    }

    public final String c(double d, double d2, double d3, double d4) {
        Address d5 = d(d, d2);
        String str = "";
        if (d5 == null) {
            return str;
        }
        Address d6 = d(d3, d4);
        String thoroughfare = d5.getThoroughfare();
        if (e(thoroughfare)) {
            thoroughfare = null;
        } else {
            String subThoroughfare = d5.getSubThoroughfare();
            if (!e(subThoroughfare)) {
                thoroughfare = rh4.j(thoroughfare, ", ", subThoroughfare);
            }
        }
        if (!e(thoroughfare)) {
            return are.e(b(d5, a(d5, thoroughfare, d6), d6));
        }
        String featureName = d5.getFeatureName();
        if (!e(featureName) && !featureName.matches("\\d+")) {
            return are.e(b(d5, a(d5, featureName, d6), d6));
        }
        String locality = d5.getLocality();
        if (!e(locality)) {
            return are.e(b(d5, locality, d6));
        }
        String adminArea = d5.getAdminArea();
        if (!e(adminArea)) {
            return are.e(b(d5, adminArea, d6));
        }
        String countryName = d5.getCountryName();
        if (!e(countryName)) {
            return are.e(countryName);
        }
        if (d5.getMaxAddressLineIndex() != -1) {
            str = d5.getAddressLine(0);
        }
        if (!e(str)) {
            return str;
        }
        String countryName2 = d5.getCountryName();
        if (!oag.t(countryName2)) {
            str = countryName2;
        }
        String locality2 = d5.getLocality();
        return oag.t(locality2) ? str : oag.t(countryName2) ? locality2 : rh4.j(str, ", ", locality2);
    }

    public final Address d(double d, double d2) {
        if (d == 0.0d && d2 == 0.0d) {
            return null;
        }
        Pair pair = new Pair(Double.valueOf(d), Double.valueOf(d2));
        Map map = c;
        Address address = (Address) map.get(pair);
        Address address2 = b;
        if (address == address2) {
            return null;
        }
        if (address != null) {
            return address;
        }
        try {
            List<Address> fromLocation = ((Geocoder) this.a.getValue()).getFromLocation(d, d2, 1);
            if (nd7.D(fromLocation)) {
                map.put(pair, address2);
                return null;
            }
            Address address3 = fromLocation.get(0);
            map.put(pair, address3);
            return address3;
        } catch (IOException unused) {
            Locale locale = Locale.ENGLISH;
            hm9.p("nd", "Can't decode latitude = " + d + " longitude = " + d2, (Throwable) null);
            return null;
        }
    }

    public final boolean f(double d, double d2, double d3, double d4) {
        float[] fArr = new float[1];
        Location.distanceBetween(d, d2, d3, d4, fArr);
        return fArr[0] < 10.0f;
    }
}
