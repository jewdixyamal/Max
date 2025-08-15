package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* renamed from: j1e  reason: default package */
public abstract class j1e implements SdpObserver {
    public static boolean a;
    public static final rq9 b = new Object();
    public static final r6d[] c = new r6d[0];

    public static void B(ByteBuffer byteBuffer, j60 j60, ByteBuffer byteBuffer2, j60 j602, f42 f42, int i, boolean z, boolean z2) {
        boolean z3;
        j60 j603;
        ByteBuffer byteBuffer3 = byteBuffer2;
        f42 f422 = f42;
        boolean z4 = true;
        if (j60.c == 2) {
            j603 = j602;
            z3 = true;
        } else {
            j603 = j602;
            z3 = false;
        }
        if (j603.c != 2) {
            z4 = false;
        }
        int i2 = f422.a;
        float[] fArr = new float[i2];
        int i3 = f422.b;
        float[] fArr2 = new float[i3];
        int i4 = i;
        for (int i5 = 0; i5 < i4; i5++) {
            if (z) {
                int position = byteBuffer2.position();
                for (int i6 = 0; i6 < i3; i6++) {
                    fArr2[i6] = t(byteBuffer3, z4, z4);
                }
                byteBuffer3.position(position);
            }
            for (int i7 = 0; i7 < i2; i7++) {
                fArr[i7] = t(byteBuffer, z3, z4);
            }
            ByteBuffer byteBuffer4 = byteBuffer;
            for (int i8 = 0; i8 < i3; i8++) {
                for (int i9 = 0; i9 < i2; i9++) {
                    fArr2[i8] = (f422.c[(i9 * i3) + i8] * fArr[i9]) + fArr2[i8];
                }
                if (z4) {
                    byteBuffer3.putShort((short) ((int) oaf.i(fArr2[i8], -32768.0f, 32767.0f)));
                } else {
                    byteBuffer3.putFloat(z2 ? oaf.i(fArr2[i8], -1.0f, 1.0f) : fArr2[i8]);
                }
                fArr2[i8] = 0.0f;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ce, code lost:
        if (r12 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ff, code lost:
        r12 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0100, code lost:
        r9 = new defpackage.bx8(r9, r12);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dx8 C(defpackage.gy8 r15) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "payloadCatching catch error"
            java.lang.String r2 = "ServerPayload/PayloadCatching"
            r3 = 1
            r4 = 0
            int r5 = defpackage.lz7.N(r15)     // Catch:{ all -> 0x000d }
            goto L_0x003c
        L_0x000d:
            r5 = move-exception
            defpackage.hm9.l0(r2, r1, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.u7d.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x002a
            java.lang.Object r7 = r6.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r5)
            goto L_0x0017
        L_0x002a:
            int r6 = defpackage.k7d.a
            int r6 = defpackage.au1.s(r6)
            if (r6 == 0) goto L_0x003b
            if (r6 == r3) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            r7 = 0
            r9 = r6
            r10 = r7
        L_0x0041:
            if (r4 >= r5) goto L_0x013d
            java.lang.String r12 = defpackage.lz7.P(r15)     // Catch:{ all -> 0x0048 }
            goto L_0x0077
        L_0x0048:
            r12 = move-exception
            defpackage.hm9.l0(r2, r1, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L_0x0052:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0065
            java.lang.Object r14 = r13.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r12)
            goto L_0x0052
        L_0x0065:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L_0x0076
            if (r13 == r3) goto L_0x0075
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0075:
            throw r12
        L_0x0076:
            r12 = r6
        L_0x0077:
            java.lang.String r13 = "userId"
            boolean r13 = defpackage.tpa.f(r12, r13)
            if (r13 == 0) goto L_0x00c0
            java.lang.Long r10 = java.lang.Long.valueOf(r7)
            long r11 = defpackage.lz7.M(r15, r7)     // Catch:{ all -> 0x008c }
            java.lang.Long r10 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x008c }
            goto L_0x00ba
        L_0x008c:
            r11 = move-exception
            defpackage.hm9.l0(r2, r1, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.u7d.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0096:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00a9
            java.lang.Object r13 = r12.next()
            r4a r13 = (defpackage.r4a) r13
            r13.getClass()
            defpackage.r4a.a(r11)
            goto L_0x0096
        L_0x00a9:
            int r12 = defpackage.k7d.a
            int r12 = defpackage.au1.s(r12)
            if (r12 == 0) goto L_0x00ba
            if (r12 == r3) goto L_0x00b9
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x00b9:
            throw r11
        L_0x00ba:
            long r10 = r10.longValue()
            goto L_0x0139
        L_0x00c0:
            java.lang.String r13 = "reaction"
            boolean r12 = defpackage.tpa.f(r12, r13)
            if (r12 == 0) goto L_0x0107
            gx8 r9 = defpackage.gx8.EMOJI
            java.lang.String r12 = defpackage.lz7.P(r15)     // Catch:{ all -> 0x00d1 }
            if (r12 != 0) goto L_0x0100
            goto L_0x00ff
        L_0x00d1:
            r12 = move-exception
            defpackage.hm9.l0(r2, r1, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L_0x00db:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ee
            java.lang.Object r14 = r13.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r12)
            goto L_0x00db
        L_0x00ee:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L_0x00ff
            if (r13 == r3) goto L_0x00fe
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x00fe:
            throw r12
        L_0x00ff:
            r12 = r0
        L_0x0100:
            bx8 r13 = new bx8
            r13.<init>(r9, r12)
            r9 = r13
            goto L_0x0139
        L_0x0107:
            r15.z()     // Catch:{ all -> 0x010b }
            goto L_0x0139
        L_0x010b:
            r12 = move-exception
            defpackage.hm9.l0(r2, r1, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.u7d.a
            java.util.Iterator r13 = r13.iterator()
        L_0x0115:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0128
            java.lang.Object r14 = r13.next()
            r4a r14 = (defpackage.r4a) r14
            r14.getClass()
            defpackage.r4a.a(r12)
            goto L_0x0115
        L_0x0128:
            int r13 = defpackage.k7d.a
            int r13 = defpackage.au1.s(r13)
            if (r13 == 0) goto L_0x0139
            if (r13 == r3) goto L_0x0138
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0138:
            throw r12
        L_0x0139:
            int r4 = r4 + 1
            goto L_0x0041
        L_0x013d:
            dx8 r15 = new dx8
            if (r9 == 0) goto L_0x0145
            r15.<init>(r10, r9)
            return r15
        L_0x0145:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "reaction is null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.C(gy8):dx8");
    }

    public static void D(kb7 kb7, Object obj) {
        if (obj == null || (obj instanceof String)) {
            String str = (String) obj;
            t1 t1Var = (t1) kb7;
            if (str != null) {
                t1Var.i(str);
            } else {
                t1Var.c0();
            }
        } else if (obj == JSONObject.NULL) {
            kb7.c0();
        } else if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            t1 t1Var2 = (t1) kb7;
            t1Var2.getClass();
            t1Var2.a(String.valueOf(booleanValue));
        } else if ((obj instanceof Double) || (obj instanceof Float)) {
            ((t1) kb7).d(((Number) obj).doubleValue());
        } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            long longValue = ((Number) obj).longValue();
            t1 t1Var3 = (t1) kb7;
            t1Var3.getClass();
            t1Var3.a(Long.toString(longValue));
        } else if (obj instanceof JSONObject) {
            E(kb7, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            kb7.u();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                D(kb7, jSONArray.opt(i));
            }
            kb7.t();
        } else {
            throw new IllegalArgumentException("Don't know how to write " + obj);
        }
    }

    public static void E(kb7 kb7, JSONObject jSONObject) {
        kb7.s();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            kb7.g0(next);
            D(kb7, jSONObject.opt(next));
        }
        kb7.q();
    }

    public static final ContextScope F(sx3 sx3, lx3 lx3) {
        return new ContextScope(sx3.getCoroutineContext().plus(lx3));
    }

    public static v3f G(v3f v3f, String[] strArr, Map map) {
        int i = 0;
        if (v3f == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (v3f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                v3f v3f2 = new v3f();
                int length = strArr.length;
                while (i < length) {
                    v3f2.a((v3f) map.get(strArr[i]));
                    i++;
                }
                return v3f2;
            }
        } else if (strArr != null && strArr.length == 1) {
            v3f.a((v3f) map.get(strArr[0]));
            return v3f;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i < length2) {
                v3f.a((v3f) map.get(strArr[i]));
                i++;
            }
        }
        return v3f;
    }

    public static mqb H(int i, int i2) {
        if (i2 > i) {
            int i3 = i2;
            i2 = i;
            i = i3;
        }
        for (mqb mqb : mqb.values()) {
            if (mqb.c == i && mqb.o == i2) {
                return mqb;
            }
        }
        for (mqb mqb2 : mqb.values()) {
            if (mqb2.o == i2) {
                return mqb2;
            }
        }
        for (mqb mqb3 : mqb.values()) {
            if (mqb3.o == i) {
                return mqb3;
            }
        }
        float f = (float) i;
        float f2 = f / ((float) i2);
        if (f2 > 1.7777778f) {
            for (mqb mqb4 : mqb.values()) {
                if (mqb4.c == i) {
                    return mqb4;
                }
            }
            int i4 = (int) (f / 1.7777778f);
            mqb mqb5 = null;
            try {
                mqb mqb6 = null;
                int i5 = -1;
                for (mqb mqb7 : mqb.values()) {
                    int abs = Math.abs(mqb7.o - i4);
                    if (i5 == -1 || abs < i5) {
                        mqb6 = mqb7;
                        i5 = abs;
                    }
                }
                mqb5 = mqb6;
            } catch (NumberFormatException e) {
                hm9.p("j1e", "Can't parse quality", e);
            }
            if (mqb5 != null) {
                return mqb5;
            }
        } else {
            for (mqb mqb8 : mqb.values()) {
                if (mqb8.o == i2) {
                    return mqb8;
                }
            }
        }
        if (f2 < 1.0f) {
            int i6 = i2;
            i2 = i;
            i = i6;
        }
        mqb mqb9 = mqb.P_144;
        for (mqb mqb10 : mqb.values()) {
            if (mqb10.c <= i && mqb10.o <= i2) {
                return mqb10;
            }
        }
        return mqb9;
    }

    public static m5d I(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size() / 2);
        ArrayList arrayList4 = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxd jxd = (jxd) it.next();
            int i = jxd.a;
            int i2 = jxd.b;
            if (i == 1) {
                if (i2 == 1) {
                    arrayList.add((dxd) jxd);
                } else if (i2 == 2) {
                    arrayList2.add((exd) jxd);
                } else {
                    throw new AssertionError("unreachable: " + jxd);
                }
            } else if (i != 2) {
                throw new AssertionError("unreachable: " + jxd);
            } else if (i2 == 1) {
                arrayList3.add((hxd) jxd);
            } else if (i2 == 2) {
                arrayList4.add((ixd) jxd);
            } else {
                throw new AssertionError("unreachable: " + jxd);
            }
        }
        return new m5d(14, arrayList, arrayList3, arrayList2, arrayList4, false);
    }

    public static ArrayList J(List list, cz1 cz1) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxd jxd = (jxd) it.next();
            if (cz1.j.equals(jxd.d)) {
                arrayList.add(jxd);
            }
        }
        return arrayList;
    }

    public static Object K(Task task) {
        if (task.h()) {
            return task.f();
        }
        if (((ukg) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.e());
    }

    public static final ContextScope a(lx3 lx3) {
        if (lx3.get(c32.X) == null) {
            lx3 = lx3.plus(pag.a());
        }
        return new ContextScope(lx3);
    }

    public static Object b(Task task) {
        fp3.m("Must not be called on the main application thread");
        fp3.l();
        fp3.o(task, "Task must not be null");
        if (task.g()) {
            return K(task);
        }
        hgf hgf = new hgf();
        ok4 ok4 = xne.b;
        task.d(ok4, hgf);
        task.c(ok4, hgf);
        task.a(ok4, hgf);
        ((CountDownLatch) hgf.a).await();
        return K(task);
    }

    public static Object c(Task task, long j, TimeUnit timeUnit) {
        fp3.m("Must not be called on the main application thread");
        fp3.l();
        fp3.o(task, "Task must not be null");
        fp3.o(timeUnit, "TimeUnit must not be null");
        if (task.g()) {
            return K(task);
        }
        hgf hgf = new hgf();
        ok4 ok4 = xne.b;
        task.d(ok4, hgf);
        task.c(ok4, hgf);
        task.a(ok4, hgf);
        if (((CountDownLatch) hgf.a).await(j, timeUnit)) {
            return K(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static kl7 d(List list) {
        kl7 kl7 = (kl7) list;
        kl7.e();
        kl7.c = true;
        return kl7.b > 0 ? kl7 : kl7.o;
    }

    public static final Set e(r6d r6d) {
        if (r6d instanceof px0) {
            return ((px0) r6d).b();
        }
        HashSet hashSet = new HashSet(r6d.f());
        int f = r6d.f();
        for (int i = 0; i < f; i++) {
            hashSet.add(r6d.g(i));
        }
        return hashSet;
    }

    public static final int f(RecyclerView recyclerView, int i, int i2) {
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            width = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        int i3 = width - (i * i2);
        int i4 = 1;
        int i5 = i2 - 1;
        if (i5 >= 1) {
            i4 = i5;
        }
        return i3 / i4;
    }

    public static ukg g(Callable callable, Executor executor) {
        fp3.o(executor, "Executor must not be null");
        ukg ukg = new ukg();
        executor.execute(new ihg((Object) ukg, 4, (Object) callable));
        return ukg;
    }

    public static boolean h(j60 j60) {
        if (j60.a == -1 || j60.b == -1) {
            return false;
        }
        int i = j60.c;
        return i == 2 || i == 4;
    }

    public static final void i(sx3 sx3, CancellationException cancellationException) {
        x77 x77 = (x77) sx3.getCoroutineContext().get(c32.X);
        if (x77 != null) {
            x77.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + sx3).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        r1 = (defpackage.r6d[]) r1.toArray(new defpackage.r6d[0]);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.r6d[] j(java.util.List r1) {
        /*
            if (r1 == 0) goto L_0x0008
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            if (r1 == 0) goto L_0x0016
            r0 = 0
            r6d[] r0 = new defpackage.r6d[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            r6d[] r1 = (defpackage.r6d[]) r1
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r6d[] r1 = c
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.j(java.util.List):r6d[]");
    }

    public static final Object k(a66 a66, Continuation continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        return oag.C(scopeCoroutine, scopeCoroutine, a66);
    }

    public static kl7 l() {
        return new kl7(10);
    }

    public static void m(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, new Object[]{obj});
        }
    }

    public static synchronized void n() {
        synchronized (j1e.class) {
            if (!a) {
                hm9.M("static-webp");
                a = true;
            }
        }
    }

    public static final void o(sx3 sx3) {
        pag.j(sx3.getCoroutineContext());
    }

    public static void p(Bitmap bitmap, int i) {
        int i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(width * height)];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[12544];
        int i3 = 25;
        int i4 = 1;
        for (int i5 = 1; i5 < 256; i5++) {
            for (int i6 = 0; i6 < 49; i6++) {
                iArr2[i3] = i5;
                i3++;
            }
        }
        int[] iArr3 = new int[Math.max(width, height)];
        int i7 = i;
        int i8 = 0;
        while (i8 < i7) {
            int i9 = 0;
            while (true) {
                i2 = 24;
                if (i9 >= height) {
                    break;
                }
                int i10 = width * i9;
                i9++;
                int i11 = (i9 * width) - i4;
                int i12 = width + 24;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (int i17 = -24; i17 < i12; i17++) {
                    int i18 = i10 + i17;
                    if (i18 < i10) {
                        i18 = i10;
                    } else if (i18 > i11) {
                        i18 = i11;
                    }
                    int i19 = iArr[i18];
                    i13 += (i19 >> 16) & 255;
                    i14 += (i19 >> 8) & 255;
                    i15 += i19 & 255;
                    i16 += i19 >>> 24;
                    if (i17 >= 24) {
                        iArr3[i17 - 24] = (iArr2[i16] << 24) | (iArr2[i13] << 16) | (iArr2[i14] << 8) | iArr2[i15];
                        int i20 = (i17 - 48) + i10;
                        if (i20 < i10) {
                            i20 = i10;
                        } else if (i20 > i11) {
                            i20 = i11;
                        }
                        int i21 = iArr[i20];
                        i13 -= (i21 >> 16) & 255;
                        i14 -= (i21 >> 8) & 255;
                        i15 -= i21 & 255;
                        i16 -= i21 >>> 24;
                    }
                }
                System.arraycopy(iArr3, 0, iArr, i10, width);
                i4 = 1;
            }
            int i22 = 0;
            int i23 = 0;
            while (i23 < width) {
                int i24 = ((height - 1) * width) + i23;
                int i25 = i2 * width;
                int i26 = 48 * width;
                int i27 = i23 - i25;
                int i28 = i22;
                int i29 = i28;
                int i30 = i29;
                int i31 = i30;
                int i32 = i31;
                while (i27 <= i24 + i25) {
                    int i33 = iArr[i27 < i23 ? i23 : i27 > i24 ? i24 : i27];
                    i28 += (i33 >> 16) & 255;
                    i29 += (i33 >> 8) & 255;
                    i30 += i33 & 255;
                    i2 = 24;
                    i31 += i33 >>> 24;
                    if (i27 - i25 >= i23) {
                        iArr3[i32] = (iArr2[i31] << 24) | (iArr2[i28] << 16) | (iArr2[i29] << 8) | iArr2[i30];
                        i32++;
                        int i34 = i27 - i26;
                        if (i34 < i23) {
                            i34 = i23;
                        } else if (i34 > i24) {
                            i34 = i24;
                        }
                        int i35 = iArr[i34];
                        i28 -= (i35 >> 16) & 255;
                        i29 -= (i35 >> 8) & 255;
                        i30 -= i35 & 255;
                        i2 = 24;
                        i31 -= i35 >>> 24;
                    }
                    i27 += width;
                }
                int i36 = i23;
                for (int i37 = 0; i37 < height; i37++) {
                    iArr[i36] = iArr3[i37];
                    i36 += width;
                }
                i23++;
                i22 = 0;
            }
            i8++;
            i4 = 1;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    public static ukg q(Exception exc) {
        ukg ukg = new ukg();
        ukg.m(exc);
        return ukg;
    }

    public static ukg r(Object obj) {
        ukg ukg = new ukg();
        ukg.n(obj);
        return ukg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0229 A[SYNTHETIC, Splitter:B:135:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0206 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ce A[SYNTHETIC, Splitter:B:59:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC, Splitter:B:68:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ed A[SYNTHETIC, Splitter:B:73:0x00ed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList s(android.net.Uri r30, android.content.Context r31, defpackage.cj0 r32) {
        /*
            r1 = 1
            java.lang.String r2 = "j1e"
            java.lang.String r3 = "fail to release"
            r4 = 0
            r5 = 0
            android.media.MediaMetadataRetriever r6 = new android.media.MediaMetadataRetriever     // Catch:{ IllegalArgumentException -> 0x00c3, RuntimeException -> 0x00be, all -> 0x00ba }
            r6.<init>()     // Catch:{ IllegalArgumentException -> 0x00c3, RuntimeException -> 0x00be, all -> 0x00ba }
            r7 = r30
            r0 = r31
            r6.setDataSource(r0, r7)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r0 = 12
            java.lang.String r0 = r6.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r8 = 18
            java.lang.String r8 = r6.extractMetadata(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r9 = 19
            java.lang.String r9 = r6.extractMetadata(r9)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r10 = 20
            java.lang.String r10 = r6.extractMetadata(r10)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r11 = 24
            java.lang.String r11 = r6.extractMetadata(r11)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            if (r11 == 0) goto L_0x0041
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            goto L_0x0042
        L_0x0038:
            r0 = move-exception
            r1 = r2
            r4 = r6
        L_0x003b:
            r2 = r0
            goto L_0x0227
        L_0x003e:
            r0 = move-exception
            goto L_0x00c5
        L_0x0041:
            r11 = r5
        L_0x0042:
            if (r8 == 0) goto L_0x00af
            if (r9 != 0) goto L_0x0048
            goto L_0x00af
        L_0x0048:
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r11 = r11 % 180
            r12 = 90
            if (r11 != r12) goto L_0x0059
            r15 = r8
            r14 = r9
            goto L_0x005b
        L_0x0059:
            r14 = r8
            r15 = r9
        L_0x005b:
            if (r10 == 0) goto L_0x0068
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r8 = r8.intValue()     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r16 = r8
            goto L_0x006a
        L_0x0068:
            r16 = r5
        L_0x006a:
            java.lang.String r8 = r30.toString()     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r9 = r32
            it3 r8 = r9.c(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            if (r8 == 0) goto L_0x007b
            long r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
        L_0x0078:
            r17 = r8
            goto L_0x007e
        L_0x007b:
            r8 = 0
            goto L_0x0078
        L_0x007e:
            r8 = 11
            int[] r8 = defpackage.au1.v(r8)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            int r9 = r8.length     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r10 = r5
        L_0x0086:
            if (r10 >= r9) goto L_0x0097
            r11 = r8[r10]     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            java.lang.String r12 = defpackage.ey8.f(r11)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            boolean r12 = r12.equalsIgnoreCase(r0)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            if (r12 == 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            int r10 = r10 + r1
            goto L_0x0086
        L_0x0097:
            r11 = r5
        L_0x0098:
            if (r11 != 0) goto L_0x009d
            r19 = r1
            goto L_0x009f
        L_0x009d:
            r19 = r11
        L_0x009f:
            oqb r8 = new oqb     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r13 = r8
            r13.<init>(r14, r15, r16, r17, r19)     // Catch:{ IllegalArgumentException -> 0x00d5, RuntimeException -> 0x003e }
            r6.release()     // Catch:{ all -> 0x00a9 }
            goto L_0x00e9
        L_0x00a9:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.p(r2, r3, r6)
            goto L_0x00e9
        L_0x00af:
            r6.release()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b8
        L_0x00b3:
            r0 = move-exception
            r6 = r0
        L_0x00b5:
            defpackage.hm9.p(r2, r3, r6)
        L_0x00b8:
            r8 = r4
            goto L_0x00e9
        L_0x00ba:
            r0 = move-exception
            r1 = r2
            goto L_0x003b
        L_0x00be:
            r0 = move-exception
            r7 = r30
            r6 = r4
            goto L_0x00c5
        L_0x00c3:
            r6 = r4
            goto L_0x00d5
        L_0x00c5:
            java.lang.String r7 = r30.toString()     // Catch:{ all -> 0x0038 }
            defpackage.hm9.p(r2, r7, r0)     // Catch:{ all -> 0x0038 }
            if (r6 == 0) goto L_0x00b8
            r6.release()     // Catch:{ all -> 0x00d2 }
            goto L_0x00b8
        L_0x00d2:
            r0 = move-exception
            r6 = r0
            goto L_0x00b5
        L_0x00d5:
            java.lang.String r0 = "Could not get duration from video uri"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ all -> 0x0224 }
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r5)     // Catch:{ all -> 0x0224 }
            defpackage.hm9.k0(r2, r4, r0, r7)     // Catch:{ all -> 0x0224 }
            if (r6 == 0) goto L_0x00b8
            r6.release()     // Catch:{ all -> 0x00e6 }
            goto L_0x00b8
        L_0x00e6:
            r0 = move-exception
            r6 = r0
            goto L_0x00b5
        L_0x00e9:
            if (r8 != 0) goto L_0x00ed
            goto L_0x0220
        L_0x00ed:
            int r0 = r8.e     // Catch:{ IOException -> 0x00fa, IllegalArgumentException -> 0x00f8, all -> 0x00f6 }
            r3 = 8
            if (r0 != r3) goto L_0x00fc
            java.lang.String r0 = "video/mp4v-es"
            goto L_0x0100
        L_0x00f6:
            r0 = move-exception
            goto L_0x010a
        L_0x00f8:
            r0 = move-exception
            goto L_0x010b
        L_0x00fa:
            r0 = move-exception
            goto L_0x0119
        L_0x00fc:
            java.lang.String r0 = defpackage.ey8.f(r0)     // Catch:{ IOException -> 0x00fa, IllegalArgumentException -> 0x00f8, all -> 0x00f6 }
        L_0x0100:
            android.media.MediaCodec r0 = android.media.MediaCodec.createDecoderByType(r0)     // Catch:{ IOException -> 0x00fa, IllegalArgumentException -> 0x00f8, all -> 0x00f6 }
            if (r0 == 0) goto L_0x0120
            r0.release()
            goto L_0x0120
        L_0x010a:
            throw r0
        L_0x010b:
            java.lang.String r1 = r0.getMessage()
            defpackage.hm9.p(r2, r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x0220
        L_0x0119:
            java.lang.String r3 = r0.getMessage()
            defpackage.hm9.l(r2, r3, r0)
        L_0x0120:
            int r0 = r8.a
            int r3 = r8.b
            mqb r0 = H(r0, r3)
            int r3 = r8.c
            int r6 = r0.X
            if (r3 == 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r3 = r6
        L_0x0130:
            float r7 = (float) r3
            float r6 = (float) r6
            float r6 = r7 / r6
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r9 = r8.a
            float r10 = (float) r9
            int r11 = r8.b
            float r12 = (float) r11
            float r10 = r10 / r12
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r13 >= 0) goto L_0x014f
            float r10 = r12 / r10
            r8.a = r11
            r8.b = r9
            r17 = r1
            goto L_0x0151
        L_0x014f:
            r17 = r5
        L_0x0151:
            r18 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r18
            int r9 = java.lang.Math.round(r10)
            float r9 = (float) r9
            float r19 = r9 / r18
            mqb[] r15 = defpackage.mqb.values()
            int r13 = r15.length
        L_0x0161:
            if (r5 >= r13) goto L_0x0213
            r10 = r15[r5]
            int r9 = r10.c
            int r11 = r10.X
            float r11 = (float) r11
            float r11 = r11 * r6
            int r11 = (int) r11
            float r12 = (float) r9
            int r4 = r10.o
            float r1 = (float) r4
            float r16 = r12 / r1
            float r16 = r16 * r18
            r30 = r6
            int r6 = java.lang.Math.round(r16)
            float r6 = (float) r6
            float r6 = r6 / r18
            r31 = r14
            r32 = r15
            long r14 = r8.d
            r16 = r13
            float r13 = (float) r14
            r28 = r2
            float r2 = (float) r11
            float r2 = r7 / r2
            float r13 = r13 / r2
            r20 = r14
            long r13 = (long) r13
            int r2 = r8.a
            if (r9 > r2) goto L_0x0197
            int r2 = r8.b
            if (r4 <= r2) goto L_0x019f
        L_0x0197:
            if (r10 == r0) goto L_0x019f
            int r2 = r10.b
            int r15 = r0.b
            if (r2 <= r15) goto L_0x01cb
        L_0x019f:
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x01a4
            goto L_0x01ad
        L_0x01a4:
            if (r2 <= 0) goto L_0x01aa
            float r12 = r12 / r19
            int r4 = (int) r12
            goto L_0x01ad
        L_0x01aa:
            float r1 = r1 * r19
            int r9 = (int) r1
        L_0x01ad:
            if (r17 == 0) goto L_0x01b4
            r22 = r4
            r23 = r9
            goto L_0x01b8
        L_0x01b4:
            r23 = r4
            r22 = r9
        L_0x01b8:
            mqb r1 = defpackage.mqb.P_1080
            if (r10 == r1) goto L_0x01d3
            mqb r1 = defpackage.mqb.P_720
            if (r10 == r1) goto L_0x01d3
            mqb r1 = defpackage.mqb.P_480
            if (r10 == r1) goto L_0x01d3
            mqb r1 = defpackage.mqb.P_360
            if (r10 == r1) goto L_0x01d3
            if (r10 != r0) goto L_0x01cb
            goto L_0x01d3
        L_0x01cb:
            r6 = r31
            r29 = r32
            r4 = r16
            r1 = 0
            goto L_0x0201
        L_0x01d3:
            if (r10 != r0) goto L_0x01ec
            nqb r1 = new nqb
            r2 = 1
            r9 = r1
            r11 = r22
            r12 = r23
            r4 = r16
            r13 = r3
            r6 = r31
            r29 = r32
            r14 = r20
            r16 = r2
            r9.<init>(r10, r11, r12, r13, r14, r16)
            goto L_0x0201
        L_0x01ec:
            r6 = r31
            r29 = r32
            r4 = r16
            nqb r1 = new nqb
            r27 = 0
            r20 = r1
            r21 = r10
            r24 = r11
            r25 = r13
            r20.<init>(r21, r22, r23, r24, r25, r27)
        L_0x0201:
            if (r1 == 0) goto L_0x0206
            r6.add(r1)
        L_0x0206:
            r1 = 1
            int r5 = r5 + r1
            r13 = r4
            r14 = r6
            r2 = r28
            r15 = r29
            r4 = 0
            r6 = r30
            goto L_0x0161
        L_0x0213:
            r28 = r2
            r6 = r14
            java.lang.String r0 = r6.toString()
            r1 = r28
            defpackage.hm9.m(r1, r0, new java.lang.Object[0])
            r4 = r6
        L_0x0220:
            return r4
        L_0x0221:
            r2 = r0
            r4 = r6
            goto L_0x0227
        L_0x0224:
            r0 = move-exception
            r1 = r2
            goto L_0x0221
        L_0x0227:
            if (r4 == 0) goto L_0x0232
            r4.release()     // Catch:{ all -> 0x022d }
            goto L_0x0232
        L_0x022d:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.p(r1, r3, r4)
        L_0x0232:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.s(android.net.Uri, android.content.Context, cj0):java.util.ArrayList");
    }

    public static float t(ByteBuffer byteBuffer, boolean z, boolean z2) {
        int i = 32767;
        if (z2) {
            if (z) {
                return (float) byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            if (f < 0.0f) {
                i = 32768;
            }
            return oaf.i(f * ((float) i), -32768.0f, 32767.0f);
        } else if (!z) {
            return byteBuffer.getFloat();
        } else {
            short s = byteBuffer.getShort();
            float f2 = (float) s;
            if (s < 0) {
                i = 32768;
            }
            return f2 / ((float) i);
        }
    }

    public static String u(String str) {
        return "TRuntime.".concat(str);
    }

    public static ArrayList v(List list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jxd jxd = (jxd) it.next();
            if (jxd.b == 1 && jxd.a == 2) {
                arrayList.add((hxd) jxd);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017e, code lost:
        if (r0.equals("video/mp2t") == false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int w(java.lang.String r21) {
        /*
            r0 = r21
            r1 = 14
            r2 = 13
            r3 = 12
            r4 = 11
            r6 = 9
            r7 = 8
            r8 = 7
            r9 = 6
            r10 = 5
            r11 = 4
            r12 = 3
            java.lang.String r13 = "audio/flac"
            java.lang.String r14 = "audio/wav"
            java.lang.String r15 = "audio/mpeg"
            r16 = 2
            r17 = 1
            r18 = 0
            r19 = -1
            if (r0 != 0) goto L_0x0024
            return r19
        L_0x0024:
            java.util.ArrayList r20 = defpackage.ha9.a
            int r20 = r21.hashCode()
            switch(r20) {
                case -1007807498: goto L_0x0048;
                case -586683234: goto L_0x003c;
                case 187090231: goto L_0x0030;
                default: goto L_0x002d;
            }
        L_0x002d:
            r5 = r19
            goto L_0x0053
        L_0x0030:
            java.lang.String r5 = "audio/mp3"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0039
            goto L_0x002d
        L_0x0039:
            r5 = r16
            goto L_0x0053
        L_0x003c:
            java.lang.String r5 = "audio/x-wav"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0045
            goto L_0x002d
        L_0x0045:
            r5 = r17
            goto L_0x0053
        L_0x0048:
            java.lang.String r5 = "audio/x-flac"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0051
            goto L_0x002d
        L_0x0051:
            r5 = r18
        L_0x0053:
            switch(r5) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0059;
                case 2: goto L_0x0057;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x005c
        L_0x0057:
            r0 = r15
            goto L_0x005c
        L_0x0059:
            r0 = r14
            goto L_0x005c
        L_0x005b:
            r0 = r13
        L_0x005c:
            int r5 = r0.hashCode()
            switch(r5) {
                case -2123537834: goto L_0x018f;
                case -1662384011: goto L_0x0182;
                case -1662384007: goto L_0x0178;
                case -1662095187: goto L_0x016b;
                case -1606874997: goto L_0x015e;
                case -1487394660: goto L_0x0151;
                case -1248337486: goto L_0x0144;
                case -1004728940: goto L_0x0137;
                case -387023398: goto L_0x0129;
                case -43467528: goto L_0x011b;
                case 13915911: goto L_0x010d;
                case 187078296: goto L_0x00ff;
                case 187078297: goto L_0x00f1;
                case 187078669: goto L_0x00e3;
                case 187090232: goto L_0x00d6;
                case 187091926: goto L_0x00c9;
                case 187099443: goto L_0x00be;
                case 1331848029: goto L_0x00b1;
                case 1503095341: goto L_0x00a4;
                case 1504578661: goto L_0x0097;
                case 1504619009: goto L_0x008c;
                case 1504831518: goto L_0x0081;
                case 1505118770: goto L_0x0074;
                case 2039520277: goto L_0x0067;
                default: goto L_0x0063;
            }
        L_0x0063:
            r16 = r19
            goto L_0x019b
        L_0x0067:
            java.lang.String r5 = "video/x-matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0070
            goto L_0x0063
        L_0x0070:
            r16 = 23
            goto L_0x019b
        L_0x0074:
            java.lang.String r5 = "audio/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x007d
            goto L_0x0063
        L_0x007d:
            r16 = 22
            goto L_0x019b
        L_0x0081:
            boolean r0 = r0.equals(r15)
            if (r0 != 0) goto L_0x0088
            goto L_0x0063
        L_0x0088:
            r16 = 21
            goto L_0x019b
        L_0x008c:
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x0093
            goto L_0x0063
        L_0x0093:
            r16 = 20
            goto L_0x019b
        L_0x0097:
            java.lang.String r5 = "audio/eac3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00a0
            goto L_0x0063
        L_0x00a0:
            r16 = 19
            goto L_0x019b
        L_0x00a4:
            java.lang.String r5 = "audio/3gpp"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ad
            goto L_0x0063
        L_0x00ad:
            r16 = 18
            goto L_0x019b
        L_0x00b1:
            java.lang.String r5 = "video/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ba
            goto L_0x0063
        L_0x00ba:
            r16 = 17
            goto L_0x019b
        L_0x00be:
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x00c5
            goto L_0x0063
        L_0x00c5:
            r16 = 16
            goto L_0x019b
        L_0x00c9:
            java.lang.String r5 = "audio/ogg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00d2
            goto L_0x0063
        L_0x00d2:
            r16 = 15
            goto L_0x019b
        L_0x00d6:
            java.lang.String r5 = "audio/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00df
            goto L_0x0063
        L_0x00df:
            r16 = r1
            goto L_0x019b
        L_0x00e3:
            java.lang.String r5 = "audio/amr"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ed
            goto L_0x0063
        L_0x00ed:
            r16 = r2
            goto L_0x019b
        L_0x00f1:
            java.lang.String r5 = "audio/ac4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00fb
            goto L_0x0063
        L_0x00fb:
            r16 = r3
            goto L_0x019b
        L_0x00ff:
            java.lang.String r5 = "audio/ac3"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0109
            goto L_0x0063
        L_0x0109:
            r16 = r4
            goto L_0x019b
        L_0x010d:
            java.lang.String r5 = "video/x-flv"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0117
            goto L_0x0063
        L_0x0117:
            r16 = 10
            goto L_0x019b
        L_0x011b:
            java.lang.String r5 = "application/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0125
            goto L_0x0063
        L_0x0125:
            r16 = r6
            goto L_0x019b
        L_0x0129:
            java.lang.String r5 = "audio/x-matroska"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0133
            goto L_0x0063
        L_0x0133:
            r16 = r7
            goto L_0x019b
        L_0x0137:
            java.lang.String r5 = "text/vtt"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0141
            goto L_0x0063
        L_0x0141:
            r16 = r8
            goto L_0x019b
        L_0x0144:
            java.lang.String r5 = "application/mp4"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x014e
            goto L_0x0063
        L_0x014e:
            r16 = r9
            goto L_0x019b
        L_0x0151:
            java.lang.String r5 = "image/jpeg"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x015b
            goto L_0x0063
        L_0x015b:
            r16 = r10
            goto L_0x019b
        L_0x015e:
            java.lang.String r5 = "audio/amr-wb"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0168
            goto L_0x0063
        L_0x0168:
            r16 = r11
            goto L_0x019b
        L_0x016b:
            java.lang.String r5 = "video/webm"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0175
            goto L_0x0063
        L_0x0175:
            r16 = r12
            goto L_0x019b
        L_0x0178:
            java.lang.String r5 = "video/mp2t"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x019b
            goto L_0x0063
        L_0x0182:
            java.lang.String r5 = "video/mp2p"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x018c
            goto L_0x0063
        L_0x018c:
            r16 = r17
            goto L_0x019b
        L_0x018f:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0199
            goto L_0x0063
        L_0x0199:
            r16 = r18
        L_0x019b:
            switch(r16) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x01ab;
                case 2: goto L_0x01aa;
                case 3: goto L_0x01a9;
                case 4: goto L_0x01a8;
                case 5: goto L_0x01a7;
                case 6: goto L_0x01a6;
                case 7: goto L_0x01a5;
                case 8: goto L_0x01a9;
                case 9: goto L_0x01a9;
                case 10: goto L_0x01a4;
                case 11: goto L_0x01ae;
                case 12: goto L_0x01a3;
                case 13: goto L_0x01a8;
                case 14: goto L_0x01a6;
                case 15: goto L_0x01a2;
                case 16: goto L_0x01a1;
                case 17: goto L_0x01a6;
                case 18: goto L_0x01a8;
                case 19: goto L_0x01ae;
                case 20: goto L_0x01a0;
                case 21: goto L_0x019f;
                case 22: goto L_0x01a9;
                case 23: goto L_0x01a9;
                default: goto L_0x019e;
            }
        L_0x019e:
            return r19
        L_0x019f:
            return r8
        L_0x01a0:
            return r11
        L_0x01a1:
            return r3
        L_0x01a2:
            return r6
        L_0x01a3:
            return r17
        L_0x01a4:
            return r10
        L_0x01a5:
            return r2
        L_0x01a6:
            return r7
        L_0x01a7:
            return r1
        L_0x01a8:
            return r12
        L_0x01a9:
            return r9
        L_0x01aa:
            return r4
        L_0x01ab:
            r0 = 10
            return r0
        L_0x01ae:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.w(java.lang.String):int");
    }

    public static int x(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) ? 14 : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016d, code lost:
        if (r0.isEmpty() != false) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kp4 y(defpackage.gy8 r17) {
        /*
            r1 = r17
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 1
            r5 = 0
            int r0 = defpackage.lz7.N(r17)     // Catch:{ all -> 0x000e }
            r6 = r0
            goto L_0x003e
        L_0x000e:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x002c
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0019
        L_0x002c:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x003d
            if (r0 == r4) goto L_0x003c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003c:
            throw r6
        L_0x003d:
            r6 = r5
        L_0x003e:
            r7 = 0
            if (r6 != 0) goto L_0x0042
            return r7
        L_0x0042:
            r8 = r5
            r9 = r7
            r10 = r9
        L_0x0045:
            if (r8 >= r6) goto L_0x01d8
            java.lang.String r0 = defpackage.lz7.P(r17)     // Catch:{ all -> 0x004c }
            goto L_0x007c
        L_0x004c:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x006a
            java.lang.Object r12 = r0.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r11)
            goto L_0x0057
        L_0x006a:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x007b
            if (r0 == r4) goto L_0x007a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007a:
            throw r11
        L_0x007b:
            r0 = r7
        L_0x007c:
            if (r0 != 0) goto L_0x0080
            goto L_0x01d4
        L_0x0080:
            java.lang.String r11 = "discarded"
            boolean r11 = r0.equals(r11)
            r12 = 8
            r13 = 0
            if (r11 == 0) goto L_0x00fb
            av8 r0 = r17.n()     // Catch:{ all -> 0x00c6 }
            int r0 = r0.a()     // Catch:{ all -> 0x00c6 }
            if (r0 != r12) goto L_0x00b8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            int r9 = r17.x0()     // Catch:{ all -> 0x00c6 }
            r11 = r5
        L_0x00a0:
            if (r11 >= r9) goto L_0x00bc
            long r15 = defpackage.lz7.M(r1, r13)     // Catch:{ all -> 0x00c6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00c6 }
            long r15 = defpackage.lz7.M(r1, r13)     // Catch:{ all -> 0x00c6 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00c6 }
            r0.put(r12, r15)     // Catch:{ all -> 0x00c6 }
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00b8:
            r17.z()     // Catch:{ all -> 0x00c6 }
            r0 = r7
        L_0x00bc:
            if (r0 == 0) goto L_0x00c4
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00c8
        L_0x00c4:
            r0 = r7
            goto L_0x00c8
        L_0x00c6:
            r0 = move-exception
            goto L_0x00cb
        L_0x00c8:
            r9 = r0
            goto L_0x01d4
        L_0x00cb:
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.u7d.a
            java.util.Iterator r9 = r9.iterator()
        L_0x00d4:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r11 = r9.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r0)
            goto L_0x00d4
        L_0x00e7:
            int r9 = defpackage.k7d.a
            int r9 = defpackage.au1.s(r9)
            if (r9 == 0) goto L_0x00f8
            if (r9 == r4) goto L_0x00f7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f7:
            throw r0
        L_0x00f8:
            r9 = r7
            goto L_0x01d4
        L_0x00fb:
            java.lang.String r11 = "saved"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01a1
            av8 r0 = r17.n()     // Catch:{ all -> 0x0163 }
            int r0 = r0.a()     // Catch:{ all -> 0x0163 }
            if (r0 != r12) goto L_0x012b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0163 }
            r0.<init>()     // Catch:{ all -> 0x0163 }
            int r10 = r17.x0()     // Catch:{ all -> 0x0163 }
            r11 = r5
        L_0x0117:
            if (r11 >= r10) goto L_0x012f
            long r15 = defpackage.lz7.M(r1, r13)     // Catch:{ all -> 0x0163 }
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0163 }
            n7d r15 = defpackage.tfg.y(r17)     // Catch:{ all -> 0x0163 }
            r0.put(r12, r15)     // Catch:{ all -> 0x0163 }
            int r11 = r11 + 1
            goto L_0x0117
        L_0x012b:
            r17.z()     // Catch:{ all -> 0x0163 }
            r0 = r7
        L_0x012f:
            if (r0 == 0) goto L_0x016f
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0163 }
            r10.<init>()     // Catch:{ all -> 0x0163 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0163 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0163 }
        L_0x013e:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0163 }
            if (r11 == 0) goto L_0x0165
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0163 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0163 }
            java.lang.Object r12 = r11.getValue()     // Catch:{ all -> 0x0163 }
            n7d r12 = (defpackage.n7d) r12     // Catch:{ all -> 0x0163 }
            if (r12 != 0) goto L_0x0154
            r13 = r7
            goto L_0x015d
        L_0x0154:
            java.lang.Object r11 = r11.getKey()     // Catch:{ all -> 0x0163 }
            kpa r13 = new kpa     // Catch:{ all -> 0x0163 }
            r13.<init>(r11, r12)     // Catch:{ all -> 0x0163 }
        L_0x015d:
            if (r13 == 0) goto L_0x013e
            r10.add(r13)     // Catch:{ all -> 0x0163 }
            goto L_0x013e
        L_0x0163:
            r0 = move-exception
            goto L_0x0172
        L_0x0165:
            java.util.Map r0 = defpackage.mz7.c0(r10)     // Catch:{ all -> 0x0163 }
            boolean r10 = r0.isEmpty()     // Catch:{ all -> 0x0163 }
            if (r10 == 0) goto L_0x0170
        L_0x016f:
            r0 = r7
        L_0x0170:
            r10 = r0
            goto L_0x01d4
        L_0x0172:
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.u7d.a
            java.util.Iterator r10 = r10.iterator()
        L_0x017b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x018e
            java.lang.Object r11 = r10.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r0)
            goto L_0x017b
        L_0x018e:
            int r10 = defpackage.k7d.a
            int r10 = defpackage.au1.s(r10)
            if (r10 == 0) goto L_0x019f
            if (r10 == r4) goto L_0x019e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x019e:
            throw r0
        L_0x019f:
            r10 = r7
            goto L_0x01d4
        L_0x01a1:
            r17.z()     // Catch:{ all -> 0x01a5 }
            goto L_0x01d4
        L_0x01a5:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01b0:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x01c3
            java.lang.Object r12 = r0.next()
            r4a r12 = (defpackage.r4a) r12
            r12.getClass()
            defpackage.r4a.a(r11)
            goto L_0x01b0
        L_0x01c3:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01d4
            if (r0 == r4) goto L_0x01d3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d3:
            throw r11
        L_0x01d4:
            int r8 = r8 + 1
            goto L_0x0045
        L_0x01d8:
            kp4 r0 = new kp4
            r0.<init>(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1e.y(gy8):kp4");
    }

    public static final boolean z(sx3 sx3) {
        x77 x77 = (x77) sx3.getCoroutineContext().get(c32.X);
        if (x77 != null) {
            return x77.isActive();
        }
        return true;
    }

    public boolean A() {
        return false;
    }

    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    public void onSetSuccess() {
    }
}
