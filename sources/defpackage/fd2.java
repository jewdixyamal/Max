package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fd2  reason: default package */
public final class fd2 implements ComponentCallbacks {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
    }

    private final void b() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
        Set<ne3> set;
        switch (this.a) {
            case 0:
                ld2 ld2 = (ld2) this.b;
                ld2.t.j(-1);
                ld2.v.j(-1);
                return;
            case 1:
                oe3 oe3 = (oe3) this.b;
                int diff = configuration.diff(oe3.b);
                oe3.b = new Configuration(configuration);
                ConcurrentHashMap concurrentHashMap = oe3.a;
                for (Integer num : concurrentHashMap.keySet()) {
                    if (!((num.intValue() & diff) == 0 || (set = (Set) concurrentHashMap.get(num)) == null)) {
                        for (ne3 a2 : set) {
                            a2.a();
                        }
                    }
                }
                return;
            default:
                ((wva) this.b).getClass();
                int i = configuration.uiMode & 48;
                l63 l63 = i != 16 ? i != 32 ? l63.c : l63.b : l63.a;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    us7 us7 = us7.X;
                    String hexString = Integer.toHexString(configuration.uiMode & 48);
                    ir6.d(us7, "SystemThemeObserver", "onConfigurationChanged scheme=" + l63 + ", uiMode=0x" + hexString, (Throwable) null);
                }
                ((q0e) ((wva) this.b).b).m((Object) null, l63);
                return;
        }
    }

    public final void onLowMemory() {
        switch (this.a) {
            case 0:
                ld2 ld2 = (ld2) this.b;
                ld2.t.j(-1);
                ld2.v.j(-1);
                return;
            default:
                return;
        }
    }

    public fd2(oe3 oe3, Context context) {
        this.a = 1;
        this.b = oe3;
    }
}
