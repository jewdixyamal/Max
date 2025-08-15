package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ajc  reason: default package */
public final class ajc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ glc Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajc(glc glc, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = glc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ajc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ajc ajc = new ajc(this.Y, this.Z, continuation);
        ajc.X = obj;
        return ajc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        String name = sx3.getClass().getName();
        long j = this.Z;
        ir6 ir6 = hm9.m;
        CharSequence charSequence = null;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, ey8.h(j, "start restore draft for chatId:"), (Throwable) null);
        }
        e52 e52 = (e52) ((jz2) ((iy2) ((je7) this.Y.b).getValue())).m(this.Z).a.getValue();
        if (e52 == null) {
            hm9.m(sx3.getClass().getName(), "can't restore draft because chat is null", new Object[0]);
            return null;
        }
        uaa uaa = e52.b.f0;
        if (!(uaa instanceof uaa)) {
            uaa = null;
        }
        if (uaa == null) {
            hm9.m(sx3.getClass().getName(), "Draft empty in chat don't need restore", new Object[0]);
            return null;
        }
        glc glc = this.Y;
        xd7 xd7 = uaa.b;
        glc.getClass();
        if (!fm9.G(xd7)) {
            charSequence = ((ida) ((je7) glc.c).getValue()).j.e(((ida) ((je7) glc.c).getValue()).l(xd7.a, xd7.b));
        }
        return new zic(charSequence, uaa.d, uaa.c);
    }
}
