package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: vme  reason: default package */
public final class vme extends ffe implements a66 {
    public final /* synthetic */ wme X;
    public final /* synthetic */ View Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vme(wme wme, View view, Continuation continuation) {
        super(2, continuation);
        this.X = wme;
        this.Y = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((vme) n((sme) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vme(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        sme sme;
        od2.a0(obj);
        View view = this.Y;
        if (view.isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = view.getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        this.X.z(sme);
        return e5f.a;
    }
}
