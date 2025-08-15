package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: i64  reason: default package */
public abstract class i64 {
    public final LinkedHashSet a = new LinkedHashSet(1);

    public static e64 a(i64 i64, String str, String[] strArr, Set set, int i, int i2) {
        Set set2 = (i2 & 2) != 0 ? null : set;
        if ((i2 & 4) != 0) {
            i = 2;
        }
        int i3 = i;
        boolean z = (i2 & 8) != 0;
        if (w9e.S0(str, ':')) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String lowerCase : strArr) {
                arrayList.add(lowerCase.toLowerCase(Locale.ROOT));
            }
            e64 e64 = new e64(c54.h(str.toLowerCase(Locale.ROOT), "max", (String) null), i3, new LinkedHashSet(arrayList), z, set2);
            i64.a.add(e64);
            return e64;
        }
        throw new IllegalStateException("invalid route ".concat(str).toString());
    }
}
