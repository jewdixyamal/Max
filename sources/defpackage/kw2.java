package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: kw2  reason: default package */
public final class kw2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nx2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kw2(nx2 nx2, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((kw2) n((ej7) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kw2 kw2 = new kw2(this.Y, continuation);
        kw2.X = obj;
        return kw2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ej7 ej7 = (ej7) this.X;
        String name = this.Y.getClass().getName();
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, name, "get result for link " + ej7, (Throwable) null);
        }
        if (ej7 instanceof pi7) {
            pnf.o(this.Y.O0, new wm9(new m64(((pi7) ej7).a)));
        } else if (ej7 instanceof si7) {
            pnf.o(this.Y.O0, new wm9(((si7) ej7).a));
        } else if (ej7 instanceof wi7) {
            pnf.o(this.Y.O0, gy2.a2(gy2.c, ((wi7) ej7).a));
        } else if (ej7 instanceof ni7) {
            s35 s35 = this.Y.O0;
            gy2 gy2 = gy2.c;
            ni7 ni7 = (ni7) ej7;
            long j = ni7.a;
            String str = ni7.o;
            String str2 = ni7.b;
            boolean z = ni7.c;
            gy2.getClass();
            String str3 = ":join?id=" + j + "&link=" + str + "&channel=" + z;
            if (str2 != null) {
                str3 = str3 + "&title=" + str2;
            }
            wg0.k(str3, s35);
        } else if (!(ej7 instanceof xi7)) {
            if (ej7 instanceof yi7) {
                s35 s352 = this.Y.O0;
                gy2 gy22 = gy2.c;
                yi7 yi7 = (yi7) ej7;
                long j2 = yi7.a;
                String str4 = yi7.b;
                gy22.getClass();
                y7g y7g = new y7g(13);
                y7g.b = ":chats";
                y7g.D(Long.valueOf(j2), "id");
                y7g.D("local", "type");
                if (str4 != null) {
                    y7g.D(str4, ApiProtocol.PARAM_PAYLOAD);
                }
                wg0.k(y7g.s(), s352);
            } else if (ej7 instanceof aj7) {
                nx2 nx2 = this.Y;
                nx2.o.j(((aj7) ej7).a, true, false, false, new x2((Object) nx2, 26, (Object) ej7));
            } else if (tpa.f(ej7, qi7.a)) {
                pnf.o(this.Y.P0, new rnd(new eqe(jpc.A2)));
            } else if (ej7 instanceof bj7) {
                s35 s353 = this.Y.O0;
                gy2 gy23 = gy2.c;
                long j3 = ((bj7) ej7).a;
                gy23.getClass();
                wg0.k(":stickers/set?set_id=" + j3, s353);
            }
        }
        return e5f.a;
    }
}
