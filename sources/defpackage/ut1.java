package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ut1  reason: default package */
public final /* synthetic */ class ut1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu1 b;
    public final /* synthetic */ List c;

    public /* synthetic */ ut1(fu1 fu1, ArrayList arrayList, int i) {
        this.a = i;
        this.b = fu1;
        this.c = arrayList;
    }

    public final void run() {
        bkb bkb;
        switch (this.a) {
            case 0:
                fu1 fu1 = this.b;
                List<t90> list = this.c;
                fu1.getClass();
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                boolean z2 = false;
                for (t90 t90 : list) {
                    if (fu1.a.C(t90.a)) {
                        ((LinkedHashMap) fu1.a.a).remove(t90.a);
                        arrayList.add(t90.a);
                        if (t90.b == h8b.class) {
                            z2 = true;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    TextUtils.join(", ", arrayList);
                    fu1.toString();
                    if (z2) {
                        fu1.Z.h.e = null;
                    }
                    fu1.q();
                    if (fu1.a.s().isEmpty()) {
                        fu1.Z.l.c = false;
                    } else {
                        fu1.L();
                    }
                    if (fu1.a.n().isEmpty()) {
                        fu1.Z.q();
                        fu1.D();
                        fu1.Z.y(false);
                        fu1.w0 = fu1.z();
                        fu1.toString();
                        switch (au1.s(fu1.S0)) {
                            case 3:
                                if (fu1.u0 == null) {
                                    z = true;
                                }
                                c54.p((String) null, z);
                                fu1.F(3);
                                return;
                            case 5:
                            case 6:
                            case 7:
                                if (fu1.s0.a() || ((bkb = (bkb) fu1.R0.b) != null && !((AtomicBoolean) bkb.b).get())) {
                                    z = true;
                                }
                                fu1.R0.K();
                                fu1.F(5);
                                if (z) {
                                    c54.p((String) null, fu1.x0.isEmpty());
                                    fu1.s();
                                    return;
                                }
                                return;
                            case 8:
                            case 9:
                                fu1.F(5);
                                fu1.r();
                                return;
                            default:
                                fu1.toString();
                                return;
                        }
                    } else {
                        fu1.K();
                        fu1.D();
                        if (fu1.S0 == 9) {
                            fu1.B();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            default:
                List list2 = this.c;
                fu1 fu12 = this.b;
                st1 st1 = fu12.Z;
                try {
                    fu12.H((ArrayList) list2);
                    return;
                } finally {
                    st1.q();
                }
        }
    }
}
