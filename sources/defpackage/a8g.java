package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.animated.gif.GifImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import ru.ok.tamtam.nano.Protos;

/* renamed from: a8g  reason: default package */
public final class a8g implements ik8, nr4, hk8, mr4, obe, u3d, uw4 {
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ a8g(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static void k(String str) {
        FileInputStream fileInputStream;
        try {
            File file = new File(str);
            MessageDigest instance = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    String.format("%32x", new Object[]{new BigInteger(1, instance.digest())});
                    fileInputStream.close();
                    return;
                }
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            e.toString();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A(int i, yj8 yj8, pc8 pc8) {
        if (o(i, yj8)) {
            ((jn) this.b).P(p(pc8, yj8));
        }
    }

    public void B(int i, xj8 xj8) {
        if (m(i, xj8)) {
            ((kr4) this.c).f();
        }
    }

    public void C(int i, yj8 yj8) {
        if (o(i, yj8)) {
            ((lr4) this.c).b();
        }
    }

    public void D(int i, yj8 yj8) {
        if (o(i, yj8)) {
            ((lr4) this.c).a();
        }
    }

    public void E(int i, xj8 xj8, pc8 pc8) {
        if (m(i, xj8)) {
            ((gk8) this.b).c(pc8);
        }
    }

    public void F(int i, xj8 xj8, pc8 pc8) {
        if (m(i, xj8)) {
            ((gk8) this.b).m(pc8);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01df, code lost:
        r11 = 128;
        r15 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(byte[] r33, int r34, int r35, defpackage.nbe r36, defpackage.pj3 r37) {
        /*
            r32 = this;
            r0 = r32
            r1 = r34
            r2 = 4
            r3 = 128(0x80, float:1.794E-43)
            int r5 = r1 + r35
            java.lang.Object r6 = r0.a
            wpa r6 = (defpackage.wpa) r6
            r7 = r33
            r6.E(r5, r7)
            r6.G(r1)
            int r1 = r6.a()
            r5 = 255(0xff, float:3.57E-43)
            r7 = 0
            r8 = 2
            if (r1 <= 0) goto L_0x00ab
            byte[] r1 = r6.a
            int r9 = r6.b
            byte r1 = r1[r9]
            r1 = r1 & r5
            r9 = 120(0x78, float:1.68E-43)
            if (r1 != r9) goto L_0x00ab
            java.lang.Object r1 = r0.o
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            if (r1 != 0) goto L_0x0037
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
            r0.o = r1
        L_0x0037:
            java.lang.Object r1 = r0.o
            java.util.zip.Inflater r1 = (java.util.zip.Inflater) r1
            int r9 = defpackage.oaf.a
            int r9 = r6.a()
            if (r9 > 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            java.lang.Object r9 = r0.b
            wpa r9 = (defpackage.wpa) r9
            byte[] r10 = r9.a
            int r10 = r10.length
            int r11 = r6.a()
            if (r10 >= r11) goto L_0x0059
            int r10 = r6.a()
            int r10 = r10 * r8
            r9.b(r10)
        L_0x0059:
            if (r1 != 0) goto L_0x0060
            java.util.zip.Inflater r1 = new java.util.zip.Inflater
            r1.<init>()
        L_0x0060:
            byte[] r10 = r6.a
            int r11 = r6.b
            int r12 = r6.a()
            r1.setInput(r10, r11, r12)
            r10 = r7
        L_0x006c:
            byte[] r11 = r9.a     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r12 - r10
            int r11 = r1.inflate(r11, r10, r12)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r10 = r10 + r11
            boolean r11 = r1.finished()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 == 0) goto L_0x008b
            r9.F(r10)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            r1.reset()
            byte[] r1 = r9.a
            int r9 = r9.c
            r6.E(r9, r1)
            goto L_0x00ab
        L_0x0089:
            r0 = move-exception
            goto L_0x00a7
        L_0x008b:
            boolean r11 = r1.needsDictionary()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 != 0) goto L_0x00a3
            boolean r11 = r1.needsInput()     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r11 == 0) goto L_0x0098
            goto L_0x00a3
        L_0x0098:
            byte[] r11 = r9.a     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r12 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            if (r10 != r12) goto L_0x006c
            int r11 = r11.length     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            int r11 = r11 * r8
            r9.b(r11)     // Catch:{ DataFormatException -> 0x00a3, all -> 0x0089 }
            goto L_0x006c
        L_0x00a3:
            r1.reset()
            goto L_0x00ab
        L_0x00a7:
            r1.reset()
            throw r0
        L_0x00ab:
            java.lang.Object r0 = r0.c
            nua r0 = (defpackage.nua) r0
            r0.c = r7
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            java.lang.Object r1 = r0.i
            wpa r1 = (defpackage.wpa) r1
            r1.D(r7)
            r0.b = r7
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
        L_0x00c9:
            int r9 = r6.a()
            r10 = 3
            if (r9 < r10) goto L_0x02be
            int r9 = r6.c
            int r11 = r6.u()
            int r12 = r6.A()
            int r13 = r6.b
            int r13 = r13 + r12
            if (r13 <= r9) goto L_0x00e9
            r6.G(r9)
            r11 = r3
            r35 = r14
            r9 = 1
            r15 = 0
            goto L_0x02b1
        L_0x00e9:
            java.lang.Object r9 = r0.a
            int[] r9 = (int[]) r9
            if (r11 == r3) goto L_0x01e5
            switch(r11) {
                case 20: goto L_0x0161;
                case 21: goto L_0x0119;
                case 22: goto L_0x00f6;
                default: goto L_0x00f2;
            }
        L_0x00f2:
            r35 = r14
            goto L_0x01df
        L_0x00f6:
            r9 = 19
            if (r12 >= r9) goto L_0x00fb
            goto L_0x00f2
        L_0x00fb:
            int r9 = r6.A()
            r0.c = r9
            int r9 = r6.A()
            r0.d = r9
            r9 = 11
            r6.H(r9)
            int r9 = r6.A()
            r0.e = r9
            int r9 = r6.A()
            r0.f = r9
            goto L_0x00f2
        L_0x0119:
            if (r12 >= r2) goto L_0x011c
            goto L_0x00f2
        L_0x011c:
            r6.H(r10)
            int r9 = r6.u()
            r9 = r9 & r3
            if (r9 == 0) goto L_0x0128
            r9 = 1
            goto L_0x0129
        L_0x0128:
            r9 = r7
        L_0x0129:
            int r10 = r12 + -4
            if (r9 == 0) goto L_0x014a
            r9 = 7
            if (r10 >= r9) goto L_0x0131
            goto L_0x00f2
        L_0x0131:
            int r9 = r6.x()
            if (r9 >= r2) goto L_0x0138
            goto L_0x00f2
        L_0x0138:
            int r10 = r6.A()
            r0.g = r10
            int r10 = r6.A()
            r0.h = r10
            int r9 = r9 - r2
            r1.D(r9)
            int r10 = r12 + -11
        L_0x014a:
            int r9 = r1.b
            int r11 = r1.c
            if (r9 >= r11) goto L_0x00f2
            if (r10 <= 0) goto L_0x00f2
            int r11 = r11 - r9
            int r10 = java.lang.Math.min(r10, r11)
            byte[] r11 = r1.a
            r6.e(r9, r11, r10)
            int r9 = r9 + r10
            r1.G(r9)
            goto L_0x00f2
        L_0x0161:
            int r10 = r12 % 5
            if (r10 == r8) goto L_0x0166
            goto L_0x00f2
        L_0x0166:
            r6.H(r8)
            java.util.Arrays.fill(r9, r7)
            int r12 = r12 / 5
            r10 = r7
        L_0x016f:
            if (r10 >= r12) goto L_0x01da
            int r11 = r6.u()
            int r2 = r6.u()
            int r16 = r6.u()
            int r17 = r6.u()
            int r18 = r6.u()
            r32 = r9
            double r8 = (double) r2
            int r2 = r16 + -128
            double r4 = (double) r2
            r19 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            double r19 = r19 * r4
            r35 = r14
            double r14 = r19 + r8
            int r14 = (int) r14
            int r15 = r17 + -128
            double r2 = (double) r15
            r20 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            double r20 = r20 * r2
            double r20 = r8 - r20
            r22 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r4 = r4 * r22
            double r4 = r20 - r4
            int r4 = (int) r4
            r20 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r2 = r2 * r20
            double r2 = r2 + r8
            int r2 = (int) r2
            int r3 = r18 << 24
            r5 = 255(0xff, float:3.57E-43)
            int r8 = defpackage.oaf.j(r14, r7, r5)
            int r8 = r8 << 16
            r3 = r3 | r8
            int r4 = defpackage.oaf.j(r4, r7, r5)
            int r4 = r4 << 8
            r3 = r3 | r4
            int r2 = defpackage.oaf.j(r2, r7, r5)
            r2 = r2 | r3
            r32[r11] = r2
            r2 = 1
            int r10 = r10 + r2
            r9 = r32
            r14 = r35
            r2 = 4
            r3 = 128(0x80, float:1.794E-43)
            r8 = 2
            goto L_0x016f
        L_0x01da:
            r35 = r14
            r2 = 1
            r0.b = r2
        L_0x01df:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            r15 = 0
            goto L_0x02ae
        L_0x01e5:
            r32 = r9
            r35 = r14
            int r2 = r0.c
            if (r2 == 0) goto L_0x0205
            int r2 = r0.d
            if (r2 == 0) goto L_0x0205
            int r2 = r0.g
            if (r2 == 0) goto L_0x0205
            int r2 = r0.h
            if (r2 == 0) goto L_0x0205
            int r2 = r1.c
            if (r2 == 0) goto L_0x0205
            int r3 = r1.b
            if (r3 != r2) goto L_0x0205
            boolean r2 = r0.b
            if (r2 != 0) goto L_0x020a
        L_0x0205:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x029c
        L_0x020a:
            r1.G(r7)
            int r2 = r0.g
            int r3 = r0.h
            int r2 = r2 * r3
            int[] r3 = new int[r2]
            r4 = r7
        L_0x0215:
            if (r4 >= r2) goto L_0x0254
            int r8 = r1.u()
            if (r8 == 0) goto L_0x0228
            r9 = 1
            int r10 = r4 + 1
            r8 = r32[r8]
            r3[r4] = r8
            r4 = r10
        L_0x0225:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0215
        L_0x0228:
            r9 = 1
            int r8 = r1.u()
            if (r8 == 0) goto L_0x0225
            r10 = r8 & 64
            if (r10 != 0) goto L_0x0238
            r10 = r8 & 63
        L_0x0235:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0242
        L_0x0238:
            r10 = r8 & 63
            int r10 = r10 << 8
            int r11 = r1.u()
            r10 = r10 | r11
            goto L_0x0235
        L_0x0242:
            r8 = r8 & r11
            if (r8 != 0) goto L_0x0248
            r8 = r32[r7]
            goto L_0x024e
        L_0x0248:
            int r8 = r1.u()
            r8 = r32[r8]
        L_0x024e:
            int r10 = r10 + r4
            java.util.Arrays.fill(r3, r4, r10, r8)
            r4 = r10
            goto L_0x0215
        L_0x0254:
            r9 = 1
            r11 = 128(0x80, float:1.794E-43)
            int r2 = r0.g
            int r4 = r0.h
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r18 = android.graphics.Bitmap.createBitmap(r3, r2, r4, r8)
            int r2 = r0.e
            float r2 = (float) r2
            int r3 = r0.c
            float r3 = (float) r3
            float r22 = r2 / r3
            int r2 = r0.f
            float r2 = (float) r2
            int r4 = r0.d
            float r4 = (float) r4
            float r19 = r2 / r4
            int r2 = r0.g
            float r2 = (float) r2
            float r26 = r2 / r3
            int r2 = r0.h
            float r2 = (float) r2
            float r27 = r2 / r4
            yz3 r2 = new yz3
            r14 = r2
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r31 = 0
            r16 = 0
            r17 = r16
            r15 = r16
            r20 = 0
            r21 = 0
            r23 = 0
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r24 = r30
            r25 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r28 = 0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r15 = r2
            goto L_0x029d
        L_0x029c:
            r15 = 0
        L_0x029d:
            r0.c = r7
            r0.d = r7
            r0.e = r7
            r0.f = r7
            r0.g = r7
            r0.h = r7
            r1.D(r7)
            r0.b = r7
        L_0x02ae:
            r6.G(r13)
        L_0x02b1:
            r2 = r35
            if (r15 == 0) goto L_0x02b8
            r2.add(r15)
        L_0x02b8:
            r14 = r2
            r3 = r11
            r2 = 4
            r8 = 2
            goto L_0x00c9
        L_0x02be:
            r2 = r14
            b04 r0 = new b04
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r0
            r9.<init>(r10, r12, r14)
            r1 = r37
            r1.accept(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8g.G(byte[], int, int, nbe, pj3):void");
    }

    public void H(int i, yj8 yj8) {
        if (o(i, yj8)) {
            ((lr4) this.c).f();
        }
    }

    public void I(int i, xj8 xj8) {
        if (m(i, xj8)) {
            ((kr4) this.c).c();
        }
    }

    public int J() {
        return 2;
    }

    public void K(int i, xj8 xj8) {
        if (m(i, xj8)) {
            ((kr4) this.c).b();
        }
    }

    public void L(int i, yj8 yj8, pc8 pc8) {
        if (o(i, yj8)) {
            ((jn) this.b).n(p(pc8, yj8));
        }
    }

    public void M(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        if (m(i, xj8)) {
            ((gk8) this.b).g(xn7, pc8);
        }
    }

    public void N(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        if (m(i, xj8)) {
            ((gk8) this.b).l(xn7, pc8);
        }
    }

    public void a(tu0 tu0) {
        if (!cqc.c((sd7) this.o)) {
            hm9.m("mx5", "Font already loading", new Object[0]);
            return;
        }
        h0a h0a = new h0a(new l5(14, this));
        je7 je7 = (je7) this.b;
        hle hle = (hle) je7.getValue();
        hle.getClass();
        r0a n = h0a.r(((jle) hle).a()).n(((jle) ((hle) je7.getValue())).b());
        sd7 sd7 = new sd7(new lke(this, tu0, 0), new lke(this, tu0, 1), ft.d);
        n.a(sd7);
        this.o = sd7;
    }

    public void b(int i, xj8 xj8, xn7 xn7, pc8 pc8) {
        if (m(i, xj8)) {
            ((gk8) this.b).e(xn7, pc8);
        }
    }

    public n90 c() {
        String str = "";
        String str2 = ((Integer) this.a) == null ? " audioSource" : str;
        if (((Integer) this.b) == null) {
            str2 = str2.concat(" sampleRate");
        }
        if (((Integer) this.c) == null) {
            str2 = au1.g(str2, " channelCount");
        }
        if (((Integer) this.o) == null) {
            str2 = au1.g(str2, " audioFormat");
        }
        if (str2.isEmpty()) {
            int intValue = ((Integer) this.a).intValue();
            int intValue2 = ((Integer) this.b).intValue();
            int intValue3 = ((Integer) this.c).intValue();
            int intValue4 = ((Integer) this.o).intValue();
            n90 n90 = new n90(intValue, intValue2, intValue3, intValue4);
            if (intValue == -1) {
                str = " audioSource";
            }
            if (intValue2 <= 0) {
                str = str.concat(" sampleRate");
            }
            if (intValue3 <= 0) {
                str = au1.g(str, " channelCount");
            }
            if (intValue4 == -1) {
                str = au1.g(str, " audioFormat");
            }
            if (str.isEmpty()) {
                return n90;
            }
            throw new IllegalArgumentException("Required settings missing or non-positive:".concat(str));
        }
        throw new IllegalStateException("Missing required properties:".concat(str2));
    }

    public synchronized void d() {
        try {
            Iterator it = ((ArrayDeque) this.b).iterator();
            while (it.hasNext()) {
                ((z7c) it.next()).c.d();
            }
            Iterator it2 = ((ArrayDeque) this.c).iterator();
            while (it2.hasNext()) {
                ((z7c) it2.next()).c.d();
            }
            Iterator it3 = ((ArrayDeque) this.o).iterator();
            while (it3.hasNext()) {
                ((b8c) it3.next()).d();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void e(int i, yj8 yj8, yn7 yn7, pc8 pc8, IOException iOException, boolean z) {
        if (o(i, yj8)) {
            ((jn) this.b).D(yn7, p(pc8, yj8), iOException, z);
        }
    }

    public void f(String str) {
        ilc ilc = (ilc) this.a;
        ilc.b();
        ktf ktf = (ktf) this.c;
        q36 f = ktf.f();
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        ilc.c();
        try {
            f.n();
            ilc.r();
        } finally {
            ilc.l();
            ktf.t(f);
        }
    }

    public void g(int i, xj8 xj8, Exception exc) {
        if (m(i, xj8)) {
            ((kr4) this.c).e(exc);
        }
    }

    public synchronized ExecutorService h() {
        try {
            if (((ExecutorService) this.a) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, timeUnit, synchronousQueue, new je3(naf.g + " Dispatcher", false));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (ExecutorService) this.a;
    }

    public void i(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        q();
    }

    public void j(z7c z7c) {
        z7c.a.decrementAndGet();
        i((ArrayDeque) this.c, z7c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:23|24|34|35|36|38|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        k(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0062, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        if (r1 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0085, code lost:
        k(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0088, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r5.b
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L_0x000c
            java.lang.System.load(r7)
            return
        L_0x000c:
            r1 = 4
            r6 = r6 & r1
            if (r6 != r1) goto L_0x0015
            java.lang.Object r6 = r5.c
        L_0x0012:
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0018
        L_0x0015:
            java.lang.Object r6 = r5.o
            goto L_0x0012
        L_0x0018:
            r1 = 0
            java.lang.Object r2 = r5.a     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            monitor-enter(r2)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
            java.lang.Object r3 = r5.b     // Catch:{ all -> 0x005e }
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x005e }
            java.lang.Object r5 = r5.a     // Catch:{ all -> 0x005e }
            java.lang.Runtime r5 = (java.lang.Runtime) r5     // Catch:{ all -> 0x005e }
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x005c }
            java.lang.Object[] r6 = new java.lang.Object[]{r7, r4, r6}     // Catch:{ all -> 0x005c }
            java.lang.Object r5 = r3.invoke(r5, r6)     // Catch:{ all -> 0x005c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x005c }
            if (r5 != 0) goto L_0x0042
            monitor-exit(r2)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x003e
            k(r7)
        L_0x003e:
            return
        L_0x003f:
            r6 = move-exception
            r1 = r5
            goto L_0x0060
        L_0x0042:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r6.<init>(r0)     // Catch:{ all -> 0x003f }
            r6.append(r7)     // Catch:{ all -> 0x003f }
            java.lang.String r0 = ": "
            r6.append(r0)     // Catch:{ all -> 0x003f }
            r6.append(r5)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x003f }
            mud r5 = new mud     // Catch:{ all -> 0x005c }
            r5.<init>(r7, r1)     // Catch:{ all -> 0x005c }
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r6 = move-exception
            goto L_0x0060
        L_0x005e:
            r5 = move-exception
            r6 = r5
        L_0x0060:
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            throw r6     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0064 }
        L_0x0062:
            r5 = move-exception
            goto L_0x0083
        L_0x0064:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r5.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "nativeLoad() error during invocation for "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r7)     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0062 }
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ all -> 0x0062 }
            r5.<init>(r1)     // Catch:{ all -> 0x0062 }
            throw r5     // Catch:{ all -> 0x0062 }
        L_0x0083:
            if (r1 == 0) goto L_0x0088
            k(r7)
        L_0x0088:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8g.l(int, java.lang.String):void");
    }

    public boolean m(int i, xj8 xj8) {
        sk8 sk8 = (sk8) this.a;
        xj8 xj82 = null;
        if (xj8 != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= sk8.c.size()) {
                    break;
                } else if (((xj8) sk8.c.get(i2)).d == xj8.d) {
                    xj82 = xj8.b(Pair.create(sk8.b, xj8.a));
                    break;
                } else {
                    i2++;
                }
            }
            if (xj82 == null) {
                return false;
            }
        }
        int i3 = i + sk8.d;
        gk8 gk8 = (gk8) this.b;
        int i4 = gk8.b;
        vk8 vk8 = (vk8) this.o;
        if (i4 != i3 || !maf.a((xj8) gk8.c, xj82)) {
            this.b = new gk8((CopyOnWriteArrayList) ((gk8) vk8.j).d, i3, xj82, 0);
        }
        kr4 kr4 = (kr4) this.c;
        if (kr4.a == i3 && maf.a(kr4.b, xj82)) {
            return true;
        }
        this.c = new kr4(((kr4) vk8.k).c, i3, xj82);
        return true;
    }

    public boolean o(int i, yj8 yj8) {
        yj8 yj82;
        Object obj = this.a;
        pc3 pc3 = (pc3) this.o;
        if (yj8 != null) {
            yj82 = pc3.u(obj, yj8);
            if (yj82 == null) {
                return false;
            }
        } else {
            yj82 = null;
        }
        int w = pc3.w(i, obj);
        jn jnVar = (jn) this.b;
        if (jnVar.b != w || !oaf.a((yj8) jnVar.c, yj82)) {
            this.b = new jn((CopyOnWriteArrayList) pc3.c.o, w, yj82);
        }
        lr4 lr4 = (lr4) this.c;
        if (lr4.a == w && oaf.a(lr4.b, yj82)) {
            return true;
        }
        this.c = new lr4(pc3.d.c, w, yj82);
        return true;
    }

    public pc8 p(pc8 pc8, yj8 yj8) {
        pc3 pc3 = (pc3) this.o;
        Object obj = this.a;
        long j = pc8.e;
        long v = pc3.v(j, obj);
        long j2 = pc8.f;
        long v2 = pc3.v(j2, obj);
        if (v == j && v2 == j2) {
            return pc8;
        }
        return new pc8(pc8.a, pc8.b, (qy5) pc8.g, pc8.c, pc8.d, v, v2);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void q() {
        /*
            r8 = this;
            byte[] r0 = defpackage.naf.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0046 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0046 }
        L_0x0010:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0046 }
            if (r2 == 0) goto L_0x0048
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0046 }
            z7c r2 = (defpackage.z7c) r2     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r8.c     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0046 }
            int r3 = r3.size()     // Catch:{ all -> 0x0046 }
            r4 = 64
            if (r3 < r4) goto L_0x0029
            goto L_0x0048
        L_0x0029:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch:{ all -> 0x0046 }
            int r3 = r3.get()     // Catch:{ all -> 0x0046 }
            r4 = 5
            if (r3 < r4) goto L_0x0033
            goto L_0x0010
        L_0x0033:
            r1.remove()     // Catch:{ all -> 0x0046 }
            java.util.concurrent.atomic.AtomicInteger r3 = r2.a     // Catch:{ all -> 0x0046 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0046 }
            r0.add(r2)     // Catch:{ all -> 0x0046 }
            java.lang.Object r3 = r8.c     // Catch:{ all -> 0x0046 }
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch:{ all -> 0x0046 }
            r3.add(r2)     // Catch:{ all -> 0x0046 }
            goto L_0x0010
        L_0x0046:
            r0 = move-exception
            goto L_0x00a1
        L_0x0048:
            monitor-enter(r8)     // Catch:{ all -> 0x0046 }
            java.lang.Object r1 = r8.c     // Catch:{ all -> 0x009e }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x009e }
            r1.size()     // Catch:{ all -> 0x009e }
            java.lang.Object r1 = r8.o     // Catch:{ all -> 0x009e }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x009e }
            r1.size()     // Catch:{ all -> 0x009e }
            monitor-exit(r8)     // Catch:{ all -> 0x0046 }
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L_0x005e:
            if (r2 >= r1) goto L_0x009d
            java.lang.Object r3 = r0.get(r2)
            z7c r3 = (defpackage.z7c) r3
            java.util.concurrent.ExecutorService r4 = r8.h()
            b8c r5 = r3.c
            u2a r6 = r5.A0
            a8g r6 = r6.a
            byte[] r6 = defpackage.naf.a
            r4.execute(r3)     // Catch:{ RejectedExecutionException -> 0x0078 }
            goto L_0x0092
        L_0x0076:
            r8 = move-exception
            goto L_0x0095
        L_0x0078:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0076 }
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch:{ all -> 0x0076 }
            r6.initCause(r4)     // Catch:{ all -> 0x0076 }
            r5.j(r6)     // Catch:{ all -> 0x0076 }
            gq1 r4 = r3.b     // Catch:{ all -> 0x0076 }
            r4.q(r5, r6)     // Catch:{ all -> 0x0076 }
            u2a r4 = r5.A0
            a8g r4 = r4.a
            r4.j(r3)
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x0095:
            u2a r0 = r5.A0
            a8g r0 = r0.a
            r0.j(r3)
            throw r8
        L_0x009d:
            return
        L_0x009e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x009e }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x00a1:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a8g.q():void");
    }

    public void r(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        if (o(i, yj8)) {
            ((jn) this.b).y(yn7, p(pc8, yj8));
        }
    }

    public void s(int i, yj8 yj8, Exception exc) {
        if (o(i, yj8)) {
            ((lr4) this.c).e(exc);
        }
    }

    public void t(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        if (o(i, yj8)) {
            ((jn) this.b).A(yn7, p(pc8, yj8));
        }
    }

    public void u(int i, xj8 xj8, xn7 xn7, pc8 pc8, IOException iOException, boolean z) {
        if (m(i, xj8)) {
            ((gk8) this.b).j(xn7, pc8, iOException, z);
        }
    }

    public void v(int i, xj8 xj8) {
        if (m(i, xj8)) {
            ((kr4) this.c).a();
        }
    }

    public void w(int i, yj8 yj8, int i2) {
        if (o(i, yj8)) {
            ((lr4) this.c).d(i2);
        }
    }

    public void x(int i, yj8 yj8, yn7 yn7, pc8 pc8) {
        if (o(i, yj8)) {
            ((jn) this.b).G(yn7, p(pc8, yj8));
        }
    }

    public void y(int i, xj8 xj8, int i2) {
        if (m(i, xj8)) {
            ((kr4) this.c).d(i2);
        }
    }

    public void z(int i, yj8 yj8) {
        if (o(i, yj8)) {
            ((lr4) this.c).c();
        }
    }

    public a8g(int i) {
        switch (i) {
            case 7:
                this.b = new ArrayDeque();
                this.c = new ArrayDeque();
                this.o = new ArrayDeque();
                return;
            case 10:
                this.a = new wpa();
                this.b = new wpa();
                this.c = new nua(1);
                return;
            case 13:
                this.a = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = mhe.getNativeLoadRuntimeMethod();
                this.b = nativeLoadRuntimeMethod;
                String str = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? mhe.getClassLoaderLdLoadLibrary() : null;
                this.c = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] split = classLoaderLdLoadLibrary.split(":");
                    ArrayList arrayList = new ArrayList(split.length);
                    for (String str2 : split) {
                        if (!str2.contains("!")) {
                            arrayList.add(str2);
                        }
                    }
                    str = TextUtils.join(":", arrayList);
                }
                this.o = str;
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                this.a = new qpd();
                this.b = new SparseArray();
                this.c = new wv7();
                this.o = new qpd();
                return;
            default:
                this.a = tu0.r(3, new m52(15));
                this.b = tu0.r(3, new m52(16));
                this.c = tu0.r(3, new m52(17));
                this.o = tu0.r(3, new m52(18));
                return;
        }
    }

    public a8g(m5d m5d) {
        ArrayList arrayList;
        GifImage gifImage = (GifImage) m5d.c;
        gifImage.getClass();
        this.a = gifImage;
        this.c = o43.o((o43) m5d.o);
        ArrayList<o43> arrayList2 = (ArrayList) m5d.X;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            for (o43 o2 : arrayList2) {
                arrayList3.add(o43.o(o2));
            }
            arrayList = arrayList3;
        }
        this.o = arrayList;
        this.b = (String) m5d.b;
    }

    public a8g(Cipher cipher) {
        this.a = null;
        this.b = cipher;
        this.c = null;
        this.o = null;
    }
}
