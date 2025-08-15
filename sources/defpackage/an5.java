package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* renamed from: an5  reason: default package */
public final class an5 {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public an5(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public static void a(an5 an5) {
        FlexboxLayoutManager flexboxLayoutManager = an5.h;
        if (flexboxLayoutManager.d1() || !flexboxLayoutManager.t) {
            an5.c = an5.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.B.m();
        } else {
            an5.c = an5.e ? flexboxLayoutManager.B.h() : flexboxLayoutManager.n - flexboxLayoutManager.B.m();
        }
    }

    public static void b(an5 an5) {
        an5.a = -1;
        an5.b = -1;
        an5.c = Integer.MIN_VALUE;
        boolean z = false;
        an5.f = false;
        an5.g = false;
        FlexboxLayoutManager flexboxLayoutManager = an5.h;
        if (flexboxLayoutManager.d1()) {
            int i = flexboxLayoutManager.q;
            if (i == 0) {
                if (flexboxLayoutManager.p == 1) {
                    z = true;
                }
                an5.e = z;
                return;
            }
            if (i == 2) {
                z = true;
            }
            an5.e = z;
            return;
        }
        int i2 = flexboxLayoutManager.q;
        if (i2 == 0) {
            if (flexboxLayoutManager.p == 3) {
                z = true;
            }
            an5.e = z;
            return;
        }
        if (i2 == 2) {
            z = true;
        }
        an5.e = z;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }
}
