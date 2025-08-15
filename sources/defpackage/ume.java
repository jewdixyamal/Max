package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.coroutines.Continuation;

/* renamed from: ume  reason: default package */
public final class ume extends ffe implements a66 {
    public final /* synthetic */ View X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ume(View view, Continuation continuation) {
        super(2, continuation);
        this.X = view;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ume) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ume(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        View view = this.X;
        if (view.isInEditMode()) {
            ee4 ee4 = ee4.e0;
        } else {
            Context context = view.getContext();
            khe khe = sme.a0;
            fm9.R(context);
        }
        return e5f.a;
    }
}
