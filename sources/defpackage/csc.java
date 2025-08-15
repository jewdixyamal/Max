package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: csc  reason: default package */
public final class csc {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final hsc e;

    public csc(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new qb3(3, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(csc csc) {
        for (Map.Entry entry : mz7.d0(csc.b).entrySet()) {
            csc.b(((hsc) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = csc.a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return dy7.g(new kpa("keys", arrayList), new kpa("values", arrayList2));
    }

    public final void b(Object obj, String str) {
        if (obj != null) {
            Class[] clsArr = f;
            int i = 0;
            while (i < 29) {
                if (!clsArr[i].isInstance(obj)) {
                    i++;
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.c.get(str);
        ci9 ci9 = obj2 instanceof ci9 ? (ci9) obj2 : null;
        if (ci9 != null) {
            ci9.k(obj);
        } else {
            this.a.put(str, obj);
        }
        ti9 ti9 = (ti9) this.d.get(str);
        if (ti9 != null) {
            ti9.setValue(obj);
        }
    }

    public csc() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new qb3(3, this);
    }
}
