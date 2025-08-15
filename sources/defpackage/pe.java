package defpackage;

import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* renamed from: pe  reason: default package */
public final /* synthetic */ class pe implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe b;

    public /* synthetic */ pe(qe qeVar, int i) {
        this.a = i;
        this.b = qeVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("circle");
            case 1:
                return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("hours");
            default:
                return ((EnhancedAnimatedVectorDrawable) this.b.getDrawable()).findPath("minutes");
        }
    }
}
