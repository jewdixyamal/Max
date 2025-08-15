package defpackage;

/* renamed from: f63  reason: default package */
public final class f63 {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ o23 j;

    public f63(o23 o23, int i2, int i3) {
        this.j = o23;
        this.a = i2;
        this.b = i3;
        a();
    }

    public final void a() {
        o23 o23 = this.j;
        int[] iArr = (int[]) o23.a;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = 0;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = this.a; i9 <= this.b; i9++) {
            int i10 = iArr[i9];
            i6 += ((int[]) o23.b)[i10];
            int i11 = (i10 >> 10) & 31;
            int i12 = (i10 >> 5) & 31;
            int i13 = i10 & 31;
            if (i11 > i3) {
                i3 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i4) {
                i4 = i12;
            }
            if (i12 < i7) {
                i7 = i12;
            }
            if (i13 > i5) {
                i5 = i13;
            }
            if (i13 < i8) {
                i8 = i13;
            }
        }
        this.d = i2;
        this.e = i3;
        this.f = i7;
        this.g = i4;
        this.h = i8;
        this.i = i5;
        this.c = i6;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}
