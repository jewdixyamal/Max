package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: cd6  reason: default package */
public final class cd6 implements ry9, f2a {
    public Object X;
    public Object Y;
    public int a;
    public boolean b;
    public Object c;
    public Object o;

    public cd6(Class cls, int i) {
        this.a = i;
        this.o = cls;
        this.X = new Rect();
        this.c = new ArrayList();
        this.Y = new WeakReference((Object) null);
    }

    public static final void a(vpf vpf, View view, ViewTreeObserver viewTreeObserver) {
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(vpf);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(vpf);
        }
    }

    public static void d(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z = true;
        }
        mr0.g(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str, z);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        mr0.f();
    }

    public void b() {
        boolean z = this.b;
        ry1 ry1 = (ry1) this.c;
        if (!z) {
            int i = this.a;
            if (i == 2) {
                ry1.resumeWith(this.Y);
            } else if (ry1.isActive()) {
                ry1.resumeWith(new njc(new NoSuchElementException("No value received via onNext for ".concat(ey8.s(i)))));
            }
        } else if (ry1.isActive()) {
            ry1.resumeWith(this.X);
        }
    }

    public void c(zl4 zl4) {
        this.o = zl4;
        ((ry1) this.c).d(new c01(10, zl4));
    }

    public void e(Object obj) {
        int i = this.a;
        int s = au1.s(i);
        zl4 zl4 = null;
        ry1 ry1 = (ry1) this.c;
        if (s == 0 || s == 1) {
            if (!this.b) {
                this.b = true;
                ry1.resumeWith(obj);
                zl4 zl42 = (zl4) this.o;
                if (zl42 != null) {
                    zl4 = zl42;
                }
                zl4.g();
            }
        } else if (s != 2 && s != 3) {
            throw new NoWhenBranchMatchedException();
        } else if (i != 4 || !this.b) {
            this.X = obj;
            this.b = true;
        } else {
            if (ry1.isActive()) {
                ry1.resumeWith(new njc(new IllegalArgumentException("More than one onNext value for ".concat(ey8.s(i)))));
            }
            zl4 zl43 = (zl4) this.o;
            if (zl43 != null) {
                zl4 = zl43;
            }
            zl4.g();
        }
    }

    public void f(Executor executor, py9 py9) {
        u0e u0e;
        synchronized (this.o) {
            m(py9);
            u0e = new u0e((AtomicReference) this.X, executor, py9);
            ((HashMap) this.c).put(py9, u0e);
            ((CopyOnWriteArraySet) this.Y).add(u0e);
        }
        u0e.a(0);
    }

    public k56 g(uu3 uu3) {
        View view;
        View view2 = uu3.getView();
        uu3 targetController = uu3.getTargetController();
        View view3 = targetController != null ? targetController.getView() : null;
        if (view2 != null) {
            view = view2;
        } else if (view3 == null) {
            return new fh5(10);
        } else {
            view = view3;
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        vpf vpf = new vpf(this, view3, view);
        viewTreeObserver.addOnPreDrawListener(vpf);
        uu3.addLifecycleListener(new upf(this, viewTreeObserver, vpf, view));
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new tpf(view, viewTreeObserver, vpf, view, 0));
        } else if (!view.isAttachedToWindow()) {
            a(vpf, view, viewTreeObserver);
        } else {
            view.addOnAttachStateChangeListener(new tpf(view, viewTreeObserver, vpf, view, 1));
        }
        return new kpf(vpf, view, viewTreeObserver);
    }

    public void h() {
        for (ad6 ad6 : (ad6[]) this.o) {
            FloatBuffer floatBuffer = ad6.b;
            fm9.i(floatBuffer, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(ad6.a, ad6.c, 5126, false, 0, floatBuffer);
            GLES20.glEnableVertexAttribArray(ad6.a);
            mr0.f();
        }
        for (bd6 bd6 : (bd6[]) this.X) {
            boolean z = this.b;
            int[] iArr = bd6.d;
            int i = bd6.a;
            int i2 = bd6.b;
            if (i2 != 5124) {
                float[] fArr = bd6.c;
                if (i2 == 5126) {
                    GLES20.glUniform1fv(i, 1, fArr, 0);
                    mr0.f();
                } else if (i2 != 35678 && i2 != 35815 && i2 != 36198) {
                    switch (i2) {
                        case 35664:
                            GLES20.glUniform2fv(i, 1, fArr, 0);
                            mr0.f();
                            break;
                        case 35665:
                            GLES20.glUniform3fv(i, 1, fArr, 0);
                            mr0.f();
                            break;
                        case 35666:
                            GLES20.glUniform4fv(i, 1, fArr, 0);
                            mr0.f();
                            break;
                        case 35667:
                            GLES20.glUniform2iv(i, 1, iArr, 0);
                            mr0.f();
                            break;
                        case 35668:
                            GLES20.glUniform3iv(i, 1, iArr, 0);
                            mr0.f();
                            break;
                        case 35669:
                            GLES20.glUniform4iv(i, 1, iArr, 0);
                            mr0.f();
                            break;
                        default:
                            switch (i2) {
                                case 35675:
                                    GLES20.glUniformMatrix3fv(i, 1, false, fArr, 0);
                                    mr0.f();
                                    break;
                                case 35676:
                                    GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
                                    mr0.f();
                                    break;
                                default:
                                    throw new IllegalStateException(zr6.h(i2, "Unexpected uniform type: "));
                            }
                    }
                } else if (bd6.e != 0) {
                    GLES20.glActiveTexture(bd6.f + 33984);
                    mr0.f();
                    mr0.d(i2 == 35678 ? 3553 : 36197, bd6.e, (i2 != 35678 || z) ? 9728 : 9729);
                    GLES20.glUniform1i(i, bd6.f);
                    mr0.f();
                } else {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
            } else {
                GLES20.glUniform1iv(i, 1, iArr, 0);
                mr0.f();
            }
        }
    }

    public int i() {
        int i;
        synchronized (this.o) {
            i = this.a;
            this.a = i + 1;
        }
        return i;
    }

    public bm7 j() {
        Object obj = ((AtomicReference) this.X).get();
        return obj instanceof tb0 ? new dw6(1, ((tb0) obj).a) : kq0.r(obj);
    }

    public void k() {
        ArrayList arrayList;
        synchronized (this.o) {
            try {
                this.b = true;
                arrayList = new ArrayList(((us) this.X).values());
                ((us) this.X).clear();
                if (((Runnable) this.c) != null) {
                    Handler handler = (Handler) this.Y;
                    handler.getClass();
                    handler.post((Runnable) this.c);
                    this.c = null;
                    this.Y = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k6d) it.next()).n();
        }
    }

    public void l(py9 py9) {
        synchronized (this.o) {
            m(py9);
        }
    }

    public void m(py9 py9) {
        u0e u0e = (u0e) ((HashMap) this.c).remove(py9);
        if (u0e != null) {
            u0e.c.set(false);
            ((CopyOnWriteArraySet) this.Y).remove(u0e);
        }
    }

    public void n() {
        synchronized (this.o) {
            try {
                Iterator it = new HashSet(((HashMap) this.c).keySet()).iterator();
                while (it.hasNext()) {
                    m((py9) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(float[] fArr) {
        ad6 ad6 = (ad6) ((HashMap) this.c).get("aFramePosition");
        ad6.getClass();
        ad6.b = (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
        ad6.c = 4;
    }

    public void onError(Throwable th) {
        ((ry1) this.c).resumeWith(new njc(th));
    }

    public void p(String str, float f) {
        bd6 bd6 = (bd6) ((HashMap) this.Y).get(str);
        bd6.getClass();
        bd6.c[0] = f;
    }

    public void q(String str, float[] fArr) {
        bd6 bd6 = (bd6) ((HashMap) this.Y).get(str);
        bd6.getClass();
        System.arraycopy(fArr, 0, bd6.c, 0, fArr.length);
    }

    public void r(float[] fArr) {
        bd6 bd6 = (bd6) ((HashMap) this.Y).get("uRgbMatrix");
        if (bd6 != null) {
            System.arraycopy(fArr, 0, bd6.c, 0, fArr.length);
        }
    }

    public void s(int i, Object obj) {
        synchronized (this.o) {
            try {
                k6d k6d = (k6d) ((us) this.X).remove(Integer.valueOf(i));
                if (k6d != null) {
                    if (k6d.t0.getClass() == obj.getClass()) {
                        k6d.l(obj);
                    } else {
                        z04.c0("Type mismatch, expected " + k6d.t0.getClass() + ", but was " + obj.getClass());
                    }
                }
                if (((Runnable) this.c) != null && ((us) this.X).isEmpty()) {
                    k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t(int i, String str) {
        bd6 bd6 = (bd6) ((HashMap) this.Y).get(str);
        bd6.getClass();
        bd6.d[0] = i;
    }

    public void u(int i, int i2, String str) {
        bd6 bd6 = (bd6) ((HashMap) this.Y).get(str);
        bd6.getClass();
        bd6.e = i;
        bd6.f = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r1.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        ((defpackage.u0e) r1.next()).a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        r1 = r3.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r3.a != r4) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r3.b = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r4 = ((java.util.concurrent.CopyOnWriteArraySet) r3.Y).iterator();
        r0 = r3.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        r1 = r4;
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.o
            monitor-enter(r0)
            java.lang.Object r1 = r3.X     // Catch:{ all -> 0x0013 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r1.getAndSet(r4)     // Catch:{ all -> 0x0013 }
            boolean r4 = java.util.Objects.equals(r1, r4)     // Catch:{ all -> 0x0013 }
            if (r4 == 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r3 = move-exception
            goto L_0x005a
        L_0x0015:
            int r4 = r3.a     // Catch:{ all -> 0x0013 }
            r1 = 1
            int r4 = r4 + r1
            r3.a = r4     // Catch:{ all -> 0x0013 }
            boolean r2 = r3.b     // Catch:{ all -> 0x0013 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0021:
            r3.b = r1     // Catch:{ all -> 0x0013 }
            java.lang.Object r1 = r3.Y     // Catch:{ all -> 0x0013 }
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1     // Catch:{ all -> 0x0013 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r1.next()
            u0e r0 = (defpackage.u0e) r0
            r0.a(r4)
            goto L_0x002c
        L_0x003c:
            java.lang.Object r1 = r3.o
            monitor-enter(r1)
            int r0 = r3.a     // Catch:{ all -> 0x0048 }
            if (r0 != r4) goto L_0x004a
            r4 = 0
            r3.b = r4     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            goto L_0x0058
        L_0x004a:
            java.lang.Object r4 = r3.Y     // Catch:{ all -> 0x0048 }
            java.util.concurrent.CopyOnWriteArraySet r4 = (java.util.concurrent.CopyOnWriteArraySet) r4     // Catch:{ all -> 0x0048 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0048 }
            int r0 = r3.a     // Catch:{ all -> 0x0048 }
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            r1 = r4
            r4 = r0
            goto L_0x002c
        L_0x0058:
            monitor-exit(r1)     // Catch:{ all -> 0x0048 }
            throw r3
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cd6.v(java.lang.Object):void");
    }

    public void w() {
        GLES20.glUseProgram(this.a);
        mr0.f();
    }

    public cd6() {
        this.o = new Object();
        this.X = new qpd();
    }

    public cd6(Context context, String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        String Q = oaf.Q(context, str);
        String Q2 = oaf.Q(context, str2);
        int glCreateProgram = GLES20.glCreateProgram();
        this.a = glCreateProgram;
        mr0.f();
        d(glCreateProgram, 35633, Q);
        d(glCreateProgram, 35632, Q2);
        GLES20.glLinkProgram(glCreateProgram);
        int i = 0;
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        int i2 = 1;
        mr0.g("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(glCreateProgram);
        this.c = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.o = new ad6[iArr2[0]];
        int i3 = 0;
        while (i3 < iArr2[0]) {
            int i4 = this.a;
            int[] iArr3 = new int[i2];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            int[] iArr4 = new int[i2];
            int[] iArr5 = new int[i2];
            int[] iArr6 = new int[i2];
            byte[] bArr3 = new byte[i5];
            int i6 = i5;
            int i7 = i4;
            GLES20.glGetActiveAttrib(i4, i3, i5, iArr4, 0, iArr5, 0, iArr6, 0, bArr3, 0);
            int i8 = 0;
            while (true) {
                if (i8 >= i6) {
                    bArr2 = bArr3;
                    i8 = i6;
                    break;
                }
                bArr2 = bArr3;
                if (bArr2[i8] == 0) {
                    break;
                }
                i8++;
                bArr3 = bArr2;
            }
            String str3 = new String(bArr2, 0, i8);
            ad6 ad6 = new ad6(str3, GLES20.glGetAttribLocation(i7, str3));
            ((ad6[]) this.o)[i3] = ad6;
            ((HashMap) this.c).put(str3, ad6);
            i3++;
            i2 = 1;
        }
        this.Y = new HashMap();
        int[] iArr7 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr7, 0);
        this.X = new bd6[iArr7[0]];
        for (int i9 = 0; i9 < iArr7[i]; i9++) {
            int i10 = this.a;
            int[] iArr8 = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr8, i);
            int[] iArr9 = new int[1];
            int i11 = iArr8[i];
            byte[] bArr4 = new byte[i11];
            int i12 = i11;
            int[] iArr10 = iArr9;
            GLES20.glGetActiveUniform(i10, i9, i11, new int[1], 0, new int[1], 0, iArr9, 0, bArr4, 0);
            int i13 = 0;
            while (true) {
                if (i13 >= i12) {
                    bArr = bArr4;
                    i13 = i12;
                    break;
                }
                bArr = bArr4;
                if (bArr[i13] == 0) {
                    break;
                }
                i13++;
                bArr4 = bArr;
            }
            i = 0;
            String str4 = new String(bArr, 0, i13);
            bd6 bd6 = new bd6(str4, GLES20.glGetUniformLocation(i10, str4), iArr10[0]);
            ((bd6[]) this.X)[i9] = bd6;
            ((HashMap) this.Y).put(str4, bd6);
        }
        mr0.f();
    }

    public cd6(Object obj) {
        this.o = new Object();
        this.a = 0;
        this.b = false;
        this.c = new HashMap();
        this.Y = new CopyOnWriteArraySet();
        this.X = new AtomicReference(obj);
    }
}
