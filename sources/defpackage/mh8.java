package defpackage;

import android.util.SparseBooleanArray;
import java.util.HashSet;

/* renamed from: mh8  reason: default package */
public final class mh8 {
    public static final z9d d;
    public static final k3b e;
    public final z9d a;
    public final k3b b;
    public final zw6 c;

    static {
        HashSet hashSet = new HashSet();
        ffc ffc = y9d.d;
        for (int i = 0; i < ffc.o; i++) {
            hashSet.add(new y9d(((Integer) ffc.get(i)).intValue()));
        }
        d = new z9d(hashSet);
        HashSet hashSet2 = new HashSet();
        ffc ffc2 = y9d.e;
        for (int i2 = 0; i2 < ffc2.o; i2++) {
            hashSet2.add(new y9d(((Integer) ffc2.get(i2)).intValue()));
        }
        for (int i3 = 0; i3 < ffc.o; i3++) {
            hashSet2.add(new y9d(((Integer) ffc.get(i3)).intValue()));
        }
        new z9d(hashSet2);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int append : wd6.o) {
            fm9.k(!false);
            sparseBooleanArray.append(append, true);
        }
        fm9.k(!false);
        e = new k3b(new tm5(sparseBooleanArray));
    }

    public mh8(z9d z9d, k3b k3b, zw6 zw6) {
        this.a = z9d;
        this.b = k3b;
        this.c = zw6;
    }
}
