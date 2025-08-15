package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: u7b  reason: default package */
public final class u7b implements qu7 {
    public final vxd X;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final ConcurrentHashMap o = new ConcurrentHashMap();

    public u7b(je7 je7, je7 je72, khe khe, kke kke, o45 o45) {
        this.a = je7;
        this.b = je72;
        this.c = khe;
        this.X = j47.T(j1e.a(((w9a) kke).a().limitedParallelism(1, "presences").plus(new qj(o45))), (lx3) null, (vx3) null, new t7b(this, (Continuation) null), 3);
    }

    public final void a() {
        this.X.cancel((CancellationException) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001e, code lost:
        r2 = (defpackage.r7b) (r2 = (defpackage.ti9) r2.o.get(java.lang.Long.valueOf(r3))).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.r7b b(long r3) {
        /*
            r2 = this;
            je7 r0 = r2.b
            java.lang.Object r0 = r0.getValue()
            el3 r0 = (defpackage.el3) r0
            boolean r0 = r0.g(r3)
            r7b r1 = defpackage.r7b.c
            if (r0 == 0) goto L_0x0028
            java.util.concurrent.ConcurrentHashMap r2 = r2.o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            ti9 r2 = (defpackage.ti9) r2
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r2.getValue()
            r7b r2 = (defpackage.r7b) r2
            if (r2 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7b.b(long):r7b");
    }

    public final ti9 c(long j) {
        return (ti9) this.o.computeIfAbsent(Long.valueOf(j), new di(17, new ww9(18)));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qpd, us] */
    public final us d() {
        ConcurrentHashMap concurrentHashMap = this.o;
        ? qpd = new qpd(concurrentHashMap.size());
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            r7b r7b = (r7b) ((ti9) entry.getValue()).getValue();
            if (r7b != null) {
                qpd.put(Long.valueOf(longValue), r7b);
            }
        }
        return qpd;
    }

    public final boolean e(long j) {
        r7b r7b;
        if (!((el3) this.b.getValue()).g(j)) {
            return false;
        }
        ti9 ti9 = (ti9) this.o.get(Long.valueOf(j));
        if (ti9 == null || (r7b = (r7b) ti9.getValue()) == null) {
            r7b = r7b.c;
        }
        int i = r7b.a;
        return i == 40 || i == 10 || i == 20;
    }

    public final void f(long j, r7b r7b) {
        Object value;
        Object value2;
        r7b r7b2 = (r7b) c(j).getValue();
        if (r7b2 == null || r7b2.b <= r7b.b) {
            ti9 c2 = c(j);
            do {
                value = c2.getValue();
                r7b r7b3 = (r7b) value;
            } while (!c2.c(value, r7b));
        } else {
            ti9 c3 = c(j);
            do {
                value2 = c3.getValue();
                r7b r7b4 = (r7b) value2;
            } while (!c3.c(value2, new r7b(r7b.a, r7b2.b)));
        }
        if (((el3) this.b.getValue()).e) {
            uj3 i = ((el3) this.b.getValue()).i(j, false);
            if (i == null) {
                hm9.k0("ContactController", (Exception) null, "updatePresence failure! contact not found", Arrays.copyOf(new Object[0], 0));
            } else {
                i.a.o = r7b;
            }
        }
    }

    public final void g(gi9 gi9) {
        wv7 wv7 = new wv7(gi9.d);
        long[] jArr = gi9.b;
        long[] jArr2 = gi9.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr2[i];
                if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            long j2 = jArr[(i << 3) + i3];
                            wv7.f(j2, b(j2));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        glc glc = ((k24) ((c34) this.a.getValue())).d;
        ((OneMeRoomDatabase) ((jlc) glc.b).m()).q(new flc(wv7, 0, glc));
    }
}
