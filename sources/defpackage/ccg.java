package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.webrtc.StatsReport;

/* renamed from: ccg  reason: default package */
public final class ccg implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qoa b;

    public /* synthetic */ ccg(qoa qoa, int i) {
        this.a = i;
        this.b = qoa;
    }

    /* JADX WARNING: type inference failed for: r14v2, types: [java.lang.Object, lec] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object, lec] */
    public final Object apply(Object obj) {
        boolean z;
        m56 m56;
        double d;
        double d2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        String str;
        Double d0;
        switch (this.a) {
            case 0:
                long longValue = ((Number) obj).longValue();
                qoa qoa = this.b;
                m56 m562 = qoa.f;
                m562.invoke("run routine #" + longValue);
                return new q1a(1, new yt8(13, (Object) qoa));
            default:
                qoa qoa2 = this.b;
                c4c d3 = c4c.d(qoa2.c, (StatsReport[]) obj);
                sy4 sy4 = qoa2.k;
                List<jxd> list = d3.c;
                boolean Q = sy4.Q(list);
                l7 l7Var = qoa2.p;
                l7 l7Var2 = qoa2.o;
                aw7 aw7 = qoa2.n;
                m56 m563 = qoa2.f;
                if (Q) {
                    m563.invoke("reset state");
                    qoa2.b.reset();
                    qoa2.l = 0.0d;
                    aw7.a = 0;
                    aw7.b = 0;
                    qoa2.m = Double.NaN;
                    l7Var2.b = 0;
                    l7Var2.c = 0;
                    l7Var.b = 0;
                    l7Var.c = 0;
                }
                cz1 c = d3.c();
                boolean f = tpa.f(c != null ? c.i : null, "tcp");
                cz1 c2 = d3.c();
                double doubleValue = (c2 == null || (str = c2.h) == null || (d0 = cae.d0(str)) == null) ? 0.0d : d0.doubleValue() / ((double) TimeUnit.SECONDS.toMillis(1));
                m5d I = j1e.I(list);
                List<Object> list2 = (List) I.b;
                boolean isEmpty = list2.isEmpty();
                List<Object> list3 = (List) I.o;
                List<Object> list4 = (List) I.X;
                List<Object> list5 = (List) I.c;
                if (!isEmpty || !list5.isEmpty() || !list4.isEmpty() || !list3.isEmpty()) {
                    ? obj2 = new Object();
                    ? obj3 = new Object();
                    m56 = m563;
                    ubg ubg = new ubg(obj2, obj3, 0);
                    z = f;
                    ubg ubg2 = new ubg(obj2, obj3, 1);
                    for (Object invoke : list2) {
                        ubg.invoke(invoke);
                    }
                    for (Object invoke2 : list5) {
                        ubg.invoke(invoke2);
                    }
                    for (Object invoke3 : list3) {
                        ubg2.invoke(invoke3);
                    }
                    for (Object invoke4 : list4) {
                        ubg2.invoke(invoke4);
                    }
                    long j = obj3.a;
                    if (j != 0) {
                        long j2 = obj2.a;
                        if (j2 != 0) {
                            d = aw7.a(j, j2);
                            qoa2.l = d;
                        }
                    }
                    d = 0.0d;
                    qoa2.l = 0.0d;
                } else {
                    z = f;
                    d = qoa2.l;
                    m56 = m563;
                }
                hxd hxd = (hxd) x53.i0(j1e.v(list));
                Long valueOf = (hxd == null || (bigInteger2 = hxd.j) == null) ? null : Long.valueOf(bigInteger2.longValue());
                ArrayList arrayList = new ArrayList(list.size());
                for (jxd jxd : list) {
                    if (jxd.b == 1 && jxd.a == 1) {
                        arrayList.add((dxd) jxd);
                    }
                }
                dxd dxd = (dxd) x53.i0(arrayList);
                Long valueOf2 = (dxd == null || (bigInteger = dxd.j) == null) ? null : Long.valueOf(bigInteger.longValue());
                if (valueOf == null) {
                    d2 = qoa2.m;
                } else if (valueOf2 != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    d2 = l7Var.c(valueOf.longValue(), elapsedRealtime) + l7Var2.c(valueOf2.longValue(), elapsedRealtime);
                    qoa2.m = d2;
                } else {
                    d2 = qoa2.m;
                }
                double a2 = qoa2.b.a(doubleValue, d, d2, z);
                m56.invoke("calc result: " + a2 + " for: rtt=" + doubleValue + ", loss=" + d + ", bitrate=" + d2 + " isTCP=" + z);
                return Double.valueOf(a2);
        }
    }
}
