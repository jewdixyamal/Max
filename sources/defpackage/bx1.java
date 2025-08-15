package defpackage;

import one.me.sdk.arch.Widget;

/* renamed from: bx1  reason: default package */
public final class bx1 implements eh7 {
    public final /* synthetic */ int a;
    public final gh7 b;

    public bx1() {
        this.a = 0;
        gh7 gh7 = new gh7(this);
        this.b = gh7;
        gh7.d(eg7.ON_CREATE);
    }

    public final gh7 Q() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public bx1(Widget widget) {
        this.a = 1;
        this.b = new gh7(this);
        widget.addLifecycleListener(new ia3(1, this));
    }
}
