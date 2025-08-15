package defpackage;

import android.graphics.drawable.Drawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: at8  reason: default package */
public final /* synthetic */ class at8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt8 b;

    public /* synthetic */ at8(dt8 dt8, int i) {
        this.a = i;
        this.b = dt8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return au1.g(this.b.a.getString(oda.C0), ":");
            case 1:
                return this.b.a.getString(oda.E0);
            case 2:
                return this.b.a.getString(oda.z0);
            case 3:
                Drawable b2 = kt3.b(this.b.a, woc.P);
                if (b2 != null) {
                    return b2;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 4:
                Drawable b3 = kt3.b(this.b.a, woc.o1);
                if (b3 != null) {
                    return b3;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 5:
                Drawable b4 = kt3.b(this.b.a, woc.w0);
                if (b4 != null) {
                    return b4;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 6:
                Drawable b5 = kt3.b(this.b.a, woc.p);
                if (b5 != null) {
                    return b5;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 7:
                Drawable b6 = kt3.b(this.b.a, woc.z1);
                if (b6 != null) {
                    return b6;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 8:
                Drawable b7 = kt3.b(this.b.a, woc.g0);
                if (b7 != null) {
                    return b7;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 9:
                Drawable b8 = kt3.b(this.b.a, woc.y1);
                if (b8 != null) {
                    return b8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 10:
                Drawable b9 = kt3.b(this.b.a, lda.h);
                if (b9 != null) {
                    return b9;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 11:
                Drawable b10 = kt3.b(this.b.a, lda.f);
                if (b10 != null) {
                    return b10;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return kt3.b(this.b.a, lda.e);
            case 13:
                return this.b.a.getString(oda.D0);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return this.b.a.getString(oda.A0);
            default:
                return this.b.a.getString(oda.B0);
        }
    }
}
