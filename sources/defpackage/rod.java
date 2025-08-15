package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rod  reason: default package */
public final class rod {
    public final d4c a;
    public final a4c b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final AtomicLong e = new AtomicLong(1);
    public final Object f = new Object();
    public final hrf g;
    public final ArrayList h = new ArrayList();
    public final LongSparseArray i = new LongSparseArray();
    public final ArrayList j = new ArrayList();
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet l = new CopyOnWriteArraySet();
    public final int m;
    public final int n;
    public final gw3 o;
    public boolean p = true;
    public boolean q;
    public boolean r;
    public volatile long s;
    public volatile long t;
    public final boolean u;
    public final boolean v;

    public rod(hrf hrf, hw3 hw3, a4c a4c, d4c d4c, boolean z, boolean z2) {
        this.g = hrf;
        this.o = hw3;
        this.b = a4c;
        this.a = d4c;
        this.n = 5;
        this.m = 30000;
        this.u = z;
        this.v = z2;
        hrf.m = new sy4(4, (Object) this);
    }

    public final d14 a(uod uod, long j2) {
        try {
            return new d14(uod.a().put("sequence", j2).toString(), j2);
        } catch (JSONException e2) {
            this.b.reportException("OKSignaling", "signaling.create.command", e2);
            return null;
        }
    }

    public final sa5 b(long j2) {
        sa5 sa5;
        synchronized (this.f) {
            try {
                int indexOfKey = this.i.indexOfKey(j2);
                if (indexOfKey >= 0) {
                    sa5 = (sa5) this.i.valueAt(indexOfKey);
                    this.i.removeAt(indexOfKey);
                } else {
                    sa5 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sa5;
    }

    public final void c(uod uod, qod qod, qod qod2) {
        synchronized (this.f) {
            try {
                a4c a4c = this.b;
                a4c.log("OKSignaling", "<!> postpone send " + uod);
                if (!this.v || !e(uod, qod, qod2)) {
                    d14 a2 = a(uod, this.e.getAndIncrement());
                    if (a2 != null) {
                        this.h.add(new sa5(this, uod, a2, qod, qod2));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.uod r10, boolean r11, defpackage.qod r12, defpackage.qod r13) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f
            monitor-enter(r0)
            boolean r1 = r9.u     // Catch:{ all -> 0x000f }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0011
            boolean r4 = r9.q     // Catch:{ all -> 0x000f }
            if (r4 == 0) goto L_0x0011
            r4 = r3
            goto L_0x0012
        L_0x000f:
            r9 = move-exception
            goto L_0x004d
        L_0x0011:
            r4 = r2
        L_0x0012:
            if (r1 == 0) goto L_0x0019
            boolean r1 = r9.r     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x0019
            r2 = r3
        L_0x0019:
            if (r4 != 0) goto L_0x0024
            if (r2 != 0) goto L_0x0024
            if (r11 == 0) goto L_0x0020
            goto L_0x0024
        L_0x0020:
            r9.c(r10, r12, r13)     // Catch:{ all -> 0x000f }
            goto L_0x004b
        L_0x0024:
            java.util.concurrent.atomic.AtomicLong r11 = r9.e     // Catch:{ all -> 0x000f }
            long r1 = r11.getAndIncrement()     // Catch:{ all -> 0x000f }
            d14 r11 = r9.a(r10, r1)     // Catch:{ all -> 0x000f }
            if (r11 != 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x0032:
            sa5 r1 = new sa5     // Catch:{ all -> 0x000f }
            r3 = r1
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x000f }
            android.util.LongSparseArray r10 = r9.i     // Catch:{ all -> 0x000f }
            long r12 = r11.b     // Catch:{ all -> 0x000f }
            r10.put(r12, r1)     // Catch:{ all -> 0x000f }
            hrf r9 = r9.g     // Catch:{ all -> 0x000f }
            java.lang.String r10 = r11.a     // Catch:{ all -> 0x000f }
            r9.f(r10)     // Catch:{ all -> 0x000f }
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x004d:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rod.d(uod, boolean, qod, qod):void");
    }

    public final boolean e(uod uod, qod qod, qod qod2) {
        String str;
        uod uod2 = uod;
        sa5 sa5 = null;
        sr8 sr8 = uod2 instanceof wod ? new sr8((wod) uod2, 1) : uod2 instanceof vod ? new sr8((vod) uod2, 0) : null;
        if (sr8 == null) {
            return false;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        while (size > 0) {
            if (size > 0) {
                int i2 = size - 1;
                apd w = sr8.w(((sa5) arrayList.get(i2)).a);
                if (!w.equals(xod.a)) {
                    if (w instanceof zod) {
                        sa5 sa52 = (sa5) arrayList.get(i2);
                        long longValue = Long.valueOf(sa52.b).longValue();
                        uod uod3 = ((zod) w).a;
                        d14 a2 = a(uod3, longValue);
                        if (a2 != null) {
                            sa5 = new sa5(this, uod3, a2, qod, qod2);
                        }
                        if (sa5 == null) {
                            return false;
                        }
                        try {
                            if (sa52.e != null) {
                                sa52.f.c.post(new dd4(20, sa52));
                            }
                        } catch (Throwable th) {
                            try {
                                str = sa52.a.a().optString("command");
                            } catch (JSONException unused) {
                                str = "";
                            }
                            this.b.logException("SignalingCommandQueueIterator", wg0.i("Error on discard command ", str), th);
                        }
                        arrayList.set(i2, sa5);
                    } else if (!w.equals(yod.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return true;
                }
                size = i2;
            } else {
                throw new IndexOutOfBoundsException("No more elements in the list");
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: sa5} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v16, types: [qod] */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "type"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "stamp"
            r2 = 0
            long r4 = r11.optLong(r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001a
            long r6 = r10.s
            long r4 = java.lang.Math.max(r4, r6)
            r10.s = r4
        L_0x001a:
            java.lang.String r1 = "response"
            boolean r1 = r0.equals(r1)
            r4 = 0
            r5 = 0
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = "response"
            java.lang.String r0 = r11.optString(r0, r5)
            java.lang.String r1 = "sequence"
            long r1 = r11.getLong(r1)
            java.lang.String r3 = "recover"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0081
            boolean r0 = r10.u
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "messages"
            org.json.JSONArray r11 = r11.optJSONArray(r0)
            if (r11 == 0) goto L_0x0055
            r0 = r4
        L_0x0045:
            int r3 = r11.length()
            if (r0 >= r3) goto L_0x0055
            org.json.JSONObject r3 = r11.getJSONObject(r0)
            r10.f(r3)
            int r0 = r0 + 1
            goto L_0x0045
        L_0x0055:
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
        L_0x0058:
            android.util.LongSparseArray r11 = r10.i     // Catch:{ all -> 0x007b }
            int r11 = r11.size()     // Catch:{ all -> 0x007b }
            if (r4 >= r11) goto L_0x007d
            android.util.LongSparseArray r11 = r10.i     // Catch:{ all -> 0x007b }
            java.lang.Object r11 = r11.valueAt(r4)     // Catch:{ all -> 0x007b }
            sa5 r11 = (defpackage.sa5) r11     // Catch:{ all -> 0x007b }
            d14 r11 = r11.c     // Catch:{ all -> 0x007b }
            long r5 = r11.b     // Catch:{ all -> 0x007b }
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            goto L_0x0078
        L_0x0071:
            hrf r3 = r10.g     // Catch:{ all -> 0x007b }
            java.lang.String r11 = r11.a     // Catch:{ all -> 0x007b }
            r3.f(r11)     // Catch:{ all -> 0x007b }
        L_0x0078:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x007b:
            r10 = move-exception
            goto L_0x007f
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            return
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x007b }
            throw r10
        L_0x0081:
            sa5 r0 = r10.b(r1)
            if (r0 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            qod r5 = r0.d
        L_0x008a:
            if (r5 == 0) goto L_0x0324
            android.os.Handler r0 = r10.c
            pod r1 = new pod
            r2 = 0
            r1.<init>(r10, r5, r11, r2)
            r0.post(r1)
            goto L_0x0324
        L_0x0099:
            java.lang.String r1 = "notification"
            boolean r1 = r0.equals(r1)
            r6 = 2
            if (r1 == 0) goto L_0x01fb
            java.lang.String r0 = "notification"
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r1 = "connection"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = "recoverMessages"
            org.json.JSONArray r0 = r11.optJSONArray(r0)
            if (r0 == 0) goto L_0x00ce
            boolean r1 = r10.u
            if (r1 == 0) goto L_0x00ce
            r1 = r4
        L_0x00be:
            int r5 = r0.length()
            if (r1 >= r5) goto L_0x00ce
            org.json.JSONObject r5 = r0.getJSONObject(r1)
            r10.f(r5)
            int r1 = r1 + 1
            goto L_0x00be
        L_0x00ce:
            java.lang.String r0 = "conversation"
            org.json.JSONObject r0 = r11.getJSONObject(r0)
            java.lang.String r1 = "id"
            java.lang.String r0 = r0.getString(r1)
            a4c r1 = r10.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "cur cid="
            r5.<init>(r8)
            gw3 r8 = r10.o
            hw3 r8 = (defpackage.hw3) r8
            java.lang.String r8 = r8.a
            r5.append(r8)
            java.lang.String r8 = ", new cid="
            r5.append(r8)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r8 = "OKSignaling"
            r1.log(r8, r5)
            gw3 r1 = r10.o
            boolean r5 = r1 instanceof defpackage.hw3
            if (r5 == 0) goto L_0x0107
            hw3 r1 = (defpackage.hw3) r1
            r1.a = r0
        L_0x0107:
            java.lang.String r0 = "conversationParams"
            org.json.JSONObject r0 = r11.optJSONObject(r0)
            if (r0 != 0) goto L_0x0110
            goto L_0x016b
        L_0x0110:
            java.lang.String r1 = "activityTimeout"
            r8 = -1
            long r0 = r0.optLong(r1, r8)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x016b
            hrf r5 = r10.g
            r5.getClass()
            long r6 = r0 / r6
            r8 = 60000(0xea60, double:2.9644E-319)
            long r8 = r0 - r8
            long r6 = java.lang.Math.max(r6, r8)
            r8 = 30000(0x7530, double:1.4822E-319)
            long r6 = java.lang.Math.max(r6, r8)
            r5.i = r6
            long r6 = r5.r
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x014c
            r2 = 4
            long r0 = r0 / r2
            r2 = 61000(0xee48, double:3.0138E-319)
            long r0 = java.lang.Math.min(r0, r2)
            r2 = 11000(0x2af8, double:5.4347E-320)
            long r0 = java.lang.Math.max(r0, r2)
            r5.r = r0
        L_0x014c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "updateTimeoutMS timeoutMS="
            r0.<init>(r1)
            long r1 = r5.i
            r0.append(r1)
            java.lang.String r1 = " serverPingTimeoutMs="
            r0.append(r1)
            long r1 = r5.r
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            b9b r1 = r5.q
            r1.o(r0)
        L_0x016b:
            java.lang.Object r0 = r10.f
            monitor-enter(r0)
            r1 = 1
            r10.r = r1     // Catch:{ all -> 0x019f }
            boolean r2 = r10.q     // Catch:{ all -> 0x019f }
            if (r2 == 0) goto L_0x01ac
            boolean r2 = r10.u     // Catch:{ all -> 0x019f }
            if (r2 != 0) goto L_0x01ac
            long r1 = r10.t     // Catch:{ all -> 0x019f }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01a1 }
            r3.<init>()     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r4 = "stamp"
            r3.put((java.lang.String) r4, (long) r1)     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r1 = "recover"
            ka6 r1 = defpackage.f46.b(r3, r1)     // Catch:{ JSONException -> 0x01a1 }
            java.util.concurrent.atomic.AtomicLong r2 = r10.e     // Catch:{ JSONException -> 0x01a1 }
            long r2 = r2.getAndIncrement()     // Catch:{ JSONException -> 0x01a1 }
            d14 r1 = r10.a(r1, r2)     // Catch:{ JSONException -> 0x01a1 }
            if (r1 == 0) goto L_0x01e9
            hrf r2 = r10.g     // Catch:{ JSONException -> 0x01a1 }
            java.lang.String r1 = r1.a     // Catch:{ JSONException -> 0x01a1 }
            r2.f(r1)     // Catch:{ JSONException -> 0x01a1 }
            goto L_0x01e9
        L_0x019f:
            r10 = move-exception
            goto L_0x01eb
        L_0x01a1:
            r1 = move-exception
            a4c r2 = r10.b     // Catch:{ all -> 0x019f }
            java.lang.String r3 = "OKSignaling"
            java.lang.String r4 = "signaling.recover"
            r2.reportException(r3, r4, r1)     // Catch:{ all -> 0x019f }
            goto L_0x01e9
        L_0x01ac:
            r10.q = r1     // Catch:{ all -> 0x019f }
        L_0x01ae:
            java.util.ArrayList r1 = r10.h     // Catch:{ all -> 0x019f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x019f }
            if (r1 != 0) goto L_0x01e9
            java.util.ArrayList r1 = r10.h     // Catch:{ all -> 0x019f }
            java.lang.Object r1 = r1.remove(r4)     // Catch:{ all -> 0x019f }
            sa5 r1 = (defpackage.sa5) r1     // Catch:{ all -> 0x019f }
            d14 r2 = r1.c     // Catch:{ all -> 0x019f }
            a4c r3 = r10.b     // Catch:{ all -> 0x019f }
            java.lang.String r5 = "OKSignaling"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            r6.<init>()     // Catch:{ all -> 0x019f }
            java.lang.String r7 = "send postponed "
            r6.append(r7)     // Catch:{ all -> 0x019f }
            r6.append(r2)     // Catch:{ all -> 0x019f }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x019f }
            r3.log(r5, r2)     // Catch:{ all -> 0x019f }
            d14 r2 = r1.c     // Catch:{ all -> 0x019f }
            android.util.LongSparseArray r3 = r10.i     // Catch:{ all -> 0x019f }
            long r5 = r2.b     // Catch:{ all -> 0x019f }
            r3.put(r5, r1)     // Catch:{ all -> 0x019f }
            hrf r1 = r10.g     // Catch:{ all -> 0x019f }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x019f }
            r1.f(r2)     // Catch:{ all -> 0x019f }
            goto L_0x01ae
        L_0x01e9:
            monitor-exit(r0)     // Catch:{ all -> 0x019f }
            goto L_0x01ed
        L_0x01eb:
            monitor-exit(r0)     // Catch:{ all -> 0x019f }
            throw r10
        L_0x01ed:
            android.os.Handler r0 = r10.c
            flc r1 = new flc
            r2 = 18
            r1.<init>(r10, r2, r11)
            r0.post(r1)
            goto L_0x0324
        L_0x01fb:
            java.lang.String r1 = "error"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0324
            java.lang.String r0 = "sequence"
            boolean r0 = r11.has(r0)
            if (r0 == 0) goto L_0x0317
            java.lang.String r0 = "sequence"
            long r0 = r11.getLong(r0)
            sa5 r2 = r10.b(r0)
            if (r2 != 0) goto L_0x0219
            r2 = r5
            goto L_0x021b
        L_0x0219:
            qod r2 = r2.e
        L_0x021b:
            if (r2 == 0) goto L_0x0228
            android.os.Handler r3 = r10.c
            pod r8 = new pod
            r9 = 1
            r8.<init>(r10, r2, r11, r9)
            r3.post(r8)
        L_0x0228:
            java.lang.String r2 = "error"
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "service-unavailable"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02f4
            d4c r2 = r10.a
            e0e r3 = defpackage.e0e.app_event
            java.lang.String r8 = "rtc.cmd.service.unavailable"
            r2.log((defpackage.e0e) r3, (java.lang.String) r8, (java.lang.String) r5)
            java.lang.String r2 = "recoverable"
            boolean r2 = r11.optBoolean(r2, r4)
            if (r2 != 0) goto L_0x0256
            java.lang.String r0 = "signaling.listener.response.error.seq"
            android.os.Handler r1 = r10.c
            ewc r2 = new ewc
            r3 = 3
            r2.<init>(r10, r11, r0, r3)
            r1.post(r2)
            goto L_0x0324
        L_0x0256:
            java.lang.String r11 = "<!> retrying "
            java.lang.String r2 = "<!> quit retrying "
            java.lang.Object r3 = r10.f
            monitor-enter(r3)
            android.util.LongSparseArray r4 = r10.i     // Catch:{ all -> 0x026f }
            int r0 = r4.indexOfKey(r0)     // Catch:{ all -> 0x026f }
            if (r0 < 0) goto L_0x0272
            android.util.LongSparseArray r1 = r10.i     // Catch:{ all -> 0x026f }
            java.lang.Object r1 = r1.valueAt(r0)     // Catch:{ all -> 0x026f }
            r5 = r1
            sa5 r5 = (defpackage.sa5) r5     // Catch:{ all -> 0x026f }
            goto L_0x0272
        L_0x026f:
            r10 = move-exception
            goto L_0x02f2
        L_0x0272:
            if (r5 == 0) goto L_0x02f0
            d14 r1 = r5.c     // Catch:{ all -> 0x026f }
            long r4 = r1.d     // Catch:{ all -> 0x026f }
            r8 = 1
            long r4 = r4 + r8
            r1.d = r4     // Catch:{ all -> 0x026f }
            int r8 = r10.n     // Catch:{ all -> 0x026f }
            long r8 = (long) r8     // Catch:{ all -> 0x026f }
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x02bc
            a4c r11 = r10.b     // Catch:{ all -> 0x026f }
            java.lang.String r4 = "OKSignaling"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r5.<init>(r2)     // Catch:{ all -> 0x026f }
            gw3 r2 = r10.o     // Catch:{ all -> 0x026f }
            hw3 r2 = (defpackage.hw3) r2     // Catch:{ all -> 0x026f }
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x026f }
            r5.append(r2)     // Catch:{ all -> 0x026f }
            java.lang.String r2 = " "
            r5.append(r2)     // Catch:{ all -> 0x026f }
            r5.append(r1)     // Catch:{ all -> 0x026f }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x026f }
            r11.log(r4, r1)     // Catch:{ all -> 0x026f }
            a4c r11 = r10.b     // Catch:{ all -> 0x026f }
            java.lang.String r1 = "OKSignaling"
            java.lang.String r2 = "signaling.retry"
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x026f }
            java.lang.String r5 = "retry.fail"
            r4.<init>(r5)     // Catch:{ all -> 0x026f }
            r11.reportException(r1, r2, r4)     // Catch:{ all -> 0x026f }
            android.util.LongSparseArray r10 = r10.i     // Catch:{ all -> 0x026f }
            r10.removeAt(r0)     // Catch:{ all -> 0x026f }
            monitor-exit(r3)     // Catch:{ all -> 0x026f }
            goto L_0x0324
        L_0x02bc:
            i76 r0 = new i76     // Catch:{ all -> 0x026f }
            r2 = 5
            r4 = 0
            r0.<init>((java.lang.Object) r10, (java.lang.Object) r1, (boolean) r4, (int) r2)     // Catch:{ all -> 0x026f }
            java.util.ArrayList r2 = r10.j     // Catch:{ all -> 0x026f }
            r2.add(r0)     // Catch:{ all -> 0x026f }
            a4c r2 = r10.b     // Catch:{ all -> 0x026f }
            java.lang.String r4 = "OKSignaling"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x026f }
            r5.<init>(r11)     // Catch:{ all -> 0x026f }
            r5.append(r1)     // Catch:{ all -> 0x026f }
            java.lang.String r11 = r5.toString()     // Catch:{ all -> 0x026f }
            r2.log(r4, r11)     // Catch:{ all -> 0x026f }
            android.os.Handler r11 = r10.d     // Catch:{ all -> 0x026f }
            long r4 = r1.c     // Catch:{ all -> 0x026f }
            r11.postDelayed(r0, r4)     // Catch:{ all -> 0x026f }
            long r4 = r1.c     // Catch:{ all -> 0x026f }
            long r4 = r4 * r6
            r1.c = r4     // Catch:{ all -> 0x026f }
            int r10 = r10.m     // Catch:{ all -> 0x026f }
            long r10 = (long) r10     // Catch:{ all -> 0x026f }
            long r10 = java.lang.Math.min(r4, r10)     // Catch:{ all -> 0x026f }
            r1.c = r10     // Catch:{ all -> 0x026f }
        L_0x02f0:
            monitor-exit(r3)     // Catch:{ all -> 0x026f }
            goto L_0x0324
        L_0x02f2:
            monitor-exit(r3)     // Catch:{ all -> 0x026f }
            throw r10
        L_0x02f4:
            d4c r0 = r10.a
            e0e r1 = defpackage.e0e.app_event
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "rtc.cmd.error."
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.log((defpackage.e0e) r1, (java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r0 = "signaling.listener.response.error.seq"
            android.os.Handler r1 = r10.c
            ewc r2 = new ewc
            r3 = 3
            r2.<init>(r10, r11, r0, r3)
            r1.post(r2)
            goto L_0x0324
        L_0x0317:
            java.lang.String r0 = "listener.response.error"
            android.os.Handler r1 = r10.c
            ewc r2 = new ewc
            r3 = 3
            r2.<init>(r10, r11, r0, r3)
            r1.post(r2)
        L_0x0324:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rod.f(org.json.JSONObject):void");
    }

    public final void g() {
        this.g.b();
        synchronized (this.f) {
            try {
                Iterator it = this.j.iterator();
                while (it.hasNext()) {
                    this.d.removeCallbacks((Runnable) it.next());
                }
                this.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(ka6 ka6, qod qod) {
        d(ka6, false, qod, (qod) null);
    }

    public final void i(uod uod) {
        d(uod, false, (qod) null, (qod) null);
    }

    public final void j(JSONObject jSONObject, qod qod, qod qod2) {
        d(new ka6(jSONObject), false, qod, qod2);
    }
}
