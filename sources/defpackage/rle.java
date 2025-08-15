package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: rle  reason: default package */
public final class rle implements lme {
    public final /* synthetic */ sqd a;

    public rle(nqd nqd) {
        this.a = nqd;
    }

    public final void e(gle gle) {
        sqd sqd = this.a;
        if (!((nqd) sqd).h()) {
            ((nqd) sqd).a(gle);
        }
    }

    public final void g(pke pke) {
        sqd sqd = this.a;
        if (!((nqd) sqd).h()) {
            ((nqd) sqd).onError(new TamErrorException(pke));
        }
    }
}
