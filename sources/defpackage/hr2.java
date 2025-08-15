package defpackage;

import one.me.sdk.design.theme.ChromaIllegalApplyThemeException;

/* renamed from: hr2  reason: default package */
public final class hr2 extends e0 implements ox3 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr2(kx3 kx3, int i) {
        super(kx3);
        this.a = i;
    }

    public final void g(lx3 lx3, Throwable th) {
        switch (this.a) {
            case 0:
                hm9.r("jr2", th, "fail in %s", lx3);
                return;
            default:
                IllegalStateException illegalStateException = th instanceof ChromaIllegalApplyThemeException ? (ChromaIllegalApplyThemeException) th : null;
                if (illegalStateException == null) {
                    illegalStateException = new IllegalStateException(th);
                }
                bcf.a.c().a("ONEME-8759", illegalStateException);
                return;
        }
    }
}
