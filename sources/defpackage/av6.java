package defpackage;

import android.text.TextUtils;

/* renamed from: av6  reason: default package */
public final class av6 {
    public static final /* synthetic */ int c = 0;
    public final je7 a;
    public final je7 b;

    public av6(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public final void a(String str, zu6 zu6) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty((CharSequence) null)) {
            b(zu6);
        } else {
            ((w9a) ((kke) this.b.getValue())).b().dispatch(hz4.a, new yg3(this, str, zu6));
        }
    }

    public final void b(zu6 zu6) {
        if (zu6 != null) {
            c(new wu6(zu6, 0));
        }
    }

    public final void c(Runnable runnable) {
        ((w9a) ((kke) this.b.getValue())).c().getImmediate().dispatch(hz4.a, runnable);
    }
}
