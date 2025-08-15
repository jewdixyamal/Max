package defpackage;

/* renamed from: spc  reason: default package */
public final class spc implements ab3, erd, b38 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry1 b;

    public /* synthetic */ spc(sy1 sy1, int i) {
        this.a = i;
        this.b = sy1;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                this.b.resumeWith(obj);
                return;
            default:
                this.b.resumeWith(obj);
                return;
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                this.b.resumeWith(e5f.a);
                return;
            default:
                this.b.resumeWith((Object) null);
                return;
        }
    }

    public final void c(zl4 zl4) {
        switch (this.a) {
            case 0:
                ((sy1) this.b).d(new rpc(0, zl4));
                return;
            case 1:
                ((sy1) this.b).d(new rpc(0, zl4));
                return;
            default:
                ((sy1) this.b).d(new rpc(0, zl4));
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.resumeWith(new njc(th));
                return;
            case 1:
                this.b.resumeWith(new njc(th));
                return;
            default:
                this.b.resumeWith(new njc(th));
                return;
        }
    }
}
