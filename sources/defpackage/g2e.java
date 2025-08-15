package defpackage;

import java.io.File;

/* renamed from: g2e  reason: default package */
public final class g2e implements nm9 {
    public final /* synthetic */ h2e a;

    public g2e(h2e h2e) {
        this.a = h2e;
    }

    public final void onFailed(Throwable th) {
        h2e h2e = this.a;
        h2e.b(h2e.f, th);
    }

    public final void onFinished(String str, File file, String str2) {
        ((iba) this.a.c.getValue()).c().execute(new ewc(this, file, str2, 5));
    }
}
