package defpackage;

/* renamed from: w68  reason: default package */
public abstract class w68 extends u68 {
    public final /* synthetic */ cj8 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w68(cj8 cj8) {
        super(cj8);
        this.f = cj8;
    }

    public final void J() {
        v68 v68 = new v68(this, this.f);
        this.b = v68;
        v68.onCreate();
    }
}
