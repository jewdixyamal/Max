package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ok1  reason: default package */
public final class ok1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ el1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ok1(el1 el1, Continuation continuation) {
        super(2, continuation);
        this.Y = el1;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ok1) n((jb) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ok1 ok1 = new ok1(this.Y, continuation);
        ok1.X = obj;
        return ok1;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jb jbVar = (jb) this.X;
        boolean z = jbVar instanceof za;
        el1 el1 = this.Y;
        if (z) {
            pnf.o(el1.M0, wj1.b);
        } else if (jbVar instanceof xa) {
            pnf.o(el1.M0, wj1.c);
        } else if (jbVar instanceof wa) {
            pnf.o(el1.M0, wj1.d);
        } else if (jbVar instanceof db) {
            pnf.o(el1.M0, wj1.e);
        } else if (jbVar instanceof va) {
            pnf.o(el1.M0, wj1.f);
        } else if (jbVar instanceof sa) {
            pnf.o(el1.M0, wj1.g);
        } else if (jbVar instanceof ra) {
            pnf.o(el1.M0, wj1.h);
        } else if (jbVar instanceof ab) {
            pnf.o(el1.M0, wj1.i);
        } else if (jbVar instanceof ya) {
            pnf.o(el1.M0, wj1.j);
        } else if (jbVar instanceof eb) {
            pnf.o(el1.M0, wj1.k);
        } else if (jbVar instanceof fb) {
            pnf.o(el1.M0, wj1.l);
        } else if (jbVar instanceof ib) {
            pnf.o(el1.M0, wj1.m);
        } else if (jbVar instanceof bb) {
            pnf.o(el1.M0, wj1.n);
        } else if (jbVar instanceof gb) {
            pnf.o(el1.M0, wj1.o);
        } else if (jbVar instanceof ta) {
            pnf.o(el1.M0, wj1.p);
        } else if (jbVar instanceof ua) {
            pnf.o(el1.M0, wj1.A);
        } else if (jbVar instanceof hb) {
            pnf.o(el1.M0, ((hb) jbVar).a ? wj1.B : wj1.C);
        }
        return e5f.a;
    }
}
