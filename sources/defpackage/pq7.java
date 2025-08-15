package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: pq7  reason: default package */
public final class pq7 implements Serializable {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean o;
    public final boolean s0;
    public final mqb t0;
    public final boolean u0;
    public final int v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final boolean z0;

    public pq7(oq7 oq7) {
        this.a = oq7.a;
        this.b = oq7.b;
        this.c = oq7.c;
        this.o = oq7.d;
        this.X = oq7.e;
        this.Y = oq7.f;
        this.Z = oq7.g;
        this.s0 = oq7.h;
        this.t0 = oq7.i;
        this.u0 = oq7.j;
        this.v0 = oq7.k;
        this.w0 = oq7.l;
        this.x0 = oq7.m;
        this.y0 = oq7.n;
        this.z0 = oq7.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pq7.class != obj.getClass()) {
            return false;
        }
        pq7 pq7 = (pq7) obj;
        return this.a == pq7.a && this.b == pq7.b && this.c == pq7.c && this.o == pq7.o && this.X == pq7.X && this.Y == pq7.Y && this.Z == pq7.Z && this.s0 == pq7.s0 && this.u0 == pq7.u0 && this.v0 == pq7.v0 && this.w0 == pq7.w0 && this.x0 == pq7.x0 && this.y0 == pq7.y0 && this.z0 == pq7.z0 && this.t0 == pq7.t0;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.o), Boolean.valueOf(this.X), Boolean.valueOf(this.Y), Boolean.valueOf(this.Z), Boolean.valueOf(this.s0), this.t0, Boolean.valueOf(this.u0), Integer.valueOf(this.v0), Boolean.valueOf(this.w0), Boolean.valueOf(this.x0), Boolean.valueOf(this.y0), Boolean.valueOf(this.z0)});
    }

    public final String toString() {
        return "LocalMediaToolboxViewState{qualityButtonEnable=" + this.a + ", qualityTextVisibility=" + this.b + ", qualityProgressBarVisibility=" + this.c + ", multiSelect=" + this.o + ", videoControlsVisibility=" + this.X + ", videoSeekBarVisibility=" + this.Y + ", cropVisibility=" + this.Z + ", editVisibility=" + this.s0 + ", quality=" + this.t0 + ", isNumericCheckButtonEnabled=" + this.u0 + ", numberForNumericCheckButton=" + this.v0 + ", highlightCropButton=" + this.w0 + ", highlightEditButton=" + this.x0 + ", muteVideo=" + this.y0 + '}';
    }
}
