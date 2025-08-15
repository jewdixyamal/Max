package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import kotlin.coroutines.Continuation;

/* renamed from: x3c  reason: default package */
public final class x3c implements Provider, bbe {
    public Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ x3c(int i) {
        this.a = i;
    }

    public long a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            ((a4c) this.b).logException("RTCDeprecatedStat", "stat.parse", e);
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.hg7 r5, defpackage.uof r6, java.util.List r7, java.util.List r8, defpackage.l0f r9) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            boolean r1 = r8.isEmpty()     // Catch:{ all -> 0x001a }
            r1 = r1 ^ 1
            defpackage.c54.k(r1)     // Catch:{ all -> 0x001a }
            r4.Y = r9     // Catch:{ all -> 0x001a }
            eh7 r9 = r5.c()     // Catch:{ all -> 0x001a }
            jg7 r1 = r4.e(r9)     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x00a5
        L_0x001d:
            java.lang.Object r2 = r4.o     // Catch:{ all -> 0x001a }
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x001a }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r4.Y     // Catch:{ all -> 0x001a }
            l0f r2 = (defpackage.l0f) r2     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0032
            int r2 = r2.b     // Catch:{ all -> 0x001a }
            r3 = 2
            if (r2 == r3) goto L_0x0068
        L_0x0032:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001a }
        L_0x0036:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x001a }
            wa0 r2 = (defpackage.wa0) r2     // Catch:{ all -> 0x001a }
            java.lang.Object r3 = r4.c     // Catch:{ all -> 0x001a }
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch:{ all -> 0x001a }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x001a }
            hg7 r2 = (defpackage.hg7) r2     // Catch:{ all -> 0x001a }
            r2.getClass()     // Catch:{ all -> 0x001a }
            boolean r3 = r2.equals(r5)     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x0036
            java.util.List r2 = r2.e()     // Catch:{ all -> 0x001a }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x0060
            goto L_0x0036
        L_0x0060:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner."
            r4.<init>(r5)     // Catch:{ all -> 0x001a }
            throw r4     // Catch:{ all -> 0x001a }
        L_0x0068:
            xx1 r1 = r5.c     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            java.lang.Object r2 = r1.w0     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            monitor-enter(r2)     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            r1.t0 = r6     // Catch:{ all -> 0x009c }
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            xx1 r6 = r5.c     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            java.lang.Object r1 = r6.w0     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            monitor-enter(r1)     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            r6.u0 = r7     // Catch:{ all -> 0x0099 }
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            java.lang.Object r6 = r5.a     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            monitor-enter(r6)     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
            xx1 r5 = r5.c     // Catch:{ all -> 0x0094 }
            r5.c(r8)     // Catch:{ all -> 0x0094 }
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            gh7 r5 = r9.Q()     // Catch:{ all -> 0x001a }
            fg7 r5 = r5.d     // Catch:{ all -> 0x001a }
            fg7 r6 = defpackage.fg7.o     // Catch:{ all -> 0x001a }
            boolean r5 = r5.a(r6)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0092
            r4.k(r9)     // Catch:{ all -> 0x001a }
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return
        L_0x0094:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0094 }
            throw r4     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
        L_0x0097:
            r4 = move-exception
            goto L_0x009f
        L_0x0099:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0099 }
            throw r4     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
        L_0x009c:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x009c }
            throw r4     // Catch:{ CameraUseCaseAdapter$CameraException -> 0x0097 }
        L_0x009f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x001a }
            r5.<init>(r4)     // Catch:{ all -> 0x001a }
            throw r5     // Catch:{ all -> 0x001a }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3c.b(hg7, uof, java.util.List, java.util.List, l0f):void");
    }

    public vb0 c() {
        String str = ((Size) this.b) == null ? " resolution" : "";
        if (((eu4) this.c) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.o) == null) {
            str = au1.g(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.Y) == null) {
            str = au1.g(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new vb0((Size) this.b, (eu4) this.c, (Range) this.o, (ce3) this.X, ((Boolean) this.Y).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public hg7 d(eh7 eh7, xx1 xx1) {
        synchronized (this.b) {
            try {
                c54.j("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", ((HashMap) this.c).get(new wa0(eh7, xx1.X)) == null);
                hg7 hg7 = new hg7(eh7, xx1);
                if (((ArrayList) xx1.w()).isEmpty()) {
                    hg7.i();
                }
                if (eh7.Q().d == fg7.a) {
                    return hg7;
                }
                j(hg7);
                return hg7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public jg7 e(eh7 eh7) {
        synchronized (this.b) {
            try {
                for (jg7 jg7 : ((HashMap) this.o).keySet()) {
                    if (eh7.equals(jg7.b)) {
                        return jg7;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object f(Continuation continuation) {
        return j47.t0(((w9a) ((kke) ((je7) this.X).getValue())).b(), new a5d(this, (Continuation) null), continuation);
    }

    public int g(long j) {
        long[] jArr = (long[]) this.c;
        int b2 = oaf.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public Object get() {
        return new kd4((Executor) ((Provider) this.b).get(), (g99) ((Provider) this.c).get(), (z77) ((Provider) this.o).get(), (h45) ((Provider) this.X).get(), (fhe) ((Provider) this.Y).get());
    }

    public boolean h(eh7 eh7) {
        synchronized (this.b) {
            try {
                jg7 e = e(eh7);
                if (e == null) {
                    return false;
                }
                for (wa0 wa0 : (Set) ((HashMap) this.o).get(e)) {
                    hg7 hg7 = (hg7) ((HashMap) this.c).get(wa0);
                    hg7.getClass();
                    if (!hg7.e().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public long i(int i) {
        return ((long[]) this.c)[i];
    }

    public void j(hg7 hg7) {
        synchronized (this.b) {
            try {
                eh7 c2 = hg7.c();
                xx1 xx1 = hg7.c;
                wa0 wa0 = new wa0(c2, xx1.t(xx1.C0, xx1.D0));
                jg7 e = e(c2);
                Set hashSet = e != null ? (Set) ((HashMap) this.o).get(e) : new HashSet();
                hashSet.add(wa0);
                ((HashMap) this.c).put(wa0, hg7);
                if (e == null) {
                    jg7 jg7 = new jg7(c2, this);
                    ((HashMap) this.o).put(jg7, hashSet);
                    c2.Q().a(jg7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(eh7 eh7) {
        synchronized (this.b) {
            try {
                if (h(eh7)) {
                    if (((ArrayDeque) this.X).isEmpty()) {
                        ((ArrayDeque) this.X).push(eh7);
                    } else {
                        l0f l0f = (l0f) this.Y;
                        if (l0f == null || l0f.b != 2) {
                            eh7 eh72 = (eh7) ((ArrayDeque) this.X).peek();
                            if (!eh7.equals(eh72)) {
                                m(eh72);
                                ((ArrayDeque) this.X).remove(eh7);
                                ((ArrayDeque) this.X).push(eh7);
                            }
                        }
                    }
                    q(eh7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(eh7 eh7) {
        synchronized (this.b) {
            try {
                ((ArrayDeque) this.X).remove(eh7);
                m(eh7);
                if (!((ArrayDeque) this.X).isEmpty()) {
                    q((eh7) ((ArrayDeque) this.X).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(eh7 eh7) {
        synchronized (this.b) {
            try {
                jg7 e = e(eh7);
                if (e != null) {
                    for (wa0 wa0 : (Set) ((HashMap) this.o).get(e)) {
                        hg7 hg7 = (hg7) ((HashMap) this.c).get(wa0);
                        hg7.getClass();
                        hg7.i();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(List list) {
        synchronized (this.b) {
            for (wa0 wa0 : ((HashMap) this.c).keySet()) {
                hg7 hg7 = (hg7) ((HashMap) this.c).get(wa0);
                boolean z = !hg7.e().isEmpty();
                synchronized (hg7.a) {
                    ArrayList arrayList = new ArrayList(list);
                    arrayList.retainAll(hg7.c.w());
                    hg7.c.z(arrayList);
                }
                if (z) {
                    if (hg7.e().isEmpty()) {
                        l(hg7.c());
                    }
                }
            }
        }
    }

    public void o() {
        synchronized (this.b) {
            for (wa0 wa0 : ((HashMap) this.c).keySet()) {
                hg7 hg7 = (hg7) ((HashMap) this.c).get(wa0);
                synchronized (hg7.a) {
                    xx1 xx1 = hg7.c;
                    xx1.z((ArrayList) xx1.w());
                }
                l(hg7.c());
            }
        }
    }

    public List p(long j) {
        q3f q3f = (q3f) this.b;
        q3f.getClass();
        ArrayList arrayList = new ArrayList();
        q3f.g(j, q3f.h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        q3f.i(j2, false, q3f.h, treeMap);
        Map map = (Map) this.X;
        q3f.h(j2, (Map) this.o, map, q3f.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.Y).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                t3f t3f = (t3f) map.get(pair.first);
                t3f.getClass();
                arrayList2.add(new yz3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, t3f.c, 0, t3f.e, t3f.b, 0, Integer.MIN_VALUE, -3.4028235E38f, t3f.f, t3f.g, false, -16777216, t3f.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            t3f t3f2 = (t3f) map.get(entry.getKey());
            t3f2.getClass();
            wz3 wz3 = (wz3) entry.getValue();
            CharSequence charSequence = wz3.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (ih4 ih4 : (ih4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ih4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(ih4), spannableStringBuilder.getSpanEnd(ih4), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == 10) {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == 10) {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            wz3.e = t3f2.c;
            wz3.f = t3f2.d;
            wz3.g = t3f2.e;
            wz3.h = t3f2.b;
            wz3.l = t3f2.f;
            wz3.k = t3f2.i;
            wz3.j = t3f2.h;
            wz3.p = t3f2.j;
            arrayList2.add(wz3.a());
        }
        return arrayList2;
    }

    public void q(eh7 eh7) {
        synchronized (this.b) {
            try {
                for (wa0 wa0 : (Set) ((HashMap) this.o).get(e(eh7))) {
                    hg7 hg7 = (hg7) ((HashMap) this.c).get(wa0);
                    hg7.getClass();
                    if (!hg7.e().isEmpty()) {
                        hg7.q();
                    }
                }
            } finally {
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(super.toString());
                sb.append(10);
                for (Field field : x3c.class.getDeclaredFields()) {
                    try {
                        sb.append(field.getName());
                        sb.append('=');
                        sb.append(field.get(this));
                        sb.append(10);
                    } catch (IllegalAccessException e) {
                        sb.append("\nCaught ");
                        sb.append(e.getMessage());
                        sb.append(10);
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        return ((long[]) this.c).length;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076 A[Catch:{ NumberFormatException -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009d A[Catch:{ NumberFormatException -> 0x0053 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x3c(defpackage.a4c r17, org.webrtc.StatsReport[] r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r0 = 0
            r1.a = r0
            r16.<init>()
            r0 = 0
            r1.c = r0
            r1.b = r2
            int r4 = r3.length
            r6 = 0
        L_0x0013:
            if (r6 >= r4) goto L_0x0236
            r7 = r3[r6]
            java.lang.String r0 = r7.type
            java.lang.String r8 = "VideoBwe"
            boolean r0 = r0.equals(r8)
            java.lang.String r8 = "stat.parse"
            java.lang.String r9 = "RTCDeprecatedStat"
            if (r0 == 0) goto L_0x00ae
            org.webrtc.StatsReport$Value[] r10 = r7.values
            int r11 = r10.length
            r12 = 0
        L_0x0029:
            if (r12 >= r11) goto L_0x00ae
            r0 = r10[r12]
            java.lang.String r13 = r0.name     // Catch:{ NumberFormatException -> 0x0053 }
            int r14 = r13.hashCode()     // Catch:{ NumberFormatException -> 0x0053 }
            r5 = -1709278787(0xffffffff9a1e79bd, float:-3.2771974E-23)
            r15 = 2
            if (r14 == r5) goto L_0x0069
            r5 = -1197172950(0xffffffffb8a4972a, float:-7.848286E-5)
            if (r14 == r5) goto L_0x005f
            r5 = 1074688577(0x400e7241, float:2.2257235)
            if (r14 == r5) goto L_0x0055
            r5 = 1093751428(0x41315284, float:11.082645)
            if (r14 == r5) goto L_0x0049
            goto L_0x0073
        L_0x0049:
            java.lang.String r5 = "googTargetEncBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 0
            goto L_0x0074
        L_0x0053:
            r0 = move-exception
            goto L_0x00a7
        L_0x0055:
            java.lang.String r5 = "googActualEncBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = r15
            goto L_0x0074
        L_0x005f:
            java.lang.String r5 = "googRetransmitBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 3
            goto L_0x0074
        L_0x0069:
            java.lang.String r5 = "googTransmitBitrate"
            boolean r5 = r13.equals(r5)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r5 == 0) goto L_0x0073
            r5 = 1
            goto L_0x0074
        L_0x0073:
            r5 = -1
        L_0x0074:
            if (r5 == 0) goto L_0x009d
            r13 = 1
            if (r5 == r13) goto L_0x0093
            if (r5 == r15) goto L_0x0089
            r13 = 3
            if (r5 == r13) goto L_0x007f
            goto L_0x00aa
        L_0x007f:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x0089:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x0093:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x009d:
            java.lang.String r0 = r0.value     // Catch:{ NumberFormatException -> 0x0053 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0053 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x0053 }
            goto L_0x00aa
        L_0x00a7:
            r2.logException(r9, r8, r0)
        L_0x00aa:
            int r12 = r12 + 1
            goto L_0x0029
        L_0x00ae:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            org.webrtc.StatsReport$Value[] r0 = r7.values
            int r10 = r0.length
            r11 = 0
        L_0x00b7:
            if (r11 >= r10) goto L_0x00c5
            r12 = r0[r11]
            java.lang.String r13 = r12.name
            java.lang.String r12 = r12.value
            r5.put(r13, r12)
            int r11 = r11 + 1
            goto L_0x00b7
        L_0x00c5:
            java.lang.String r0 = r7.type
            java.lang.String r10 = "ssrc"
            boolean r0 = r0.equals(r10)
            java.lang.String r11 = "video"
            java.lang.String r12 = "mediaType"
            if (r0 == 0) goto L_0x0135
            java.lang.String r0 = r7.id
            java.lang.String r13 = "recv"
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r5.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equals(r0)
            java.lang.String r13 = "googJitterBufferMs"
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = "googNacksSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "googPlisSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "googFirsSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.Object r0 = r5.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "framesDecoded"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "framesReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            goto L_0x0135
        L_0x012c:
            java.lang.Object r0 = r5.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
        L_0x0135:
            java.lang.String r0 = r7.type
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = r7.id
            java.lang.String r10 = "send"
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x01e0
            java.lang.Object r0 = r5.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "framesEncoded"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "googNacksReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "googPlisReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "googFirsReceived"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "googAvgEncodeMs"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googAdaptationChanges"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googFrameWidthSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "googFrameHeightSent"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r0 == 0) goto L_0x01b6
            if (r10 == 0) goto L_0x01b6
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01b2 }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            java.lang.Math.min(r0, r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            java.lang.Math.max(r0, r10)     // Catch:{ NumberFormatException -> 0x01b2 }
            goto L_0x01b6
        L_0x01b2:
            r0 = move-exception
            r2.logException(r9, r8, r0)
        L_0x01b6:
            java.lang.String r0 = "bytesSent"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.a(r0)
            java.lang.String r0 = "packetsLost"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r10 = "packetsSent"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x01e0
            if (r0 == 0) goto L_0x01e0
            java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01dc }
            java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x01dc }
            goto L_0x01e0
        L_0x01dc:
            r0 = move-exception
            r2.logException(r9, r8, r0)
        L_0x01e0:
            java.lang.String r0 = r7.type
            java.lang.String r7 = "googCandidatePair"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "googActiveConnection"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "true"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x021e
            java.lang.String r0 = "googRtt"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googTransportType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = "googRemoteCandidateType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.c = r0
            java.lang.String r0 = "googLocalCandidateType"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.o = r0
        L_0x021e:
            java.lang.String r0 = "googLocalAddress"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.X = r0
            java.lang.String r0 = "googRemoteAddress"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1.Y = r0
        L_0x0232:
            int r6 = r6 + 1
            goto L_0x0013
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x3c.<init>(a4c, org.webrtc.StatsReport[]):void");
    }

    public x3c(je7 je7, je7 je72, je7 je73, Set set) {
        this.a = 5;
        this.b = je73;
        this.c = set;
        this.o = je7;
        this.X = je72;
        AtomicReference atomicReference = new AtomicReference(wz4.a);
        this.Y = atomicReference;
        if (!set.isEmpty()) {
            atomicReference.updateAndGet(new oz0(this, 3, new LinkedHashSet()));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3c(je7 je7, je7 je72, je7 je73, int i) {
        this(je7, je72, (i & 4) != 0 ? null : je73, (Set) wz4.a);
        this.a = 5;
    }

    public x3c(Provider provider, Provider provider2, c8d c8d, Provider provider3, Provider provider4) {
        this.a = 2;
        this.b = provider;
        this.c = provider2;
        this.o = c8d;
        this.X = provider3;
        this.Y = provider4;
    }

    public x3c(q3f q3f, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = 6;
        this.b = q3f;
        this.X = hashMap2;
        this.Y = hashMap3;
        this.o = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        q3f.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.c = jArr;
    }

    public x3c() {
        this.a = 3;
        this.b = new Object();
        this.c = new HashMap();
        this.o = new HashMap();
        this.X = new ArrayDeque();
    }
}
