package defpackage;

import android.transition.TransitionManager;
import android.view.View;

/* renamed from: a6c  reason: default package */
public final /* synthetic */ class a6c implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6c b;

    public /* synthetic */ a6c(b6c b6c, int i) {
        this.a = i;
        this.b = b6c;
    }

    public final Object invoke() {
        ri9 ri9;
        int i;
        switch (this.a) {
            case 0:
                b6c b6c = this.b;
                b6c.d();
                ri9 ri92 = b6c.w0;
                Object[] objArr = ri92.b;
                long[] jArr = ri92.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    b6c.removeView((View) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                }
                b6c.c();
                b6c.e();
                if (b6c.getChildCount() == 0) {
                    b6c.setVisibility(8);
                }
                return e5f.a;
            case 1:
                b6c b6c2 = this.b;
                TransitionManager.beginDelayedTransition(b6c2, b6c2.u0);
                ri9 ri93 = b6c2.v0;
                boolean z = ri93.d == 0;
                ri9 ri94 = b6c2.w0;
                if (!z || ri94.d != 0) {
                    Object[] objArr2 = ri93.b;
                    long[] jArr2 = ri93.a;
                    int length2 = jArr2.length - 2;
                    long j2 = 128;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j3 = jArr2[i5];
                            ri9 = ri94;
                            if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j3 & 255) < j2) {
                                        ((View) objArr2[(i5 << 3) + i7]).setVisibility(0);
                                    }
                                    j3 >>= 8;
                                    i7++;
                                    j2 = 128;
                                }
                                i = 0;
                                if (i6 != 8) {
                                }
                            } else {
                                i = 0;
                            }
                            if (i5 != length2) {
                                i5++;
                                ri94 = ri9;
                                j2 = 128;
                            }
                        }
                    } else {
                        ri9 = ri94;
                        i = 0;
                    }
                    ri9 ri95 = ri9;
                    Object[] objArr3 = ri95.b;
                    long[] jArr3 = ri95.a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i8 = i;
                        while (true) {
                            long j4 = jArr3[i8];
                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                for (int i10 = i; i10 < i9; i10++) {
                                    if ((j4 & 255) < 128) {
                                        ((View) objArr3[(i8 << 3) + i10]).setVisibility(8);
                                    }
                                    j4 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length3) {
                                i8++;
                            }
                        }
                    }
                } else {
                    b6c2.requestLayout();
                }
                return e5f.a;
            case 2:
                return Boolean.valueOf(this.b.c);
            default:
                b6c b6c3 = this.b;
                b6c3.d();
                b6c3.c();
                b6c3.e();
                return e5f.a;
        }
    }
}
