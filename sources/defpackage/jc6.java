package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

/* renamed from: jc6  reason: default package */
public final class jc6 implements o55, Provider, abe {
    public static int Y;
    public Object X;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public jc6(p3f p3f, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = p3f;
        this.o = hashMap2;
        this.X = hashMap3;
        this.c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        p3f.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.jc6 r4, long r5, java.util.List r7, kotlin.coroutines.Continuation r8) {
        /*
            r4.getClass()
            boolean r0 = r8 instanceof defpackage.hc6
            if (r0 == 0) goto L_0x0016
            r0 = r8
            hc6 r0 = (defpackage.hc6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x001b
        L_0x0016:
            hc6 r0 = new hc6
            r0.<init>(r4, r8)
        L_0x001b:
            java.lang.Object r8 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            defpackage.od2.a0(r8)
            goto L_0x004d
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            defpackage.od2.a0(r8)
            java.lang.Object r4 = r4.c
            je7 r4 = (defpackage.je7) r4
            java.lang.Object r4 = r4.getValue()
            ome r4 = (defpackage.ome) r4
            tq2 r8 = new tq2
            r8.<init>((long) r5, (java.util.List) r7)
            r0.Y = r3
            java.lang.Object r8 = r4.e(r8, r0)
            if (r8 != r1) goto L_0x004d
            goto L_0x0051
        L_0x004d:
            xe9 r8 = (defpackage.xe9) r8
            java.util.List r1 = r8.o
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jc6.b(jc6, long, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public ExecutorService a() {
        return (ExecutorService) this.b;
    }

    public ExecutorService c() {
        return (ExecutorService) this.o;
    }

    public ExecutorService d() {
        return (ExecutorService) this.c;
    }

    public ExecutorService e() {
        return (ExecutorService) this.a;
    }

    public void f(qv4 qv4, ov4 ov4, boolean z) {
        cqc.b((iq1) this.X);
        hle hle = (hle) this.b;
        Resources resources = (Resources) this.a;
        iqd e = (ov4 == null || !ov4.o) ? ((pkg) this.c).e(resources, hle) : ((pkg) this.o).e(resources, hle);
        iq1 iq1 = new iq1(new t64(this, qv4, ov4, z), 2, new yt8(17, (Object) this));
        e.k(iq1);
        this.X = iq1;
    }

    public int g(long j) {
        long[] jArr = (long[]) this.b;
        int b2 = maf.b(jArr, j, false);
        if (b2 < jArr.length) {
            return b2;
        }
        return -1;
    }

    public Object get() {
        return new gqc((d9f) ((Provider) this.a).get(), (d9f) ((Provider) this.b).get(), (ka0) ((Provider) this.c).get(), (puc) ((Provider) this.o).get(), (Provider) this.X);
    }

    public ExecutorService h() {
        return (ExecutorService) this.a;
    }

    public long i(int i) {
        return ((long[]) this.b)[i];
    }

    public ExecutorService j() {
        return (ExecutorService) this.a;
    }

    public o90 k() {
        String str = ((Range) this.a) == null ? " bitrate" : "";
        if (((Integer) this.b) == null) {
            str = str.concat(" sourceFormat");
        }
        if (((Integer) this.c) == null) {
            str = au1.g(str, " source");
        }
        if (((Range) this.o) == null) {
            str = au1.g(str, " sampleRate");
        }
        if (((Integer) this.X) == null) {
            str = au1.g(str, " channelCount");
        }
        if (str.isEmpty()) {
            return new o90((Range) this.a, ((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (Range) this.o, ((Integer) this.X).intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void l() {
        kq0.e();
        l84 l84 = (l84) this.c;
        l84.getClass();
        kq0.e();
        y90 y90 = (y90) l84.d;
        Objects.requireNonNull(y90);
        hqc hqc = (hqc) l84.b;
        Objects.requireNonNull(hqc);
        l84.getClass();
        fw6 fw6 = y90.b;
        Objects.requireNonNull(fw6);
        fw6.a();
        fw6 fw62 = y90.b;
        Objects.requireNonNull(fw62);
        kq0.w(fw62.e).d(new nz1(hqc, 0), ju0.D());
        fw6 fw63 = y90.c;
        if (fw63 != null) {
            fw63.a();
            kq0.w(y90.c.e).d(new nz1((hqc) null, 1), ju0.D());
        }
        ((w9b) this.o).getClass();
    }

    public List p(long j) {
        p3f p3f = (p3f) this.a;
        p3f.getClass();
        ArrayList arrayList = new ArrayList();
        p3f.g(j, p3f.h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j2 = j;
        p3f.i(j2, false, p3f.h, treeMap);
        Map map = (Map) this.o;
        p3f.h(j2, (Map) this.c, map, p3f.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((Map) this.X).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                s3f s3f = (s3f) map.get(pair.first);
                s3f.getClass();
                arrayList2.add(new xz3((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, s3f.c, 0, s3f.e, s3f.b, 0, Integer.MIN_VALUE, -3.4028235E38f, s3f.f, s3f.g, false, -16777216, s3f.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            s3f s3f2 = (s3f) map.get(entry.getKey());
            s3f2.getClass();
            vz3 vz3 = (vz3) entry.getValue();
            CharSequence charSequence = vz3.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (hh4 hh4 : (hh4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hh4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(hh4), spannableStringBuilder.getSpanEnd(hh4), "");
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
            vz3.e = s3f2.c;
            vz3.f = s3f2.d;
            vz3.g = s3f2.e;
            vz3.h = s3f2.b;
            vz3.l = s3f2.f;
            vz3.k = s3f2.i;
            vz3.j = s3f2.h;
            vz3.p = s3f2.j;
            arrayList2.add(vz3.a());
        }
        return arrayList2;
    }

    public int u() {
        return ((long[]) this.b).length;
    }
}
