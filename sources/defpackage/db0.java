package defpackage;

import android.opengl.EGLSurface;

/* renamed from: db0  reason: default package */
public final class db0 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public db0(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.a = eGLSurface;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof db0)) {
            return false;
        }
        db0 db0 = (db0) obj;
        return this.a.equals(db0.a) && this.b == db0.b && this.c == db0.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zr6.j(sb, this.c, "}");
    }
}
