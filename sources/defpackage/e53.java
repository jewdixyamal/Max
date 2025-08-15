package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: e53  reason: default package */
public final class e53 {
    public static final /* synthetic */ bc7[] k;
    public final Context a;
    public final View b;
    public int c;
    public int d;
    public final ar0 e = new ar0();
    public final yj f = new yj(this);
    public m56 g = new pz2(2);
    public float[] h = s36.c;
    public final int i = tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density);
    public final us j;

    static {
        oi9 oi9 = new oi9(e53.class, "imageAttaches", "getImageAttaches()Ljava/util/List;");
        nec.a.getClass();
        k = new bc7[]{oi9};
    }

    /* JADX WARNING: type inference failed for: r2v10, types: [qpd, us] */
    public e53(Context context, View view) {
        this.a = context;
        this.b = view;
        view.addOnAttachStateChangeListener(new ck(3, this));
        this.j = new qpd(0);
    }

    public static int d(int i2) {
        return (int) ((float) Math.rint((double) (((float) i2) * 0.4f)));
    }

    public final a53 a(int i2, int i3) {
        umc e2;
        int length = this.h.length;
        int i4 = 0;
        while (i4 < length) {
            sq4 i5 = this.e.i(i4);
            zt6 zt6 = i5 instanceof zt6 ? (zt6) i5 : null;
            if (zt6 == null || (e2 = zt6.e()) == null || !e2.getBounds().contains(i2, i3)) {
                i4++;
            } else {
                bc7 bc7 = k[0];
                a53 a53 = (a53) x53.j0(i4, (List) this.f.b);
                if (a53 == null) {
                    return null;
                }
                return a53;
            }
        }
        return null;
    }

    public final void b(int i2, int i3) {
        umc e2;
        int length = this.h.length;
        int i4 = i2;
        for (int i5 = 0; i5 < length; i5++) {
            ar0 ar0 = this.e;
            sq4 i6 = ar0.i(i5);
            zt6 zt6 = i6 instanceof zt6 ? (zt6) i6 : null;
            if (!(zt6 == null || (e2 = zt6.e()) == null)) {
                int i7 = zt6.Z + i4;
                int i8 = this.c + i2;
                int i9 = this.i;
                if (i7 > i8) {
                    i3 += ((zt6) ar0.i(i5 - 1)).s0 + i9;
                    i4 = i2;
                }
                e2.setBounds(i4, i3, zt6.Z + i4, zt6.s0 + i3);
                i4 += zt6.Z + i9;
            }
        }
    }

    public final void c(int i2) {
        double d2;
        String str;
        int i3;
        ar0 ar0;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i2;
        if (this.h.length != 0) {
            ar0 ar02 = this.e;
            if (((ArrayList) ar02.b).size() > 0) {
                this.d = 0;
                float[] fArr = this.h;
                String str2 = "Array is empty.";
                if (fArr.length != 0) {
                    float f2 = (float) i5;
                    double d3 = (double) (0.45f * f2);
                    double d4 = (double) (f2 * 0.6f);
                    int e2 = ote.e((int) ((float) Math.rint((double) (((float) ((int) ((float) Math.rint(d3)))) / fArr[0]))), (int) ((float) Math.rint(d3)), (int) ((float) Math.rint(d4)));
                    int length = this.h.length;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        int i9 = this.i;
                        if (i6 < length) {
                            sq4 i10 = ar02.i(i6);
                            zt6 zt6 = i10 instanceof zt6 ? (zt6) i10 : null;
                            if (zt6 == null) {
                                ar0 = ar02;
                                i3 = length;
                                str = str2;
                                d2 = d3;
                            } else {
                                float f3 = (float) e2;
                                ar0 = ar02;
                                int i11 = e2;
                                i3 = length;
                                int rint = (int) ((float) Math.rint((double) (this.h[i6] * f3)));
                                float[] fArr2 = this.h;
                                if (fArr2.length != 0) {
                                    boolean z4 = true;
                                    if (fArr2[0] <= 1.0f || i6 != 0) {
                                        str = str2;
                                        z = false;
                                    } else {
                                        z = true;
                                        str = str2;
                                    }
                                    if (i6 == fArr2.length - 1) {
                                        z2 = true;
                                        d2 = d3;
                                    } else {
                                        d2 = d3;
                                        z2 = false;
                                    }
                                    boolean z5 = i6 < fArr2.length - 1 && Float.compare(fArr2[i6], fArr2[i6 + 1]) == 0;
                                    if (z || z2) {
                                        e2 = (!z || this.h.length <= 3) ? i11 : (int) ((float) Math.rint(d4));
                                        i4 = i5 - i7;
                                        z3 = true;
                                    } else {
                                        if (z5 && i8 == 0) {
                                            i4 = i5 / 2;
                                        } else if (i8 == 1) {
                                            i4 = i5 - i7;
                                        } else {
                                            int i12 = i5 - i7;
                                            i4 = i12 - rint < d(i2) ? i12 - d(i2) < d(i2) ? i12 : i12 - d(i2) : rint < d(i2) ? d(i2) : (int) ((float) Math.rint((double) (f3 * this.h[i6])));
                                        }
                                        e2 = i11;
                                        z3 = false;
                                    }
                                    if (i8 != 1 || z3) {
                                        z4 = z3;
                                    }
                                    zt6.s0 = e2;
                                    zt6.Z = i4;
                                    i8++;
                                    i7 += i4 + i9;
                                    if (z4) {
                                        this.d = e2 + i9 + this.d;
                                        e2 = ote.e((int) ((float) Math.rint((double) (((float) ((int) ((float) Math.rint(d2)))) / this.h[i6]))), (int) ((float) Math.rint(d2)), (int) ((float) Math.rint(d4)));
                                        i7 = 0;
                                        i8 = 0;
                                    }
                                } else {
                                    throw new NoSuchElementException(str2);
                                }
                            }
                            i6++;
                            ar02 = ar0;
                            length = i3;
                            str2 = str;
                            d3 = d2;
                        } else {
                            this.d -= i9;
                            this.c = i5;
                            return;
                        }
                    }
                } else {
                    throw new NoSuchElementException(str2);
                }
            }
        }
    }

    public final void e(int i2, int i3, int[] iArr) {
        y2b y2b;
        umc e2;
        int length = this.h.length;
        int i4 = 0;
        while (i4 < length) {
            sq4 i5 = this.e.i(i4);
            zt6 zt6 = i5 instanceof zt6 ? (zt6) i5 : null;
            if (zt6 == null || (y2b = (y2b) this.j.get(zt6)) == null || (e2 = zt6.e()) == null || !e2.getBounds().contains(i2, i3)) {
                i4++;
            } else {
                y2b.setHotspot((float) y2b.getBounds().centerX(), (float) y2b.getBounds().centerY());
                y2b.setState(iArr);
                return;
            }
        }
    }

    public final void f() {
        for (Map.Entry value : this.j.entrySet()) {
            ((y2b) value.getValue()).onThemeChanged(qp4.u0.b(this.a).i());
        }
    }

    public final boolean g(Drawable drawable) {
        int i2 = 0;
        while (true) {
            ar0 ar0 = this.e;
            if (i2 >= ((ArrayList) ar0.b).size()) {
                return x53.c0(this.j.values(), drawable);
            }
            if (drawable == ar0.i(i2).e()) {
                break;
            }
            i2++;
        }
    }
}
