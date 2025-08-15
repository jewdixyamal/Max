package defpackage;

import android.text.InputFilter;

/* renamed from: wh4  reason: default package */
public final class wh4 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xh4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh4(Integer num, xh4 xh4, int i) {
        super(9, (Object) num);
        this.c = i;
        this.o = xh4;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    xh4 xh4 = this.o;
                    xh4.t0.setFilters(xh4.getMaxCount() != Integer.MAX_VALUE ? (InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(xh4.getMaxCount())} : new InputFilter[0]);
                    return;
                }
                return;
            case 1:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq9 = qp4.u0;
                    xh4 xh42 = this.o;
                    xh42.onThemeChanged(pq9.j(xh42));
                    return;
                }
                return;
            case 2:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq92 = qp4.u0;
                    xh4 xh43 = this.o;
                    xh43.onThemeChanged(pq92.j(xh43));
                    return;
                }
                return;
            case 3:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq93 = qp4.u0;
                    xh4 xh44 = this.o;
                    xh44.onThemeChanged(pq93.j(xh44));
                    return;
                }
                return;
            default:
                if (!tpa.f(obj, obj2)) {
                    pq9 pq94 = qp4.u0;
                    xh4 xh45 = this.o;
                    xh45.onThemeChanged(pq94.j(xh45));
                    return;
                }
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh4(xh4 xh4, int i) {
        super(9, (Object) Integer.MAX_VALUE);
        this.c = i;
        switch (i) {
            case 1:
                this.o = xh4;
                super(9, (Object) null);
                return;
            default:
                this.o = xh4;
                return;
        }
    }
}
