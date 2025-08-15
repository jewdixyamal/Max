package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* renamed from: t1b  reason: default package */
public final class t1b implements um1 {
    public final w7c X;
    public final je7 Y;
    public final os1 a;
    public final q1b b;
    public xg1 c;
    public final q0e o;

    /* JADX WARNING: type inference failed for: r6v6, types: [a66, ffe] */
    public t1b(oqa oqa, kr1 kr1, os1 os1, q1b q1b, je7 je7) {
        os1 os12 = os1;
        khe d = n31.a.getAccessor().d(jr1.class);
        je7 je72 = yi1.a;
        khe d2 = zi1.a.getAccessor().d(ir1.class);
        this.a = os12;
        this.b = q1b;
        q0e a2 = r0e.a(new qma((md0) null, (String) null, (gg1) null, false, false, true, (haf) null, iaf.o, false, (CharSequence) null));
        this.o = a2;
        this.X = new w7c(a2);
        je7 r = tu0.r(3, new s4a(25));
        this.Y = r;
        os12.d(this);
        od2.L(new zn5(((ugf) r.getValue()).d, new ffe(2, (Continuation) null), 5), (sx3) d.getValue());
        od2.L(new j31(new j31(new m58(((ir1) d2.getValue()).o, 24), ((cra) oqa).w0, new r1b(3, (Continuation) null, 0), 4), ((wr1) kr1).I, new jf1((Object) this, je7, (Continuation) null, 5), 4), (sx3) d.getValue());
    }

    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        super.onDestroyed(conversationDestroyedInfo);
        this.b.b();
        this.c = null;
    }
}
