package defpackage;

import android.app.Activity;

/* renamed from: mg0  reason: default package */
public final class mg0 extends fz4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
                ug0 ug0 = (ug0) this.b;
                ug0.d.h();
                ug0.e.h();
                return;
            default:
                boolean z = ((lqf) this.b).k;
                if (!((lqf) this.b).k) {
                    hm9.m0("lqf", "set visible=true on onActivityResumed", new Object[0]);
                    ((lqf) this.b).k = true;
                }
                boolean z2 = ((lqf) this.b).l;
                if (!((lqf) this.b).l) {
                    hm9.m0("lqf", "set screenOn=true on onActivityResumed", new Object[0]);
                    ((lqf) this.b).l = true;
                }
                if (!z || !z2) {
                    hm9.m0("lqf", "crutch! call onAppGoesForeground", new Object[0]);
                    ((lqf) this.b).b();
                    return;
                }
                return;
        }
    }

    public void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 1:
                ((lqf) this.b).f++;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "lqf", "onActivityStarted, visibleActivitiesCount: " + ((lqf) this.b).f, (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 1:
                lqf lqf = (lqf) this.b;
                lqf.f--;
                ir6 ir6 = hm9.m;
                if (ir6 != null && ir6.c()) {
                    ir6.d(us7.X, "lqf", "onActivityStopped, visibleActivitiesCount: " + ((lqf) this.b).f, (Throwable) null);
                }
                if (((lqf) this.b).k) {
                    lqf lqf2 = (lqf) this.b;
                    if (lqf2.f == 0) {
                        lqf2.k = false;
                        ((lqf) this.b).a();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
