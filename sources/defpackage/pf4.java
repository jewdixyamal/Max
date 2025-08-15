package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: pf4  reason: default package */
public final /* synthetic */ class pf4 implements Callable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ nx0 Y;
    public final /* synthetic */ Executor Z;
    public final /* synthetic */ qf4 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xw0 c;
    public final /* synthetic */ i63 o;
    public final /* synthetic */ agf s0;

    public /* synthetic */ pf4(qf4 qf4, Context context, xw0 xw0, i63 i63, boolean z, nx0 nx0, Executor executor, agf agf) {
        this.a = qf4;
        this.b = context;
        this.c = xw0;
        this.o = i63;
        this.X = z;
        this.Y = nx0;
        this.Z = executor;
        this.s0 = agf;
    }

    public final Object call() {
        Pair pair;
        qf4 qf4 = this.a;
        qf4.getClass();
        int i = rf4.s;
        EGLDisplay A = mr0.A();
        i63 i63 = this.o;
        int[] iArr = i63.g(i63) ? mr0.h : mr0.g;
        int i2 = oaf.a;
        va8 va8 = qf4.c;
        if (i2 < 29) {
            EGLContext r = va8.r(A, 2, iArr);
            pair = Pair.create(r, va8.u(r, A));
        } else {
            try {
                EGLContext r2 = va8.r(A, 3, iArr);
                pair = Pair.create(r2, va8.u(r2, A));
            } catch (GlUtil$GlException unused) {
                EGLContext r3 = va8.r(A, 2, iArr);
                pair = Pair.create(r3, va8.u(r3, A));
            }
        }
        g63 a2 = i63.a();
        a2.c = 1;
        a2.d = null;
        i63 i632 = new i63(a2.a, a2.b, a2.c, a2.e, a2.f, a2.d);
        boolean g = i63.g(i63);
        int i3 = qf4.a;
        i63 i633 = (!g && i3 != 2) ? i63 : i632;
        agf agf = this.s0;
        Objects.requireNonNull(agf);
        lf4 lf4 = new lf4(agf, 0);
        boolean z = qf4.g;
        Context context = this.b;
        nx0 nx0 = this.Y;
        Executor executor = this.Z;
        s27 s27 = new s27(context, i633, va8, nx0, executor, lf4, i3, qf4.b, z, qf4.h);
        xw0 xw0 = this.c;
        id6 id6 = qf4.e;
        int i4 = qf4.f;
        boolean z2 = this.X;
        Executor executor2 = executor;
        return new rf4(context, va8, A, s27, nx0, agf, executor2, new rk5(context, A, (EGLContext) pair.first, (EGLSurface) pair.second, xw0, i63, nx0, executor2, agf, id6, i4, i3, z2), z2, i63);
    }
}
