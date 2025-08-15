package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: v65  reason: default package */
public final /* synthetic */ class v65 implements jde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ v65(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [ob6, java.lang.Object] */
    public final Object get() {
        h84 h84;
        i84 i84;
        switch (this.a) {
            case 0:
                return new gd4(this.b);
            case 1:
                return new oc4(this.b, new va4());
            case 2:
                new HashMap();
                this.b.getApplicationContext();
                Object obj = new Object();
                new HashMap();
                new HashSet();
                new HashMap();
                return obj;
            case 3:
                return new bf4(this.b, new Object());
            case 4:
                return new oc4(this.b, new va4());
            case 5:
                return new cf4(this.b);
            case 6:
                Context context = this.b;
                ffc ffc = h84.n;
                synchronized (h84.class) {
                    try {
                        if (h84.t == null) {
                            ay ayVar = new ay(context, 3);
                            boolean z = ayVar.b;
                            h84.t = new h84((Context) ayVar.o, (HashMap) ayVar.X, ayVar.c, (rhe) ayVar.Y, z);
                        }
                        h84 = h84.t;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                            break;
                        }
                    }
                }
                return h84;
            default:
                Context context2 = this.b;
                ffc ffc2 = i84.n;
                synchronized (i84.class) {
                    try {
                        if (i84.t == null) {
                            ay ayVar2 = new ay(context2, 4);
                            boolean z2 = ayVar2.b;
                            i84.t = new i84((Context) ayVar2.o, (HashMap) ayVar2.X, ayVar2.c, (she) ayVar2.Y, z2);
                        }
                        i84 = i84.t;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                return i84;
        }
    }
}
