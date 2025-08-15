package defpackage;

import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: nh5  reason: default package */
public final /* synthetic */ class nh5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh5 b;

    public /* synthetic */ nh5(oh5 oh5, int i) {
        this.a = i;
        this.b = oh5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("background");
            case 1:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("foreground");
            default:
                return ((EnhancedVectorDrawable) this.b.getDrawable()).findPath("corner");
        }
    }
}
