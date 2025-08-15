package defpackage;

import android.graphics.Bitmap;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.os.Parcel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpStatus;

/* renamed from: kj6  reason: default package */
public final class kj6 implements s43, b7b, qj3, lm9, ihb, mbe, rh {
    public static final kj6 X = new kj6(4);
    public static final kj6 Y = new kj6(5);
    public static final kj6 b = new kj6(1);
    public static final kj6 c = new kj6(2);
    public static final kj6 o = new kj6(3);
    public final /* synthetic */ int a;

    public /* synthetic */ kj6(int i) {
        this.a = i;
    }

    public static byte[] d(long j, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yz3 yz3 = (yz3) it.next();
            Bundle b2 = yz3.b();
            Bitmap bitmap = yz3.d;
            if (bitmap != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                fm9.k(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                b2.putByteArray(yz3.w, byteArrayOutputStream.toByteArray());
            }
            arrayList.add(b2);
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static boolean g(File file) {
        Object obj;
        try {
            obj = Boolean.valueOf(file.exists() && file.canRead());
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof njc) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public static boolean h(String str) {
        Object obj;
        try {
            obj = Boolean.valueOf(g(new File(str)));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof njc) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public static Font k(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : HttpStatus.SC_BAD_REQUEST, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int n = n(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int n2 = n(fontStyle, font2.getStyle());
            if (n2 < n) {
                font = font2;
                n = n2;
            }
        }
        return font;
    }

    public static ub8 m(int i) {
        Object obj;
        v25 v25 = ub8.Z;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((ub8) obj).ordinal() == i) {
                break;
            }
        }
        ub8 ub8 = (ub8) obj;
        return ub8 == null ? ub8.b : ub8;
    }

    public static int n(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static File p(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int E0 = w9e.E0(str, '.', 0, 6);
        int i = 0;
        while (i < 100) {
            if (E0 != -1) {
                str2 = str.substring(0, E0) + "(" + (i + 1) + ")" + str.substring(E0);
            } else {
                str2 = str + "(" + (i + 1) + ")";
            }
            File file3 = new File(file, str2);
            if (!file3.exists()) {
                return file3;
            }
            i++;
            file2 = file3;
        }
        return file2;
    }

    public static void r(String str) {
        Object obj;
        Object obj2;
        try {
            File file = new File(str);
            obj2 = Boolean.valueOf(file.exists() ? file.delete() : false);
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj3 = Boolean.FALSE;
        if (obj2 instanceof njc) {
            obj2 = obj3;
        }
        obj = (Boolean) obj2;
        Object obj4 = Boolean.FALSE;
        if (obj instanceof njc) {
            obj = obj4;
        }
        Boolean bool = (Boolean) obj;
    }

    public boolean a(qy5 qy5) {
        return false;
    }

    public void accept(Object obj) {
    }

    public void b(p05 p05) {
        q80 q80 = q80.a;
        pa7 pa7 = (pa7) p05;
        pa7.a(fl0.class, q80);
        pa7.a(s90.class, q80);
        t80 t80 = t80.a;
        pa7.a(ws7.class, t80);
        pa7.a(ya0.class, t80);
        r80 r80 = r80.a;
        pa7.a(o33.class, r80);
        pa7.a(z90.class, r80);
        p80 p80 = p80.a;
        pa7.a(kd.class, p80);
        pa7.a(k90.class, p80);
        s80 s80 = s80.a;
        pa7.a(qs7.class, s80);
        pa7.a(xa0.class, s80);
        u80 u80 = u80.a;
        pa7.a(sn9.class, u80);
        pa7.a(bb0.class, u80);
    }

    public n85[] c(l85[] l85Arr, hg0 hg0) {
        int i;
        fk0 fk0;
        int i2;
        l85[] l85Arr2 = l85Arr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= l85Arr2.length) {
                break;
            }
            l85 l85 = l85Arr2[i4];
            if (l85 == null || l85.b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ww6 i5 = zw6.i();
                i5.d(new a9(0, 0));
                arrayList.add(i5);
            }
            i4++;
        }
        int length = l85Arr2.length;
        long[][] jArr = new long[length][];
        for (int i6 = 0; i6 < l85Arr2.length; i6++) {
            l85 l852 = l85Arr2[i6];
            if (l852 == null) {
                jArr[i6] = new long[0];
            } else {
                int[] iArr = l852.b;
                jArr[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = (long) l852.a.d[iArr[i7]].i;
                    long[] jArr2 = jArr[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i7] = j;
                }
                Arrays.sort(jArr[i6]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            long[] jArr4 = jArr[i8];
            jArr3[i8] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        c9.v(arrayList, jArr3);
        pg9 g = sh0.H().c().g();
        int i9 = 0;
        while (i9 < length) {
            long[] jArr5 = jArr[i9];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i10 = i3;
                while (true) {
                    long[] jArr6 = jArr[i9];
                    double d = 0.0d;
                    if (i10 >= jArr6.length) {
                        break;
                    }
                    int i11 = length;
                    long j2 = jArr6[i10];
                    if (j2 != -1) {
                        d = Math.log((double) j2);
                    }
                    dArr[i10] = d;
                    i10++;
                    length = i11;
                }
                i2 = length;
                int i12 = length2 - 1;
                double d2 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d3 = dArr[i13];
                    i13++;
                    g.g(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i13]) * 0.5d) - dArr[0]) / d2), Integer.valueOf(i9));
                }
            }
            i9++;
            length = i2;
            i3 = 0;
            i = 1;
        }
        zw6 j3 = zw6.j(g.h());
        for (int i14 = 0; i14 < j3.size(); i14++) {
            int intValue = ((Integer) j3.get(i14)).intValue();
            int i15 = iArr2[intValue] + 1;
            iArr2[intValue] = i15;
            jArr3[intValue] = jArr[intValue][i15];
            c9.v(arrayList, jArr3);
        }
        for (int i16 = 0; i16 < l85Arr2.length; i16++) {
            if (arrayList.get(i16) != null) {
                jArr3[i16] = jArr3[i16] * 2;
            }
        }
        c9.v(arrayList, jArr3);
        ww6 i17 = zw6.i();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            ww6 ww6 = (ww6) arrayList.get(i18);
            i17.d(ww6 == null ? zw6.m() : ww6.j());
        }
        ffc j4 = i17.j();
        n85[] n85Arr = new n85[l85Arr2.length];
        for (int i19 = 0; i19 < l85Arr2.length; i19++) {
            l85 l853 = l85Arr2[i19];
            if (l853 != null) {
                int[] iArr3 = l853.b;
                if (iArr3.length != 0) {
                    if (iArr3.length == 1) {
                        fk0 = new fk0(l853.a, new int[]{iArr3[0]});
                    } else {
                        long j5 = (long) 25000;
                        fk0 = new c9(l853.a, iArr3, hg0, (long) 10000, j5, j5, 1279, 719, 0.7f, 0.75f, (zw6) j4.get(i19), she.a);
                    }
                    n85Arr[i19] = fk0;
                }
            }
        }
        return n85Arr;
    }

    public obe e(qy5 qy5) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    public void f(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) serializable;
        }
    }

    public void i(String str) {
        hm9.m("Webm", str, new Object[0]);
    }

    public void j(String str, Throwable th) {
        hm9.p("Webm", str, th);
    }

    public int l(qy5 qy5) {
        return 1;
    }

    public void o(Throwable th) {
        hm9.p("Webm", "fail!", th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.io.Closeable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ all -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object q(java.io.File r13, java.io.InputStream r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.jk5
            if (r0 == 0) goto L_0x0013
            r0 = r15
            jk5 r0 = (defpackage.jk5) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            jk5 r0 = new jk5
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r12 = r0.u0
            tx3 r15 = defpackage.tx3.a
            int r1 = r0.w0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0043
            if (r1 != r3) goto L_0x003b
            long r13 = r0.t0
            byte[] r1 = r0.s0
            java.io.OutputStream r4 = r0.Z
            java.io.Closeable r5 = r0.Y
            java.io.InputStream r6 = r0.X
            java.io.Closeable r7 = r0.o
            defpackage.od2.a0(r12)     // Catch:{ all -> 0x0038 }
            r12 = r6
            r10 = r13
            r14 = r7
            r6 = r10
            goto L_0x007a
        L_0x0038:
            r12 = move-exception
            r14 = r7
            goto L_0x0093
        L_0x003b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0043:
            defpackage.od2.a0(r12)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream
            r5.<init>(r13, r2)
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x0082 }
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            int r13 = r14.read(r12)     // Catch:{ all -> 0x0082 }
            r6 = 0
            r1 = r12
            r12 = r14
            r4 = r5
        L_0x005b:
            if (r13 < 0) goto L_0x0084
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            r4.write(r1, r2, r13)     // Catch:{ all -> 0x0082 }
            long r8 = (long) r13     // Catch:{ all -> 0x0082 }
            long r6 = r6 + r8
            r0.o = r14     // Catch:{ all -> 0x0082 }
            r0.X = r12     // Catch:{ all -> 0x0082 }
            r0.Y = r5     // Catch:{ all -> 0x0082 }
            r0.Z = r4     // Catch:{ all -> 0x0082 }
            r0.s0 = r1     // Catch:{ all -> 0x0082 }
            r0.t0 = r6     // Catch:{ all -> 0x0082 }
            r0.w0 = r3     // Catch:{ all -> 0x0082 }
            java.lang.Object r13 = defpackage.i24.L(r0)     // Catch:{ all -> 0x0082 }
            if (r13 != r15) goto L_0x007a
            return r15
        L_0x007a:
            java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            int r13 = r12.read(r1)     // Catch:{ all -> 0x0082 }
            goto L_0x005b
        L_0x0082:
            r12 = move-exception
            goto L_0x0093
        L_0x0084:
            r4.flush()     // Catch:{ all -> 0x0082 }
            r12 = 0
            defpackage.v3c.i(r5, r12)     // Catch:{ all -> 0x0091 }
            defpackage.v3c.i(r14, r12)
            e5f r12 = defpackage.e5f.a
            return r12
        L_0x0091:
            r12 = move-exception
            goto L_0x0099
        L_0x0093:
            throw r12     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r13 = move-exception
            defpackage.v3c.i(r5, r12)     // Catch:{ all -> 0x0091 }
            throw r13     // Catch:{ all -> 0x0091 }
        L_0x0099:
            throw r12     // Catch:{ all -> 0x009a }
        L_0x009a:
            r13 = move-exception
            defpackage.v3c.i(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj6.q(java.io.File, java.io.InputStream, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean test(Object obj) {
        return fme.a(((Number) obj).intValue());
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return "EmptyConsumer";
            case 13:
                return "MediaItemType";
            default:
                return super.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [qpd, us] */
    public gle w(gy8 gy8) {
        int i;
        String str;
        int i2;
        if (!gy8.m()) {
            return null;
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        ? qpd = new qpd(0);
        for (int i3 = 0; i3 < i; i3++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("messagesReactions")) {
                    try {
                        i2 = lz7.N(gy8);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 == 0) {
                            i2 = 0;
                        } else if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        long j = 0;
                        try {
                            j = lz7.M(gy8, 0);
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 != 0) {
                                if (s4 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw th4;
                            }
                        }
                        fx8 F = ote.F(gy8);
                        if (F != null) {
                            qpd.put(Long.valueOf(j), F);
                        }
                    }
                    continue;
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 != 0) {
                            if (s5 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th5;
                        }
                    }
                }
            }
        }
        return new cf9(qpd);
    }

    public kj6() {
        this.a = 18;
        new ConcurrentHashMap();
    }

    public kj6(kd7 kd7, kd7 kd72) {
        this.a = 8;
        kd7.getClass();
        kd72.getClass();
        c54.k(0.0f <= 0.0f);
    }
}
