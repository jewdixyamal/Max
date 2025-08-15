package defpackage;

import java.util.Arrays;

/* renamed from: c9b  reason: default package */
public final class c9b extends ws {
    public sud[] f;
    public sud[] g;
    public int h;
    public b9b i;

    public final sud d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.h; i3++) {
            sud[] sudArr = this.f;
            sud sud = sudArr[i3];
            if (!zArr[sud.b]) {
                b9b b9b = this.i;
                b9b.b = sud;
                int i4 = 8;
                if (i2 != -1) {
                    sud sud2 = sudArr[i2];
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = sud2.s0[i4];
                        float f3 = ((sud) b9b.b).s0[i4];
                        if (f3 == f2) {
                            i4--;
                        } else if (f3 >= f2) {
                        }
                    }
                } else {
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f4 = ((sud) b9b.b).s0[i4];
                        if (f4 > 0.0f) {
                            break;
                        } else if (f4 < 0.0f) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f[i2];
    }

    public final boolean e() {
        return this.h == 0;
    }

    public final void i(zh7 zh7, ws wsVar, boolean z) {
        ws wsVar2 = wsVar;
        sud sud = wsVar2.a;
        if (sud != null) {
            ks ksVar = wsVar2.d;
            int f2 = ksVar.f();
            for (int i2 = 0; i2 < f2; i2++) {
                sud g2 = ksVar.g(i2);
                float h2 = ksVar.h(i2);
                b9b b9b = this.i;
                b9b.b = g2;
                boolean z2 = g2.a;
                float[] fArr = sud.s0;
                if (z2) {
                    boolean z3 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr2 = ((sud) b9b.b).s0;
                        float f3 = (fArr[i3] * h2) + fArr2[i3];
                        fArr2[i3] = f3;
                        if (Math.abs(f3) < 1.0E-4f) {
                            ((sud) b9b.b).s0[i3] = 0.0f;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        ((c9b) b9b.c).k((sud) b9b.b);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f4 = fArr[i4];
                        if (f4 != 0.0f) {
                            float f5 = f4 * h2;
                            if (Math.abs(f5) < 1.0E-4f) {
                                f5 = 0.0f;
                            }
                            ((sud) b9b.b).s0[i4] = f5;
                        } else {
                            ((sud) b9b.b).s0[i4] = 0.0f;
                        }
                    }
                    j(g2);
                }
                this.b = (wsVar2.b * h2) + this.b;
            }
            k(sud);
        }
    }

    public final void j(sud sud) {
        int i2;
        int i3 = this.h + 1;
        sud[] sudArr = this.f;
        if (i3 > sudArr.length) {
            sud[] sudArr2 = (sud[]) Arrays.copyOf(sudArr, sudArr.length * 2);
            this.f = sudArr2;
            this.g = (sud[]) Arrays.copyOf(sudArr2, sudArr2.length * 2);
        }
        sud[] sudArr3 = this.f;
        int i4 = this.h;
        sudArr3[i4] = sud;
        int i5 = i4 + 1;
        this.h = i5;
        if (i5 > 1 && sudArr3[i4].b > sud.b) {
            int i6 = 0;
            while (true) {
                i2 = this.h;
                if (i6 >= i2) {
                    break;
                }
                this.g[i6] = this.f[i6];
                i6++;
            }
            Arrays.sort(this.g, 0, i2, new ky6(10));
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f[i7] = this.g[i7];
            }
        }
        sud.a = true;
        sud.a(this);
    }

    public final void k(sud sud) {
        int i2 = 0;
        while (i2 < this.h) {
            if (this.f[i2] == sud) {
                while (true) {
                    int i3 = this.h;
                    if (i2 < i3 - 1) {
                        sud[] sudArr = this.f;
                        int i4 = i2 + 1;
                        sudArr[i2] = sudArr[i4];
                        i2 = i4;
                    } else {
                        this.h = i3 - 1;
                        sud.a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i2 = 0; i2 < this.h; i2++) {
            sud sud = this.f[i2];
            b9b b9b = this.i;
            b9b.b = sud;
            str = str + b9b + " ";
        }
        return str;
    }
}
