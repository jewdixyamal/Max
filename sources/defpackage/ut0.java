package defpackage;

import android.view.View;
import java.util.Collection;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import one.me.folders.list.FoldersListScreen;

/* renamed from: ut0  reason: default package */
public final /* synthetic */ class ut0 extends p66 implements c66 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Collection collection;
        e5f e5f = e5f.a;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                OnUndeliveredElementKt.callUndeliveredElement(((zt0) this.receiver).b, obj2, (lx3) obj3);
                return e5f;
            case 1:
                Throwable th2 = (Throwable) obj;
                Object obj4 = ((i42) obj2).a;
                lx3 lx3 = (lx3) obj3;
                m56 m56 = ((zt0) this.receiver).b;
                if (obj4 instanceof h42) {
                    obj4 = null;
                }
                OnUndeliveredElementKt.callUndeliveredElement(m56, obj4, lx3);
                return e5f;
            default:
                w9f w9f = (w9f) obj2;
                ((Number) obj3).intValue();
                FoldersListScreen foldersListScreen = (FoldersListScreen) this.receiver;
                bc7[] bc7Arr = FoldersListScreen.Z;
                foldersListScreen.m0().t0 = w9f;
                qt3 Y = dy7.c(1).Y((View) obj);
                foldersListScreen.m0().getClass();
                at5 at5 = w9f.a;
                if (at5 == null) {
                    collection = nz4.a;
                } else {
                    kl7 l = j1e.l();
                    l.add(new tt3(oba.j, (jqe) new eqe(qba.n), Integer.valueOf(yfa.f), (Integer) null, 20));
                    if (!at5.C0.contains(cv5.NO_DELETE)) {
                        int i = oba.k;
                        eqe eqe = new eqe(qba.o);
                        int i2 = woc.w;
                        int i3 = wfa.U;
                        int i4 = wfa.P;
                        l.add(new tt3(i, (jqe) eqe, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)));
                    }
                    collection = j1e.d(l);
                }
                Y.I(collection).s().build().q(foldersListScreen);
                return e5f;
        }
    }
}
