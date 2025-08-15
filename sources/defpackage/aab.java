package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;

/* renamed from: aab  reason: default package */
public final class aab implements erd, b66, f1d, y2a, fu3 {
    public Object a;
    public Object b;

    public /* synthetic */ aab(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bkb e(org.webrtc.RTCStats r7, org.webrtc.RTCStatsReport r8) {
        /*
            r0 = -1
            bc7[] r1 = defpackage.e4c.a
            java.util.Map r8 = r8.getStatsMap()
            java.util.Map r1 = r7.getMembers()
            java.lang.String r2 = "codecId"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Object r8 = r8.get(r1)
            org.webrtc.RTCStats r8 = (org.webrtc.RTCStats) r8
            r1 = 1
            java.lang.String r2 = ""
            if (r8 == 0) goto L_0x0041
            m82 r3 = defpackage.e4c.b
            bc7[] r4 = defpackage.e4c.a
            r5 = 0
            r4 = r4[r5]
            java.lang.Object r3 = r3.T0(r8, r4)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0041
            int r4 = defpackage.w9e.v0(r3)
        L_0x002f:
            if (r0 >= r4) goto L_0x0042
            char r5 = r3.charAt(r4)
            r6 = 47
            if (r5 == r6) goto L_0x003b
            int r4 = r4 + r0
            goto L_0x002f
        L_0x003b:
            int r4 = r4 + r1
            java.lang.String r3 = r3.substring(r4)
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            m82 r0 = defpackage.e4c.d
            bc7[] r4 = defpackage.e4c.a
            r5 = 2
            r5 = r4[r5]
            java.lang.Object r0 = r0.T0(r7, r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x005f
            m82 r0 = defpackage.e4c.c
            r1 = r4[r1]
            java.lang.Object r7 = r0.T0(r7, r1)
            r0 = r7
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x005f
            r0 = r2
        L_0x005f:
            if (r8 == 0) goto L_0x0070
            m82 r7 = defpackage.e4c.e
            r1 = 3
            r1 = r4[r1]
            java.lang.Object r7 = r7.T0(r8, r1)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r7
        L_0x0070:
            if (r8 == 0) goto L_0x007d
            m82 r7 = defpackage.e4c.f
            r1 = 4
            r1 = r4[r1]
            java.lang.Object r7 = r7.T0(r8, r1)
            java.lang.Long r7 = (java.lang.Long) r7
        L_0x007d:
            bkb r7 = new bkb
            r7.<init>(r3, r0, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.e(org.webrtc.RTCStats, org.webrtc.RTCStatsReport):bkb");
    }

    public static gpd f(JSONObject jSONObject) {
        bg1 a2 = bg1.a(jSONObject.getString("initiator"));
        long j = jSONObject.getLong("recordMovieId");
        String string = jSONObject.getString("recordType");
        return new gpd(j, string.equals("STREAM") ? pcc.c : string.equals("RECORD") ? pcc.b : pcc.a, a2, jSONObject.optLong("recordStartTime", System.currentTimeMillis()), f8.t(jSONObject, "recordExternalMovieId"), f8.t(jSONObject, "recordExternalOwnerId"));
    }

    public static z9b k() {
        String str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            try {
                StringBuilder sb = new StringBuilder();
                for (String readLine = randomAccessFile.readLine(); readLine != null; readLine = randomAccessFile.readLine()) {
                    sb.append(readLine);
                }
                str = sb.toString();
                v3c.i(randomAccessFile, (Throwable) null);
            } catch (Throwable th) {
                v3c.i(randomAccessFile, th);
                throw th;
            }
        } catch (IOException unused) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        List Q0 = w9e.Q0(str, new String[]{" "}, false, 6);
        if (Q0.size() <= 22) {
            return null;
        }
        try {
            return new z9b(Long.parseLong((String) Q0.get(13)), Long.parseLong((String) Q0.get(14)), Long.parseLong((String) Q0.get(15)), Long.parseLong((String) Q0.get(16)), Long.parseLong((String) Q0.get(21)));
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public x6g P(View view, x6g x6g) {
        boolean z;
        int i;
        w3 w3Var = (w3) this.b;
        int i2 = w3Var.a;
        ar0 ar0 = (ar0) this.a;
        ar0.getClass();
        v6g v6g = x6g.a;
        v27 f = v6g.f(7);
        v27 f2 = v6g.f(32);
        int i3 = f.b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ar0.b;
        bottomSheetBehavior.w = i3;
        boolean t = mqd.t(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z2 = bottomSheetBehavior.o;
        if (z2) {
            int a2 = x6g.a();
            bottomSheetBehavior.v = a2;
            paddingBottom = a2 + w3Var.c;
        }
        int i4 = w3Var.b;
        boolean z3 = bottomSheetBehavior.p;
        int i5 = f.a;
        if (z3) {
            paddingLeft = (t ? i4 : i2) + i5;
        }
        boolean z4 = bottomSheetBehavior.q;
        int i6 = f.c;
        if (z4) {
            if (!t) {
                i2 = i4;
            }
            paddingRight = i2 + i6;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z5 = true;
        if (!bottomSheetBehavior.s || marginLayoutParams.leftMargin == i5) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.t && marginLayoutParams.rightMargin != i6) {
            marginLayoutParams.rightMargin = i6;
            z = true;
        }
        if (!bottomSheetBehavior.u || marginLayoutParams.topMargin == (i = f.b)) {
            z5 = z;
        } else {
            marginLayoutParams.topMargin = i;
        }
        if (z5) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z6 = ar0.a;
        if (z6) {
            bottomSheetBehavior.m = f2.d;
        }
        if (z2 || z6) {
            bottomSheetBehavior.R();
        }
        return x6g;
    }

    public void a(Object obj) {
        ((erd) this.b).a(obj);
    }

    public Object apply(Object obj) {
        return qi8.m((qi8) this.a, (fk2) obj, (String) this.b);
    }

    public void b(tue tue, pa5 pa5, l3f l3f) {
    }

    public void c(zl4 zl4) {
        dm4.c((AtomicReference) this.a, zl4);
    }

    public void d(wpa wpa) {
        i3f i3f;
        if (wpa.u() == 0 && (wpa.u() & 128) != 0) {
            wpa.H(6);
            int a2 = wpa.a() / 4;
            int i = 0;
            while (true) {
                i3f = (i3f) this.b;
                if (i >= a2) {
                    break;
                }
                s02 s02 = (s02) this.a;
                wpa.e(0, s02.b, 4);
                s02.q(0);
                int i2 = s02.i(16);
                s02.t(3);
                if (i2 == 0) {
                    s02.t(13);
                } else {
                    int i3 = s02.i(13);
                    if (i3f.s0.get(i3) == null) {
                        i3f.s0.put(i3, new h1d(new l0f(i3f, i3)));
                        i3f.y0++;
                    }
                }
                i++;
            }
            if (i3f.a != 2) {
                i3f.s0.remove(0);
            }
        }
    }

    public synchronized void g(ip7 ip7) {
        ((Executor) this.a).execute(ip7);
    }

    public void h() {
        int[] iArr = (int[]) this.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.b = null;
    }

    public void i(pa5 pa5, l3f l3f) {
        int i = 0;
        while (true) {
            yze[] yzeArr = (yze[]) this.b;
            if (i < yzeArr.length) {
                l3f.a();
                l3f.b();
                yze B = pa5.B(l3f.e, 3);
                qy5 qy5 = (qy5) ((List) this.a).get(i);
                String str = qy5.n;
                fm9.e("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                String str2 = qy5.a;
                if (str2 == null) {
                    l3f.b();
                    str2 = l3f.f;
                }
                ny5 ny5 = new ny5();
                ny5.a = str2;
                ny5.m = ia9.l(str);
                ny5.e = qy5.e;
                ny5.d = qy5.d;
                ny5.F = qy5.G;
                ny5.p = qy5.q;
                B.e(new qy5(ny5));
                yzeArr[i] = B;
                i++;
            } else {
                return;
            }
        }
    }

    public void j(int i) {
        int[] iArr = (int[]) this.a;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.a;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int l(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.a
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r0.length
            if (r6 < r0) goto L_0x000c
            return r1
        L_0x000c:
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0014
        L_0x0012:
            r0 = r1
            goto L_0x006f
        L_0x0014:
            r2 = 0
            if (r0 != 0) goto L_0x0018
            goto L_0x0033
        L_0x0018:
            int r0 = r0.size()
            int r0 = r0 + -1
        L_0x001e:
            if (r0 < 0) goto L_0x0033
            java.lang.Object r3 = r5.b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            oxd r3 = (defpackage.oxd) r3
            int r4 = r3.a
            if (r4 != r6) goto L_0x0030
            r2 = r3
            goto L_0x0033
        L_0x0030:
            int r0 = r0 + -1
            goto L_0x001e
        L_0x0033:
            if (r2 == 0) goto L_0x003c
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L_0x003c:
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L_0x0045:
            if (r2 >= r0) goto L_0x0059
            java.lang.Object r3 = r5.b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            oxd r3 = (defpackage.oxd) r3
            int r3 = r3.a
            if (r3 < r6) goto L_0x0056
            goto L_0x005a
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0059:
            r2 = r1
        L_0x005a:
            if (r2 == r1) goto L_0x0012
            java.lang.Object r0 = r5.b
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            oxd r0 = (defpackage.oxd) r0
            java.lang.Object r3 = r5.b
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.a
        L_0x006f:
            if (r0 != r1) goto L_0x007f
            java.lang.Object r0 = r5.a
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r5 = r5.a
            int[] r5 = (int[]) r5
            int r5 = r5.length
            return r5
        L_0x007f:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.a
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r5 = r5.a
            int[] r5 = (int[]) r5
            java.util.Arrays.fill(r5, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.l(int):int");
    }

    public void m(int i, int i2) {
        int[] iArr = (int[]) this.a;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            j(i3);
            int[] iArr2 = (int[]) this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.a, i, i3, -1);
            List list = (List) this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    oxd oxd = (oxd) ((List) this.b).get(size);
                    int i4 = oxd.a;
                    if (i4 >= i) {
                        oxd.a = i4 + i2;
                    }
                }
            }
        }
    }

    public void n(int i, int i2) {
        int[] iArr = (int[]) this.a;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            j(i3);
            int[] iArr2 = (int[]) this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    oxd oxd = (oxd) ((List) this.b).get(size);
                    int i4 = oxd.a;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.b).remove(size);
                        } else {
                            oxd.a = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void o(defpackage.ip7 r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.b     // Catch:{ all -> 0x000c }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x000c }
            r0.remove(r2)     // Catch:{ all -> 0x000c }
            monitor-exit(r1)
            return
        L_0x000a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        L_0x000c:
            r2 = move-exception
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.o(ip7):void");
    }

    public void onError(Throwable th) {
        ((erd) this.b).onError(th);
    }

    /* JADX WARNING: type inference failed for: r14v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v11 */
    /* JADX WARNING: type inference failed for: r14v26 */
    /* JADX WARNING: type inference failed for: r29v5, types: [ixd] */
    /* JADX WARNING: type inference failed for: r27v9, types: [gxd] */
    /* JADX WARNING: type inference failed for: r29v6, types: [hxd] */
    /* JADX WARNING: type inference failed for: r14v38 */
    /* JADX WARNING: type inference failed for: r22v9, types: [dxd] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0752  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0847  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x0667 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.c4c p(defpackage.n1e r63) {
        /*
            r62 = this;
            r0 = r62
            c4c r7 = new c4c
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            r2 = r63
            org.webrtc.RTCStatsReport r2 = r2.a
            double r3 = r2.getTimestampUs()
            long r3 = (long) r3
            long r3 = r1.toMillis(r3)
            nz4 r5 = defpackage.nz4.a
            java.util.Map r1 = r2.getStatsMap()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r9 = -1
            r10 = -1
        L_0x0028:
            boolean r11 = r1.hasNext()
            if (r11 == 0) goto L_0x061a
            java.lang.Object r11 = r1.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            org.webrtc.RTCStats r11 = (org.webrtc.RTCStats) r11
            java.lang.String r14 = r11.getType()
            java.lang.String r15 = "inbound-rtp"
            boolean r14 = defpackage.tpa.f(r14, r15)
            java.lang.String r8 = "jitter"
            java.lang.String r12 = "bytesReceived"
            java.lang.String r13 = "packetsDiscarded"
            r16 = r1
            java.lang.String r1 = "packetsReceived"
            r17 = r5
            java.lang.String r5 = "audio"
            r18 = 0
            r20 = 0
            if (r14 == 0) goto L_0x01a4
            java.lang.String r14 = defpackage.e4c.e(r11)
            boolean r14 = defpackage.tpa.f(r14, r5)
            if (r14 == 0) goto L_0x01a4
            java.lang.Long r5 = defpackage.e4c.g(r11)
            if (r5 == 0) goto L_0x0072
            long r23 = r5.longValue()
            java.lang.String r25 = defpackage.e4c.i(r11)
            if (r25 != 0) goto L_0x007e
        L_0x0072:
            r22 = r3
            r26 = r6
            r24 = r7
            r25 = r9
        L_0x007a:
            r18 = r10
            goto L_0x05ba
        L_0x007e:
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L_0x008f
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r26 = r1
            goto L_0x0091
        L_0x008f:
            r26 = 0
        L_0x0091:
            java.math.BigInteger r27 = defpackage.e4c.f(r11)
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r13)
            if (r1 == 0) goto L_0x00a2
            defpackage.e4c.a(r1)
        L_0x00a2:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L_0x00b3
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r28 = r1
            goto L_0x00b5
        L_0x00b3:
            r28 = 0
        L_0x00b5:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x00c4
            java.lang.Double r1 = defpackage.e4c.b(r1)
            goto L_0x00c5
        L_0x00c4:
            r1 = 0
        L_0x00c5:
            if (r1 == 0) goto L_0x00cb
            double r18 = r1.doubleValue()
        L_0x00cb:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r12 = 1
            long r12 = r1.toMillis(r12)
            double r12 = (double) r12
            double r12 = r12 * r18
            long r12 = (long) r12
            java.lang.String r33 = defpackage.e4c.h(r11)
            if (r33 != 0) goto L_0x00de
            goto L_0x0072
        L_0x00de:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "totalSamplesReceived"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x00ef
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            if (r1 == 0) goto L_0x00f9
            long r14 = r1.longValue()
            r34 = r14
            goto L_0x00fb
        L_0x00f9:
            r34 = r20
        L_0x00fb:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "insertedSamplesForDeceleration"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x010c
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r1 == 0) goto L_0x0116
            long r14 = r1.longValue()
            r36 = r14
            goto L_0x0118
        L_0x0116:
            r36 = r20
        L_0x0118:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "removedSamplesForAcceleration"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0129
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x012a
        L_0x0129:
            r1 = 0
        L_0x012a:
            if (r1 == 0) goto L_0x0133
            long r14 = r1.longValue()
            r38 = r14
            goto L_0x0135
        L_0x0133:
            r38 = r20
        L_0x0135:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "concealedSamples"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0146
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            if (r1 == 0) goto L_0x0150
            long r14 = r1.longValue()
            r40 = r14
            goto L_0x0152
        L_0x0150:
            r40 = r20
        L_0x0152:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "silentConcealedSamples"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0163
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x0164
        L_0x0163:
            r1 = 0
        L_0x0164:
            if (r1 == 0) goto L_0x016d
            long r14 = r1.longValue()
            r42 = r14
            goto L_0x016f
        L_0x016d:
            r42 = r20
        L_0x016f:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r5 = "concealmentEvents"
            java.lang.Object r1 = r1.get(r5)
            if (r1 == 0) goto L_0x0180
            java.lang.Long r14 = defpackage.e4c.c(r1)
            goto L_0x0181
        L_0x0180:
            r14 = 0
        L_0x0181:
            if (r14 == 0) goto L_0x0187
            long r20 = r14.longValue()
        L_0x0187:
            r44 = r20
            bkb r46 = e(r11, r2)
            dxd r14 = new dxd
            r22 = r14
            r29 = -1
            r31 = r12
            r22.<init>(r23, r25, r26, r27, r28, r29, r31, r33, r34, r36, r38, r40, r42, r44, r46)
            r22 = r3
            r26 = r6
            r24 = r7
            r25 = r9
        L_0x01a0:
            r18 = r10
            goto L_0x05bb
        L_0x01a4:
            java.lang.String r14 = r11.getType()
            boolean r14 = defpackage.tpa.f(r14, r15)
            java.lang.String r15 = "frameHeight"
            r22 = r3
            java.lang.String r3 = "frameWidth"
            java.lang.String r4 = "firCount"
            r24 = r7
            java.lang.String r7 = "pliCount"
            r25 = r9
            java.lang.String r9 = "nackCount"
            r26 = r6
            java.lang.String r6 = "video"
            r27 = -1
            if (r14 == 0) goto L_0x0396
            java.lang.String r14 = defpackage.e4c.e(r11)
            boolean r14 = defpackage.tpa.f(r14, r6)
            if (r14 == 0) goto L_0x0396
            java.lang.Long r5 = defpackage.e4c.g(r11)
            if (r5 == 0) goto L_0x007a
            long r30 = r5.longValue()
            java.lang.String r32 = defpackage.e4c.i(r11)
            if (r32 != 0) goto L_0x01e0
        L_0x01de:
            goto L_0x007a
        L_0x01e0:
            java.util.Map r5 = r11.getMembers()
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L_0x01f1
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r33 = r1
            goto L_0x01f3
        L_0x01f1:
            r33 = 0
        L_0x01f3:
            java.math.BigInteger r34 = defpackage.e4c.f(r11)
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r13)
            if (r1 == 0) goto L_0x0204
            defpackage.e4c.a(r1)
        L_0x0204:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L_0x0215
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r35 = r1
            goto L_0x0217
        L_0x0215:
            r35 = 0
        L_0x0217:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x0226
            java.lang.Double r1 = defpackage.e4c.b(r1)
            goto L_0x0227
        L_0x0226:
            r1 = 0
        L_0x0227:
            if (r1 == 0) goto L_0x022e
            double r5 = r1.doubleValue()
            goto L_0x0230
        L_0x022e:
            r5 = r18
        L_0x0230:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            r8 = r15
            r12 = 1
            long r14 = r1.toMillis(r12)
            double r12 = (double) r14
            double r5 = r5 * r12
            long r5 = (long) r5
            java.util.Map r12 = r11.getMembers()
            java.lang.Object r9 = r12.get(r9)
            if (r9 == 0) goto L_0x024b
            java.lang.Long r9 = defpackage.e4c.c(r9)
            goto L_0x024c
        L_0x024b:
            r9 = 0
        L_0x024c:
            if (r9 == 0) goto L_0x0255
            long r12 = r9.longValue()
            r38 = r12
            goto L_0x0257
        L_0x0255:
            r38 = r20
        L_0x0257:
            java.util.Map r9 = r11.getMembers()
            java.lang.Object r7 = r9.get(r7)
            if (r7 == 0) goto L_0x0266
            java.lang.Long r7 = defpackage.e4c.c(r7)
            goto L_0x0267
        L_0x0266:
            r7 = 0
        L_0x0267:
            if (r7 == 0) goto L_0x0270
            long r12 = r7.longValue()
            r40 = r12
            goto L_0x0272
        L_0x0270:
            r40 = r20
        L_0x0272:
            java.util.Map r7 = r11.getMembers()
            java.lang.Object r4 = r7.get(r4)
            if (r4 == 0) goto L_0x0281
            java.lang.Long r4 = defpackage.e4c.c(r4)
            goto L_0x0282
        L_0x0281:
            r4 = 0
        L_0x0282:
            if (r4 == 0) goto L_0x028b
            long r12 = r4.longValue()
            r42 = r12
            goto L_0x028d
        L_0x028b:
            r42 = r20
        L_0x028d:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r7 = "framesDecoded"
            java.lang.Object r4 = r4.get(r7)
            if (r4 == 0) goto L_0x029e
            java.lang.Long r4 = defpackage.e4c.c(r4)
            goto L_0x029f
        L_0x029e:
            r4 = 0
        L_0x029f:
            if (r4 == 0) goto L_0x02a8
            long r12 = r4.longValue()
            r44 = r12
            goto L_0x02aa
        L_0x02a8:
            r44 = r20
        L_0x02aa:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r7 = "framesReceived"
            java.lang.Object r4 = r4.get(r7)
            if (r4 == 0) goto L_0x02bb
            java.lang.Long r4 = defpackage.e4c.c(r4)
            goto L_0x02bc
        L_0x02bb:
            r4 = 0
        L_0x02bc:
            if (r4 == 0) goto L_0x02c5
            long r12 = r4.longValue()
            r46 = r12
            goto L_0x02c7
        L_0x02c5:
            r46 = r20
        L_0x02c7:
            java.util.Map r4 = r11.getMembers()
            java.lang.String r7 = "framesDropped"
            java.lang.Object r4 = r4.get(r7)
            if (r4 == 0) goto L_0x02d8
            java.lang.Long r4 = defpackage.e4c.c(r4)
            goto L_0x02d9
        L_0x02d8:
            r4 = 0
        L_0x02d9:
            if (r4 == 0) goto L_0x02e2
            long r12 = r4.longValue()
            r53 = r12
            goto L_0x02e4
        L_0x02e2:
            r53 = r20
        L_0x02e4:
            java.util.Map r4 = r11.getMembers()
            java.lang.Object r3 = r4.get(r3)
            if (r3 == 0) goto L_0x02f3
            java.lang.Long r3 = defpackage.e4c.c(r3)
            goto L_0x02f4
        L_0x02f3:
            r3 = 0
        L_0x02f4:
            if (r3 == 0) goto L_0x02fd
            long r3 = r3.longValue()
            r50 = r3
            goto L_0x02ff
        L_0x02fd:
            r50 = r27
        L_0x02ff:
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r8)
            if (r3 == 0) goto L_0x030e
            java.lang.Long r3 = defpackage.e4c.c(r3)
            goto L_0x030f
        L_0x030e:
            r3 = 0
        L_0x030f:
            if (r3 == 0) goto L_0x0315
            long r27 = r3.longValue()
        L_0x0315:
            r48 = r27
            java.lang.String r52 = defpackage.e4c.h(r11)
            if (r52 != 0) goto L_0x031f
            goto L_0x01de
        L_0x031f:
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalSquaredInterFrameDelay"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0332
            java.lang.Double r3 = defpackage.e4c.b(r3)
            r55 = r3
            goto L_0x0334
        L_0x0332:
            r55 = 0
        L_0x0334:
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalInterFrameDelay"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0347
            java.lang.Double r3 = defpackage.e4c.b(r3)
            r56 = r3
            goto L_0x0349
        L_0x0347:
            r56 = 0
        L_0x0349:
            bkb r57 = e(r11, r2)
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "freezeCount"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x035e
            java.lang.Long r3 = defpackage.e4c.c(r3)
            goto L_0x035f
        L_0x035e:
            r3 = 0
        L_0x035f:
            if (r3 == 0) goto L_0x0365
            long r20 = r3.longValue()
        L_0x0365:
            r58 = r20
            java.util.Map r3 = r11.getMembers()
            java.lang.String r4 = "totalFreezesDuration"
            java.lang.Object r3 = r3.get(r4)
            if (r3 == 0) goto L_0x0378
            java.lang.Double r14 = defpackage.e4c.b(r3)
            goto L_0x0379
        L_0x0378:
            r14 = 0
        L_0x0379:
            if (r14 == 0) goto L_0x037f
            double r18 = r14.doubleValue()
        L_0x037f:
            r3 = 1
            long r3 = r1.toMillis(r3)
            double r3 = (double) r3
            double r3 = r3 * r18
            long r3 = (long) r3
            r60 = r3
            hxd r14 = new hxd
            r29 = r14
            r36 = r5
            r29.<init>(r30, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r55, r56, r57, r58, r60)
            goto L_0x01a0
        L_0x0396:
            r8 = r15
            java.lang.String r1 = r11.getType()
            java.lang.String r12 = "outbound-rtp"
            boolean r1 = defpackage.tpa.f(r1, r12)
            java.lang.String r13 = "mediaSourceId"
            java.lang.String r14 = "remoteId"
            java.lang.String r15 = "bytesSent"
            r18 = r10
            java.lang.String r10 = "packetsSent"
            if (r1 == 0) goto L_0x0460
            java.lang.String r1 = defpackage.e4c.e(r11)
            boolean r1 = defpackage.tpa.f(r1, r5)
            if (r1 == 0) goto L_0x0460
            java.lang.Long r1 = defpackage.e4c.g(r11)
            if (r1 == 0) goto L_0x05ba
            long r29 = r1.longValue()
            java.lang.String r31 = defpackage.e4c.i(r11)
            if (r31 != 0) goto L_0x03c9
            goto L_0x05ba
        L_0x03c9:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L_0x03da
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r32 = r1
            goto L_0x03dc
        L_0x03da:
            r32 = 0
        L_0x03dc:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r15)
            if (r1 == 0) goto L_0x03ed
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r34 = r1
            goto L_0x03ef
        L_0x03ed:
            r34 = 0
        L_0x03ef:
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r14)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 == 0) goto L_0x040a
            java.math.BigInteger r1 = defpackage.e4c.f(r1)
            r33 = r1
            goto L_0x040c
        L_0x040a:
            r33 = 0
        L_0x040c:
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r13)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 != 0) goto L_0x0422
            goto L_0x05ba
        L_0x0422:
            java.lang.String r1 = defpackage.e4c.h(r1)
            if (r1 != 0) goto L_0x042a
            goto L_0x05ba
        L_0x042a:
            bkb r36 = e(r11, r2)
            java.lang.Object r3 = r0.b
            iq7 r3 = (defpackage.iq7) r3
            if (r3 == 0) goto L_0x0451
            kq7 r3 = r3.a
            java.lang.String r4 = r3.k
            boolean r4 = r1.equals(r4)
            java.lang.String r3 = r3.l
            boolean r3 = r1.equals(r3)
            if (r4 != 0) goto L_0x0449
            if (r3 == 0) goto L_0x0447
            goto L_0x0449
        L_0x0447:
            r12 = 0
            goto L_0x044a
        L_0x0449:
            r12 = 1
        L_0x044a:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            r37 = r14
            goto L_0x0453
        L_0x0451:
            r37 = 0
        L_0x0453:
            exd r14 = new exd
            r28 = 1
            r27 = r14
            r35 = r1
            r27.<init>(r28, r29, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x05bb
        L_0x0460:
            java.lang.String r1 = r11.getType()
            boolean r1 = defpackage.tpa.f(r1, r12)
            if (r1 == 0) goto L_0x05ba
            java.lang.String r1 = defpackage.e4c.e(r11)
            boolean r1 = defpackage.tpa.f(r1, r6)
            if (r1 == 0) goto L_0x05ba
            java.lang.Long r1 = defpackage.e4c.g(r11)
            if (r1 == 0) goto L_0x05ba
            long r30 = r1.longValue()
            java.lang.String r32 = defpackage.e4c.i(r11)
            if (r32 != 0) goto L_0x0486
            goto L_0x05ba
        L_0x0486:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L_0x0497
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r33 = r1
            goto L_0x0499
        L_0x0497:
            r33 = 0
        L_0x0499:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r15)
            if (r1 == 0) goto L_0x04aa
            java.math.BigInteger r1 = defpackage.e4c.a(r1)
            r35 = r1
            goto L_0x04ac
        L_0x04aa:
            r35 = 0
        L_0x04ac:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r9)
            if (r1 == 0) goto L_0x04bb
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x04bc
        L_0x04bb:
            r1 = 0
        L_0x04bc:
            if (r1 == 0) goto L_0x04c5
            long r5 = r1.longValue()
            r36 = r5
            goto L_0x04c7
        L_0x04c5:
            r36 = r20
        L_0x04c7:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r7)
            if (r1 == 0) goto L_0x04d6
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x04d7
        L_0x04d6:
            r1 = 0
        L_0x04d7:
            if (r1 == 0) goto L_0x04e0
            long r5 = r1.longValue()
            r38 = r5
            goto L_0x04e2
        L_0x04e0:
            r38 = r20
        L_0x04e2:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x04f1
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x04f2
        L_0x04f1:
            r1 = 0
        L_0x04f2:
            if (r1 == 0) goto L_0x04fb
            long r4 = r1.longValue()
            r40 = r4
            goto L_0x04fd
        L_0x04fb:
            r40 = r20
        L_0x04fd:
            java.util.Map r1 = r11.getMembers()
            java.lang.String r4 = "framesEncoded"
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x050e
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x050f
        L_0x050e:
            r1 = 0
        L_0x050f:
            if (r1 == 0) goto L_0x0515
            long r20 = r1.longValue()
        L_0x0515:
            r42 = r20
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r8)
            if (r1 == 0) goto L_0x0526
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x0527
        L_0x0526:
            r1 = 0
        L_0x0527:
            if (r1 == 0) goto L_0x0530
            long r4 = r1.longValue()
            r50 = r4
            goto L_0x0532
        L_0x0530:
            r50 = r27
        L_0x0532:
            java.util.Map r1 = r11.getMembers()
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0541
            java.lang.Long r1 = defpackage.e4c.c(r1)
            goto L_0x0542
        L_0x0541:
            r1 = 0
        L_0x0542:
            if (r1 == 0) goto L_0x0548
            long r27 = r1.longValue()
        L_0x0548:
            r48 = r27
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r14)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 == 0) goto L_0x0565
            java.math.BigInteger r1 = defpackage.e4c.f(r1)
            r34 = r1
            goto L_0x0567
        L_0x0565:
            r34 = 0
        L_0x0567:
            java.util.Map r1 = r2.getStatsMap()
            java.util.Map r3 = r11.getMembers()
            java.lang.Object r3 = r3.get(r13)
            java.lang.Object r1 = r1.get(r3)
            org.webrtc.RTCStats r1 = (org.webrtc.RTCStats) r1
            if (r1 != 0) goto L_0x057c
            goto L_0x05ba
        L_0x057c:
            java.lang.String r1 = defpackage.e4c.h(r1)
            if (r1 != 0) goto L_0x0583
            goto L_0x05ba
        L_0x0583:
            bkb r53 = e(r11, r2)
            java.lang.Object r3 = r0.b
            iq7 r3 = (defpackage.iq7) r3
            if (r3 == 0) goto L_0x05aa
            kq7 r3 = r3.a
            java.lang.String r4 = r3.k
            boolean r4 = r1.equals(r4)
            java.lang.String r3 = r3.l
            boolean r3 = r1.equals(r3)
            if (r4 != 0) goto L_0x05a2
            if (r3 == 0) goto L_0x05a0
            goto L_0x05a2
        L_0x05a0:
            r12 = 0
            goto L_0x05a3
        L_0x05a2:
            r12 = 1
        L_0x05a3:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r12)
            r54 = r14
            goto L_0x05ac
        L_0x05aa:
            r54 = 0
        L_0x05ac:
            ixd r14 = new ixd
            r29 = r14
            r44 = -1
            r46 = -1
            r52 = r1
            r29.<init>(r30, r32, r33, r34, r35, r36, r38, r40, r42, r44, r46, r48, r50, r52, r53, r54)
            goto L_0x05bb
        L_0x05ba:
            r14 = 0
        L_0x05bb:
            if (r14 == 0) goto L_0x0608
            boolean r1 = r14 instanceof defpackage.ixd
            r8 = r18
            if (r1 == 0) goto L_0x05f5
            r1 = -1
            if (r8 != r1) goto L_0x05da
            r3 = r14
            ixd r3 = (defpackage.ixd) r3
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Boolean r3 = r3.k
            boolean r3 = defpackage.tpa.f(r3, r4)
            if (r3 == 0) goto L_0x05da
            int r10 = r26.size()
        L_0x05d7:
            r3 = r25
            goto L_0x05dc
        L_0x05da:
            r10 = r8
            goto L_0x05d7
        L_0x05dc:
            if (r3 != r1) goto L_0x05f3
            r1 = r14
            ixd r1 = (defpackage.ixd) r1
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = r1.k
            boolean r1 = defpackage.tpa.f(r1, r4)
            if (r1 == 0) goto L_0x05f3
            int r1 = r26.size()
            r9 = r1
        L_0x05f0:
            r5 = r26
            goto L_0x05fa
        L_0x05f3:
            r9 = r3
            goto L_0x05f0
        L_0x05f5:
            r3 = r25
            r9 = r3
            r10 = r8
            goto L_0x05f0
        L_0x05fa:
            r5.add(r14)
            r6 = r5
            r1 = r16
            r5 = r17
            r3 = r22
            r7 = r24
            goto L_0x0028
        L_0x0608:
            r8 = r18
            r3 = r25
            r9 = r3
            r10 = r8
            r1 = r16
            r5 = r17
            r3 = r22
            r7 = r24
            r6 = r26
            goto L_0x0028
        L_0x061a:
            r22 = r3
            r17 = r5
            r5 = r6
            r24 = r7
            r3 = r9
            r8 = r10
            if (r3 >= r8) goto L_0x0638
            r1 = -1
            if (r3 == r1) goto L_0x0638
            java.lang.Object r1 = r5.get(r8)
            jxd r1 = (defpackage.jxd) r1
            java.lang.Object r4 = r5.get(r3)
            r5.set(r8, r4)
            r5.set(r3, r1)
        L_0x0638:
            int r1 = r5.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " ssrcs parsed"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object r0 = r0.a
            a4c r0 = (defpackage.a4c) r0
            java.lang.String r3 = "WebRTCToInternalStatsMapper"
            r0.log(r3, r1)
            java.util.Map r1 = r2.getStatsMap()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0667:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x084c
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            org.webrtc.RTCStats r4 = (org.webrtc.RTCStats) r4
            java.lang.String r7 = r4.getType()
            java.lang.String r8 = "candidate-pair"
            boolean r7 = defpackage.tpa.f(r7, r8)
            if (r7 != 0) goto L_0x0686
            goto L_0x0667
        L_0x0686:
            bc7[] r7 = defpackage.e4c.a
            java.util.Map r7 = r2.getStatsMap()
            java.util.Map r8 = r4.getMembers()
            java.lang.String r9 = "localCandidateId"
            java.lang.Object r8 = r8.get(r9)
            java.lang.Object r7 = r7.get(r8)
            org.webrtc.RTCStats r7 = (org.webrtc.RTCStats) r7
            if (r7 != 0) goto L_0x06a2
        L_0x069e:
            r12 = 1
            goto L_0x0782
        L_0x06a2:
            java.util.Map r8 = r2.getStatsMap()
            java.util.Map r9 = r4.getMembers()
            java.lang.String r10 = "remoteCandidateId"
            java.lang.Object r9 = r9.get(r10)
            java.lang.Object r8 = r8.get(r9)
            org.webrtc.RTCStats r8 = (org.webrtc.RTCStats) r8
            if (r8 != 0) goto L_0x06b9
            goto L_0x069e
        L_0x06b9:
            java.util.Map r9 = r7.getMembers()
            java.lang.String r10 = "candidateType"
            java.lang.Object r9 = r9.get(r10)
            if (r9 == 0) goto L_0x06ca
            java.lang.String r9 = r9.toString()
            goto L_0x06cb
        L_0x06ca:
            r9 = 0
        L_0x06cb:
            java.lang.String r11 = "protocol"
            java.lang.String r12 = "address"
            if (r9 != 0) goto L_0x06d2
            goto L_0x06fe
        L_0x06d2:
            java.lang.String r13 = defpackage.e4c.d(r7)
            if (r13 != 0) goto L_0x06d9
            goto L_0x06fe
        L_0x06d9:
            java.util.Map r14 = r7.getMembers()
            java.lang.Object r14 = r14.get(r12)
            if (r14 == 0) goto L_0x06e8
            java.lang.String r14 = r14.toString()
            goto L_0x06e9
        L_0x06e8:
            r14 = 0
        L_0x06e9:
            if (r14 != 0) goto L_0x06ec
            goto L_0x06fe
        L_0x06ec:
            java.util.Map r7 = r7.getMembers()
            java.lang.Object r7 = r7.get(r11)
            if (r7 == 0) goto L_0x06fb
            java.lang.String r7 = r7.toString()
            goto L_0x06fc
        L_0x06fb:
            r7 = 0
        L_0x06fc:
            if (r7 != 0) goto L_0x0700
        L_0x06fe:
            r15 = 0
            goto L_0x0705
        L_0x0700:
            a8g r15 = new a8g
            r15.<init>(r9, r13, r14, r7)
        L_0x0705:
            if (r15 != 0) goto L_0x0708
            goto L_0x069e
        L_0x0708:
            java.util.Map r7 = r8.getMembers()
            java.lang.Object r7 = r7.get(r10)
            if (r7 == 0) goto L_0x0717
            java.lang.String r7 = r7.toString()
            goto L_0x0718
        L_0x0717:
            r7 = 0
        L_0x0718:
            if (r7 != 0) goto L_0x071b
            goto L_0x0747
        L_0x071b:
            java.lang.String r9 = defpackage.e4c.d(r8)
            if (r9 != 0) goto L_0x0722
            goto L_0x0747
        L_0x0722:
            java.util.Map r10 = r8.getMembers()
            java.lang.Object r10 = r10.get(r12)
            if (r10 == 0) goto L_0x0731
            java.lang.String r10 = r10.toString()
            goto L_0x0732
        L_0x0731:
            r10 = 0
        L_0x0732:
            if (r10 != 0) goto L_0x0735
            goto L_0x0747
        L_0x0735:
            java.util.Map r8 = r8.getMembers()
            java.lang.Object r8 = r8.get(r11)
            if (r8 == 0) goto L_0x0744
            java.lang.String r8 = r8.toString()
            goto L_0x0745
        L_0x0744:
            r8 = 0
        L_0x0745:
            if (r8 != 0) goto L_0x0749
        L_0x0747:
            r11 = 0
            goto L_0x074e
        L_0x0749:
            a8g r11 = new a8g
            r11.<init>(r7, r9, r10, r8)
        L_0x074e:
            if (r11 != 0) goto L_0x0752
            goto L_0x069e
        L_0x0752:
            java.util.Map r7 = r4.getMembers()
            java.lang.String r8 = "currentRoundTripTime"
            java.lang.Object r7 = r7.get(r8)
            if (r7 == 0) goto L_0x0763
            java.lang.Double r7 = defpackage.e4c.b(r7)
            goto L_0x0764
        L_0x0763:
            r7 = 0
        L_0x0764:
            if (r7 == 0) goto L_0x0779
            double r7 = r7.doubleValue()
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            r12 = 1
            long r9 = r9.toMillis(r12)
            double r9 = (double) r9
            double r7 = r7 * r9
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            goto L_0x077c
        L_0x0779:
            r12 = 1
            r7 = 0
        L_0x077c:
            java.lang.String r35 = defpackage.e4c.i(r4)
            if (r35 != 0) goto L_0x0785
        L_0x0782:
            r8 = 0
            goto L_0x0845
        L_0x0785:
            java.util.Map r8 = r2.getStatsMap()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.size()
            r9.<init>(r10)
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x079a:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x07b0
            java.lang.Object r10 = r8.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getValue()
            org.webrtc.RTCStats r10 = (org.webrtc.RTCStats) r10
            r9.add(r10)
            goto L_0x079a
        L_0x07b0:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x07b9:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x07d8
            java.lang.Object r10 = r9.next()
            r14 = r10
            org.webrtc.RTCStats r14 = (org.webrtc.RTCStats) r14
            java.lang.String r14 = r14.getType()
            java.lang.String r12 = "transport"
            boolean r12 = defpackage.tpa.f(r14, r12)
            if (r12 == 0) goto L_0x07d5
            r8.add(r10)
        L_0x07d5:
            r12 = 1
            goto L_0x07b9
        L_0x07d8:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x07df
            goto L_0x080a
        L_0x07df:
            java.util.Iterator r8 = r8.iterator()
        L_0x07e3:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x080a
            java.lang.Object r9 = r8.next()
            org.webrtc.RTCStats r9 = (org.webrtc.RTCStats) r9
            java.lang.String r10 = "selectedCandidatePairId"
            java.lang.Object r9 = defpackage.f46.c(r9, r10)
            if (r9 == 0) goto L_0x07fc
            java.lang.String r9 = r9.toString()
            goto L_0x07fd
        L_0x07fc:
            r9 = 0
        L_0x07fd:
            java.lang.String r10 = r4.getId()
            boolean r9 = defpackage.tpa.f(r9, r10)
            if (r9 == 0) goto L_0x07e3
            r36 = 1
            goto L_0x080c
        L_0x080a:
            r36 = 0
        L_0x080c:
            cz1 r8 = new cz1
            java.lang.String r26 = r4.getId()
            java.lang.String r33 = java.lang.String.valueOf(r7)
            java.lang.Object r4 = r11.a
            r30 = r4
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r4 = r11.b
            r31 = r4
            java.lang.String r31 = (java.lang.String) r31
            java.lang.Object r4 = r15.a
            r27 = r4
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r4 = r15.b
            r28 = r4
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r4 = r15.c
            r29 = r4
            java.lang.String r29 = (java.lang.String) r29
            java.lang.Object r4 = r11.c
            r32 = r4
            java.lang.String r32 = (java.lang.String) r32
            java.lang.Object r4 = r15.o
            r34 = r4
            java.lang.String r34 = (java.lang.String) r34
            r25 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
        L_0x0845:
            if (r8 == 0) goto L_0x0667
            r6.add(r8)
            goto L_0x0667
        L_0x084c:
            int r1 = r6.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " candidatePairs parsed"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.log(r3, r1)
            r3 = 0
            r0 = r24
            r1 = r22
            r4 = r17
            r0.<init>(r1, r3, r4, r5, r6)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.p(n1e):c4c");
    }

    public void q(jlf jlf) {
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new fre(this, 12, jlf));
        }
    }

    public void r(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (((Map) this.a)) {
            hashMap = new HashMap((Map) this.a);
        }
        synchronized (((Map) this.b)) {
            hashMap2 = new HashMap((Map) this.b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).Q(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((qne) entry2.getKey()).c(new ApiException(status));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r1 = (android.os.Bundle) r4.f();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object u(com.google.android.gms.tasks.Task r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.a
            goc r0 = (defpackage.goc) r0
            r0.getClass()
            boolean r1 = r4.h()
            if (r1 != 0) goto L_0x000e
            goto L_0x002e
        L_0x000e:
            java.lang.Object r1 = r4.f()
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "google.messenger"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x002e
            java.lang.Object r3 = r3.b
            android.os.Bundle r3 = (android.os.Bundle) r3
            ukg r3 = r0.a(r3)
            ok4 r4 = defpackage.ok4.o
            o84 r0 = defpackage.o84.s0
            ukg r4 = r3.l(r4, r0)
        L_0x002e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aab.u(com.google.android.gms.tasks.Task):java.lang.Object");
    }

    public aab(int i) {
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.a = Collections.synchronizedMap(new WeakHashMap());
                this.b = Collections.synchronizedMap(new WeakHashMap());
                return;
            default:
                this.a = new khe(h8.t0);
                this.b = new khe(h8.s0);
                return;
        }
    }

    public aab(String str) {
        this.a = str;
        CharsetDecoder newDecoder = StandardCharsets.UTF_8.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.b = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    public aab(List list) {
        this.a = list;
        this.b = new yze[list.size()];
    }
}
