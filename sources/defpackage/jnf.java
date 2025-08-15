package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.coroutines.Continuation;

/* renamed from: jnf  reason: default package */
public final class jnf extends ijc implements a66 {
    public final /* synthetic */ View X;
    public int c;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jnf(View view, Continuation continuation) {
        super(2, continuation);
        this.X = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jnf) n((f6d) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        jnf jnf = new jnf(this.X, continuation);
        jnf.o = obj;
        return jnf;
    }

    public final Object o(Object obj) {
        Object obj2;
        Object obj3 = tx3.a;
        int i = this.c;
        View view = this.X;
        if (i != 0) {
            Object obj4 = e5f.a;
            if (i == 1) {
                f6d f6d = (f6d) this.o;
                od2.a0(obj);
                if (view instanceof ViewGroup) {
                    this.o = null;
                    this.c = 2;
                    f6d.getClass();
                    q1f q1f = new q1f(new u1(4, (ViewGroup) view));
                    if (!q1f.b.hasNext()) {
                        obj2 = obj4;
                    } else {
                        f6d.c = q1f;
                        f6d.a = 2;
                        f6d.o = this;
                        obj2 = obj3;
                    }
                    if (obj2 != obj3) {
                        obj2 = obj4;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
            } else if (i == 2) {
                od2.a0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj4;
        }
        od2.a0(obj);
        f6d f6d2 = (f6d) this.o;
        this.o = f6d2;
        this.c = 1;
        f6d2.c(view, this);
        return obj3;
    }
}
