package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: b0e  reason: default package */
public final class b0e implements m1e {
    public final vk8 a;
    public final a4c b;
    public final boolean c;
    public jw4 d;
    public double e;
    public final aw7 f = new Object();
    public BigInteger g;
    public BigInteger h;
    public final sy4 i;
    public final CopyOnWriteArrayList j;

    /* JADX WARNING: type inference failed for: r4v1, types: [aw7, java.lang.Object] */
    public b0e(vk8 vk8, a4c a4c, boolean z) {
        this.a = vk8;
        this.b = a4c;
        this.c = z;
        BigInteger bigInteger = BigInteger.ZERO;
        this.g = bigInteger;
        this.h = bigInteger;
        this.i = new sy4(29);
        this.j = new CopyOnWriteArrayList();
        vk8.c(this, 5, TimeUnit.SECONDS);
    }

    public final void a(c4c c4c) {
        BigInteger bigInteger;
        String str;
        Double d0;
        c4c c4c2 = c4c;
        double d2 = 0.0d;
        if (this.i.Q(c4c2.c)) {
            this.d = null;
            this.e = 0.0d;
            BigInteger bigInteger2 = BigInteger.ZERO;
            this.g = bigInteger2;
            this.h = bigInteger2;
            aw7 aw7 = this.f;
            aw7.a = 0;
            aw7.b = 0;
        }
        cz1 c2 = c4c.c();
        if (!(c2 == null || (str = c2.h) == null || (d0 = cae.d0(str)) == null)) {
            double doubleValue = d0.doubleValue();
            jw4 jw4 = this.d;
            if (jw4 != null) {
                jw4.a(doubleValue);
            } else {
                this.d = new jw4(doubleValue);
            }
        }
        List<jxd> list = c4c2.c;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (jxd jxd : list) {
            if (jxd.b == 2 && jxd.a == 2) {
                arrayList.add((ixd) jxd);
            }
        }
        ixd ixd = (ixd) x53.i0(arrayList);
        if (ixd != null) {
            BigInteger bigInteger3 = ixd.h;
            a4c a4c = this.b;
            if (bigInteger3 == null || (bigInteger = ixd.i) == null) {
                this.e = 0.0d;
                a4c.log("MediaAdaptation", "No packets were sent yet. Reset lost to 0");
            } else {
                if (this.c) {
                    long longValue = bigInteger.longValue();
                    long longValue2 = bigInteger3.longValue();
                    aw7 aw72 = this.f;
                    this.e = aw72.a(longValue, longValue2);
                    long j2 = aw72.d;
                    long j3 = aw72.c;
                    StringBuilder sb = new StringBuilder("Sent stats: sent=");
                    sb.append(j2);
                    sb.append(" (total=");
                    sb.append(bigInteger3);
                    au1.q(j3, "), lost=", " (total=", sb);
                    sb.append(bigInteger);
                    sb.append(")");
                    a4c.log("MediaAdaptation", sb.toString());
                    double d3 = this.e;
                    a4c.log("MediaAdaptation", "Lost packets fraction updated to " + d3);
                } else {
                    if (bigInteger3.compareTo(this.g) < 0) {
                        this.g = bigInteger3;
                    }
                    if (bigInteger.compareTo(this.h) < 0) {
                        this.h = bigInteger;
                    }
                    BigInteger subtract = bigInteger.subtract(this.h);
                    BigInteger subtract2 = bigInteger3.subtract(this.g);
                    a4c.log("MediaAdaptation", "Sent stats: sent=" + subtract2 + " (total=" + bigInteger3 + "), lost=" + subtract + " (total=" + bigInteger + ")");
                    BigInteger bigInteger4 = BigInteger.ZERO;
                    double doubleValue2 = (subtract2.compareTo(bigInteger4) <= 0 || subtract.compareTo(bigInteger4) <= 0) ? 0.0d : subtract.doubleValue() / subtract2.doubleValue();
                    this.e = doubleValue2;
                    a4c.log("MediaAdaptation", "Lost packets fraction updated to " + doubleValue2);
                    this.g = bigInteger3;
                    this.h = bigInteger;
                }
                d2 = 0.0d;
            }
        }
        if (this.j.isEmpty()) {
            this.b.log("MediaAdaptation", "Ignore network state update because there are no listeners");
            return;
        }
        jw4 jw42 = this.d;
        if (jw42 != null) {
            d2 = jw42.b;
        }
        s38 s38 = new s38(d2, this.e);
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            u38 u38 = (u38) it.next();
            r38 r38 = u38.i;
            p38 p38 = r38.a;
            double d4 = p38.a;
            double d5 = s38.a;
            int i2 = (d5 > d4 ? 1 : (d5 == d4 ? 0 : -1));
            vte vte = u38.c;
            a4c a4c2 = u38.d;
            double d6 = s38.b;
            vte vte2 = vte;
            if ((i2 > 0 || d6 < p38.b) && ((d5 <= d4 || d6 < p38.c) && d5 < p38.d)) {
                q38 q38 = r38.b;
                if ((d5 >= q38.a || d6 > q38.b) && (d5 >= q38.c || d6 > q38.d)) {
                    a4c2.log("MediaAdaptation", "Ignore inbound state update " + s38);
                } else {
                    int i3 = u38.k;
                    a4c2.log("MediaAdaptation", "Good network detected. Current condition is " + zr6.s(i3) + ", state is " + s38);
                    ((wte) vte2).getClass();
                    if (SystemClock.elapsedRealtime() - u38.f > r38.b.e && u38.k != 1) {
                        u38.c(1, s38);
                    }
                }
            } else {
                int i4 = u38.k;
                a4c2.log("MediaAdaptation", "Bad network detected. Current condition is " + zr6.s(i4) + ", state is " + s38);
                p38 p382 = r38.a;
                int i5 = 3;
                if (d5 < p382.d) {
                    int i6 = u38.k;
                    i5 = (i6 != 3 || d5 < p382.e) ? 2 : i6;
                }
                ((wte) vte2).getClass();
                u38.f = SystemClock.elapsedRealtime();
                if (u38.k != i5) {
                    u38.c(i5, s38);
                }
            }
        }
    }
}
