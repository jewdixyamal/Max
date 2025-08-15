package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: no0  reason: default package */
public final class no0 extends v2 {
    public final va8 X;
    public final boolean Y;
    public sgc Z;
    public final LinkedBlockingQueue o = new LinkedBlockingQueue();
    public hd6 s0;
    public int t0;
    public boolean u0;
    public boolean v0;

    public no0(va8 va8, nx0 nx0, boolean z) {
        super(nx0);
        this.X = va8;
        this.Y = z;
    }

    public final void A() {
        if (!this.o.isEmpty() && this.t0 != 0) {
            mo0 mo0 = (mo0) this.o.element();
            t26 t26 = mo0.b;
            uue uue = mo0.c;
            fm9.k(uue.hasNext());
            long next = uue.next() + mo0.b.e;
            if (!this.v0) {
                this.v0 = true;
                Bitmap bitmap = mo0.a;
                try {
                    hd6 hd6 = this.s0;
                    if (hd6 != null) {
                        hd6.a();
                    }
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    mr0.f();
                    int i = iArr[0];
                    mr0.b(bitmap.getWidth(), bitmap.getHeight());
                    mr0.d(3553, i, 9729);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    mr0.f();
                    this.s0 = new hd6(i, -1, t26.b, t26.c);
                    if (oaf.a >= 34 && bitmap.hasGainmap()) {
                        sgc sgc = this.Z;
                        sgc.getClass();
                        Gainmap c = bitmap.getGainmap();
                        c.getClass();
                        ((od4) sgc).l(jo0.d(c));
                    }
                    if (this.Y) {
                        sgc sgc2 = this.Z;
                        sgc2.getClass();
                        od4 od4 = (od4) sgc2;
                        fm9.k(od4.a.b == 1);
                        od4.t = true;
                        od4.u = false;
                    }
                } catch (GlUtil$GlException e) {
                    throw VideoFrameProcessingException.a(e);
                }
            }
            this.t0--;
            sgc sgc3 = this.Z;
            sgc3.getClass();
            va8 va8 = this.X;
            hd6 hd62 = this.s0;
            hd62.getClass();
            ((qi0) sgc3).e(va8, hd62, next);
            int i2 = t26.b;
            LinkedHashMap linkedHashMap = d54.a;
            synchronized (d54.class) {
            }
            if (!mo0.c.hasNext()) {
                this.v0 = false;
                ((mo0) this.o.remove()).a.recycle();
                if (this.o.isEmpty() && this.u0) {
                    sgc sgc4 = this.Z;
                    sgc4.getClass();
                    ((qi0) sgc4).b();
                    d54.a();
                    this.u0 = false;
                }
            }
        }
    }

    public final void h() {
        ((nx0) this.a).v(new lo0(this, 1));
    }

    public final void i() {
        this.o.clear();
        this.v0 = false;
        this.u0 = false;
        this.t0 = 0;
        hd6 hd6 = this.s0;
        if (hd6 != null) {
            try {
                hd6.a();
                this.s0 = null;
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        super.i();
    }

    public final int k() {
        return 0;
    }

    public final void o(Bitmap bitmap, t26 t26, uue uue) {
        ((nx0) this.a).v(new ko0(this, bitmap, t26, uue));
    }

    public final void release() {
        ((nx0) this.a).v(new lo0(this, 2));
    }

    public final void y(od4 od4) {
        this.t0 = 0;
        this.Z = od4;
    }

    public final void z() {
        ((nx0) this.a).v(new lo0(this, 0));
    }
}
