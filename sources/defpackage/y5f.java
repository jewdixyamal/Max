package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import scout.exception.IllegalOverridesException;
import scout.exception.ScopeInitializationException;

/* renamed from: y5f  reason: default package */
public class y5f {
    public final String a;
    public final hx9 b = ema.c;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();

    public y5f(String str) {
        this.a = str;
    }

    public ruc a() {
        hx9 hx9 = this.b;
        boolean z = false;
        String str = this.a;
        if (hx9 != null) {
            try {
                if (au1.b(2, 2) >= 0) {
                    hx9.j(hx9, "Start initialization of scope \"" + str + '\"');
                }
            } catch (Exception e2) {
                throw new ScopeInitializationException(str, e2);
            }
        }
        ArrayList arrayList = this.h;
        if (!(!arrayList.isEmpty())) {
            ruc ruc = new ruc(this.a, this.c, this.d, this.e, this.f, this.g);
            if (hx9 != null) {
                if (au1.b(2, 2) >= 0) {
                    z = true;
                }
                if (z) {
                    hx9.j(hx9, "Finish initialization of \"" + str + '\"');
                }
            }
            return ruc;
        }
        throw new IllegalOverridesException(str, arrayList);
    }

    public /* bridge */ void b(Class cls, b37 b37) {
        c(cls, b37);
    }

    public void c(Class cls, b37 b37) {
        HashMap hashMap = this.e;
        Object obj = hashMap.get(cls);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(cls, obj);
        }
        ((List) obj).add(b37);
    }

    public /* bridge */ void d(Class cls, b37 b37) {
        e(cls, b37);
    }

    public void e(Class cls, b37 b37) {
        if (this.d.put(cls, b37) != null) {
            this.h.add(cls);
        }
    }
}
