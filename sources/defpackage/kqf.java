package defpackage;

/* renamed from: kqf  reason: default package */
public final class kqf implements zb4 {
    public final /* synthetic */ lqf a;

    public kqf(lqf lqf) {
        this.a = lqf;
    }

    public final void onResume(eh7 eh7) {
        hm9.m("lqf", "onResume, owner=" + eh7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
    }

    public final void onStart(eh7 eh7) {
        hm9.m("lqf", "onStart, owner=" + eh7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
        if (!this.a.k) {
            this.a.k = true;
            if (this.a.l) {
                this.a.b();
            }
        }
    }

    public final void onStop(eh7 eh7) {
        hm9.m("lqf", "onStop, owner=" + eh7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l, new Object[0]);
        if (this.a.k) {
            this.a.k = false;
            this.a.a();
        }
    }
}
