package defpackage;

import ru.ok.messages.views.fragments.base.FrgBase;

/* renamed from: hg5  reason: default package */
public final /* synthetic */ class hg5 implements f6 {
    public final /* synthetic */ jg5 a;
    public final /* synthetic */ l20 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ es8 d;

    public /* synthetic */ hg5(jg5 jg5, l20 l20, boolean z, es8 es8) {
        this.a = jg5;
        this.b = l20;
        this.c = z;
        this.d = es8;
    }

    public final void run() {
        jg5 jg5 = this.a;
        if (jg5.a()) {
            kk5 kk5 = jg5.g;
            l20 l20 = this.b;
            kk5.h(l20).getAbsolutePath();
            boolean z = this.c;
            FrgBase frgBase = jg5.c;
            if (!z || frgBase == null || (!s5c.N(l20) && !s5c.P(l20))) {
                v3c.A(jg5.a, this.d, l20, ((jyc) jg5.b).n(), ((y8a) ((ed3) frgBase.p1.b)).h());
            }
        }
    }
}
