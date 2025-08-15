package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public class ExtraSupportedSurfaceCombinationsQuirk implements vrb {
    public static final cee a;
    public static final cee b;
    public static final HashSet c = new HashSet(Arrays.asList(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"}));
    public static final HashSet d = new HashSet(Arrays.asList(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"}));

    static {
        cee cee = new cee();
        dee dee = dee.VGA;
        k7d.m(2, dee, 0, cee);
        dee dee2 = dee.PREVIEW;
        k7d.m(1, dee2, 0, cee);
        dee dee3 = dee.MAXIMUM;
        k7d.m(2, dee3, 0, cee);
        a = cee;
        cee cee2 = new cee();
        cee2.a(new xb0(1, dee2, 0));
        cee2.a(new xb0(1, dee, 0));
        k7d.m(2, dee3, 0, cee2);
        b = cee2;
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
