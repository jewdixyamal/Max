package defpackage;

import android.content.Context;
import android.text.SpannableString;
import androidx.work.WorkRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: w7b  reason: default package */
public final class w7b implements gbd {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final av0 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final ContextScope s0;
    public final kld t0 = lld.b(0, 0, 0, 7);
    public final w4d u0 = mqd.D();
    public final AtomicBoolean v0 = new AtomicBoolean(false);

    static {
        oi9 oi9 = new oi9(w7b.class, "presencesJob", "getPresencesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        w0 = new bc7[]{oi9};
    }

    public w7b(je7 je7, je7 je72, je7 je73, av0 av0, je7 je74, je7 je75, kke kke, khe khe) {
        this.a = av0;
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = khe;
        this.Y = je74;
        this.Z = je75;
        this.s0 = j1e.a(((w9a) kke).a());
    }

    public final CharSequence a(long j, boolean z, r7b r7b) {
        je7 je7 = this.c;
        if (!z) {
            return ((ida) je7.getValue()).a.getString(dpc.m);
        }
        if (d().e(j)) {
            int i = c2c.tt_contact_status_online;
            Context context = ((ida) je7.getValue()).a;
            String string = context.getString(i);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new mse(qp4.u0.b(context).i(), new ww9(10)), 0, string.length(), 33);
            return spannableString;
        }
        if (r7b == null) {
            r7b = d().b(j);
        }
        ida ida = (ida) je7.getValue();
        t33 t33 = ida.c;
        b11 o2 = ay7.o(((long) r7b.b) * 1000, t33.n());
        Locale v = t33.v();
        String[] strArr = are.b;
        int i2 = o2.b;
        int s = au1.s(i2);
        Context context2 = ida.a;
        long j2 = o2.c;
        switch (s) {
            case 0:
                return context2.getString(c2c.tt_dates_right_now);
            case 1:
                return context2.getString(c2c.tt_dates_minutes_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 2:
                return context2.getString(c2c.tt_dates_hours_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 3:
                return j2 == 0 ? context2.getString(c2c.tt_dates_yesterday_at_last_seen_no_time) : String.format(context2.getString(c2c.tt_dates_yesterday_at), new Object[]{ay7.k(context2, j2, v)});
            case 4:
                return context2.getString(c2c.tt_dates_days_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 5:
                return context2.getString(c2c.tt_dates_weeks_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 6:
                return context2.getString(c2c.tt_dates_months_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 7:
            case 8:
                return context2.getString(c2c.tt_dates_full_last_seen_u, new Object[]{ay7.r(v, j2, au1.c(i2, 8))});
            case 9:
                return context2.getString(c2c.presence_unknown_date);
            default:
                return "";
        }
    }

    public final CharSequence b(uj3 uj3) {
        return a(uj3.n(), uj3.c(), (r7b) null);
    }

    public final void c(int i) {
        AtomicBoolean atomicBoolean = this.v0;
        if (i != 1) {
            atomicBoolean.set(true);
        } else if (atomicBoolean.get()) {
            g();
            atomicBoolean.set(false);
        }
    }

    public final u7b d() {
        return (u7b) this.b.getValue();
    }

    public final q33 e() {
        return (q33) this.o.getValue();
    }

    public final x77 f() {
        return (x77) this.u0.T0(this, w0[0]);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [qpd, java.util.Map] */
    public final void g() {
        hm9.m("PresenceController", "moveOnlineToLastSeen", new Object[0]);
        ? qpd = new qpd(0);
        int n = (int) (((hyc) e()).n() / 1000);
        Iterator it = ((ps) d().d().entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            if (((r7b) entry.getValue()).a != 0) {
                qpd.put(Long.valueOf(longValue), new r7b(0, n));
            }
        }
        h(0, qpd);
    }

    public final void h(long j, Map map) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "PresenceController", zr6.h(map.size(), "onContactPresence, presence.count() = "), (Throwable) null);
        }
        if (!map.isEmpty()) {
            k(map);
            if (j > 0) {
                hyc hyc = (hyc) e();
                if (j > hyc.f("user.presenceLastSync", 0)) {
                    hyc.l("user.presenceLastSync", Long.valueOf(j));
                }
            }
        }
    }

    public final void i(HashMap hashMap, long j) {
        if (!hashMap.containsKey(Long.valueOf(((hyc) e()).t()))) {
            hashMap.put(Long.valueOf(((hyc) e()).t()), r7b.d);
        }
        h(j, hashMap);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [qpd, java.util.Map] */
    public final void j(xs9 xs9) {
        int i;
        x77 f;
        x77 f2;
        ConcurrentHashMap concurrentHashMap = d().o;
        if (concurrentHashMap.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Map.Entry value : concurrentHashMap.entrySet()) {
                if (((ti9) value.getValue()).getValue() != null) {
                    i++;
                }
            }
        }
        long j = i < 500 ? 0 : i < 1000 ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : WorkRequest.MIN_BACKOFF_MILLIS;
        if (j > 0 && (f() == null || ((f2 = f()) != null && !f2.isActive()))) {
            this.u0.o1(this, w0[0], j47.T(this.s0, (lx3) null, vx3.b, new v7b(this, j, (Continuation) null), 1));
        }
        if (f() == null || (f = f()) == null || !f.isActive()) {
            List<xs9> singletonList = Collections.singletonList(xs9);
            if (!singletonList.isEmpty()) {
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "PresenceController", "onNotifPresence: " + singletonList + ".size", (Throwable) null);
                }
                ? qpd = new qpd(singletonList.size());
                long j2 = 0;
                for (xs9 xs92 : singletonList) {
                    qpd.put(Long.valueOf(xs92.c), iz7.l(xs92.o));
                    long j3 = xs92.X;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                hyc hyc = (hyc) e();
                if (j2 > hyc.f("user.presenceLastSync", 0)) {
                    hyc.l("user.presenceLastSync", Long.valueOf(j2));
                }
                k(qpd);
                return;
            }
            return;
        }
        hm9.m("PresenceController", "onNotifPresence: post to subject", new Object[0]);
        this.t0.g(xs9);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: qpd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(java.util.Map r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.v0
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0046
            us r0 = new us
            int r1 = r7.size()
            r0.<init>(r1)
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0019:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0045
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r1 = r1.getValue()
            r7b r1 = (defpackage.r7b) r1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r7b r3 = new r7b
            r4 = 0
            int r1 = r1.b
            r3.<init>(r4, r1)
            r0.put(r2, r3)
            goto L_0x0019
        L_0x0045:
            r7 = r0
        L_0x0046:
            u7b r0 = r6.d()
            r0.getClass()
            gi9 r1 = new gi9
            int r2 = r7.size()
            r1.<init>((int) r2)
            java.util.Set r2 = r7.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x005e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            java.lang.Object r3 = r3.getValue()
            r7b r3 = (defpackage.r7b) r3
            r1.a(r4)
            r0.f(r4, r3)
            goto L_0x005e
        L_0x0081:
            je7 r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            do9 r3 = new do9
            r4 = 13
            r3.<init>(r0, r4, r1)
            r2.execute(r3)
            ps3 r0 = new ps3
            java.util.Set r7 = r7.keySet()
            r0.<init>((java.util.Collection) r7)
            av0 r6 = r6.a
            r6.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7b.k(java.util.Map):void");
    }
}
