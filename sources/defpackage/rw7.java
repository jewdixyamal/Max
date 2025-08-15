package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: rw7  reason: default package */
public final class rw7 extends ffe implements a66 {
    public final /* synthetic */ MainActivity X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rw7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((rw7) n((ut7) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rw7(this.X, continuation);
    }

    public final Object o(Object obj) {
        xx6 i;
        od2.a0(obj);
        cy6 cy6 = (cy6) y8a.a.getAccessor().c(cy6.class);
        cy6.getClass();
        tx6 tx6 = tx6.a;
        Class<f5a> cls = f5a.class;
        boolean d = ((f5a) tx6.getAccessor().c(cls)).d();
        Class<by6> cls2 = by6.class;
        String str = cy6.b;
        if (!d) {
            hm9.m(str, "InAppReviewManagersInitializer init() InAppReviewComponent.authStorage.isAuthorized:" + ((f5a) tx6.getAccessor().c(cls)).d(), new Object[0]);
        } else {
            u8e u8e = (u8e) tx6.getAccessor().c(u8e.class);
            qyc qyc = (qyc) ((y7d) tx6.getAccessor().c(y7d.class));
            qyc.getClass();
            boolean n = qyc.n(PmsKey.f40fakeinappreview, false);
            boolean z = ((t33) ((q33) tx6.getAccessor().c(q33.class))).g.getBoolean("app.enable_in_app_review_not_from_market_build", false);
            ((x6a) tx6.getAccessor().c(x6a.class)).getClass();
            if (!n) {
                xe6 xe6 = (xe6) u8e;
                if (!xe6.a()) {
                    hm9.m(str, "InAppReviewManagersInitializer init() builds.isMarketBuild:true, isInAppReviewEnabledNotFromMarketBuild:" + z + ", isFakeInAppReviewEnabled:" + n + ", storeServicesInfo.areServicesAvailable:" + xe6.a(), new Object[0]);
                }
            }
            long q = qyc.q(PmsKey.f50inappreviewtriggers, 0);
            xx6 xx6 = new xx6(n, cy6.a.getSharedPreferences("app_crash_prefs", 0).getLong("pref_last_crash_time", 0));
            kl7 l = j1e.l();
            Iterator it = ux6.v0.iterator();
            int i2 = 0;
            while (true) {
                u1 u1Var = (u1) it;
                if (u1Var.hasNext()) {
                    Object next = u1Var.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        ux6 ux6 = (ux6) next;
                        if (((q & 1) << i2) != 0) {
                            l.add(ux6);
                        }
                        i2 = i3;
                    } else {
                        y53.R();
                        throw null;
                    }
                } else {
                    kl7 d2 = j1e.d(l);
                    if (d2.isEmpty()) {
                        hm9.m(str, "InAppReviewManagersInitializer init() conditions.isEmpty", new Object[0]);
                    } else {
                        ListIterator listIterator = d2.listIterator(0);
                        while (true) {
                            il7 il7 = (il7) listIterator;
                            if (!il7.hasNext()) {
                                break;
                            }
                            xx6.h.put((ux6) il7.next(), new Object());
                        }
                        if (!((xe6) u8e).a()) {
                            hm9.m(str, "InAppReviewManagersInitializer init() storeServicesInfo.areServicesAvailable:" + ((f5a) tx6.a.getAccessor().c(cls)).d(), new Object[0]);
                        } else {
                            tx6 tx62 = tx6.a;
                            ((by6) tx62.getAccessor().c(cls2)).getClass();
                            by6.b = (ay6) tx62.getAccessor().c(ay6.class);
                        }
                    }
                    cy6.c = xx6;
                }
            }
        }
        MainActivity mainActivity = this.X;
        int ordinal = mainActivity.a.d.ordinal();
        if (ordinal == 3) {
            int i4 = MainActivity.a1;
            mainActivity.j0();
        } else if (ordinal == 4) {
            int i5 = MainActivity.a1;
            mainActivity.j0();
            y8a y8a = y8a.a;
            ((by6) y8a.getAccessor().c(cls2)).getClass();
            ay6 ay6 = by6.b;
            if (!(ay6 == null || (i = y8a.i()) == null)) {
                i.k = ay6.e;
            }
        }
        xx6 i6 = y8a.a.i();
        if (i6 != null) {
            List list = xx6.p;
            i6.e((Integer) null);
        }
        return e5f.a;
    }
}
