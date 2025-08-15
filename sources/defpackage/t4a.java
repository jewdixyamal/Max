package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: t4a  reason: default package */
public final class t4a extends ffe implements a66 {
    public int X;
    public final /* synthetic */ OneMeApplication Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t4a(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.Y = oneMeApplication;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t4a) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t4a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        e5f e5f = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            je7 je7 = iyc.a;
            khe d = jyc.a.getAccessor().d(q33.class);
            je7 a = iyc.a();
            ggc ggc = new ggc(d, a);
            this.X = 1;
            se5 se5 = (se5) ((qe5) ((khe) a).getValue());
            se5.getClass();
            if (se5.n(PmsKey.f7appearancemultithemescreenenabled, false)) {
                hm9.m("SavedBackgroundThemeMigration", "Chat theme use new multithemes, migration not needed", new Object[0]);
            } else {
                ((t33) ggc.a()).j("app.chat.background.migrated", ze0.c.contains(tfg.l(ggc.a(), true)) && ze0.b.contains(tfg.l(ggc.a(), false)));
                if (((t33) ggc.a()).g.getBoolean("app.chat.background.migrated", false)) {
                    hm9.m("SavedBackgroundThemeMigration", "Chat theme background already migrated.", new Object[0]);
                } else {
                    ggc.b(true);
                    ggc.b(false);
                    ((t33) ggc.a()).j("app.chat.background.migrated", true);
                }
            }
            if (e5f == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else if (i == 2) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l7b l7b = new l7b(iyc.a());
        this.X = 2;
        Object t0 = j47.t0(((w9a) ((kke) ((je7) l7b.c).getValue())).b(), new k7b(this.Y, l7b, (Continuation) null), this);
        if (t0 != tx3) {
            t0 = e5f;
        }
        return t0 == tx3 ? tx3 : e5f;
    }
}
