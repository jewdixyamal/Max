package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: ls3  reason: default package */
public final class ls3 extends ffe implements a66 {
    public final /* synthetic */ ns3 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ int Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ls3(ns3 ns3, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ns3;
        this.Y = str;
        this.Z = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ls3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ls3(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        ns3 ns3 = this.X;
        List f = ns3.c.f(this.Y, this.Z, nz4.a, ns3.e);
        ns3.getClass();
        return f;
    }
}
