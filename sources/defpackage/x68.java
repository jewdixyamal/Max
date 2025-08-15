package defpackage;

/* renamed from: x68  reason: default package */
public final class x68 extends w68 {
    public final /* synthetic */ cj8 g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x68(cj8 cj8) {
        super(cj8);
        this.g = cj8;
    }

    public final vi8 K() {
        cj8 cj8 = this.g;
        s68 s68 = cj8.Y;
        if (s68 == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        } else if (s68 != cj8.c) {
            return s68.d;
        } else {
            v68 v68 = (v68) this.b;
            v68.getClass();
            return new vi8(v68.getCurrentBrowserInfo());
        }
    }
}
