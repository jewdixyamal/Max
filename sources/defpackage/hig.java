package defpackage;

/* renamed from: hig  reason: default package */
public final class hig extends idg {
    public final qm4 d;
    public final qne e;
    public final /* synthetic */ mig f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hig(mig mig, qne qne) {
        super(3);
        qm4 qm4 = new qm4("OnRequestInstallCallback", 1);
        this.f = mig;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.d = qm4;
        this.e = qne;
    }
}
