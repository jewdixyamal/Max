package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: rze  reason: default package */
public final class rze {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public final int a;
    public final String b;
    public final int c;
    public final qy5[] d;
    public int e;

    static {
        int i = oaf.a;
    }

    public rze(String str, qy5... qy5Arr) {
        int i = 1;
        fm9.f(qy5Arr.length > 0);
        this.b = str;
        this.d = qy5Arr;
        this.a = qy5Arr.length;
        int g2 = ia9.g(qy5Arr[0].n);
        this.c = g2 == -1 ? ia9.g(qy5Arr[0].m) : g2;
        String str2 = qy5Arr[0].d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = qy5Arr[0].f | 16384;
        while (i < qy5Arr.length) {
            String str3 = qy5Arr[i].d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                e("languages", i, qy5Arr[0].d, qy5Arr[i].d);
                return;
            } else if (i2 != (qy5Arr[i].f | 16384)) {
                e("role flags", i, Integer.toBinaryString(qy5Arr[0].f), Integer.toBinaryString(qy5Arr[i].f));
                return;
            } else {
                i++;
            }
        }
    }

    public static rze b(Bundle bundle) {
        ffc ffc;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            ls5 ls5 = zw6.b;
            ffc = ffc.X;
        } else {
            ffc = nu0.i(new hme(14), parcelableArrayList);
        }
        return new rze(bundle.getString(g, ""), (qy5[]) ffc.toArray(new qy5[0]));
    }

    public static void e(String str, int i, String str2, String str3) {
        StringBuilder k = k7d.k("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        k.append(str3);
        k.append("' (track ");
        k.append(i);
        k.append(")");
        z04.v("", new IllegalStateException(k.toString()));
    }

    public final rze a(String str) {
        return new rze(str, this.d);
    }

    public final qy5 c() {
        return this.d[0];
    }

    public final int d(qy5 qy5) {
        int i = 0;
        while (true) {
            qy5[] qy5Arr = this.d;
            if (i >= qy5Arr.length) {
                return -1;
            }
            if (qy5 == qy5Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rze.class != obj.getClass()) {
            return false;
        }
        rze rze = (rze) obj;
        return this.b.equals(rze.b) && Arrays.equals(this.d, rze.d);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        qy5[] qy5Arr = this.d;
        ArrayList arrayList = new ArrayList(qy5Arr.length);
        for (qy5 d2 : qy5Arr) {
            arrayList.add(d2.d(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + rh4.d(527, 31, this.b);
        }
        return this.e;
    }
}
