package defpackage;

import java.util.Collection;
import java.util.HashSet;

/* renamed from: zw0  reason: default package */
public final /* synthetic */ class zw0 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx0 b;
    public final /* synthetic */ Collection c;

    public /* synthetic */ zw0(cx0 cx0, HashSet hashSet, int i) {
        this.a = i;
        this.b = cx0;
        this.c = hashSet;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cx0 cx0 = this.b;
                Collection collection = this.c;
                cx0.getClass();
                if (collection.contains(gx0.t0)) {
                    gx0 gx0 = gx0.Y;
                    if (!collection.contains(gx0)) {
                        collection.add(gx0);
                    }
                }
                if (cx0.k.a != null) {
                    ax0 ax0 = cx0.k;
                    if (collection.contains(gx0.Z) || collection.contains(gx0.c)) {
                        f40 f40 = cx0.b;
                        f40.getClass();
                        hm9.m("f40", "stop", new Object[0]);
                        f40.t();
                        f40.c.t();
                        f40.o();
                    }
                    ax0.a.h(collection);
                    cx0.c.a(new f8d((HashSet) collection));
                    return;
                }
                hm9.p("cx0", "onClearCacheTypesPicked: already cleared all", (Throwable) null);
                return;
            default:
                cx0 cx02 = this.b;
                cx02.getClass();
                if (this.c.equals(cx0.l)) {
                    cx02.i.set(true);
                    return;
                }
                return;
        }
    }
}
