package defpackage;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* renamed from: k3b  reason: default package */
public final class k3b {
    public static final k3b b;
    public static final String c = Integer.toString(0, 36);
    public final tm5 a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        fm9.k(!false);
        b = new k3b(new tm5(sparseBooleanArray));
        int i = oaf.a;
    }

    public k3b(tm5 tm5) {
        this.a = tm5;
    }

    public static k3b c(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
        if (integerArrayList == null) {
            return b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            int intValue = integerArrayList.get(i).intValue();
            fm9.k(!false);
            sparseBooleanArray.append(intValue, true);
        }
        fm9.k(!false);
        return new k3b(new tm5(sparseBooleanArray));
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final boolean b(int... iArr) {
        return this.a.a(iArr);
    }

    public final int d(int i) {
        return this.a.b(i);
    }

    public final int e() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3b)) {
            return false;
        }
        return this.a.equals(((k3b) obj).a);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            tm5 tm5 = this.a;
            if (i < tm5.a.size()) {
                arrayList.add(Integer.valueOf(tm5.b(i)));
                i++;
            } else {
                bundle.putIntegerArrayList(c, arrayList);
                return bundle;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
