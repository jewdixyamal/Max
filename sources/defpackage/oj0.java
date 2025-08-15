package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: oj0  reason: default package */
public class oj0 implements eab {
    public static final kx6 x0;
    public static final Object y0 = new Object();
    public final vv6 X;
    public final HashMap Y;
    public boolean Z;
    public final wv6 a;
    public final String b;
    public final hab c;
    public final Object o;
    public a9b s0;
    public boolean t0;
    public boolean u0;
    public final ArrayList v0;
    public final kv6 w0;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet, kx6] */
    static {
        String[] strArr = {"id", HasExtraData.KEY_URI_SOURCE};
        int i = kx6.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        x0 = new HashSet(hashSet);
    }

    public oj0(wv6 wv6, String str, String str2, b47 b47, Object obj, vv6 vv6, boolean z, boolean z2, a9b a9b, kv6 kv6) {
        this.a = wv6;
        this.b = str;
        HashMap hashMap = new HashMap();
        this.Y = hashMap;
        hashMap.put("id", str);
        hashMap.put(HasExtraData.KEY_URI_SOURCE, wv6 == null ? "null-request" : wv6.b);
        this.c = b47;
        this.o = obj == null ? y0 : obj;
        this.X = vv6;
        this.Z = z;
        this.s0 = a9b;
        this.t0 = z2;
        this.u0 = false;
        this.v0 = new ArrayList();
        this.w0 = kv6;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((pj0) it.next()).b();
            }
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((pj0) it.next()).c();
            }
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((pj0) it.next()).d();
            }
        }
    }

    public final void a(pj0 pj0) {
        boolean z;
        synchronized (this) {
            this.v0.add(pj0);
            z = this.u0;
        }
        if (z) {
            pj0.a();
        }
    }

    public final void e() {
        ArrayList<pj0> arrayList;
        synchronized (this) {
            if (this.u0) {
                arrayList = null;
            } else {
                this.u0 = true;
                ArrayList arrayList2 = new ArrayList(this.v0);
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            for (pj0 a2 : arrayList) {
                a2.a();
            }
        }
    }

    public final synchronized boolean f() {
        return this.t0;
    }

    public final synchronized boolean g() {
        return this.Z;
    }

    public final Object getExtra(String str) {
        return this.Y.get(str);
    }

    public final Map getExtras() {
        return this.Y;
    }

    public final void h(String str, String str2) {
        HashMap hashMap = this.Y;
        hashMap.put(HasExtraData.KEY_ORIGIN, str);
        hashMap.put(HasExtraData.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    public final synchronized ArrayList i(a9b a9b) {
        if (a9b == this.s0) {
            return null;
        }
        this.s0 = a9b;
        return new ArrayList(this.v0);
    }

    public final void putExtra(String str, Object obj) {
        if (!x0.contains(str)) {
            this.Y.put(str, obj);
        }
    }

    public final void putExtras(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                putExtra((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.Y.get(str);
        return obj2 == null ? obj : obj2;
    }
}
