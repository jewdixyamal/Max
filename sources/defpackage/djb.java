package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: djb  reason: default package */
public final class djb implements e15, a76, erd, ree {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ djb(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00de, code lost:
        defpackage.c54.p("Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording", r10.o());
        r4 = null;
        r6 = null;
        r5 = 0;
        r7 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0105, code lost:
        if (r10.n == null) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        r4 = null;
        r6 = null;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010a, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010f, code lost:
        if (r10.g0 != 3) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0111, code lost:
        r4 = r10.o;
        r10.o = null;
        r10.y();
        r6 = defpackage.adc.m0;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011c, code lost:
        r6 = null;
        r5 = 0;
        r7 = 0;
        r0 = r10.q(r10.k);
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        r4 = null;
        r6 = null;
        r11 = false;
        r5 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.a
            switch(r0) {
                case 2: goto L_0x0024;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x001c;
                case 6: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Void r11 = (java.lang.Void) r11
            java.lang.Object r10 = r10.b
            lq1 r10 = (defpackage.lq1) r10
            r11 = 0
            boolean r10 = r10.b(r11)
            defpackage.c54.p(r11, r10)
            return
        L_0x0014:
            java.lang.Object r10 = r10.b
            erd r10 = (defpackage.erd) r10
            r10.a(r11)
            return
        L_0x001c:
            java.lang.Object r10 = r10.b
            erd r10 = (defpackage.erd) r10
            r10.a(r11)
            return
        L_0x0024:
            n05 r11 = (defpackage.n05) r11
            java.util.Objects.toString(r11)
            if (r11 != 0) goto L_0x002d
            goto L_0x016c
        L_0x002d:
            java.lang.Object r11 = r10.c
            wj4 r11 = (defpackage.wj4) r11
            java.lang.Object r11 = r11.g
            adc r11 = (defpackage.adc) r11
            zm4 r11 = r11.a0
            java.lang.Object r0 = r10.b
            zm4 r0 = (defpackage.zm4) r0
            r1 = 0
            r2 = 1
            if (r11 != r0) goto L_0x0041
            r11 = r2
            goto L_0x0042
        L_0x0041:
            r11 = r1
        L_0x0042:
            r0 = 0
            defpackage.c54.p(r0, r11)
            java.lang.Object r11 = r10.c
            wj4 r11 = (defpackage.wj4) r11
            java.lang.Object r11 = r11.g
            adc r11 = (defpackage.adc) r11
            n05 r11 = r11.F
            if (r11 != 0) goto L_0x0054
            r11 = r2
            goto L_0x0055
        L_0x0054:
            r11 = r1
        L_0x0055:
            defpackage.c54.p(r0, r11)
            java.lang.Object r11 = r10.c
            wj4 r11 = (defpackage.wj4) r11
            java.lang.Object r11 = r11.g
            adc r11 = (defpackage.adc) r11
            java.lang.Object r3 = r10.b
            zm4 r3 = (defpackage.zm4) r3
            r11.getClass()
            java.lang.Object r4 = r3.f
            d15 r4 = (defpackage.d15) r4
            r11.F = r4
            u2 r4 = r4.g
            dff r4 = (defpackage.dff) r4
            r4.b1()
            n05 r4 = r11.F
            d15 r4 = (defpackage.d15) r4
            android.media.MediaFormat r4 = r4.d
            java.lang.String r5 = "bitrate"
            boolean r6 = r4.containsKey(r5)
            if (r6 == 0) goto L_0x0085
            r4.getInteger(r5)
        L_0x0085:
            int r4 = r3.b
            r5 = 4
            if (r4 == r5) goto L_0x008c
            r4 = r0
            goto L_0x0090
        L_0x008c:
            java.lang.Object r4 = r3.g
            android.view.Surface r4 = (android.view.Surface) r4
        L_0x0090:
            r11.B = r4
            r11.A(r4)
            q6d r4 = r11.e
            qcc r6 = new qcc
            r6.<init>(r11)
            r3.i = r4
            r3.j = r6
            java.lang.Object r6 = r3.m
            bm7 r6 = (defpackage.bm7) r6
            bm7 r6 = defpackage.kq0.w(r6)
            bdb r7 = new bdb
            r8 = 2
            r9 = 0
            r7.<init>(r11, r3, r9, r8)
            defpackage.kq0.a(r6, r7, r4)
            java.lang.Object r10 = r10.c
            wj4 r10 = (defpackage.wj4) r10
            java.lang.Object r10 = r10.g
            adc r10 = (defpackage.adc) r10
            java.lang.String r11 = "Incorrectly invoke onConfigured() in state "
            java.lang.Object r3 = r10.h
            monitor-enter(r3)
            zcc r4 = r10.k     // Catch:{ all -> 0x00d8 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x00d8 }
            switch(r4) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0102;
                case 2: goto L_0x0100;
                case 3: goto L_0x00ec;
                case 4: goto L_0x00dd;
                case 5: goto L_0x00db;
                case 6: goto L_0x00ca;
                case 7: goto L_0x00ec;
                default: goto L_0x00c8;
            }     // Catch:{ all -> 0x00d8 }
        L_0x00c8:
            goto L_0x012d
        L_0x00ca:
            boolean r11 = r10.i     // Catch:{ all -> 0x00d8 }
            if (r11 == 0) goto L_0x00d0
            goto L_0x012d
        L_0x00d0:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch:{ all -> 0x00d8 }
            java.lang.String r11 = "Unexpectedly invoke onConfigured() in a STOPPING state when it's not waiting for a new surface."
            r10.<init>(r11)     // Catch:{ all -> 0x00d8 }
            throw r10     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r10 = move-exception
            goto L_0x016d
        L_0x00db:
            r11 = r2
            goto L_0x00de
        L_0x00dd:
            r11 = r1
        L_0x00de:
            boolean r4 = r10.o()     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "Unexpectedly invoke onConfigured() when there's a non-persistent in-progress recording"
            defpackage.c54.p(r5, r4)     // Catch:{ all -> 0x00d8 }
            r4 = r0
            r6 = r4
            r5 = r1
            r7 = r2
            goto L_0x0132
        L_0x00ec:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00d8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r1.<init>(r11)     // Catch:{ all -> 0x00d8 }
            zcc r10 = r10.k     // Catch:{ all -> 0x00d8 }
            r1.append(r10)     // Catch:{ all -> 0x00d8 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x00d8 }
            r0.<init>(r10)     // Catch:{ all -> 0x00d8 }
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x0100:
            r11 = r2
            goto L_0x0103
        L_0x0102:
            r11 = r1
        L_0x0103:
            nb0 r4 = r10.n     // Catch:{ all -> 0x00d8 }
            if (r4 == 0) goto L_0x010c
            r4 = r0
            r6 = r4
            r5 = r1
        L_0x010a:
            r7 = r5
            goto L_0x0132
        L_0x010c:
            int r4 = r10.g0     // Catch:{ all -> 0x00d8 }
            r6 = 3
            if (r4 != r6) goto L_0x011c
            nb0 r4 = r10.o     // Catch:{ all -> 0x00d8 }
            r10.o = r0     // Catch:{ all -> 0x00d8 }
            r10.y()     // Catch:{ all -> 0x00d8 }
            java.lang.RuntimeException r6 = defpackage.adc.m0     // Catch:{ all -> 0x00d8 }
            r7 = r1
            goto L_0x0132
        L_0x011c:
            zcc r4 = r10.k     // Catch:{ all -> 0x00d8 }
            nb0 r4 = r10.q(r4)     // Catch:{ all -> 0x00d8 }
            r6 = r0
            r5 = r1
            r7 = r5
            r0 = r4
            r4 = r6
            goto L_0x0132
        L_0x0128:
            zcc r11 = defpackage.zcc.o     // Catch:{ all -> 0x00d8 }
            r10.B(r11)     // Catch:{ all -> 0x00d8 }
        L_0x012d:
            r4 = r0
            r6 = r4
            r11 = r1
            r5 = r11
            goto L_0x010a
        L_0x0132:
            monitor-exit(r3)     // Catch:{ all -> 0x00d8 }
            if (r7 == 0) goto L_0x0161
            nb0 r0 = r10.q
            r10.G(r0, r2)
            n05 r0 = r10.F
            d15 r0 = (defpackage.d15) r0
            r0.k()
            boolean r0 = r10.d0
            if (r0 == 0) goto L_0x0157
            nb0 r0 = r10.q
            hi5 r2 = r0.s0
            ob0 r3 = r10.k()
            ukf r4 = new ukf
            r4.<init>(r2, r3)
            r0.n(r4)
            r10.d0 = r1
        L_0x0157:
            if (r11 == 0) goto L_0x016c
            n05 r10 = r10.F
            d15 r10 = (defpackage.d15) r10
            r10.e()
            goto L_0x016c
        L_0x0161:
            if (r0 == 0) goto L_0x0167
            r10.E(r0, r11)
            goto L_0x016c
        L_0x0167:
            if (r4 == 0) goto L_0x016c
            r10.j(r4, r5, r6)
        L_0x016c:
            return
        L_0x016d:
            monitor-exit(r3)     // Catch:{ all -> 0x00d8 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djb.a(java.lang.Object):void");
    }

    public void b(dec dec, jt jtVar) {
        qpd qpd = (qpd) this.b;
        inf inf = (inf) qpd.get(dec);
        if (inf == null) {
            inf = inf.a();
            qpd.put(dec, inf);
        }
        inf.c = jtVar;
        inf.a |= 8;
    }

    public void c(zl4 zl4) {
        switch (this.a) {
            case 5:
                ((erd) this.b).c(zl4);
                return;
            default:
                ((erd) this.b).c(zl4);
                return;
        }
    }

    public void d(Throwable th) {
        nb0 nb0;
        switch (this.a) {
            case 2:
                Objects.toString(th);
                wj4 wj4 = (wj4) this.c;
                int i = wj4.c;
                if (i < wj4.a) {
                    wj4.c = i + 1;
                    u3c u3c = new u3c(5, this);
                    q6d q6d = ((adc) wj4.g).e;
                    wj4.f = ju0.D().schedule((Runnable) new do9(q6d, 27, u3c), adc.q0, TimeUnit.MILLISECONDS);
                    return;
                }
                adc adc = (adc) wj4.g;
                synchronized (adc.h) {
                    try {
                        nb0 = null;
                        switch (adc.k.ordinal()) {
                            case 0:
                                break;
                            case 1:
                            case 2:
                                nb0 nb02 = adc.o;
                                adc.o = null;
                                nb0 = nb02;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                throw new AssertionError("Encountered encoder setup error while in unexpected state " + adc.k + ": " + th);
                        }
                        if (adc.m != -1) {
                            adc.m = -1;
                            adc.a.v(new ub0(-1, adc.m(adc.k), adc.s));
                        }
                        adc.B(zcc.t0);
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                            break;
                        }
                    }
                }
                if (nb0 != null) {
                    adc.j(nb0, 7, th);
                    return;
                }
                return;
            default:
                if (th instanceof qee) {
                    c54.p((String) null, ((bm7) this.c).cancel(false));
                    return;
                } else {
                    c54.p((String) null, ((lq1) this.b).b((Object) null));
                    return;
                }
        }
    }

    public void e(long j, yaf yaf) {
        if (yaf.c() >= 9) {
            int h = yaf.h();
            int h2 = yaf.h();
            int v = yaf.v();
            if (h == 434 && h2 == 1195456820 && v == 3) {
                fp3.s(j, yaf, (xze[]) this.c);
            }
        }
    }

    public void f(oa5 oa5, l3f l3f) {
        int i = 0;
        while (true) {
            xze[] xzeArr = (xze[]) this.c;
            if (i < xzeArr.length) {
                l3f.a();
                l3f.b();
                xze B = oa5.B(l3f.e, 3);
                oy5 oy5 = (oy5) ((List) this.b).get(i);
                String str = oy5.w0;
                boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
                String valueOf = String.valueOf(str);
                np8.c(valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "), z);
                my5 my5 = new my5();
                l3f.b();
                my5.a = l3f.f;
                my5.k = str;
                my5.d = oy5.o;
                my5.c = oy5.c;
                my5.C = oy5.O0;
                my5.m = oy5.y0;
                B.d(new oy5(my5));
                xzeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void g(cc0 cc0) {
        ((sif) this.c).e();
        l76 l76 = (!((eu4) this.b).a() || !cc0.d) ? l76.b : l76.c;
        String str = ((sif) this.c).a;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, str, "onTransformationInfoUpdate, transformationInfo=" + cc0 + ", input format=" + l76, (Throwable) null);
        }
        fjf fjf = ((sif) this.c).u0;
        if (fjf != null) {
            o76.d((AtomicBoolean) fjf.c, true);
            o76.c((Thread) fjf.e);
            if (((l76) fjf.n) != l76) {
                fjf.n = l76;
                fjf.v(fjf.b);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public SharedPreferences h() {
        return ((Context) this.b).getSharedPreferences("tracer-" + ((String) this.c), 0);
    }

    public f15 i(int i) {
        HashMap hashMap = (HashMap) this.c;
        return (hashMap == null || !hashMap.containsKey(Integer.valueOf(i))) ? ((e15) this.b).n(i) : (f15) hashMap.get(Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            jo7 r0 = (defpackage.jo7) r0
            r0.getClass()
            java.lang.String r1 = "feedback"
            r2 = 0
            java.lang.String r3 = "eventType"
            java.lang.String r3 = r11.getString(r3)     // Catch:{ JSONException -> 0x0048 }
            int r3 = defpackage.h4f.x(r3)     // Catch:{ JSONException -> 0x0048 }
            int r3 = defpackage.au1.s(r3)     // Catch:{ JSONException -> 0x0048 }
            nz4 r4 = defpackage.nz4.a
            java.lang.String r5 = "removedParticipantIds"
            java.lang.String r6 = "addedParticipantIds"
            java.lang.String r7 = "totalCount"
            java.lang.Object r8 = r0.c
            lz1 r8 = (defpackage.lz1) r8
            if (r3 == 0) goto L_0x0071
            r9 = 1
            if (r3 == r9) goto L_0x0050
            r4 = 2
            if (r3 != r4) goto L_0x004a
            boolean r3 = r11.has(r1)     // Catch:{ JSONException -> 0x0048 }
            if (r3 == 0) goto L_0x009c
            np1 r3 = new np1     // Catch:{ JSONException -> 0x0048 }
            java.lang.Object r4 = r0.b     // Catch:{ JSONException -> 0x0048 }
            b46 r4 = (defpackage.b46) r4     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONObject r11 = r11.getJSONObject(r1)     // Catch:{ JSONException -> 0x0048 }
            r4.getClass()     // Catch:{ JSONException -> 0x0048 }
            z61 r11 = defpackage.b46.q(r11)     // Catch:{ JSONException -> 0x0048 }
            r3.<init>(r11)     // Catch:{ JSONException -> 0x0048 }
            r2 = r3
            goto L_0x009c
        L_0x0048:
            r11 = move-exception
            goto L_0x0091
        L_0x004a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException     // Catch:{ JSONException -> 0x0048 }
            r11.<init>()     // Catch:{ JSONException -> 0x0048 }
            throw r11     // Catch:{ JSONException -> 0x0048 }
        L_0x0050:
            int r1 = r11.getInt(r7)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONArray r3 = r11.optJSONArray(r6)     // Catch:{ JSONException -> 0x0048 }
            if (r3 == 0) goto L_0x005f
            java.util.ArrayList r3 = r8.a(r3)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x0060
        L_0x005f:
            r3 = r4
        L_0x0060:
            org.json.JSONArray r11 = r11.optJSONArray(r5)     // Catch:{ JSONException -> 0x0048 }
            if (r11 == 0) goto L_0x006a
            java.util.ArrayList r4 = r8.a(r11)     // Catch:{ JSONException -> 0x0048 }
        L_0x006a:
            op1 r11 = new op1     // Catch:{ JSONException -> 0x0048 }
            r11.<init>(r1, r3, r4)     // Catch:{ JSONException -> 0x0048 }
        L_0x006f:
            r2 = r11
            goto L_0x009c
        L_0x0071:
            int r1 = r11.optInt(r7)     // Catch:{ JSONException -> 0x0048 }
            org.json.JSONArray r3 = r11.optJSONArray(r6)     // Catch:{ JSONException -> 0x0048 }
            if (r3 == 0) goto L_0x0080
            java.util.ArrayList r3 = r8.a(r3)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x0081
        L_0x0080:
            r3 = r4
        L_0x0081:
            org.json.JSONArray r11 = r11.optJSONArray(r5)     // Catch:{ JSONException -> 0x0048 }
            if (r11 == 0) goto L_0x008b
            java.util.ArrayList r4 = r8.a(r11)     // Catch:{ JSONException -> 0x0048 }
        L_0x008b:
            mp1 r11 = new mp1     // Catch:{ JSONException -> 0x0048 }
            r11.<init>(r1, r3, r4)     // Catch:{ JSONException -> 0x0048 }
            goto L_0x006f
        L_0x0091:
            java.lang.Object r0 = r0.a
            a4c r0 = (defpackage.a4c) r0
            java.lang.String r1 = "WaitingRoomNotificationParser"
            java.lang.String r3 = "Can't parse chat room notification"
            r0.logException(r1, r3, r11)
        L_0x009c:
            if (r2 == 0) goto L_0x00bf
            boolean r11 = r2 instanceof defpackage.mp1
            java.lang.Object r10 = r10.c
            bq1 r10 = (defpackage.bq1) r10
            if (r11 == 0) goto L_0x00ac
            mp1 r2 = (defpackage.mp1) r2
            r10.onAttendee(r2)
            goto L_0x00bf
        L_0x00ac:
            boolean r11 = r2 instanceof defpackage.np1
            if (r11 == 0) goto L_0x00b6
            np1 r2 = (defpackage.np1) r2
            r10.onFeedback(r2)
            goto L_0x00bf
        L_0x00b6:
            boolean r11 = r2 instanceof defpackage.op1
            if (r11 == 0) goto L_0x00bf
            op1 r2 = (defpackage.op1) r2
            r10.onHandUp(r2)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djb.j(org.json.JSONObject):void");
    }

    public void k(JSONObject jSONObject) {
        pp1 pp1;
        jo7 jo7 = (jo7) this.b;
        jo7.getClass();
        try {
            pp1 = new pp1(!jSONObject.optBoolean("disprove", false));
        } catch (JSONException e) {
            ((a4c) jo7.a).logException("WaitingRoomNotificationParser", "Can't parse promotion approved", e);
            pp1 = null;
        }
        if (pp1 != null) {
            ((bq1) this.c).onPromotionUpdated(pp1);
        }
    }

    public jt l(dec dec, int i) {
        inf inf;
        jt jtVar;
        qpd qpd = (qpd) this.b;
        int d = qpd.d(dec);
        if (d >= 0 && (inf = (inf) qpd.i(d)) != null) {
            int i2 = inf.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                inf.a = i3;
                if (i == 4) {
                    jtVar = inf.b;
                } else if (i == 8) {
                    jtVar = inf.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    qpd.g(d);
                    inf.a = 0;
                    inf.b = null;
                    inf.c = null;
                    inf.d.e(inf);
                }
                return jtVar;
            }
        }
        return null;
    }

    public boolean m(int i) {
        return i(i) != null;
    }

    public f15 n(int i) {
        return i(i);
    }

    public void o(dec dec) {
        inf inf = (inf) ((qpd) this.b).get(dec);
        if (inf != null) {
            inf.a &= -2;
        }
    }

    public void onError(Throwable th) {
        Object obj;
        switch (this.a) {
            case 5:
                try {
                    ((rqd) this.c).c.accept(th);
                } catch (Throwable th2) {
                    c37.B(th2);
                    th = new CompositeException(th, th2);
                }
                ((erd) this.b).onError(th);
                return;
            default:
                frd frd = (frd) this.c;
                b66 b66 = frd.b;
                erd erd = (erd) this.b;
                if (b66 != null) {
                    try {
                        obj = b66.apply(th);
                    } catch (Throwable th3) {
                        c37.B(th3);
                        erd.onError(new CompositeException(th, th3));
                        return;
                    }
                } else {
                    obj = frd.c;
                }
                if (obj == null) {
                    NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                    nullPointerException.initCause(th);
                    erd.onError(nullPointerException);
                    return;
                }
                erd.a(obj);
                return;
        }
    }

    public void p(dec dec) {
        wv7 wv7 = (wv7) this.c;
        int h = wv7.h() - 1;
        while (true) {
            if (h < 0) {
                break;
            } else if (dec == wv7.i(h)) {
                Object[] objArr = wv7.c;
                Object obj = objArr[h];
                Object obj2 = c54.c;
                if (obj != obj2) {
                    objArr[h] = obj2;
                    wv7.a = true;
                }
            } else {
                h--;
            }
        }
        inf inf = (inf) ((qpd) this.b).remove(dec);
        if (inf != null) {
            inf.a = 0;
            inf.b = null;
            inf.c = null;
            inf.d.e(inf);
        }
    }

    public /* synthetic */ djb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public djb(IBinder iBinder) {
        this.a = 16;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.b = new Messenger(iBinder);
            this.c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.c = new sgg(iBinder);
            this.b = null;
        } else {
            "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
            throw new RemoteException();
        }
    }

    public djb(int i) {
        this.a = i;
        switch (i) {
            case 7:
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                this.b = new qpd();
                this.c = new wv7();
                return;
            default:
                this.b = new tt3(cpc.g, (jqe) new eqe(dpc.i), Integer.valueOf(gpc.f), (Integer) null, 20);
                this.c = new tt3(cpc.c, (jqe) new eqe(dpc.f), Integer.valueOf(gpc.u), (Integer) null, 20);
                return;
        }
    }

    public djb(List list) {
        this.a = 10;
        this.b = list;
        this.c = new xze[list.size()];
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r3v3, types: [dff] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public djb(defpackage.yw1 r6, defpackage.e15 r7, defpackage.bj6 r8) {
        /*
            r5 = this;
            r0 = 1
            r5.a = r0
            r5.<init>()
            r5.b = r7
            java.lang.Class<androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk> r0 = androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk.class
            java.util.ArrayList r8 = r8.f(r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00e1
            int r0 = r8.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x001e
            r0 = r2
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            r3 = 0
            defpackage.c54.p(r3, r0)
            java.lang.Object r8 = r8.get(r1)
            androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk r8 = (androidx.camera.video.internal.compat.quirk.ExtraSupportedQualityQuirk) r8
            r8.getClass()
            java.lang.String r8 = "motorola"
            java.lang.String r0 = android.os.Build.BRAND
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x00d4
            java.lang.String r8 = "moto c"
            java.lang.String r0 = android.os.Build.MODEL
            boolean r8 = r8.equalsIgnoreCase(r0)
            if (r8 == 0) goto L_0x00d4
            java.lang.String r8 = "1"
            java.lang.String r6 = r6.d()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00d8
            r6 = 4
            boolean r8 = r7.m(r6)
            if (r8 == 0) goto L_0x0055
            goto L_0x00d8
        L_0x0055:
            f15 r7 = r7.n(r2)
            if (r7 == 0) goto L_0x0070
            java.util.List r8 = r7.d()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0070
            java.util.List r8 = r7.d()
            java.lang.Object r8 = r8.get(r1)
            ha0 r8 = (defpackage.ha0) r8
            goto L_0x0071
        L_0x0070:
            r8 = r3
        L_0x0071:
            if (r8 != 0) goto L_0x0074
            goto L_0x00d8
        L_0x0074:
            ic0 r0 = defpackage.eef.d(r8)
            eff r0 = defpackage.eff.Z1(r0)     // Catch:{ InvalidConfigException -> 0x0080 }
            dff r3 = defpackage.fff.a(r0, r3)     // Catch:{ InvalidConfigException -> 0x0080 }
        L_0x0080:
            if (r3 == 0) goto L_0x0087
            android.util.Range r0 = r3.b1()
            goto L_0x0089
        L_0x0087:
            android.util.Range r0 = defpackage.mc0.f
        L_0x0089:
            android.util.Size r1 = defpackage.msd.d
            ha0 r0 = defpackage.a14.p(r8, r1, r0)
            int r3 = r7.a()
            int r4 = r7.b()
            java.util.List r7 = r7.c()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            ga0 r7 = defpackage.ga0.e(r3, r4, r7, r0)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.put(r6, r7)
            android.util.Size r6 = new android.util.Size
            int r0 = r8.e
            int r8 = r8.f
            r6.<init>(r0, r8)
            int r8 = r1.getWidth()
            int r0 = r1.getHeight()
            int r0 = r0 * r8
            int r8 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r8
            if (r0 <= r6) goto L_0x00d8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r3.put(r6, r7)
            goto L_0x00d8
        L_0x00d4:
            java.util.Map r3 = java.util.Collections.emptyMap()
        L_0x00d8:
            if (r3 == 0) goto L_0x00e1
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r3)
            r5.c = r6
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djb.<init>(yw1, e15, bj6):void");
    }
}
