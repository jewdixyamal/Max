package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: th9  reason: default package */
public final class th9 extends ffe implements a66 {
    public final /* synthetic */ uh9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public th9(uh9 uh9, Continuation continuation) {
        super(2, continuation);
        this.X = uh9;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((th9) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new th9(this.X, continuation);
    }

    public final Object o(Object obj) {
        c3b d;
        od2.a0(obj);
        uh9 uh9 = this.X;
        q0e q0e = uh9.s;
        a98 a98 = uh9.m;
        long j = -1;
        q0e.m((Object) null, new Long(a98 != null ? a98.k() : -1));
        a98 a982 = uh9.m;
        uh9.u.m((Object) null, new Long(a982 != null ? a982.e0() : -1));
        a98 a983 = uh9.m;
        boolean z = true;
        int playbackState = a983 != null ? a983.getPlaybackState() : 1;
        uh9.v = playbackState;
        uh9.y = playbackState == 2;
        uh9.A = playbackState == 4;
        a98 a984 = uh9.m;
        boolean z2 = a984 != null && a984.b();
        uh9.x = z2;
        if (z2 || uh9.v != 3) {
            z = false;
        }
        uh9.w = z;
        a98 a985 = uh9.m;
        if (a985 != null) {
            a985.n();
        }
        a98 a986 = uh9.m;
        uh9.B = a986 != null ? a986.R0() : null;
        a98 a987 = uh9.m;
        int i = -1;
        uh9.C = uh9.d(uh9, a987 != null ? a987.h() : -1);
        a98 a988 = uh9.m;
        if (a988 != null) {
            i = a988.i();
        }
        uh9.d(uh9, i);
        a98 a989 = uh9.m;
        if (a989 != null) {
            a989.E0();
        }
        a98 a9810 = uh9.m;
        if (a9810 != null) {
            a9810.getRepeatMode();
        }
        a98 a9811 = uh9.m;
        uh9.D = a9811 != null ? a9811.N0() : null;
        a98 a9812 = uh9.m;
        if (a9812 != null) {
            j = a9812.c();
        }
        uh9.E = j;
        a98 a9813 = uh9.m;
        uh9.F = (a9813 == null || (d = a9813.d()) == null) ? 1.0f : d.a;
        a98 a9814 = uh9.m;
        if (a9814 != null) {
            a9814.n1();
        }
        uh9.G.m((Object) null, new Float(ote.d((float) (((Number) uh9.s.getValue()).doubleValue() / ((double) uh9.E)), 0.0f, 1.0f)));
        return e5f.a;
    }
}
