package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: bpf  reason: default package */
public final class bpf extends ffe implements a66 {
    public final /* synthetic */ TextView X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bpf(TextView textView, Continuation continuation) {
        super(2, continuation);
        this.X = textView;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((bpf) n((on5) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bpf(this.X, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        TextView textView = this.X;
        CharSequence text = textView.getText();
        if (text != null) {
            xfg.c(text, qp4.u0.b(textView.getContext()).i());
        }
        return e5f.a;
    }
}
