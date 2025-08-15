package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tkc  reason: default package */
public final /* synthetic */ class tkc implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ alc b;
    public final /* synthetic */ String c;

    public /* synthetic */ tkc(alc alc, String str, int i) {
        this.a = i;
        this.b = alc;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.a) {
            case 0:
                alc alc = this.b;
                alc.getClass();
                return alc.b(alc, this.c, continuation);
            default:
                alc alc2 = this.b;
                alc2.getClass();
                return alc.a(alc2, this.c, continuation);
        }
    }
}
