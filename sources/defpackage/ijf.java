package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: ijf  reason: default package */
public final class ijf implements tlf {
    public int X = 1;
    public float Y = 0.0f;
    public final dkf Z;
    public final long a;
    public final String b;
    public final o00 c;
    public final gef o;
    public final f4b s0;

    public ijf(long j, String str, o00 o00, gef gef, dkf dkf, f4b f4b) {
        this.a = j;
        this.b = str;
        this.c = o00;
        this.o = gef;
        this.Z = dkf;
        this.s0 = f4b;
    }

    public final void G(Surface surface) {
        this.Z.M0(surface);
    }

    public final int M0() {
        return this.o.getHeight();
    }

    public final int R() {
        return this.o.getWidth();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijf)) {
            return false;
        }
        ijf ijf = (ijf) obj;
        return this.a == ijf.a && tpa.f(this.b, ijf.b) && tpa.f(this.c, ijf.c) && tpa.f(this.o, ijf.o) && this.X == ijf.X && Float.compare(this.Y, ijf.Y) == 0 && tpa.f(this.Z, ijf.Z) && tpa.f(this.s0, ijf.s0);
    }

    public final int hashCode() {
        int d = rh4.d(Long.hashCode(this.a) * 31, 31, this.b);
        int hashCode = this.o.hashCode();
        int c2 = ms2.c(ey8.g(this.X, (hashCode + ((this.c.hashCode() + d) * 31)) * 31, 31), this.Y, 31);
        return this.s0.hashCode() + ((this.Z.hashCode() + c2) * 31);
    }

    public final int j() {
        return 3;
    }

    public final void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.s0.a(this.Z);
    }

    public final String toString() {
        int i = this.X;
        float f = this.Y;
        StringBuilder sb = new StringBuilder("VideoMessageState(messageId=");
        sb.append(this.a);
        sb.append(", attachId=");
        sb.append(this.b);
        sb.append(", attachModel=");
        sb.append(this.c);
        sb.append(", videoContent=");
        sb.append(this.o);
        sb.append(", state=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "STOP" : "PAUSE" : "IN_PROGRESS" : "PLAY" : "PREPARE");
        sb.append(", progress=");
        sb.append(f);
        sb.append(", player=");
        sb.append(this.Z);
        sb.append(", playerHolder=");
        sb.append(this.s0);
        sb.append(")");
        return sb.toString();
    }
}
