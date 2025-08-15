package defpackage;

/* renamed from: akg  reason: default package */
public final class akg extends idg {
    public final o97 d;
    public final qne e;
    public final /* synthetic */ fkg f;
    public final /* synthetic */ fkg g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akg(fkg fkg, qne qne, String str) {
        super(2);
        this.g = fkg;
        o97 o97 = new o97("OnRequestInstallCallback", 2);
        this.f = fkg;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.d = o97;
        this.e = qne;
    }
}
