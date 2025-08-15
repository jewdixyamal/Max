package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Range;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: u05  reason: default package */
public final /* synthetic */ class u05 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u05(int i, long j, long j2, Object obj) {
        this.a = i;
        this.o = obj;
        this.b = j;
        this.c = j2;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        kr9 kr9;
        tle tle;
        long j = this.c;
        long j2 = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 0:
                d15 d15 = (d15) obj;
                switch (au1.s(d15.D)) {
                    case 0:
                    case 3:
                    case 7:
                        return;
                    case 1:
                    case 2:
                        int i = d15.D;
                        d15.i(4);
                        Long l = (Long) d15.t.getLower();
                        long longValue = l.longValue();
                        if (longValue != Long.MAX_VALUE) {
                            if (j2 != -1 && j2 >= longValue) {
                                j = j2;
                            }
                            if (j >= longValue) {
                                d15.t = Range.create(l, Long.valueOf(j));
                                a14.H(j);
                                if (i != 3 || d15.w == null) {
                                    d15.v = true;
                                    d15.x = ju0.D().schedule((Runnable) new r05(d15, 1), 1000, TimeUnit.MILLISECONDS);
                                    return;
                                }
                                d15.j();
                                return;
                            }
                            throw new AssertionError("The start time should be before the stop time.");
                        }
                        throw new AssertionError("There should be a \"start\" before \"stop\"");
                    case 4:
                    case 5:
                        d15.i(1);
                        return;
                    case 6:
                    case 8:
                        throw new IllegalStateException("Encoder is released");
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(rh4.r(d15.D)));
                }
            case 1:
                mz6 mz6 = (mz6) obj;
                mz6.getClass();
                StringBuilder sb = new StringBuilder("startTimer: chatId = ");
                sb.append(j2);
                sb.append(", sender = ");
                long j3 = j;
                sb.append(j3);
                hm9.k("mz6", sb.toString());
                long currentTimeMillis = System.currentTimeMillis();
                Map a2 = mz6.a(j2);
                if (a2 != null && (kr9 = (kr9) a2.get(Long.valueOf(j3))) != null) {
                    StringBuilder sb2 = new StringBuilder("startTimer: now - userTime = ");
                    long j4 = currentTimeMillis - kr9.a;
                    sb2.append(j4);
                    hm9.k("mz6", sb2.toString());
                    if (j4 >= 6000) {
                        mz6.c(j2, j3);
                        return;
                    }
                    return;
                }
                return;
            default:
                hx9 hx9 = iua.b;
                tle tle2 = (tle) ((mle) ((p7c) obj).h.getValue());
                je7 je7 = tle2.X;
                jmc jmc = ((k24) ((c34) ((eoe) je7.getValue()).a.get())).f;
                hoe b2 = jmc.b();
                b2.getClass();
                xlc a3 = xlc.a(1, "SELECT * FROM tasks WHERE type = ?");
                b2.c.getClass();
                a3.j(1, (long) 11);
                ilc ilc = b2.a;
                ilc.b();
                Cursor o2 = ilc.o(a3, (CancellationSignal) null);
                try {
                    int n = tfg.n(o2, "id");
                    int n2 = tfg.n(o2, "type");
                    int n3 = tfg.n(o2, "status");
                    int n4 = tfg.n(o2, "fails_count");
                    int n5 = tfg.n(o2, "depends_request_id");
                    int n6 = tfg.n(o2, "dependency_type");
                    int n7 = tfg.n(o2, "data");
                    je7 je72 = je7;
                    int n8 = tfg.n(o2, "created_time");
                    tle tle3 = tle2;
                    long j5 = j;
                    ArrayList arrayList = new ArrayList(o2.getCount());
                    while (o2.moveToNext()) {
                        arrayList.add(new vne(o2.getLong(n), b46.t(o2.getInt(n2)), b46.r(o2.getInt(n3)), o2.getInt(n4), o2.getLong(n5), o2.getInt(n6), o2.isNull(n7) ? null : o2.getBlob(n7), o2.getLong(n8)));
                    }
                    o2.close();
                    a3.n();
                    List<une> c2 = jmc.c(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (une une : c2) {
                        hua hua = une.f;
                        if (hua instanceof pd2) {
                            pd2 pd2 = (pd2) hua;
                            if (pd2.a != j2 && pd2.o == j5) {
                                hm9.j(tle.B0, new zja(une));
                                tle = tle3;
                                CopyOnWriteArraySet copyOnWriteArraySet = tle.o;
                                long j6 = une.a;
                                copyOnWriteArraySet.add(Long.valueOf(j6));
                                arrayList2.add(Long.valueOf(j6));
                                tle3 = tle;
                            }
                        }
                        tle = tle3;
                        tle3 = tle;
                    }
                    ((eoe) je72.getValue()).e(arrayList2);
                    return;
                } catch (Throwable th) {
                    o2.close();
                    a3.n();
                    throw th;
                }
        }
    }
}
