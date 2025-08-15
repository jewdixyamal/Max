package defpackage;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.view.View;
import android.widget.TextView;
import androidx.media3.common.ParserException;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* renamed from: pag  reason: default package */
public abstract class pag implements p05, en9 {
    public static final o97 b = new o97("HEAP_DUMP", 1);
    public static final ma7 c = new ma7(2);
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ pag(int i) {
        this.a = i;
    }

    public static ul A(wpa wpa) {
        int g = wpa.g();
        if (wpa.g() == 1684108385) {
            int g2 = wpa.g() & 16777215;
            String str = g2 == 13 ? "image/jpeg" : g2 == 14 ? "image/png" : null;
            if (str == null) {
                ey8.k(g2, "Unrecognized cover art flags: ");
                return null;
            }
            wpa.H(4);
            int i = g - 16;
            byte[] bArr = new byte[i];
            wpa.e(0, bArr, i);
            return new ul(str, (String) null, 3, bArr);
        }
        z04.c0("Failed to parse cover art attribute");
        return null;
    }

    public static jpe B(int i, wpa wpa, String str) {
        int g = wpa.g();
        if (wpa.g() == 1684108385 && g >= 22) {
            wpa.H(10);
            int A = wpa.A();
            if (A > 0) {
                String h = zr6.h(A, "");
                int A2 = wpa.A();
                if (A2 > 0) {
                    h = h + "/" + A2;
                }
                return new jpe(str, (String) null, zw6.n(h));
            }
        }
        z04.c0("Failed to parse index/count attribute: " + oy.e(i));
        return null;
    }

    public static int C(wpa wpa) {
        int g = wpa.g();
        if (wpa.g() == 1684108385) {
            wpa.H(8);
            int i = g - 16;
            if (i == 1) {
                return wpa.u();
            }
            if (i == 2) {
                return wpa.A();
            }
            if (i == 3) {
                return wpa.x();
            }
            if (i == 4 && (wpa.a[wpa.b] & 128) == 0) {
                return wpa.y();
            }
        }
        z04.c0("Failed to parse data atom to int");
        return -1;
    }

    public static dt6 D(int i, String str, wpa wpa, boolean z, boolean z2) {
        int C = C(wpa);
        if (z2) {
            C = Math.min(1, C);
        }
        if (C >= 0) {
            return z ? new jpe(str, (String) null, zw6.n(Integer.toString(C))) : new h73("und", str, Integer.toString(C));
        }
        z04.c0("Failed to parse uint8 attribute: " + oy.e(i));
        return null;
    }

    public static jpe E(int i, wpa wpa, String str) {
        int g = wpa.g();
        if (wpa.g() == 1684108385) {
            wpa.H(8);
            return new jpe(str, (String) null, zw6.n(wpa.q(g - 16)));
        }
        z04.c0("Failed to parse text attribute: " + oy.e(i));
        return null;
    }

    public static final boolean F(View view, oi6 oi6) {
        Object obj;
        try {
            obj = Boolean.valueOf(view.performHapticFeedback(oi6.a()));
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof njc) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009b, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009c, code lost:
        defpackage.v3c.i(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G(defpackage.zy r5, defpackage.bk r6) {
        /*
            java.io.FileInputStream r5 = r5.c()
            if (r5 == 0) goto L_0x00a0
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r5, r1)
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x0092 }
            r5.<init>(r0)     // Catch:{ all -> 0x0092 }
            y7g r1 = new y7g     // Catch:{ all -> 0x0045 }
            r2 = 28
            r1.<init>((int) r2)     // Catch:{ all -> 0x0045 }
        L_0x0019:
            int r2 = r5.available()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x008a
            java.lang.String r2 = r5.readUTF()     // Catch:{ all -> 0x0045 }
            int r3 = r5.readUnsignedByte()     // Catch:{ all -> 0x0045 }
            ob6 r4 = defpackage.z3f.b     // Catch:{ all -> 0x0045 }
            r4.getClass()     // Catch:{ all -> 0x0045 }
            java.util.LinkedHashMap r4 = defpackage.z3f.c     // Catch:{ all -> 0x0045 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0045 }
            java.lang.Object r3 = defpackage.mz7.X(r4, r3)     // Catch:{ all -> 0x0045 }
            z3f r3 = (defpackage.z3f) r3     // Catch:{ all -> 0x0045 }
            int r3 = r3.ordinal()     // Catch:{ all -> 0x0045 }
            switch(r3) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0075;
                case 2: goto L_0x006c;
                case 3: goto L_0x0067;
                case 4: goto L_0x005e;
                case 5: goto L_0x0055;
                case 6: goto L_0x0050;
                case 7: goto L_0x0047;
                default: goto L_0x003f;
            }     // Catch:{ all -> 0x0045 }
        L_0x003f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0045 }
            r6.<init>()     // Catch:{ all -> 0x0045 }
            throw r6     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0094
        L_0x0047:
            java.lang.String r3 = defpackage.z7.L(r5, r1)     // Catch:{ all -> 0x0045 }
            java.util.Set r3 = defpackage.z04.Z(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0050:
            java.lang.String r3 = defpackage.z7.L(r5, r1)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0055:
            boolean r3 = r5.readBoolean()     // Catch:{ all -> 0x0045 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x005e:
            java.lang.String r3 = r5.readUTF()     // Catch:{ all -> 0x0045 }
            java.util.Set r3 = defpackage.z04.Z(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0067:
            java.lang.String r3 = r5.readUTF()     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x006c:
            long r3 = r5.readLong()     // Catch:{ all -> 0x0045 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x0075:
            float r3 = r5.readFloat()     // Catch:{ all -> 0x0045 }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0086
        L_0x007e:
            int r3 = r5.readInt()     // Catch:{ all -> 0x0045 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0045 }
        L_0x0086:
            r6.invoke(r2, r3)     // Catch:{ all -> 0x0045 }
            goto L_0x0019
        L_0x008a:
            r6 = 0
            defpackage.v3c.i(r5, r6)     // Catch:{ all -> 0x0092 }
            defpackage.v3c.i(r0, r6)
            goto L_0x00a0
        L_0x0092:
            r5 = move-exception
            goto L_0x009a
        L_0x0094:
            throw r6     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r1 = move-exception
            defpackage.v3c.i(r5, r6)     // Catch:{ all -> 0x0092 }
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x009a:
            throw r5     // Catch:{ all -> 0x009b }
        L_0x009b:
            r6 = move-exception
            defpackage.v3c.i(r0, r5)
            throw r6
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.G(zy, bk):void");
    }

    public static int H(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int A = xfg.A(obj);
        int i4 = A & i;
        int L = L(i4, obj3);
        if (L == 0) {
            return -1;
        }
        int i5 = ~i;
        int i6 = A & i5;
        int i7 = -1;
        while (true) {
            i2 = L - 1;
            i3 = iArr[i2];
            if ((i3 & i5) != i6 || !f46.B(obj, objArr[i2]) || (objArr2 != null && !f46.B(obj2, objArr2[i2]))) {
                int i8 = i3 & i;
                if (i8 == 0) {
                    return -1;
                }
                int i9 = i8;
                i7 = i2;
                L = i9;
            }
        }
        int i10 = i3 & i;
        if (i7 == -1) {
            M(i4, i10, obj3);
        } else {
            iArr[i7] = w(iArr[i7], i10, i);
        }
        return i2;
    }

    public static void I(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b(textView, drawable);
        b(textView, drawable2);
        b(textView, drawable3);
        b(textView, drawable4);
    }

    public static b11 J(int i, sa4 sa4, wpa wpa) {
        b11 c2 = b11.c(sa4, wpa);
        while (true) {
            int i2 = c2.b;
            if (i2 == i) {
                return c2;
            }
            ey8.k(i2, "Ignoring unknown WAV chunk: ");
            long j = c2.c;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 <= 2147483647L) {
                sa4.z((int) j2);
                c2 = b11.c(sa4, wpa);
            } else {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
        }
    }

    public static boolean K(File file, Object obj) {
        ObjectOutputStream objectOutputStream;
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream2);
                try {
                    objectOutputStream.writeObject(obj);
                    g(fileOutputStream2, objectOutputStream);
                    return true;
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    try {
                        hm9.p("pag", "Failed to store object to file", e);
                        g(fileOutputStream, objectOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        g(fileOutputStream, objectOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    g(fileOutputStream, objectOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                objectOutputStream = null;
                fileOutputStream = fileOutputStream2;
                hm9.p("pag", "Failed to store object to file", e);
                g(fileOutputStream, objectOutputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
                fileOutputStream = fileOutputStream2;
                g(fileOutputStream, objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            objectOutputStream = null;
            hm9.p("pag", "Failed to store object to file", e);
            g(fileOutputStream, objectOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
            g(fileOutputStream, objectOutputStream);
            throw th;
        }
    }

    public static int L(int i, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void M(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static final String N(int i, long j) {
        if (j >= 0) {
            nd7.e(i);
            return Long.toString(j, i);
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        nd7.e(i);
        String l = Long.toString(j3, i);
        nd7.e(i);
        return l.concat(Long.toString(j4, i));
    }

    public static y77 a() {
        return new y77((x77) null);
    }

    public static void b(View view, Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            Objects.requireNonNull(animationDrawable);
            view.post(new dd4(6, animationDrawable));
        }
    }

    public static final Object c(Collection collection, Continuation continuation) {
        return collection.isEmpty() ? nz4.a : new de0((yf4[]) collection.toArray(new yf4[0])).a(continuation);
    }

    public static void d(lx3 lx3) {
        x77 x77 = (x77) lx3.get(c32.X);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
    }

    public static final void e(lx3 lx3, CancellationException cancellationException) {
        c6d<x77> children;
        x77 x77 = (x77) lx3.get(c32.X);
        if (x77 != null && (children = x77.getChildren()) != null) {
            for (x77 cancel : children) {
                cancel.cancel(cancellationException);
            }
        }
    }

    public static boolean f(sa4 sa4) {
        wpa wpa = new wpa(8);
        int i = b11.c(sa4, wpa).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        sa4.q(wpa.a, 0, 4, false);
        wpa.G(0);
        int g = wpa.g();
        if (g == 1463899717) {
            return true;
        }
        z04.u("Unsupported form type: " + g);
        return false;
    }

    public static void g(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    hm9.m("pag", "Failed to close output stream: " + e.getMessage(), new Object[0]);
                }
            }
        }
    }

    public static Object h(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        throw new IllegalArgumentException(zr6.h(i, "must be power of 2 between 2^1 and 2^30: "));
    }

    public static float i(float f, float f2, float f3) {
        float f4 = f / (f3 / 2.0f);
        float f5 = f2 / 2.0f;
        if (f4 < 1.0f) {
            return (f5 * f4 * f4 * f4) + 0.0f;
        }
        float f6 = f4 - 2.0f;
        return (((f6 * f6 * f6) + 2.0f) * f5) + 0.0f;
    }

    public static final void j(lx3 lx3) {
        x77 x77 = (x77) lx3.get(c32.X);
        if (x77 != null && !x77.isActive()) {
            throw x77.getCancellationException();
        }
    }

    public static boolean k(File file) {
        if (file == null) {
            return false;
        }
        try {
            return file.exists() && file.canRead();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean l(String str) {
        return !oag.t(str) && k(new File(str));
    }

    public static TextDirectionHeuristic m(zoe zoe) {
        return zoe == bpe.a ? TextDirectionHeuristics.LTR : zoe == bpe.b ? TextDirectionHeuristics.RTL : zoe == bpe.c ? TextDirectionHeuristics.FIRSTSTRONG_LTR : zoe == bpe.d ? TextDirectionHeuristics.FIRSTSTRONG_RTL : zoe == bpe.e ? TextDirectionHeuristics.ANYRTL_LTR : zoe == ape.c ? TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    public static final x77 n(lx3 lx3) {
        x77 x77 = (x77) lx3.get(c32.X);
        if (x77 != null) {
            return x77;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + lx3).toString());
    }

    public static File o(File file, String str) {
        String str2;
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int lastIndexOf = str.lastIndexOf(46);
        int i = 0;
        while (i < 100) {
            if (lastIndexOf != -1) {
                str2 = str.substring(0, lastIndexOf) + "(" + (i + 1) + ")" + str.substring(lastIndexOf);
            } else {
                StringBuilder o = rh4.o(str, "(");
                o.append(i + 1);
                o.append(")");
                str2 = o.toString();
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

    public static int p(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final cm4 q(x77 x77, boolean z, k87 k87) {
        if (x77 instanceof z87) {
            return ((z87) x77).invokeOnCompletionInternal$kotlinx_coroutines_core(z, k87);
        }
        return x77.invokeOnCompletion(k87.c(), z, new f(1, k87, k87.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 27));
    }

    public static final boolean r(lx3 lx3) {
        x77 x77 = (x77) lx3.get(c32.X);
        if (x77 != null) {
            return x77.isActive();
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object s(java.util.ArrayList r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof defpackage.fe0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            fe0 r0 = (defpackage.fe0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            fe0 r0 = new fe0
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r4 = r0.o
            defpackage.od2.a0(r5)
            goto L_0x0038
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.od2.a0(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            x77 r5 = (defpackage.x77) r5
            r0.o = r4
            r0.Y = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L_0x0038
            return r1
        L_0x004f:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.s(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object t(defpackage.x77[] r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ee0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ee0 r0 = (defpackage.ee0) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.s0 = r1
            goto L_0x0018
        L_0x0013:
            ee0 r0 = new ee0
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r6 = r0.Y
            int r2 = r0.X
            java.lang.Object[] r4 = r0.o
            x77[] r4 = (defpackage.x77[]) r4
            defpackage.od2.a0(r7)
            r7 = r4
            goto L_0x0053
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            defpackage.od2.a0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0040:
            if (r2 >= r6) goto L_0x0055
            r4 = r7[r2]
            r0.o = r7
            r0.X = r2
            r0.Y = r6
            r0.s0 = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L_0x0053
            return r1
        L_0x0053:
            int r2 = r2 + r3
            goto L_0x0040
        L_0x0055:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pag.t(x77[], kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static long u(String str) {
        if (oag.t(str)) {
            return 0;
        }
        try {
            return new File(str).lastModified();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Object v(File file) {
        ObjectInputStream objectInputStream;
        Throwable th;
        FileInputStream fileInputStream;
        if (!k(file)) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                objectInputStream = new ObjectInputStream(fileInputStream);
                try {
                    Object readObject = objectInputStream.readObject();
                    g(fileInputStream, objectInputStream);
                    return readObject;
                } catch (Throwable th2) {
                    th = th2;
                    g(fileInputStream, objectInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                objectInputStream = null;
                g(fileInputStream, objectInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            fileInputStream = null;
            th = th4;
            objectInputStream = null;
            g(fileInputStream, objectInputStream);
            throw th;
        }
    }

    public static int w(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static final String x(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (nd7.E(charAt)) {
                sb.append(charAt);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public static long y(long... jArr) {
        if (jArr.length > 0) {
            long j = jArr[0];
            for (int i = 1; i < jArr.length; i++) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
            }
            return j;
        }
        throw new IllegalArgumentException();
    }

    public static h73 z(int i, wpa wpa) {
        int g = wpa.g();
        if (wpa.g() == 1684108385) {
            wpa.H(8);
            String q = wpa.q(g - 16);
            return new h73("und", q, q);
        }
        z04.c0("Failed to parse comment attribute: " + oy.e(i));
        return null;
    }

    public int hashCode() {
        switch (this.a) {
            case 16:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return nec.a(getClass()).b();
            default:
                return super.toString();
        }
    }
}
