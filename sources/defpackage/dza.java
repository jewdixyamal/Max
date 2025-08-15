package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: dza  reason: default package */
public final class dza extends pnf {
    public static final /* synthetic */ bc7[] Y;
    public final w4d X = mqd.D();
    public final w7c b;
    public final js3 c;
    public final q0e o = r0e.a((Object) null);

    static {
        oi9 oi9 = new oi9(dza.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Y = new bc7[]{oi9};
    }

    public dza(qn3 qn3, je7 je7, je7 je72) {
        ap8 ap8 = new ap8(qn3.a(), this, 3);
        nz4 nz4 = nz4.a;
        this.b = od2.X(ap8, this.a, wld.a, nz4);
        js3 js3 = new js3(this.a, qn3.a(), (td) null, je7, je72);
        this.c = js3;
        qn3.b();
        od2.L(new zn5(js3.i, new aza(this, (Continuation) null), 5), this.a);
    }

    public static final List q(dza dza, dn3 dn3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        dn3 dn32 = dn3;
        dza.getClass();
        if (dn3.b()) {
            return nz4.a;
        }
        kl7 l = j1e.l();
        List<nn3> list = dn32.a;
        if (list != null) {
            arrayList = new ArrayList(z53.S(list, 10));
            for (nn3 nn3 : list) {
                long j = nn3.a;
                CharSequence charSequence = nn3.X;
                iqe iqe = charSequence != null ? new iqe(charSequence) : null;
                pxa pxa = r7;
                pxa pxa2 = new pxa(j, j, nn3.b, iqe, nn3.Z, false, nn3.t0, new gza(j, fza.b), nn3.u0, true);
                arrayList.add(pxa);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            l.addAll(arrayList);
        }
        List<nn3> list2 = dn32.c;
        if (list2 != null) {
            arrayList2 = new ArrayList(z53.S(list2, 10));
            for (nn3 nn32 : list2) {
                long j2 = nn32.a;
                CharSequence charSequence2 = nn32.X;
                pxa pxa3 = r4;
                pxa pxa4 = new pxa(j2, j2, nn32.b, charSequence2 != null ? new iqe(charSequence2) : null, nn32.Z, false, nn32.t0, new gza(j2, fza.c), nn32.u0, true);
                arrayList2.add(pxa3);
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            l.addAll(arrayList2);
        }
        return j1e.d(l);
    }
}
