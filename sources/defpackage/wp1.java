package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;

/* renamed from: wp1  reason: default package */
public final class wp1 extends pnf {
    public static final kpa X = new kpa(oag.a("", Long.MIN_VALUE), e9f.c(x7a.J0).toString());
    public final je7 b;
    public final q0e c;
    public final w7c o;

    public wp1(je7 je7, je7 je72, je7 je73) {
        this.b = je72;
        q0e a = r0e.a(qp1.a);
        this.c = a;
        this.o = new w7c(a);
        od2.L(od2.F(new zn5(((yz0) ((ez0) je72.getValue())).t0, new vp1(this, je7, (Continuation) null), 5), ((w9a) ((kke) je73.getValue())).a()), this.a);
    }

    public static final kl7 q(wp1 wp1, List list) {
        wp1.getClass();
        boolean z = list.size() > 3;
        List<bo1> y0 = x53.y0(list, z ? 2 : list.size());
        ArrayList arrayList = new ArrayList(z53.S(y0, 10));
        for (bo1 bo1 : y0) {
            arrayList.add(new kpa(oag.a(bo1.j(), Long.valueOf(bo1.d())), bo1.q()));
        }
        kl7 l = j1e.l();
        l.addAll(arrayList);
        if (z) {
            l.add(X);
        }
        return j1e.d(l);
    }

    public static final CharSequence r(wp1 wp1, String str) {
        wp1.getClass();
        if (w9e.C0(str)) {
            return str;
        }
        List P0 = w9e.P0(w9e.b1(str), new char[]{' '});
        if (P0.size() < 2) {
            return str;
        }
        Object g0 = x53.g0(P0);
        CharSequence charSequence = (CharSequence) x53.p0(P0);
        if (charSequence.length() != 0) {
            String upperCase = String.valueOf(charSequence.charAt(0)).toUpperCase(Locale.ROOT);
            return g0 + " " + upperCase + ".";
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
